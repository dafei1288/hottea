// Generated from D:/working/others/procjetAlice/testgpt/src/main/resources\Hottea.g4 by ANTLR 4.12.0
package com.dafei1288.hottea.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class HotteaLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TO", "YEAR", "THIS_YEAR", "LASt_YEAR", "NEXT_YEAR", "EVERY_YEAR", "SEASON", 
			"LAST_SEASON", "THIS_SEASON", "NEXT_SEASON", "MONTH", "LAST_MONTH", "THIS_MONTH", 
			"NEXT_MONTH", "ALL_MONTH", "DAY", "LAST_DAY", "TODAT", "TOMORROW", "AREA", 
			"TRADE", "SELL", "SUM", "DETAIL", "INCREASE", "NEWLINE", "INT", "ID"
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


	public HotteaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hottea.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001c\u00ed\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006P\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007W\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b`\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\tg\b\t\u0001\n\u0001\n\u0001\n\u0003\nl\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bs\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f|\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0083\b\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u008e\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0094\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u009a\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00c6\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u00d5\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u00de\b\u0018\u0001"+
		"\u0019\u0004\u0019\u00e1\b\u0019\u000b\u0019\f\u0019\u00e2\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0004\u001a\u00e8\b\u001a\u000b\u001a\f\u001a"+
		"\u00e9\u0001\u001b\u0001\u001b\u0000\u0000\u001c\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b"+
		"7\u001c\u0001\u0000\u0004\u0002\u0000\u53f7\u53f7\u65e5\u65e5\u0002\u0000"+
		"\n\n\r\r\u0001\u000009\u0001\u0000\u0000\u8000\uffff\u010c\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000"+
		"\u0000\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u0000"+
		"5\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00019\u0001"+
		"\u0000\u0000\u0000\u0003>\u0001\u0000\u0000\u0000\u0005@\u0001\u0000\u0000"+
		"\u0000\u0007C\u0001\u0000\u0000\u0000\tF\u0001\u0000\u0000\u0000\u000b"+
		"I\u0001\u0000\u0000\u0000\rO\u0001\u0000\u0000\u0000\u000fV\u0001\u0000"+
		"\u0000\u0000\u0011_\u0001\u0000\u0000\u0000\u0013f\u0001\u0000\u0000\u0000"+
		"\u0015k\u0001\u0000\u0000\u0000\u0017r\u0001\u0000\u0000\u0000\u0019{"+
		"\u0001\u0000\u0000\u0000\u001b\u0082\u0001\u0000\u0000\u0000\u001d\u0084"+
		"\u0001\u0000\u0000\u0000\u001f\u0087\u0001\u0000\u0000\u0000!\u008d\u0001"+
		"\u0000\u0000\u0000#\u0093\u0001\u0000\u0000\u0000%\u0099\u0001\u0000\u0000"+
		"\u0000\'\u00c5\u0001\u0000\u0000\u0000)\u00c7\u0001\u0000\u0000\u0000"+
		"+\u00ca\u0001\u0000\u0000\u0000-\u00cd\u0001\u0000\u0000\u0000/\u00d4"+
		"\u0001\u0000\u0000\u00001\u00dd\u0001\u0000\u0000\u00003\u00e0\u0001\u0000"+
		"\u0000\u00005\u00e7\u0001\u0000\u0000\u00007\u00eb\u0001\u0000\u0000\u0000"+
		"9:\u0005-\u0000\u0000:\u0002\u0001\u0000\u0000\u0000;?\u0005\u5e74\u0000"+
		"\u0000<=\u0005\u5e74\u0000\u0000=?\u0005\u5ea6\u0000\u0000>;\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000?\u0004\u0001\u0000\u0000\u0000"+
		"@A\u0005\u4eca\u0000\u0000AB\u0005\u5e74\u0000\u0000B\u0006\u0001\u0000"+
		"\u0000\u0000CD\u0005\u53bb\u0000\u0000DE\u0005\u5e74\u0000\u0000E\b\u0001"+
		"\u0000\u0000\u0000FG\u0005\u660e\u0000\u0000GH\u0005\u5e74\u0000\u0000"+
		"H\n\u0001\u0000\u0000\u0000IJ\u0005\u5386\u0000\u0000JK\u0005\u5e74\u0000"+
		"\u0000K\f\u0001\u0000\u0000\u0000LM\u0005\u5b63\u0000\u0000MP\u0005\u5ea6"+
		"\u0000\u0000NP\u0005\u5b63\u0000\u0000OL\u0001\u0000\u0000\u0000ON\u0001"+
		"\u0000\u0000\u0000P\u000e\u0001\u0000\u0000\u0000QR\u0005\u4e0a\u0000"+
		"\u0000RS\u0005\u5b63\u0000\u0000SW\u0005\u5ea6\u0000\u0000TU\u0005\u4e0a"+
		"\u0000\u0000UW\u0005\u5b63\u0000\u0000VQ\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000W\u0010\u0001\u0000\u0000\u0000XY\u0005\u672c\u0000"+
		"\u0000YZ\u0005\u5b63\u0000\u0000Z`\u0005\u5ea6\u0000\u0000[\\\u0005\u672c"+
		"\u0000\u0000\\`\u0005\u5b63\u0000\u0000]^\u0005\u5f53\u0000\u0000^`\u0005"+
		"\u5b63\u0000\u0000_X\u0001\u0000\u0000\u0000_[\u0001\u0000\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`\u0012\u0001\u0000\u0000\u0000ab\u0005\u4e0b"+
		"\u0000\u0000bc\u0005\u5b63\u0000\u0000cg\u0005\u5ea6\u0000\u0000de\u0005"+
		"\u4e0b\u0000\u0000eg\u0005\u5b63\u0000\u0000fa\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000g\u0014\u0001\u0000\u0000\u0000hl\u0005\u6708"+
		"\u0000\u0000ij\u0005\u6708\u0000\u0000jl\u0005\u4efd\u0000\u0000kh\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000l\u0016\u0001\u0000\u0000"+
		"\u0000mn\u0005\u4e0a\u0000\u0000ns\u0005\u6708\u0000\u0000op\u0005\u4e0a"+
		"\u0000\u0000pq\u0005\u6708\u0000\u0000qs\u0005\u4efd\u0000\u0000rm\u0001"+
		"\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000s\u0018\u0001\u0000\u0000"+
		"\u0000tu\u0005\u672c\u0000\u0000u|\u0005\u6708\u0000\u0000vw\u0005\u672c"+
		"\u0000\u0000wx\u0005\u6708\u0000\u0000x|\u0005\u4efd\u0000\u0000yz\u0005"+
		"\u5f53\u0000\u0000z|\u0005\u6708\u0000\u0000{t\u0001\u0000\u0000\u0000"+
		"{v\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|\u001a\u0001\u0000"+
		"\u0000\u0000}~\u0005\u4e0b\u0000\u0000~\u0083\u0005\u6708\u0000\u0000"+
		"\u007f\u0080\u0005\u4e0b\u0000\u0000\u0080\u0081\u0005\u6708\u0000\u0000"+
		"\u0081\u0083\u0005\u4efd\u0000\u0000\u0082}\u0001\u0000\u0000\u0000\u0082"+
		"\u007f\u0001\u0000\u0000\u0000\u0083\u001c\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\u5168\u0000\u0000\u0085\u0086\u0005\u5e74\u0000\u0000\u0086"+
		"\u001e\u0001\u0000\u0000\u0000\u0087\u0088\u0007\u0000\u0000\u0000\u0088"+
		" \u0001\u0000\u0000\u0000\u0089\u008a\u0005\u6628\u0000\u0000\u008a\u008e"+
		"\u0005\u65e5\u0000\u0000\u008b\u008c\u0005\u6628\u0000\u0000\u008c\u008e"+
		"\u0005\u5929\u0000\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008e\"\u0001\u0000\u0000\u0000\u008f\u0090\u0005"+
		"\u4eca\u0000\u0000\u0090\u0094\u0005\u65e5\u0000\u0000\u0091\u0092\u0005"+
		"\u4eca\u0000\u0000\u0092\u0094\u0005\u5929\u0000\u0000\u0093\u008f\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094$\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\u660e\u0000\u0000\u0096\u009a\u0005\u65e5"+
		"\u0000\u0000\u0097\u0098\u0005\u660e\u0000\u0000\u0098\u009a\u0005\u5929"+
		"\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u009a&\u0001\u0000\u0000\u0000\u009b\u009c\u0005\u534e\u0000"+
		"\u0000\u009c\u00c6\u0005\u4e2d\u0000\u0000\u009d\u009e\u0005\u534e\u0000"+
		"\u0000\u009e\u009f\u0005\u4e2d\u0000\u0000\u009f\u00a0\u0005\u5730\u0000"+
		"\u0000\u00a0\u00c6\u0005\u533a\u0000\u0000\u00a1\u00a2\u0005\u8000\u897f"+
		"\u0000\u0000\u00a2\u00c6\u0005\u5357\u0000\u0000\u00a3\u00a4\u0005\u8000"+
		"\u897f\u0000\u0000\u00a4\u00a5\u0005\u5357\u0000\u0000\u00a5\u00a6\u0005"+
		"\u5730\u0000\u0000\u00a6\u00c6\u0005\u533a\u0000\u0000\u00a7\u00a8\u0005"+
		"\u8000\u897f\u0000\u0000\u00a8\u00c6\u0005\u5317\u0000\u0000\u00a9\u00aa"+
		"\u0005\u8000\u897f\u0000\u0000\u00aa\u00ab\u0005\u5317\u0000\u0000\u00ab"+
		"\u00ac\u0005\u5730\u0000\u0000\u00ac\u00c6\u0005\u533a\u0000\u0000\u00ad"+
		"\u00ae\u0005\u4e1c\u0000\u0000\u00ae\u00c6\u0005\u5317\u0000\u0000\u00af"+
		"\u00b0\u0005\u4e1c\u0000\u0000\u00b0\u00b1\u0005\u5317\u0000\u0000\u00b1"+
		"\u00b2\u0005\u5730\u0000\u0000\u00b2\u00c6\u0005\u533a\u0000\u0000\u00b3"+
		"\u00b4\u0005\u534e\u0000\u0000\u00b4\u00c6\u0005\u4e1c\u0000\u0000\u00b5"+
		"\u00b6\u0005\u534e\u0000\u0000\u00b6\u00b7\u0005\u4e1c\u0000\u0000\u00b7"+
		"\u00b8\u0005\u5730\u0000\u0000\u00b8\u00c6\u0005\u533a\u0000\u0000\u00b9"+
		"\u00ba\u0005\u534e\u0000\u0000\u00ba\u00c6\u0005\u5317\u0000\u0000\u00bb"+
		"\u00bc\u0005\u534e\u0000\u0000\u00bc\u00bd\u0005\u5317\u0000\u0000\u00bd"+
		"\u00be\u0005\u5730\u0000\u0000\u00be\u00c6\u0005\u533a\u0000\u0000\u00bf"+
		"\u00c0\u0005\u534e\u0000\u0000\u00c0\u00c6\u0005\u5357\u0000\u0000\u00c1"+
		"\u00c2\u0005\u534e\u0000\u0000\u00c2\u00c3\u0005\u5357\u0000\u0000\u00c3"+
		"\u00c4\u0005\u5730\u0000\u0000\u00c4\u00c6\u0005\u533a\u0000\u0000\u00c5"+
		"\u009b\u0001\u0000\u0000\u0000\u00c5\u009d\u0001\u0000\u0000\u0000\u00c5"+
		"\u00a1\u0001\u0000\u0000\u0000\u00c5\u00a3\u0001\u0000\u0000\u0000\u00c5"+
		"\u00a7\u0001\u0000\u0000\u0000\u00c5\u00a9\u0001\u0000\u0000\u0000\u00c5"+
		"\u00ad\u0001\u0000\u0000\u0000\u00c5\u00af\u0001\u0000\u0000\u0000\u00c5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00c5\u00b5\u0001\u0000\u0000\u0000\u00c5"+
		"\u00b9\u0001\u0000\u0000\u0000\u00c5\u00bb\u0001\u0000\u0000\u0000\u00c5"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c1\u0001\u0000\u0000\u0000\u00c6"+
		"(\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u8000\u884c\u0000\u0000\u00c8"+
		"\u00c9\u0005\u4e1a\u0000\u0000\u00c9*\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0005\u8000\u9500\u0000\u0000\u00cb\u00cc\u0005\u552e\u0000\u0000\u00cc"+
		",\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005\u6c47\u0000\u0000\u00ce\u00cf"+
		"\u0005\u603b\u0000\u0000\u00cf.\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005"+
		"\u660e\u0000\u0000\u00d1\u00d5\u0005\u7ec6\u0000\u0000\u00d2\u00d3\u0005"+
		"\u8000\u8bb0\u0000\u0000\u00d3\u00d5\u0005\u5f55\u0000\u0000\u00d4\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d50\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\u589e\u0000\u0000\u00d7\u00de\u0005"+
		"\u8000\u901f\u0000\u0000\u00d8\u00d9\u0005\u6da8\u0000\u0000\u00d9\u00de"+
		"\u0005\u5e45\u0000\u0000\u00da\u00db\u0005\u589e\u0000\u0000\u00db\u00dc"+
		"\u0005\u8000\u957f\u0000\u0000\u00dc\u00de\u0005\u7387\u0000\u0000\u00dd"+
		"\u00d6\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000\u0000\u0000\u00dd"+
		"\u00da\u0001\u0000\u0000\u0000\u00de2\u0001\u0000\u0000\u0000\u00df\u00e1"+
		"\u0007\u0001\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0006\u0019\u0000\u0000\u00e54\u0001\u0000\u0000\u0000\u00e6\u00e8\u0007"+
		"\u0002\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001"+
		"\u0000\u0000\u0000\u00ea6\u0001\u0000\u0000\u0000\u00eb\u00ec\u0007\u0003"+
		"\u0000\u0000\u00ec8\u0001\u0000\u0000\u0000\u0012\u0000>OV_fkr{\u0082"+
		"\u008d\u0093\u0099\u00c5\u00d4\u00dd\u00e2\u00e9\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}