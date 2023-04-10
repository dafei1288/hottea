package com.dafei1288.hottea.parser;

import com.dafei1288.hottea.ast.AstNode;
import com.dafei1288.hottea.ast.Model;
import com.dafei1288.hottea.ast.TypeEnum;

import java.util.Calendar;
import java.util.Map;

public class MyHotteaVisitor extends HotteaBaseVisitor{

    private Model model = new Model();
    private Map<String,String> nodeTextMapping ;

    public Map<String, String> getNodeTextMapping() {
        return nodeTextMapping;
    }

    public void setNodeTextMapping(Map<String, String> nodeTextMapping) {
        this.nodeTextMapping = nodeTextMapping;
    }

    @Override
    public Object visitYear(HotteaParser.YearContext ctx) {
        AstNode yearAn = new AstNode();
        yearAn.setNodeMapText("year");
        yearAn.setTypeClass(Integer.class);
        yearAn.setTypeString("int");
        Integer year = null;
        if(ctx.THIS_YEAR()!=null){
            year = (Calendar.getInstance().get(Calendar.YEAR));
            yearAn.setNodeText(ctx.THIS_YEAR().getText());
        }
        if(ctx.LASt_YEAR() != null){
            year = (Calendar.getInstance().get(Calendar.YEAR)-1);
            yearAn.setNodeText(ctx.LASt_YEAR().getText());
        }
        if(ctx.NEXT_YEAR()!=null){
            year = (Calendar.getInstance().get(Calendar.YEAR)+1);
            yearAn.setNodeText(ctx.NEXT_YEAR().getText());

        }
        if(ctx.someYear()!=null){
            year = Integer.getInteger(ctx.someYear().INT().getText());
            yearAn.setNodeText(ctx.someYear().YEAR().getText());
        }
        if(ctx.EVERY_YEAR() != null){
            yearAn.setNodeText(ctx.EVERY_YEAR().getText());
            model.setGroupByYear(true);
        }

        yearAn.setNodeValue(year);
        model.setYear(yearAn);
        System.out.println(yearAn);
        return super.visitYear(ctx);
    }

    @Override
    public Object visitSeason(HotteaParser.SeasonContext ctx) {
        AstNode seasonAn = new AstNode();
        seasonAn.setNodeMapText("season");
        seasonAn.setTypeClass(Integer.class);
        seasonAn.setTypeString("int");
        Integer season = null;
        if(ctx.THIS_SEASON()!=null){
            season = (Calendar.getInstance().get(Calendar.MONTH)/4+1);
            seasonAn.setNodeText(ctx.THIS_SEASON().getText());
        }
        if(ctx.LAST_SEASON() != null){
            season = (Calendar.getInstance().get(Calendar.MONTH)/4-1);
            seasonAn.setNodeText(ctx.LAST_SEASON().getText());
        }
        if(ctx.NEXT_SEASON()!=null){
            season = (Calendar.getInstance().get(Calendar.MONTH)/4+2);
            seasonAn.setNodeText(ctx.NEXT_SEASON().getText());
        }
        if(ctx.someSeason()!=null){
            season = Integer.getInteger(ctx.someSeason().INT().getText());
            seasonAn.setNodeText(ctx.someSeason().getText());
        }
        seasonAn.setNodeValue(season);
        model.setSeason(seasonAn);
        System.out.println(seasonAn);
        return super.visitSeason(ctx);
    }

    @Override
    public Object visitSomeArea(HotteaParser.SomeAreaContext ctx) {
        AstNode areaAn = new AstNode();
        areaAn.setNodeMapText("area");
        areaAn.setNodeText("地域");
        areaAn.setNodeValue(ctx.AREA().getText());
        areaAn.setTypeClass(String.class);
        areaAn.setTypeString("string");
        model.setArea(areaAn);
        System.out.println(areaAn);
        return super.visitSomeArea(ctx);
    }

    @Override
    public Object visitTradeNamed(HotteaParser.TradeNamedContext ctx) {
        AstNode tradeAn = new AstNode();
        tradeAn.setNodeMapText("trade");
        tradeAn.setNodeText("行业");
        tradeAn.setNodeValue(ctx.getText());
        tradeAn.setTypeClass(String.class);
        tradeAn.setTypeString("string");
        model.setTrade(tradeAn);
        System.out.println(tradeAn);


        return super.visitTradeNamed(ctx);
    }

    @Override
    public Object visitType(HotteaParser.TypeContext ctx) {

        AstNode typeAn = new AstNode();

        TypeEnum typeEnum  = null;
        typeAn.setNodeMapText("type");
        typeAn.setTypeClass(TypeEnum.class);
        typeAn.setTypeString("typeEnum");
        if(ctx.SUM() != null){
            typeEnum = TypeEnum.SUM;
            typeAn.setNodeText(ctx.SUM().getText());
        }
        if(ctx.DETAIL() != null){
            typeEnum = TypeEnum.DETAIL;
            typeAn.setNodeText(ctx.DETAIL().getText());
        }
        if (ctx.INCREASE() != null){
            typeEnum = TypeEnum.INCREASE;
            typeAn.setNodeText(ctx.INCREASE().getText());
        }

        typeAn.setNodeValue(typeEnum);
        model.setType(typeAn);
        System.out.println(typeAn);

        return super.visitType(ctx);
    }

    @Override
    public Object visitAction(HotteaParser.ActionContext ctx) {

        AstNode actionAn = new AstNode();

        if(ctx.SELL()!=null){
            actionAn.setNodeMapText("sell");
        }else{
            actionAn.setNodeMapText("action");
        }


        actionAn.setNodeText(ctx.getText());
        actionAn.setNodeValue(ctx.getText());
        actionAn.setTypeClass(String.class);
        actionAn.setTypeString("string");
        model.setAction(actionAn);
        System.out.println(actionAn);

        return super.visitAction(ctx);
    }

    public Model getModel(){
        return this.model;
    }



}
