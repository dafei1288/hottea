// Generated from D:/working/others/procjetAlice/testgpt/src/main/resources\Hottea.g4 by ANTLR 4.12.0
package com.dafei1288.hottea.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HotteaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TO=1, YEAR=2, THIS_YEAR=3, LASt_YEAR=4, NEXT_YEAR=5, EVERY_YEAR=6, SEASON=7, 
		LAST_SEASON=8, THIS_SEASON=9, NEXT_SEASON=10, MONTH=11, LAST_MONTH=12, 
		THIS_MONTH=13, NEXT_MONTH=14, ALL_MONTH=15, DAY=16, LAST_DAY=17, TODAT=18, 
		TOMORROW=19, AREA=20, TRADE=21, SELL=22, SUM=23, DETAIL=24, INCREASE=25, 
		NEWLINE=26, INT=27, ID=28;
	public static final int
		RULE_prog = 0, RULE_expr = 1, RULE_someYear = 2, RULE_someSeason = 3, 
		RULE_someMonth = 4, RULE_someDay = 5, RULE_year = 6, RULE_season = 7, 
		RULE_month = 8, RULE_day = 9, RULE_date = 10, RULE_someArea = 11, RULE_tradeNamed = 12, 
		RULE_someTrade = 13, RULE_action = 14, RULE_type = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "expr", "someYear", "someSeason", "someMonth", "someDay", "year", 
			"season", "month", "day", "date", "someArea", "tradeNamed", "someTrade", 
			"action", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", null, "'\\u4ECA\\u5E74'", "'\\u53BB\\u5E74'", "'\\u660E\\u5E74'", 
			"'\\u5386\\u5E74'", null, null, null, null, null, null, null, null, "'\\u5168\\u5E74'", 
			null, null, null, null, null, "'\\u884C\\u4E1A'", "'\\u9500\\u552E'", 
			"'\\u6C47\\u603B'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TO", "YEAR", "THIS_YEAR", "LASt_YEAR", "NEXT_YEAR", "EVERY_YEAR", 
			"SEASON", "LAST_SEASON", "THIS_SEASON", "NEXT_SEASON", "MONTH", "LAST_MONTH", 
			"THIS_MONTH", "NEXT_MONTH", "ALL_MONTH", "DAY", "LAST_DAY", "TODAT", 
			"TOMORROW", "AREA", "TRADE", "SELL", "SUM", "DETAIL", "INCREASE", "NEWLINE", 
			"INT", "ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Hottea.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HotteaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(HotteaParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			expr();
			setState(33);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SomeAreaContext someArea() {
			return getRuleContext(SomeAreaContext.class,0);
		}
		public SomeTradeContext someTrade() {
			return getRuleContext(SomeTradeContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			date();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AREA) {
				{
				setState(36);
				someArea();
				}
			}

			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(39);
				someTrade();
				}
				break;
			}
			setState(42);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SomeYearContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HotteaParser.INT, 0); }
		public TerminalNode YEAR() { return getToken(HotteaParser.YEAR, 0); }
		public SomeYearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someYear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterSomeYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitSomeYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitSomeYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeYearContext someYear() throws RecognitionException {
		SomeYearContext _localctx = new SomeYearContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_someYear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(INT);
			setState(45);
			match(YEAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SomeSeasonContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HotteaParser.INT, 0); }
		public TerminalNode SEASON() { return getToken(HotteaParser.SEASON, 0); }
		public SomeSeasonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someSeason; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterSomeSeason(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitSomeSeason(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitSomeSeason(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeSeasonContext someSeason() throws RecognitionException {
		SomeSeasonContext _localctx = new SomeSeasonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_someSeason);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(INT);
			setState(48);
			match(SEASON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SomeMonthContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(HotteaParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(HotteaParser.INT, i);
		}
		public List<TerminalNode> MONTH() { return getTokens(HotteaParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(HotteaParser.MONTH, i);
		}
		public TerminalNode TO() { return getToken(HotteaParser.TO, 0); }
		public SomeMonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someMonth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterSomeMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitSomeMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitSomeMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeMonthContext someMonth() throws RecognitionException {
		SomeMonthContext _localctx = new SomeMonthContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_someMonth);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(INT);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MONTH) {
				{
				setState(51);
				match(MONTH);
				}
			}

			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TO) {
				{
				setState(54);
				match(TO);
				setState(55);
				match(INT);
				setState(56);
				match(MONTH);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SomeDayContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(HotteaParser.INT, 0); }
		public TerminalNode DAY() { return getToken(HotteaParser.DAY, 0); }
		public SomeDayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someDay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterSomeDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitSomeDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitSomeDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeDayContext someDay() throws RecognitionException {
		SomeDayContext _localctx = new SomeDayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_someDay);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(INT);
			setState(60);
			match(DAY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class YearContext extends ParserRuleContext {
		public SomeYearContext someYear() {
			return getRuleContext(SomeYearContext.class,0);
		}
		public TerminalNode THIS_YEAR() { return getToken(HotteaParser.THIS_YEAR, 0); }
		public TerminalNode LASt_YEAR() { return getToken(HotteaParser.LASt_YEAR, 0); }
		public TerminalNode NEXT_YEAR() { return getToken(HotteaParser.NEXT_YEAR, 0); }
		public TerminalNode EVERY_YEAR() { return getToken(HotteaParser.EVERY_YEAR, 0); }
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitYear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitYear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_year);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				someYear();
				}
				break;
			case THIS_YEAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(THIS_YEAR);
				}
				break;
			case LASt_YEAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(LASt_YEAR);
				}
				break;
			case NEXT_YEAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				match(NEXT_YEAR);
				}
				break;
			case EVERY_YEAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				match(EVERY_YEAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeasonContext extends ParserRuleContext {
		public SomeSeasonContext someSeason() {
			return getRuleContext(SomeSeasonContext.class,0);
		}
		public TerminalNode LAST_SEASON() { return getToken(HotteaParser.LAST_SEASON, 0); }
		public TerminalNode THIS_SEASON() { return getToken(HotteaParser.THIS_SEASON, 0); }
		public TerminalNode NEXT_SEASON() { return getToken(HotteaParser.NEXT_SEASON, 0); }
		public TerminalNode ALL_MONTH() { return getToken(HotteaParser.ALL_MONTH, 0); }
		public SeasonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_season; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterSeason(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitSeason(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitSeason(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeasonContext season() throws RecognitionException {
		SeasonContext _localctx = new SeasonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_season);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				someSeason();
				}
				break;
			case LAST_SEASON:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(LAST_SEASON);
				}
				break;
			case THIS_SEASON:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(THIS_SEASON);
				}
				break;
			case NEXT_SEASON:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				match(NEXT_SEASON);
				}
				break;
			case ALL_MONTH:
				enterOuterAlt(_localctx, 5);
				{
				setState(73);
				match(ALL_MONTH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MonthContext extends ParserRuleContext {
		public SomeMonthContext someMonth() {
			return getRuleContext(SomeMonthContext.class,0);
		}
		public TerminalNode LAST_MONTH() { return getToken(HotteaParser.LAST_MONTH, 0); }
		public TerminalNode THIS_MONTH() { return getToken(HotteaParser.THIS_MONTH, 0); }
		public TerminalNode NEXT_MONTH() { return getToken(HotteaParser.NEXT_MONTH, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitMonth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitMonth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_month);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				someMonth();
				}
				break;
			case LAST_MONTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(LAST_MONTH);
				}
				break;
			case THIS_MONTH:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(THIS_MONTH);
				}
				break;
			case NEXT_MONTH:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				match(NEXT_MONTH);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DayContext extends ParserRuleContext {
		public SomeDayContext someDay() {
			return getRuleContext(SomeDayContext.class,0);
		}
		public TerminalNode LAST_DAY() { return getToken(HotteaParser.LAST_DAY, 0); }
		public TerminalNode TODAT() { return getToken(HotteaParser.TODAT, 0); }
		public TerminalNode TOMORROW() { return getToken(HotteaParser.TOMORROW, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_day);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				someDay();
				}
				break;
			case LAST_DAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(LAST_DAY);
				}
				break;
			case TODAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(TODAT);
				}
				break;
			case TOMORROW:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(TOMORROW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DateContext extends ParserRuleContext {
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public SeasonContext season() {
			return getRuleContext(SeasonContext.class,0);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(88);
				year();
				}
				break;
			}
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(91);
				season();
				}
				break;
			}
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(94);
				month();
				}
				break;
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 135135232L) != 0)) {
				{
				setState(97);
				day();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SomeAreaContext extends ParserRuleContext {
		public TerminalNode AREA() { return getToken(HotteaParser.AREA, 0); }
		public SomeAreaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someArea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterSomeArea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitSomeArea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitSomeArea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeAreaContext someArea() throws RecognitionException {
		SomeAreaContext _localctx = new SomeAreaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_someArea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(AREA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TradeNamedContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(HotteaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(HotteaParser.ID, i);
		}
		public TradeNamedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tradeNamed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterTradeNamed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitTradeNamed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitTradeNamed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TradeNamedContext tradeNamed() throws RecognitionException {
		TradeNamedContext _localctx = new TradeNamedContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tradeNamed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(102);
				match(ID);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SomeTradeContext extends ParserRuleContext {
		public TerminalNode TRADE() { return getToken(HotteaParser.TRADE, 0); }
		public TradeNamedContext tradeNamed() {
			return getRuleContext(TradeNamedContext.class,0);
		}
		public SomeTradeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_someTrade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterSomeTrade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitSomeTrade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitSomeTrade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SomeTradeContext someTrade() throws RecognitionException {
		SomeTradeContext _localctx = new SomeTradeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_someTrade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(108);
				tradeNamed();
				}
				break;
			}
			setState(111);
			match(TRADE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public TerminalNode SELL() { return getToken(HotteaParser.SELL, 0); }
		public TradeNamedContext tradeNamed() {
			return getRuleContext(TradeNamedContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_action);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELL:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(SELL);
				}
				break;
			case SUM:
			case DETAIL:
			case INCREASE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(114);
					tradeNamed();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public TerminalNode SUM() { return getToken(HotteaParser.SUM, 0); }
		public TerminalNode DETAIL() { return getToken(HotteaParser.DETAIL, 0); }
		public TerminalNode INCREASE() { return getToken(HotteaParser.INCREASE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HotteaListener ) ((HotteaListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HotteaVisitor ) return ((HotteaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			action();
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001c{\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"&\b\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u00045\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004:\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006D\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007K\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bQ\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tW\b\t\u0001\n\u0003\nZ\b\n\u0001\n\u0003\n]"+
		"\b\n\u0001\n\u0003\n`\b\n\u0001\n\u0003\nc\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0005\fh\b\f\n\f\f\fk\t\f\u0001\r\u0003\rn\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0003\u000et\b\u000e\u0003\u000ev\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		"\u0000\u0001\u0001\u0000\u0017\u0019\u0084\u0000 \u0001\u0000\u0000\u0000"+
		"\u0002#\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u0006/"+
		"\u0001\u0000\u0000\u0000\b2\u0001\u0000\u0000\u0000\n;\u0001\u0000\u0000"+
		"\u0000\fC\u0001\u0000\u0000\u0000\u000eJ\u0001\u0000\u0000\u0000\u0010"+
		"P\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000\u0014Y\u0001"+
		"\u0000\u0000\u0000\u0016d\u0001\u0000\u0000\u0000\u0018i\u0001\u0000\u0000"+
		"\u0000\u001am\u0001\u0000\u0000\u0000\u001cu\u0001\u0000\u0000\u0000\u001e"+
		"w\u0001\u0000\u0000\u0000 !\u0003\u0002\u0001\u0000!\"\u0005\u0000\u0000"+
		"\u0001\"\u0001\u0001\u0000\u0000\u0000#%\u0003\u0014\n\u0000$&\u0003\u0016"+
		"\u000b\u0000%$\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001"+
		"\u0000\u0000\u0000\')\u0003\u001a\r\u0000(\'\u0001\u0000\u0000\u0000("+
		")\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*+\u0003\u001e\u000f"+
		"\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0005\u001b\u0000\u0000-.\u0005"+
		"\u0002\u0000\u0000.\u0005\u0001\u0000\u0000\u0000/0\u0005\u001b\u0000"+
		"\u000001\u0005\u0007\u0000\u00001\u0007\u0001\u0000\u0000\u000024\u0005"+
		"\u001b\u0000\u000035\u0005\u000b\u0000\u000043\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u000059\u0001\u0000\u0000\u000067\u0005\u0001\u0000"+
		"\u000078\u0005\u001b\u0000\u00008:\u0005\u000b\u0000\u000096\u0001\u0000"+
		"\u0000\u00009:\u0001\u0000\u0000\u0000:\t\u0001\u0000\u0000\u0000;<\u0005"+
		"\u001b\u0000\u0000<=\u0005\u0010\u0000\u0000=\u000b\u0001\u0000\u0000"+
		"\u0000>D\u0003\u0004\u0002\u0000?D\u0005\u0003\u0000\u0000@D\u0005\u0004"+
		"\u0000\u0000AD\u0005\u0005\u0000\u0000BD\u0005\u0006\u0000\u0000C>\u0001"+
		"\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\r\u0001\u0000\u0000"+
		"\u0000EK\u0003\u0006\u0003\u0000FK\u0005\b\u0000\u0000GK\u0005\t\u0000"+
		"\u0000HK\u0005\n\u0000\u0000IK\u0005\u000f\u0000\u0000JE\u0001\u0000\u0000"+
		"\u0000JF\u0001\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JI\u0001\u0000\u0000\u0000K\u000f\u0001\u0000\u0000\u0000"+
		"LQ\u0003\b\u0004\u0000MQ\u0005\f\u0000\u0000NQ\u0005\r\u0000\u0000OQ\u0005"+
		"\u000e\u0000\u0000PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000Q\u0011\u0001\u0000"+
		"\u0000\u0000RW\u0003\n\u0005\u0000SW\u0005\u0011\u0000\u0000TW\u0005\u0012"+
		"\u0000\u0000UW\u0005\u0013\u0000\u0000VR\u0001\u0000\u0000\u0000VS\u0001"+
		"\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VU\u0001\u0000\u0000\u0000"+
		"W\u0013\u0001\u0000\u0000\u0000XZ\u0003\f\u0006\u0000YX\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000\u0000\u0000[]\u0003\u000e"+
		"\u0007\u0000\\[\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0001"+
		"\u0000\u0000\u0000^`\u0003\u0010\b\u0000_^\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000ac\u0003\u0012\t\u0000ba\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u0015\u0001\u0000\u0000"+
		"\u0000de\u0005\u0014\u0000\u0000e\u0017\u0001\u0000\u0000\u0000fh\u0005"+
		"\u001c\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u0019\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000ln\u0003\u0018\f\u0000ml\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0005"+
		"\u0015\u0000\u0000p\u001b\u0001\u0000\u0000\u0000qv\u0005\u0016\u0000"+
		"\u0000rt\u0003\u0018\f\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tv\u0001\u0000\u0000\u0000uq\u0001\u0000\u0000\u0000us\u0001\u0000"+
		"\u0000\u0000v\u001d\u0001\u0000\u0000\u0000wx\u0003\u001c\u000e\u0000"+
		"xy\u0007\u0000\u0000\u0000y\u001f\u0001\u0000\u0000\u0000\u0010%(49CJ"+
		"PVY\\_bimsu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}