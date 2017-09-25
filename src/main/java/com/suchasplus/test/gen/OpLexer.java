// Generated from C:/dev/IdeaProjects/parser/src/main/resources\Op.g4 by ANTLR 4.7
package com.suchasplus.test.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OpLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INTERSECT_TOKEN=7, JUNCTION_TOKEN=8, 
		EXCLUDE_TOKEN=9, INT=10, ALL=11, WS=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "INTERSECT_TOKEN", "JUNCTION_TOKEN", 
		"EXCLUDE_TOKEN", "INT", "ALL", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "'item'", "'('", "')'", null, null, null, null, 
		"'-1'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "INTERSECT_TOKEN", "JUNCTION_TOKEN", 
		"EXCLUDE_TOKEN", "INT", "ALL", "WS"
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


	public OpLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Op.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16X\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13I"+
		"\n\13\r\13\16\13J\5\13M\n\13\3\f\3\f\3\f\3\r\6\rS\n\r\r\r\16\rT\3\r\3"+
		"\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2"+
		"\22\4\2KKkk\4\2PPpp\4\2VVvv\4\2GGgg\4\2TTtt\4\2UUuu\4\2EEee\4\2LLll\4"+
		"\2WWww\4\2QQqq\4\2ZZzz\4\2NNnn\4\2FFff\3\2\62;\3\2\63;\5\2\13\f\17\17"+
		"\"\"\2Z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7\37\3\2\2\2\t!\3\2\2\2"+
		"\13&\3\2\2\2\r(\3\2\2\2\17*\3\2\2\2\21\64\3\2\2\2\23=\3\2\2\2\25L\3\2"+
		"\2\2\27N\3\2\2\2\31R\3\2\2\2\33\34\7}\2\2\34\4\3\2\2\2\35\36\7.\2\2\36"+
		"\6\3\2\2\2\37 \7\177\2\2 \b\3\2\2\2!\"\7k\2\2\"#\7v\2\2#$\7g\2\2$%\7o"+
		"\2\2%\n\3\2\2\2&\'\7*\2\2\'\f\3\2\2\2()\7+\2\2)\16\3\2\2\2*+\t\2\2\2+"+
		",\t\3\2\2,-\t\4\2\2-.\t\5\2\2./\t\6\2\2/\60\t\7\2\2\60\61\t\5\2\2\61\62"+
		"\t\b\2\2\62\63\t\4\2\2\63\20\3\2\2\2\64\65\t\t\2\2\65\66\t\n\2\2\66\67"+
		"\t\3\2\2\678\t\b\2\289\t\4\2\29:\t\2\2\2:;\t\13\2\2;<\t\3\2\2<\22\3\2"+
		"\2\2=>\t\5\2\2>?\t\f\2\2?@\t\b\2\2@A\t\r\2\2AB\t\n\2\2BC\t\16\2\2CD\t"+
		"\5\2\2D\24\3\2\2\2EM\t\17\2\2FH\t\20\2\2GI\t\17\2\2HG\3\2\2\2IJ\3\2\2"+
		"\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LE\3\2\2\2LF\3\2\2\2M\26\3\2\2\2NO\7/"+
		"\2\2OP\7\63\2\2P\30\3\2\2\2QS\t\21\2\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2T"+
		"U\3\2\2\2UV\3\2\2\2VW\b\r\2\2W\32\3\2\2\2\6\2JLT\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}