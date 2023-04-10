import com.dafei1288.hottea.Hottea;
import com.dafei1288.hottea.parser.HotteaLexer;
import com.dafei1288.hottea.parser.HotteaParser;
import com.dafei1288.hottea.parser.HotteaVisitor;
import com.dafei1288.hottea.parser.MyHotteaVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.Trees;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    public static void main1(String[] args) throws Exception {

        String s = "历年销售汇总";
//        s = "本季度华东地区今年汽车行业销售汇总";
        String configFile = "D:\\working\\others\\procjetAlice\\testgpt\\src\\main\\resources\\hottea.yml";
        Hottea hottea = new Hottea(s,configFile);
        hottea = hottea.doExec();

//        hottea.printResultSet();
        hottea.printHtmlResultSet();


    }

    public static void main(String[] args) {


        String s = "今年本季度华东地区汽车行业销售汇总";
        s = "历年华东地区销售汇总";

        CharStream input = CharStreams.fromString(s);
        HotteaLexer lexer=new HotteaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HotteaParser parser = new HotteaParser(tokens);
        HotteaParser.ExprContext tree = parser.expr();
        MyHotteaVisitor tv = new MyHotteaVisitor();
        tv.visit(tree);
        System.out.println();
        System.out.println(s);
        System.out.println(tv.getModel().toSqlString());

        System.out.println(printSyntaxTree(parser, tree));
    }


    public static String printSyntaxTree(Parser parser, ParseTree root) {
        StringBuilder buf = new StringBuilder();
        recursive(root, buf, 0, Arrays.asList(parser.getRuleNames()));
        return buf.toString();
    }

    private static void recursive(ParseTree aRoot, StringBuilder buf, int offset, List<String> ruleNames) {
        for (int i = 0; i < offset; i++) {
            buf.append("  ");
        }
        buf.append(Trees.getNodeText(aRoot, ruleNames)).append("\n");
        if (aRoot instanceof ParserRuleContext) {
            ParserRuleContext prc = (ParserRuleContext) aRoot;
            if (prc.children != null) {
                for (ParseTree child : prc.children) {
                    recursive(child, buf, offset + 1, ruleNames);
                }
            }
        }
    }
}
