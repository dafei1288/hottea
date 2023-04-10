package com.dafei1288.hottea.ast;

import java.util.ArrayList;
import java.util.List;

public class Model implements ISqlNode{
    private AstNode year;
    private AstNode season;
    private AstNode month;
    private AstNode area;
    private AstNode trade;
    private AstNode action;
    private AstNode type;

    private List<String> dimNames = new ArrayList<>();

    private List<String> measureNames = new ArrayList<>();


    private boolean groupByYear = false;

    public boolean isGroupByYear() {
        return groupByYear;
    }

    public void setGroupByYear(boolean groupByYear) {
        this.groupByYear = groupByYear;
    }

    public AstNode getYear() {
        return year;
    }

    public List<String> getDimNames() {
        return dimNames;
    }

    public void setDimNames(List<String> dimNames) {
        this.dimNames = dimNames;
    }

    public List<String> getMeasureNames() {
        return measureNames;
    }

    public void setMeasureNames(List<String> measureNames) {
        this.measureNames = measureNames;
    }

    public void setYear(AstNode year) {
        this.year = year;
    }

    public AstNode getSeason() {
        return season;
    }

    public void setSeason(AstNode season) {
        this.season = season;
    }

    public AstNode getMonth() {
        return month;
    }

    public void setMonth(AstNode month) {
        this.month = month;
    }

    public AstNode getArea() {
        return area;
    }

    public void setArea(AstNode area) {
        this.area = area;
    }

    public AstNode getTrade() {
        return trade;
    }

    public void setTrade(AstNode trade) {
        this.trade = trade;
    }

    public AstNode getAction() {
        return action;
    }

    public void setAction(AstNode action) {
        this.action = action;
    }

    public AstNode getType() {
        return type;
    }

    public void setType(AstNode type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Model{" +
                "year=" + year +
                ", season=" + season +
                ", month=" + month +
                ", area=" + area +
                ", trade=" + trade +
                ", action=" + action +
                ", type=" + type +
                '}';
    }

    public String toHtmlString(){

        StringBuffer sb = new StringBuffer();
        if(year != null)  sb.append("year=" + year + "<br />");
        if(season != null)  sb.append("season=" + season + "<br />");
        if(month != null)  sb.append("month=" + month + "<br />");
        if(area != null)  sb.append("area=" + area + "<br />");
        if(trade != null)  sb.append("trade=" + trade + "<br />");
        if(action != null)  sb.append("action=" + action + "<br />");
        if(type != null)  sb.append("type=" + type + "<br />");

//        return "Model{" + "<br />" +
//                "    year=" + year + "<br />" +
//                "    season=" + season + "<br />" +
//                "    month=" + month + "<br />" +
//                "    area=" + area + "<br />" +
//                "    trade=" + trade + "<br />" +
//                "    action=" + action + "<br />" +
//                "    type=" + type + "<br />" +
//                '}';

        return sb.toString();
    }

    @Override
    public String toSqlString() {
        StringBuffer sql = new StringBuffer();
        StringBuffer selectSb = new StringBuffer();
        StringBuffer whereSb = new StringBuffer();
        StringBuffer groupbySb = new StringBuffer();

        boolean isAgg = this.type.getNodeValue().equals(TypeEnum.SUM);

        selectSb.append("SELECT ");
        if(isAgg){
            selectSb.append("sum(")
                    .append(action.getNodeMapText())
                    .append(") ")
                    .append(" AS ")
                    .append(action.getNodeText())
            ;
        }else{
            selectSb
                    .append(action.getNodeMapText())
                    .append(" AS ")
                    .append(action.getNodeText());
        }
        this.measureNames.add(action.getNodeText());

        if( year != null){


            selectSb.append(" , ")
                    .append(year.getNodeMapText())
                    .append(" AS ")
                    .append(year.getNodeText())
            ;
            this.dimNames.add(year.getNodeText());

            if(isGroupByYear() == false){
                whereSb.append(year.getNodeMapText())
                        .append("=")
                        .append(year.getNodeValue());
            }



            if(isAgg){
                groupbySb.append(year.getNodeMapText());
            }

        }
        if(season != null){
            selectSb.append(" , ")
                    .append(season.getNodeMapText())
                    .append(" AS ")
                    .append(season.getNodeText())
            ;
            this.dimNames.add(season.getNodeText());

            whereSb.append(" and ")
                    .append(season.getNodeMapText())
                    .append("=")
                    .append(season.getNodeValue());

            if(isAgg){
                groupbySb.append(" , ")
                        .append(season.getNodeMapText());
            }
        }
        if(month != null){
            selectSb.append(" , ")
                    .append(month.getNodeMapText())
                    .append(" AS ")
                    .append(month.getNodeText())
            ;
            this.dimNames.add(month.getNodeText());

            whereSb.append(" and ")
                    .append(month.getNodeMapText())
                    .append("=")
                    .append(month.getNodeValue());

            if(isAgg){
                groupbySb.append(" , ")
                        .append(month.getNodeMapText());
            }

        }
        if(area != null){
            selectSb.append(" , ")
                    .append(area.getNodeMapText())
                    .append(" AS ")
                    .append(area.getNodeText())
            ;
            this.dimNames.add(area.getNodeText());

            whereSb.append(" and ")
                    .append(area.getNodeMapText())
                    .append("=");
            if(area.isNumber()){
                whereSb.append(area.getNodeValue());
            }else{
                whereSb
                        .append("'")
                        .append(area.getNodeValue())
                        .append("'")
                ;
            }


            if(isAgg){
                groupbySb.append(" , ")
                        .append(area.getNodeMapText());
            }

        }
        if(trade != null){
            selectSb.append(" , ")
                    .append(trade.getNodeMapText())
                    .append(" AS ")
                    .append(trade.getNodeText())
            ;
            this.dimNames.add(trade.getNodeText());

            whereSb.append(" and ")
                    .append(trade.getNodeMapText())
                    .append("=");

            if(trade.isNumber()){
                whereSb.append(trade.getNodeValue());
            }else{
                whereSb
                        .append("'")
                        .append(trade.getNodeValue())
                        .append("'")
                ;
            }


            if(isAgg){
                groupbySb.append(" , ")
                        .append(trade.getNodeMapText());
            }

        }

        // select * from ft where year = 2012  and season = 1 and area = '华东地区' and trade = '汽车'
        String whereString = whereSb.toString().trim();
        whereString = whereString.startsWith("and")?whereString.substring(3,whereString.length()):whereString;

        sql.append(selectSb)
                .append(" FROM t1 ");

        if(whereString.trim().length() != 0){
            sql.append(" WHERE ")
                    .append(whereSb);
        }



        if(isAgg){
            sql.append(" ")
                    .append(" GROUP BY ")
                    .append(groupbySb);
        }

        return sql.toString();
    }
}
