// Generated from C:/dev/IdeaProjects/parser/src/main/resources\MineCraft.g4 by ANTLR 4.7
package com.suchasplus.gen.minecraft;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MineCraftLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, INT=3, ALL=4, WS=5, INTERSECT_TOKEN=6, JUNCTION_TOKEN=7, 
		EXCLUDE_TOKEN=8, ENTITY_UPLOAD_TOKEN=9, ENTITY_CAMPAIGN_TOKEN=10, ENTITY_AD_TOKEN=11, 
		ENTITY_CREATIVE_TOKEN=12, ENTITY_PARAM_FREQ=13, ENTITY_PARAM_TS=14, ENTITY_UBHV_VIEW=15, 
		ENTITY_UBHV_CLICK=16, ENTITY_UBHV_COMMENT=17, ENTITY_UBHV_REPOST=18, ENTITY_UBHV_LIKE=19, 
		StringLiteral=20, LPAREN=21, RPAREN=22, LBRACE=23, RBRACE=24, LBRACK=25, 
		RBRACK=26, SEMI=27, COMMA=28, DOT=29, ASSIGN=30, GT=31, LT=32, BANG=33, 
		TILDE=34, QUESTION=35, COLON=36, EQUAL=37, LE=38, GE=39, NOTEQUAL=40, 
		AND=41, OR=42, INC=43, DEC=44, ADD=45, SUB=46, MUL=47, DIV=48, BITAND=49, 
		BITOR=50, CARET=51, MOD=52, ARROW=53, COLONCOLON=54, ADD_ASSIGN=55, SUB_ASSIGN=56, 
		MUL_ASSIGN=57, DIV_ASSIGN=58, AND_ASSIGN=59, OR_ASSIGN=60, XOR_ASSIGN=61, 
		MOD_ASSIGN=62, LSHIFT_ASSIGN=63, RSHIFT_ASSIGN=64, URSHIFT_ASSIGN=65;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "INT", "ALL", "WS", "INTERSECT_TOKEN", "JUNCTION_TOKEN", 
		"EXCLUDE_TOKEN", "ENTITY_UPLOAD_TOKEN", "ENTITY_CAMPAIGN_TOKEN", "ENTITY_AD_TOKEN", 
		"ENTITY_CREATIVE_TOKEN", "ENTITY_PARAM_FREQ", "ENTITY_PARAM_TS", "ENTITY_UBHV_VIEW", 
		"ENTITY_UBHV_CLICK", "ENTITY_UBHV_COMMENT", "ENTITY_UBHV_REPOST", "ENTITY_UBHV_LIKE", 
		"StringLiteral", "StringCharacters", "StringCharacter", "EscapeSequence", 
		"OctalEscape", "ZeroToThree", "UnicodeEscape", "OctalDigits", "OctalDigit", 
		"OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "HexDigit", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ids'", "'bhv'", null, "'-1'", null, null, null, null, null, null, 
		null, null, null, null, "'VIEW'", "'CLICK'", "'COMMENT'", "'REPOST'", 
		"'LIKE'", null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
		"'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", "'-='", "'*='", "'/='", 
		"'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "INT", "ALL", "WS", "INTERSECT_TOKEN", "JUNCTION_TOKEN", 
		"EXCLUDE_TOKEN", "ENTITY_UPLOAD_TOKEN", "ENTITY_CAMPAIGN_TOKEN", "ENTITY_AD_TOKEN", 
		"ENTITY_CREATIVE_TOKEN", "ENTITY_PARAM_FREQ", "ENTITY_PARAM_TS", "ENTITY_UBHV_VIEW", 
		"ENTITY_UBHV_CLICK", "ENTITY_UBHV_COMMENT", "ENTITY_UBHV_REPOST", "ENTITY_UBHV_LIKE", 
		"StringLiteral", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", 
		"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN"
	};
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


	public MineCraftLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MineCraft.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2C\u01d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\6\4\u00a7\n\4\r\4\16\4\u00a8\5\4\u00ab\n\4\3\5\3\5\3\5\3\6\6\6\u00b1"+
		"\n\6\r\6\16\6\u00b2\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\5\25\u0122\n\25\3\25\3\25\3\26\6\26\u0127"+
		"\n\26\r\26\16\26\u0128\3\27\3\27\5\27\u012d\n\27\3\30\3\30\3\30\3\30\5"+
		"\30\u0133\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u0140\n\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\5\34\u014d\n\34\3\34\5\34\u0150\n\34\3\35\3\35\3\36\6\36\u0155\n\36\r"+
		"\36\16\36\u0156\3\37\3\37\5\37\u015b\n\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\3:\3:"+
		"\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D"+
		"\3D\3E\3E\3E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3J\3J\3J\3K\3K\3K\3K"+
		"\3L\3L\3L\3L\3M\3M\3M\3M\3M\2\2N\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\2\61"+
		"\2\63\2\65\2\67\29\2;\2=\2?\2A\27C\30E\31G\32I\33K\34M\35O\36Q\37S U!"+
		"W\"Y#[$]%_&a\'c(e)g*i+k,m-o.q/s\60u\61w\62y\63{\64}\65\177\66\u0081\67"+
		"\u00838\u00859\u0087:\u0089;\u008b<\u008d=\u008f>\u0091?\u0093@\u0095"+
		"A\u0097B\u0099C\3\2\37\3\2\62;\3\2\63;\5\2\13\f\17\17\"\"\4\2KKkk\4\2"+
		"PPpp\4\2VVvv\4\2GGgg\4\2TTtt\4\2UUuu\4\2EEee\4\2LLll\4\2WWww\4\2QQqq\4"+
		"\2ZZzz\4\2NNnn\4\2FFff\4\2RRrr\4\2CCcc\4\2OOoo\4\2IIii\4\2XXxx\4\2HHh"+
		"h\4\2SSss\4\2[[{{\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\3\2"+
		"\629\5\2\62;CHch\2\u01d3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009b"+
		"\3\2\2\2\5\u009f\3\2\2\2\7\u00aa\3\2\2\2\t\u00ac\3\2\2\2\13\u00b0\3\2"+
		"\2\2\r\u00b6\3\2\2\2\17\u00c0\3\2\2\2\21\u00c9\3\2\2\2\23\u00d1\3\2\2"+
		"\2\25\u00d8\3\2\2\2\27\u00e1\3\2\2\2\31\u00e4\3\2\2\2\33\u00ed\3\2\2\2"+
		"\35\u00f7\3\2\2\2\37\u0100\3\2\2\2!\u0105\3\2\2\2#\u010b\3\2\2\2%\u0113"+
		"\3\2\2\2\'\u011a\3\2\2\2)\u011f\3\2\2\2+\u0126\3\2\2\2-\u012c\3\2\2\2"+
		"/\u0132\3\2\2\2\61\u013f\3\2\2\2\63\u0141\3\2\2\2\65\u0143\3\2\2\2\67"+
		"\u014a\3\2\2\29\u0151\3\2\2\2;\u0154\3\2\2\2=\u015a\3\2\2\2?\u015c\3\2"+
		"\2\2A\u015e\3\2\2\2C\u0160\3\2\2\2E\u0162\3\2\2\2G\u0164\3\2\2\2I\u0166"+
		"\3\2\2\2K\u0168\3\2\2\2M\u016a\3\2\2\2O\u016c\3\2\2\2Q\u016e\3\2\2\2S"+
		"\u0170\3\2\2\2U\u0172\3\2\2\2W\u0174\3\2\2\2Y\u0176\3\2\2\2[\u0178\3\2"+
		"\2\2]\u017a\3\2\2\2_\u017c\3\2\2\2a\u017e\3\2\2\2c\u0181\3\2\2\2e\u0184"+
		"\3\2\2\2g\u0187\3\2\2\2i\u018a\3\2\2\2k\u018d\3\2\2\2m\u0190\3\2\2\2o"+
		"\u0193\3\2\2\2q\u0196\3\2\2\2s\u0198\3\2\2\2u\u019a\3\2\2\2w\u019c\3\2"+
		"\2\2y\u019e\3\2\2\2{\u01a0\3\2\2\2}\u01a2\3\2\2\2\177\u01a4\3\2\2\2\u0081"+
		"\u01a6\3\2\2\2\u0083\u01a9\3\2\2\2\u0085\u01ac\3\2\2\2\u0087\u01af\3\2"+
		"\2\2\u0089\u01b2\3\2\2\2\u008b\u01b5\3\2\2\2\u008d\u01b8\3\2\2\2\u008f"+
		"\u01bb\3\2\2\2\u0091\u01be\3\2\2\2\u0093\u01c1\3\2\2\2\u0095\u01c4\3\2"+
		"\2\2\u0097\u01c8\3\2\2\2\u0099\u01cc\3\2\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7f\2\2\u009d\u009e\7u\2\2\u009e\4\3\2\2\2\u009f\u00a0\7d\2\2\u00a0"+
		"\u00a1\7j\2\2\u00a1\u00a2\7x\2\2\u00a2\6\3\2\2\2\u00a3\u00ab\t\2\2\2\u00a4"+
		"\u00a6\t\3\2\2\u00a5\u00a7\t\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a3\3\2\2\2\u00aa\u00a4\3\2\2\2\u00ab\b\3\2\2\2\u00ac\u00ad\7/\2\2"+
		"\u00ad\u00ae\7\63\2\2\u00ae\n\3\2\2\2\u00af\u00b1\t\4\2\2\u00b0\u00af"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b5\b\6\2\2\u00b5\f\3\2\2\2\u00b6\u00b7\t\5\2\2"+
		"\u00b7\u00b8\t\6\2\2\u00b8\u00b9\t\7\2\2\u00b9\u00ba\t\b\2\2\u00ba\u00bb"+
		"\t\t\2\2\u00bb\u00bc\t\n\2\2\u00bc\u00bd\t\b\2\2\u00bd\u00be\t\13\2\2"+
		"\u00be\u00bf\t\7\2\2\u00bf\16\3\2\2\2\u00c0\u00c1\t\f\2\2\u00c1\u00c2"+
		"\t\r\2\2\u00c2\u00c3\t\6\2\2\u00c3\u00c4\t\13\2\2\u00c4\u00c5\t\7\2\2"+
		"\u00c5\u00c6\t\5\2\2\u00c6\u00c7\t\16\2\2\u00c7\u00c8\t\6\2\2\u00c8\20"+
		"\3\2\2\2\u00c9\u00ca\t\b\2\2\u00ca\u00cb\t\17\2\2\u00cb\u00cc\t\13\2\2"+
		"\u00cc\u00cd\t\20\2\2\u00cd\u00ce\t\r\2\2\u00ce\u00cf\t\21\2\2\u00cf\u00d0"+
		"\t\b\2\2\u00d0\22\3\2\2\2\u00d1\u00d2\t\r\2\2\u00d2\u00d3\t\22\2\2\u00d3"+
		"\u00d4\t\20\2\2\u00d4\u00d5\t\16\2\2\u00d5\u00d6\t\23\2\2\u00d6\u00d7"+
		"\t\21\2\2\u00d7\24\3\2\2\2\u00d8\u00d9\t\13\2\2\u00d9\u00da\t\23\2\2\u00da"+
		"\u00db\t\24\2\2\u00db\u00dc\t\22\2\2\u00dc\u00dd\t\23\2\2\u00dd\u00de"+
		"\t\5\2\2\u00de\u00df\t\25\2\2\u00df\u00e0\t\6\2\2\u00e0\26\3\2\2\2\u00e1"+
		"\u00e2\t\23\2\2\u00e2\u00e3\t\21\2\2\u00e3\30\3\2\2\2\u00e4\u00e5\t\13"+
		"\2\2\u00e5\u00e6\t\t\2\2\u00e6\u00e7\t\b\2\2\u00e7\u00e8\t\23\2\2\u00e8"+
		"\u00e9\t\7\2\2\u00e9\u00ea\t\5\2\2\u00ea\u00eb\t\26\2\2\u00eb\u00ec\t"+
		"\b\2\2\u00ec\32\3\2\2\2\u00ed\u00ee\t\27\2\2\u00ee\u00ef\t\t\2\2\u00ef"+
		"\u00f0\t\b\2\2\u00f0\u00f1\t\30\2\2\u00f1\u00f2\t\r\2\2\u00f2\u00f3\t"+
		"\b\2\2\u00f3\u00f4\t\6\2\2\u00f4\u00f5\t\13\2\2\u00f5\u00f6\t\31\2\2\u00f6"+
		"\34\3\2\2\2\u00f7\u00f8\t\7\2\2\u00f8\u00f9\t\5\2\2\u00f9\u00fa\t\24\2"+
		"\2\u00fa\u00fb\t\b\2\2\u00fb\u00fc\t\n\2\2\u00fc\u00fd\t\22\2\2\u00fd"+
		"\u00fe\t\23\2\2\u00fe\u00ff\t\6\2\2\u00ff\36\3\2\2\2\u0100\u0101\7X\2"+
		"\2\u0101\u0102\7K\2\2\u0102\u0103\7G\2\2\u0103\u0104\7Y\2\2\u0104 \3\2"+
		"\2\2\u0105\u0106\7E\2\2\u0106\u0107\7N\2\2\u0107\u0108\7K\2\2\u0108\u0109"+
		"\7E\2\2\u0109\u010a\7M\2\2\u010a\"\3\2\2\2\u010b\u010c\7E\2\2\u010c\u010d"+
		"\7Q\2\2\u010d\u010e\7O\2\2\u010e\u010f\7O\2\2\u010f\u0110\7G\2\2\u0110"+
		"\u0111\7P\2\2\u0111\u0112\7V\2\2\u0112$\3\2\2\2\u0113\u0114\7T\2\2\u0114"+
		"\u0115\7G\2\2\u0115\u0116\7R\2\2\u0116\u0117\7Q\2\2\u0117\u0118\7U\2\2"+
		"\u0118\u0119\7V\2\2\u0119&\3\2\2\2\u011a\u011b\7N\2\2\u011b\u011c\7K\2"+
		"\2\u011c\u011d\7M\2\2\u011d\u011e\7G\2\2\u011e(\3\2\2\2\u011f\u0121\7"+
		"$\2\2\u0120\u0122\5+\26\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\7$\2\2\u0124*\3\2\2\2\u0125\u0127\5-\27\2\u0126"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129,\3\2\2\2\u012a\u012d\n\32\2\2\u012b\u012d\5/\30\2\u012c\u012a"+
		"\3\2\2\2\u012c\u012b\3\2\2\2\u012d.\3\2\2\2\u012e\u012f\7^\2\2\u012f\u0133"+
		"\t\33\2\2\u0130\u0133\5\61\31\2\u0131\u0133\5\65\33\2\u0132\u012e\3\2"+
		"\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\60\3\2\2\2\u0134\u0135"+
		"\7^\2\2\u0135\u0140\59\35\2\u0136\u0137\7^\2\2\u0137\u0138\59\35\2\u0138"+
		"\u0139\59\35\2\u0139\u0140\3\2\2\2\u013a\u013b\7^\2\2\u013b\u013c\5\63"+
		"\32\2\u013c\u013d\59\35\2\u013d\u013e\59\35\2\u013e\u0140\3\2\2\2\u013f"+
		"\u0134\3\2\2\2\u013f\u0136\3\2\2\2\u013f\u013a\3\2\2\2\u0140\62\3\2\2"+
		"\2\u0141\u0142\t\34\2\2\u0142\64\3\2\2\2\u0143\u0144\7^\2\2\u0144\u0145"+
		"\7w\2\2\u0145\u0146\5? \2\u0146\u0147\5? \2\u0147\u0148\5? \2\u0148\u0149"+
		"\5? \2\u0149\66\3\2\2\2\u014a\u014f\59\35\2\u014b\u014d\5;\36\2\u014c"+
		"\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\59"+
		"\35\2\u014f\u014c\3\2\2\2\u014f\u0150\3\2\2\2\u01508\3\2\2\2\u0151\u0152"+
		"\t\35\2\2\u0152:\3\2\2\2\u0153\u0155\5=\37\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157<\3\2\2\2"+
		"\u0158\u015b\59\35\2\u0159\u015b\7a\2\2\u015a\u0158\3\2\2\2\u015a\u0159"+
		"\3\2\2\2\u015b>\3\2\2\2\u015c\u015d\t\36\2\2\u015d@\3\2\2\2\u015e\u015f"+
		"\7*\2\2\u015fB\3\2\2\2\u0160\u0161\7+\2\2\u0161D\3\2\2\2\u0162\u0163\7"+
		"}\2\2\u0163F\3\2\2\2\u0164\u0165\7\177\2\2\u0165H\3\2\2\2\u0166\u0167"+
		"\7]\2\2\u0167J\3\2\2\2\u0168\u0169\7_\2\2\u0169L\3\2\2\2\u016a\u016b\7"+
		"=\2\2\u016bN\3\2\2\2\u016c\u016d\7.\2\2\u016dP\3\2\2\2\u016e\u016f\7\60"+
		"\2\2\u016fR\3\2\2\2\u0170\u0171\7?\2\2\u0171T\3\2\2\2\u0172\u0173\7@\2"+
		"\2\u0173V\3\2\2\2\u0174\u0175\7>\2\2\u0175X\3\2\2\2\u0176\u0177\7#\2\2"+
		"\u0177Z\3\2\2\2\u0178\u0179\7\u0080\2\2\u0179\\\3\2\2\2\u017a\u017b\7"+
		"A\2\2\u017b^\3\2\2\2\u017c\u017d\7<\2\2\u017d`\3\2\2\2\u017e\u017f\7?"+
		"\2\2\u017f\u0180\7?\2\2\u0180b\3\2\2\2\u0181\u0182\7>\2\2\u0182\u0183"+
		"\7?\2\2\u0183d\3\2\2\2\u0184\u0185\7@\2\2\u0185\u0186\7?\2\2\u0186f\3"+
		"\2\2\2\u0187\u0188\7#\2\2\u0188\u0189\7?\2\2\u0189h\3\2\2\2\u018a\u018b"+
		"\7(\2\2\u018b\u018c\7(\2\2\u018cj\3\2\2\2\u018d\u018e\7~\2\2\u018e\u018f"+
		"\7~\2\2\u018fl\3\2\2\2\u0190\u0191\7-\2\2\u0191\u0192\7-\2\2\u0192n\3"+
		"\2\2\2\u0193\u0194\7/\2\2\u0194\u0195\7/\2\2\u0195p\3\2\2\2\u0196\u0197"+
		"\7-\2\2\u0197r\3\2\2\2\u0198\u0199\7/\2\2\u0199t\3\2\2\2\u019a\u019b\7"+
		",\2\2\u019bv\3\2\2\2\u019c\u019d\7\61\2\2\u019dx\3\2\2\2\u019e\u019f\7"+
		"(\2\2\u019fz\3\2\2\2\u01a0\u01a1\7~\2\2\u01a1|\3\2\2\2\u01a2\u01a3\7`"+
		"\2\2\u01a3~\3\2\2\2\u01a4\u01a5\7\'\2\2\u01a5\u0080\3\2\2\2\u01a6\u01a7"+
		"\7/\2\2\u01a7\u01a8\7@\2\2\u01a8\u0082\3\2\2\2\u01a9\u01aa\7<\2\2\u01aa"+
		"\u01ab\7<\2\2\u01ab\u0084\3\2\2\2\u01ac\u01ad\7-\2\2\u01ad\u01ae\7?\2"+
		"\2\u01ae\u0086\3\2\2\2\u01af\u01b0\7/\2\2\u01b0\u01b1\7?\2\2\u01b1\u0088"+
		"\3\2\2\2\u01b2\u01b3\7,\2\2\u01b3\u01b4\7?\2\2\u01b4\u008a\3\2\2\2\u01b5"+
		"\u01b6\7\61\2\2\u01b6\u01b7\7?\2\2\u01b7\u008c\3\2\2\2\u01b8\u01b9\7("+
		"\2\2\u01b9\u01ba\7?\2\2\u01ba\u008e\3\2\2\2\u01bb\u01bc\7~\2\2\u01bc\u01bd"+
		"\7?\2\2\u01bd\u0090\3\2\2\2\u01be\u01bf\7`\2\2\u01bf\u01c0\7?\2\2\u01c0"+
		"\u0092\3\2\2\2\u01c1\u01c2\7\'\2\2\u01c2\u01c3\7?\2\2\u01c3\u0094\3\2"+
		"\2\2\u01c4\u01c5\7>\2\2\u01c5\u01c6\7>\2\2\u01c6\u01c7\7?\2\2\u01c7\u0096"+
		"\3\2\2\2\u01c8\u01c9\7@\2\2\u01c9\u01ca\7@\2\2\u01ca\u01cb\7?\2\2\u01cb"+
		"\u0098\3\2\2\2\u01cc\u01cd\7@\2\2\u01cd\u01ce\7@\2\2\u01ce\u01cf\7@\2"+
		"\2\u01cf\u01d0\7?\2\2\u01d0\u009a\3\2\2\2\17\2\u00a8\u00aa\u00b2\u0121"+
		"\u0128\u012c\u0132\u013f\u014c\u014f\u0156\u015a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}