// Generated from D:/working/others/procjetAlice/testgpt/src/main/resources\Hottea.g4 by ANTLR 4.12.0
package com.dafei1288.hottea.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HotteaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HotteaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HotteaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(HotteaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HotteaParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#someYear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeYear(HotteaParser.SomeYearContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#someSeason}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeSeason(HotteaParser.SomeSeasonContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#someMonth}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeMonth(HotteaParser.SomeMonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#someDay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeDay(HotteaParser.SomeDayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#year}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear(HotteaParser.YearContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#season}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeason(HotteaParser.SeasonContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#month}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth(HotteaParser.MonthContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#day}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay(HotteaParser.DayContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#date}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(HotteaParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#someArea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeArea(HotteaParser.SomeAreaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#tradeNamed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTradeNamed(HotteaParser.TradeNamedContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#someTrade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSomeTrade(HotteaParser.SomeTradeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(HotteaParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HotteaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HotteaParser.TypeContext ctx);
}