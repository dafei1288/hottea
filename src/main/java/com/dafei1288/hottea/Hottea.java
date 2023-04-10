package com.dafei1288.hottea;

import com.dafei1288.hottea.ast.Model;
import com.dafei1288.hottea.parser.HotteaLexer;
import com.dafei1288.hottea.parser.HotteaParser;
import com.dafei1288.hottea.parser.MyHotteaVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Trees;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Hottea implements Closeable{
    private String sentence;
    private Model model;

    private String configFile ;

    private Map config;

    private String driver;

    private String url;

    private String usr;

    private String passwd;

    private Connection conn;
    private Statement stmt;
    private ResultSet resultSet;

    private List<Map> rowData;

    private String sql;

    private HotteaParser parser;
    private HotteaParser.ExprContext tree;
    private MyHotteaVisitor tv = new MyHotteaVisitor();




    public Hottea(String sentence){
        this.sentence = sentence;
    }

    public Hottea(String sentence , String configFile) throws IOException, ClassNotFoundException {
        this.sentence = sentence;
        this.setConfigFile(configFile);

    }

    public Map getConfig(){
        return this.config;
    }

    public String getConfigFile() {
        return configFile;
    }

    public void setConfigFile(String configFile) throws IOException,ClassNotFoundException {
        this.configFile = configFile;

        Yaml yaml = new Yaml();
        InputStream resourceAsStream = new FileInputStream(new File(this.configFile));
        this.config = yaml.load(resourceAsStream);
        resourceAsStream.close();

        Map ht = (Map) this.config.get("hottea");
        Map datasource = (Map) ht.get("datasource");
        driver = (String) datasource.get("driver");

        Class.forName(driver);

        url = datasource.get("url").toString();
        usr = datasource.get("usr").toString();
//        this.config.get("hottea.datasource.usr").toString();
        passwd = datasource.get("passwd").toString();
//                this.config.get("hottea.datasource.passwd").toString();
    }



    public Hottea doExec() throws SQLException {

        System.out.println("输入语句 ==> "+this.sentence);

        CharStream input = CharStreams.fromString(this.sentence);
        HotteaLexer lexer=new HotteaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new HotteaParser(tokens);
        tree = parser.expr();
        tv = new MyHotteaVisitor();
        tv.visit(tree);
        this.model = tv.getModel();

        conn = DriverManager.getConnection(url,usr,passwd);

        stmt = conn.createStatement();
        sql = this.model.toSqlString();

        System.out.println();
        System.out.println("转换查询语句 ==> "+sql);
        resultSet = stmt.executeQuery(sql);

        return this;
    }

    public String printHtmlResultSet() throws SQLException{
        String html =
                "<div id=\"main\" style=\"width: 600px;height:400px;\"></div>\n" +
                "<script type=\"text/javascript\">\n" +
                "    // 基于准备好的dom，初始化echarts实例\n" +
                "    var myChart = echarts.init(document.getElementById('main'));\n" +
                "\n" +
                "    // 指定图表的配置项和数据\n" +
                "    var option = {\n" +
                "        title: {\n" +
                "            text: ${sentence}\n" +
                "        },\n" +
                "        tooltip: {},\n" +
                "        legend: {\n" +
                "            data: [${measure}]\n" +
                "        },\n" +
                "        xAxis: {\n" +
                "            data: [${dim}]\n" +
                "        },\n" +
                "        yAxis: {},\n" +
                "        series: [\n" +
                "            {\n" +
                "                name: ${measure},\n" +
                "                type: 'bar',\n" +
                "                data: [${measureData}]\n" +
                "            }\n" +
                "        ]\n" +
                "    };\n" +
                "\n" +
                "    // 使用刚指定的配置项和数据显示图表。\n" +
                "    myChart.setOption(option);\n" +
                "</script>\n" ;

        html = html.replace("${sentence}","'"+this.sentence+"'");
        html = html.replace("${measure}",this.model.getMeasureNames().stream().map(it->"'"+it+"'").collect(Collectors.joining(",")));
//        html = html.replace("${dim}",this.model.getDimNames().stream().map(it->"'"+it+"'").collect(Collectors.joining(",")));

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        List<String> colNames = new ArrayList<>();
        for(int i=1;i<=resultSetMetaData.getColumnCount();i++){
            colNames.add(resultSetMetaData.getColumnLabel(i));
        }
        List<String> datas = new ArrayList<>();
        List<String> dimDatas = new ArrayList<>();
        while(this.resultSet.next()){
            for(String str : this.model.getDimNames()){
                dimDatas.add(this.resultSet.getString(str));
            }
            for(String str : this.model.getMeasureNames()){
                datas.add(this.resultSet.getString(str));
            }
        }
        html = html.replace("${dim}",dimDatas.stream().map(it->"'"+it+"'").collect(Collectors.joining(",")));
        html = html.replace("${measureData}",datas.stream().map(it->"'"+it+"'").collect(Collectors.joining(",")));
        System.out.println(html);
        return html;
    }


    public void printResultSet() throws SQLException {
        System.out.println();
        System.out.println("打印结果 : ");
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        List<String> colNames = new ArrayList<>();
        for(int i=1;i<=resultSetMetaData.getColumnCount();i++){
            colNames.add(resultSetMetaData.getColumnLabel(i));
//            String colName = resultSetMetaData.getColumnLabel(i);
        }

        String title = colNames.stream().collect(Collectors.joining("\t"));
        System.out.println(title);
        StringBuffer sb = new StringBuffer();
        while(this.resultSet.next()){
            for( String colName : colNames){
                String colV = this.resultSet.getString(colName);

                sb.append(colV)
                        .append("\t");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());


    }


    public void close() {
        try {
            this.resultSet.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            this.stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            this.conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String getSql(){
        return sql;
    }

    public String getAstNode(){
        return this.model.toHtmlString();
    }

    public String getSyntaxTree(){
        return printSyntaxTree(parser,tree,"&nbsp;&nbsp;&nbsp;&nbsp;","<br />");
    }

    public static String printSyntaxTree(Parser parser, ParseTree root , String blank , String enter) {
        StringBuilder buf = new StringBuilder();
        recursive(root, buf, 0, blank,enter, Arrays.asList(parser.getRuleNames()));
        return buf.toString();
    }

    private static void recursive(ParseTree aRoot, StringBuilder buf, int offset, String blank , String enter , List<String> ruleNames) {
        for (int i = 0; i < offset; i++) {
            buf.append(blank);
        }
        buf.append(Trees.getNodeText(aRoot, ruleNames)).append(enter);
        if (aRoot instanceof ParserRuleContext) {
            ParserRuleContext prc = (ParserRuleContext) aRoot;
            if (prc.children != null) {
                for (ParseTree child : prc.children) {
                    recursive(child, buf, offset + 1, blank, enter, ruleNames);
                }
            }
        }
    }

}
