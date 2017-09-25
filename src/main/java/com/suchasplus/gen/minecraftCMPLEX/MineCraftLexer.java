// Generated from C:/dev/IdeaProjects/parser/src/main/resources\MineCraft.g4 by ANTLR 4.7
package com.suchasplus.gen.minecraftCMPLEX;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MineCraftLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, EntityId=3, Integer=4, WS=5, DATASET_TOKEN=6, INTERSECT_TOKEN=7, 
		JUNCTION_TOKEN=8, EXCLUDE_TOKEN=9, ENTITY_UPLOAD_TOKEN=10, ENTITY_CAMPAIGN_TOKEN=11, 
		ENTITY_AD_TOKEN=12, ENTITY_CREATIVE_TOKEN=13, StringLiteral=14, LPAREN=15, 
		RPAREN=16, LBRACE=17, RBRACE=18, LBRACK=19, RBRACK=20, SEMI=21, COMMA=22, 
		DOT=23, ASSIGN=24, GT=25, LT=26, BANG=27, TILDE=28, QUESTION=29, COLON=30, 
		EQUAL=31, LE=32, GE=33, NOTEQUAL=34, AND=35, OR=36, INC=37, DEC=38, ADD=39, 
		SUB=40, MUL=41, DIV=42, BITAND=43, BITOR=44, CARET=45, MOD=46, ARROW=47, 
		COLONCOLON=48, ADD_ASSIGN=49, SUB_ASSIGN=50, MUL_ASSIGN=51, DIV_ASSIGN=52, 
		AND_ASSIGN=53, OR_ASSIGN=54, XOR_ASSIGN=55, MOD_ASSIGN=56, LSHIFT_ASSIGN=57, 
		RSHIFT_ASSIGN=58, URSHIFT_ASSIGN=59;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "EntityId", "Integer", "WS", "DATASET_TOKEN", "INTERSECT_TOKEN", 
		"JUNCTION_TOKEN", "EXCLUDE_TOKEN", "ENTITY_UPLOAD_TOKEN", "ENTITY_CAMPAIGN_TOKEN", 
		"ENTITY_AD_TOKEN", "ENTITY_CREATIVE_TOKEN", "StringLiteral", "StringCharacters", 
		"StringCharacter", "EscapeSequence", "OctalEscape", "ZeroToThree", "UnicodeEscape", 
		"OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", 
		"HexDigit", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", 
		"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", 
		"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", 
		"SUB", "MUL", "DIV", "BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", 
		"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", 
		"OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", 
		"URSHIFT_ASSIGN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'Result'", "'id'", null, null, null, null, null, null, null, null, 
		null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
		"','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", 
		"'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'->'", "'::'", "'+='", "'-='", 
		"'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "EntityId", "Integer", "WS", "DATASET_TOKEN", "INTERSECT_TOKEN", 
		"JUNCTION_TOKEN", "EXCLUDE_TOKEN", "ENTITY_UPLOAD_TOKEN", "ENTITY_CAMPAIGN_TOKEN", 
		"ENTITY_AD_TOKEN", "ENTITY_CREATIVE_TOKEN", "StringLiteral", "LPAREN", 
		"RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", 
		"ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", 
		"GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", 
		"BITAND", "BITOR", "CARET", "MOD", "ARROW", "COLONCOLON", "ADD_ASSIGN", 
		"SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", 
		"MOD_ASSIGN", "LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN"
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
	public String getGrammarFileName() { return "MineCraftCMPLEX.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2=\u01a0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\6\4\u009c\n\4\r\4\16\4\u009d\3"+
		"\5\3\5\3\5\6\5\u00a3\n\5\r\5\16\5\u00a4\5\5\u00a7\n\5\3\6\6\6\u00aa\n"+
		"\6\r\6\16\6\u00ab\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\5\17\u00f1\n\17\3\17\3\17\3\20\6\20\u00f6\n"+
		"\20\r\20\16\20\u00f7\3\21\3\21\5\21\u00fc\n\21\3\22\3\22\3\22\3\22\5\22"+
		"\u0102\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u010f\n\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\5\26"+
		"\u011c\n\26\3\26\5\26\u011f\n\26\3\27\3\27\3\30\6\30\u0124\n\30\r\30\16"+
		"\30\u0125\3\31\3\31\5\31\u012a\n\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3"+
		"/\3\60\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3"+
		"=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3E\3"+
		"E\3E\3E\3F\3F\3F\3F\3G\3G\3G\3G\3G\2\2H\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2#\2%\2\'\2)\2+\2-\2/\2"+
		"\61\2\63\2\65\21\67\229\23;\24=\25?\26A\27C\30E\31G\32I\33K\34M\35O\36"+
		"Q\37S U!W\"Y#[$]%_&a\'c(e)g*i+k,m-o.q/s\60u\61w\62y\63{\64}\65\177\66"+
		"\u0081\67\u00838\u00859\u0087:\u0089;\u008b<\u008d=\3\2\34\3\2\63;\3\2"+
		"\62;\5\2\13\f\17\17\"\"\4\2FFff\4\2CCcc\4\2VVvv\4\2UUuu\4\2GGgg\4\2KK"+
		"kk\4\2PPpp\4\2TTtt\4\2EEee\4\2LLll\4\2WWww\4\2QQqq\4\2ZZzz\4\2NNnn\4\2"+
		"RRrr\4\2OOoo\4\2IIii\4\2XXxx\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\3\2"+
		"\62\65\3\2\629\5\2\62;CHch\2\u01a3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0096"+
		"\3\2\2\2\7\u0099\3\2\2\2\t\u00a6\3\2\2\2\13\u00a9\3\2\2\2\r\u00af\3\2"+
		"\2\2\17\u00b7\3\2\2\2\21\u00c1\3\2\2\2\23\u00ca\3\2\2\2\25\u00d2\3\2\2"+
		"\2\27\u00d9\3\2\2\2\31\u00e2\3\2\2\2\33\u00e5\3\2\2\2\35\u00ee\3\2\2\2"+
		"\37\u00f5\3\2\2\2!\u00fb\3\2\2\2#\u0101\3\2\2\2%\u010e\3\2\2\2\'\u0110"+
		"\3\2\2\2)\u0112\3\2\2\2+\u0119\3\2\2\2-\u0120\3\2\2\2/\u0123\3\2\2\2\61"+
		"\u0129\3\2\2\2\63\u012b\3\2\2\2\65\u012d\3\2\2\2\67\u012f\3\2\2\29\u0131"+
		"\3\2\2\2;\u0133\3\2\2\2=\u0135\3\2\2\2?\u0137\3\2\2\2A\u0139\3\2\2\2C"+
		"\u013b\3\2\2\2E\u013d\3\2\2\2G\u013f\3\2\2\2I\u0141\3\2\2\2K\u0143\3\2"+
		"\2\2M\u0145\3\2\2\2O\u0147\3\2\2\2Q\u0149\3\2\2\2S\u014b\3\2\2\2U\u014d"+
		"\3\2\2\2W\u0150\3\2\2\2Y\u0153\3\2\2\2[\u0156\3\2\2\2]\u0159\3\2\2\2_"+
		"\u015c\3\2\2\2a\u015f\3\2\2\2c\u0162\3\2\2\2e\u0165\3\2\2\2g\u0167\3\2"+
		"\2\2i\u0169\3\2\2\2k\u016b\3\2\2\2m\u016d\3\2\2\2o\u016f\3\2\2\2q\u0171"+
		"\3\2\2\2s\u0173\3\2\2\2u\u0175\3\2\2\2w\u0178\3\2\2\2y\u017b\3\2\2\2{"+
		"\u017e\3\2\2\2}\u0181\3\2\2\2\177\u0184\3\2\2\2\u0081\u0187\3\2\2\2\u0083"+
		"\u018a\3\2\2\2\u0085\u018d\3\2\2\2\u0087\u0190\3\2\2\2\u0089\u0193\3\2"+
		"\2\2\u008b\u0197\3\2\2\2\u008d\u019b\3\2\2\2\u008f\u0090\7T\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7u\2\2\u0092\u0093\7w\2\2\u0093\u0094\7n\2\2"+
		"\u0094\u0095\7v\2\2\u0095\4\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7f"+
		"\2\2\u0098\6\3\2\2\2\u0099\u009b\t\2\2\2\u009a\u009c\t\3\2\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\b\3\2\2\2\u009f\u00a7\t\3\2\2\u00a0\u00a2\t\2\2\2\u00a1\u00a3\t\3\2\2"+
		"\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5"+
		"\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7"+
		"\n\3\2\2\2\u00a8\u00aa\t\4\2\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae"+
		"\b\6\2\2\u00ae\f\3\2\2\2\u00af\u00b0\t\5\2\2\u00b0\u00b1\t\6\2\2\u00b1"+
		"\u00b2\t\7\2\2\u00b2\u00b3\t\6\2\2\u00b3\u00b4\t\b\2\2\u00b4\u00b5\t\t"+
		"\2\2\u00b5\u00b6\t\7\2\2\u00b6\16\3\2\2\2\u00b7\u00b8\t\n\2\2\u00b8\u00b9"+
		"\t\13\2\2\u00b9\u00ba\t\7\2\2\u00ba\u00bb\t\t\2\2\u00bb\u00bc\t\f\2\2"+
		"\u00bc\u00bd\t\b\2\2\u00bd\u00be\t\t\2\2\u00be\u00bf\t\r\2\2\u00bf\u00c0"+
		"\t\7\2\2\u00c0\20\3\2\2\2\u00c1\u00c2\t\16\2\2\u00c2\u00c3\t\17\2\2\u00c3"+
		"\u00c4\t\13\2\2\u00c4\u00c5\t\r\2\2\u00c5\u00c6\t\7\2\2\u00c6\u00c7\t"+
		"\n\2\2\u00c7\u00c8\t\20\2\2\u00c8\u00c9\t\13\2\2\u00c9\22\3\2\2\2\u00ca"+
		"\u00cb\t\t\2\2\u00cb\u00cc\t\21\2\2\u00cc\u00cd\t\r\2\2\u00cd\u00ce\t"+
		"\22\2\2\u00ce\u00cf\t\17\2\2\u00cf\u00d0\t\5\2\2\u00d0\u00d1\t\t\2\2\u00d1"+
		"\24\3\2\2\2\u00d2\u00d3\t\17\2\2\u00d3\u00d4\t\23\2\2\u00d4\u00d5\t\22"+
		"\2\2\u00d5\u00d6\t\20\2\2\u00d6\u00d7\t\6\2\2\u00d7\u00d8\t\5\2\2\u00d8"+
		"\26\3\2\2\2\u00d9\u00da\t\r\2\2\u00da\u00db\t\6\2\2\u00db\u00dc\t\24\2"+
		"\2\u00dc\u00dd\t\23\2\2\u00dd\u00de\t\6\2\2\u00de\u00df\t\n\2\2\u00df"+
		"\u00e0\t\25\2\2\u00e0\u00e1\t\13\2\2\u00e1\30\3\2\2\2\u00e2\u00e3\t\6"+
		"\2\2\u00e3\u00e4\t\5\2\2\u00e4\32\3\2\2\2\u00e5\u00e6\t\r\2\2\u00e6\u00e7"+
		"\t\f\2\2\u00e7\u00e8\t\t\2\2\u00e8\u00e9\t\6\2\2\u00e9\u00ea\t\7\2\2\u00ea"+
		"\u00eb\t\n\2\2\u00eb\u00ec\t\26\2\2\u00ec\u00ed\t\t\2\2\u00ed\34\3\2\2"+
		"\2\u00ee\u00f0\7$\2\2\u00ef\u00f1\5\37\20\2\u00f0\u00ef\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7$\2\2\u00f3\36\3\2\2\2"+
		"\u00f4\u00f6\5!\21\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8 \3\2\2\2\u00f9\u00fc\n\27\2\2\u00fa"+
		"\u00fc\5#\22\2\u00fb\u00f9\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\"\3\2\2\2"+
		"\u00fd\u00fe\7^\2\2\u00fe\u0102\t\30\2\2\u00ff\u0102\5%\23\2\u0100\u0102"+
		"\5)\25\2\u0101\u00fd\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102"+
		"$\3\2\2\2\u0103\u0104\7^\2\2\u0104\u010f\5-\27\2\u0105\u0106\7^\2\2\u0106"+
		"\u0107\5-\27\2\u0107\u0108\5-\27\2\u0108\u010f\3\2\2\2\u0109\u010a\7^"+
		"\2\2\u010a\u010b\5\'\24\2\u010b\u010c\5-\27\2\u010c\u010d\5-\27\2\u010d"+
		"\u010f\3\2\2\2\u010e\u0103\3\2\2\2\u010e\u0105\3\2\2\2\u010e\u0109\3\2"+
		"\2\2\u010f&\3\2\2\2\u0110\u0111\t\31\2\2\u0111(\3\2\2\2\u0112\u0113\7"+
		"^\2\2\u0113\u0114\7w\2\2\u0114\u0115\5\63\32\2\u0115\u0116\5\63\32\2\u0116"+
		"\u0117\5\63\32\2\u0117\u0118\5\63\32\2\u0118*\3\2\2\2\u0119\u011e\5-\27"+
		"\2\u011a\u011c\5/\30\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d"+
		"\3\2\2\2\u011d\u011f\5-\27\2\u011e\u011b\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		",\3\2\2\2\u0120\u0121\t\32\2\2\u0121.\3\2\2\2\u0122\u0124\5\61\31\2\u0123"+
		"\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\60\3\2\2\2\u0127\u012a\5-\27\2\u0128\u012a\7a\2\2\u0129\u0127"+
		"\3\2\2\2\u0129\u0128\3\2\2\2\u012a\62\3\2\2\2\u012b\u012c\t\33\2\2\u012c"+
		"\64\3\2\2\2\u012d\u012e\7*\2\2\u012e\66\3\2\2\2\u012f\u0130\7+\2\2\u0130"+
		"8\3\2\2\2\u0131\u0132\7}\2\2\u0132:\3\2\2\2\u0133\u0134\7\177\2\2\u0134"+
		"<\3\2\2\2\u0135\u0136\7]\2\2\u0136>\3\2\2\2\u0137\u0138\7_\2\2\u0138@"+
		"\3\2\2\2\u0139\u013a\7=\2\2\u013aB\3\2\2\2\u013b\u013c\7.\2\2\u013cD\3"+
		"\2\2\2\u013d\u013e\7\60\2\2\u013eF\3\2\2\2\u013f\u0140\7?\2\2\u0140H\3"+
		"\2\2\2\u0141\u0142\7@\2\2\u0142J\3\2\2\2\u0143\u0144\7>\2\2\u0144L\3\2"+
		"\2\2\u0145\u0146\7#\2\2\u0146N\3\2\2\2\u0147\u0148\7\u0080\2\2\u0148P"+
		"\3\2\2\2\u0149\u014a\7A\2\2\u014aR\3\2\2\2\u014b\u014c\7<\2\2\u014cT\3"+
		"\2\2\2\u014d\u014e\7?\2\2\u014e\u014f\7?\2\2\u014fV\3\2\2\2\u0150\u0151"+
		"\7>\2\2\u0151\u0152\7?\2\2\u0152X\3\2\2\2\u0153\u0154\7@\2\2\u0154\u0155"+
		"\7?\2\2\u0155Z\3\2\2\2\u0156\u0157\7#\2\2\u0157\u0158\7?\2\2\u0158\\\3"+
		"\2\2\2\u0159\u015a\7(\2\2\u015a\u015b\7(\2\2\u015b^\3\2\2\2\u015c\u015d"+
		"\7~\2\2\u015d\u015e\7~\2\2\u015e`\3\2\2\2\u015f\u0160\7-\2\2\u0160\u0161"+
		"\7-\2\2\u0161b\3\2\2\2\u0162\u0163\7/\2\2\u0163\u0164\7/\2\2\u0164d\3"+
		"\2\2\2\u0165\u0166\7-\2\2\u0166f\3\2\2\2\u0167\u0168\7/\2\2\u0168h\3\2"+
		"\2\2\u0169\u016a\7,\2\2\u016aj\3\2\2\2\u016b\u016c\7\61\2\2\u016cl\3\2"+
		"\2\2\u016d\u016e\7(\2\2\u016en\3\2\2\2\u016f\u0170\7~\2\2\u0170p\3\2\2"+
		"\2\u0171\u0172\7`\2\2\u0172r\3\2\2\2\u0173\u0174\7\'\2\2\u0174t\3\2\2"+
		"\2\u0175\u0176\7/\2\2\u0176\u0177\7@\2\2\u0177v\3\2\2\2\u0178\u0179\7"+
		"<\2\2\u0179\u017a\7<\2\2\u017ax\3\2\2\2\u017b\u017c\7-\2\2\u017c\u017d"+
		"\7?\2\2\u017dz\3\2\2\2\u017e\u017f\7/\2\2\u017f\u0180\7?\2\2\u0180|\3"+
		"\2\2\2\u0181\u0182\7,\2\2\u0182\u0183\7?\2\2\u0183~\3\2\2\2\u0184\u0185"+
		"\7\61\2\2\u0185\u0186\7?\2\2\u0186\u0080\3\2\2\2\u0187\u0188\7(\2\2\u0188"+
		"\u0189\7?\2\2\u0189\u0082\3\2\2\2\u018a\u018b\7~\2\2\u018b\u018c\7?\2"+
		"\2\u018c\u0084\3\2\2\2\u018d\u018e\7`\2\2\u018e\u018f\7?\2\2\u018f\u0086"+
		"\3\2\2\2\u0190\u0191\7\'\2\2\u0191\u0192\7?\2\2\u0192\u0088\3\2\2\2\u0193"+
		"\u0194\7>\2\2\u0194\u0195\7>\2\2\u0195\u0196\7?\2\2\u0196\u008a\3\2\2"+
		"\2\u0197\u0198\7@\2\2\u0198\u0199\7@\2\2\u0199\u019a\7?\2\2\u019a\u008c"+
		"\3\2\2\2\u019b\u019c\7@\2\2\u019c\u019d\7@\2\2\u019d\u019e\7@\2\2\u019e"+
		"\u019f\7?\2\2\u019f\u008e\3\2\2\2\20\2\u009d\u00a4\u00a6\u00ab\u00f0\u00f7"+
		"\u00fb\u0101\u010e\u011b\u011e\u0125\u0129\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}