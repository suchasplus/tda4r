// Generated from D:/Dev/github/tda4r/src/main/resources\Mewick.g4 by ANTLR 4.7
package com.suchasplus.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MewickParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		INT=10, WS=11;
	public static final int
		RULE_entity = 0, RULE_item = 1, RULE_intersect = 2, RULE_junction = 3, 
		RULE_exclude = 4;
	public static final String[] ruleNames = {
		"entity", "item", "intersect", "junction", "exclude"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'item'", "'('", "')'", "'intersect'", "'{'", "','", "'}'", "'junction'", 
		"'exclude'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "INT", "WS"
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

	@Override
	public String getGrammarFileName() { return "Mewick.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MewickParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EntityContext extends ParserRuleContext {
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public IntersectContext intersect() {
			return getRuleContext(IntersectContext.class,0);
		}
		public JunctionContext junction() {
			return getRuleContext(JunctionContext.class,0);
		}
		public ExcludeContext exclude() {
			return getRuleContext(ExcludeContext.class,0);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MewickListener ) ((MewickListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MewickListener ) ((MewickListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MewickVisitor ) return ((MewickVisitor<? extends T>)visitor).visitEntity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_entity);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(10);
				item();
				}
				break;
			case T__3:
				{
				setState(11);
				intersect();
				}
				break;
			case T__7:
				{
				setState(12);
				junction();
				}
				break;
			case T__8:
				{
				setState(13);
				exclude();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(MewickParser.INT, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MewickListener ) ((MewickListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MewickListener ) ((MewickListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MewickVisitor ) return ((MewickVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(T__0);
			setState(17);
			match(T__1);
			setState(18);
			match(INT);
			setState(19);
			match(T__2);
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

	public static class IntersectContext extends ParserRuleContext {
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public IntersectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MewickListener ) ((MewickListener)listener).enterIntersect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MewickListener ) ((MewickListener)listener).exitIntersect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MewickVisitor ) return ((MewickVisitor<? extends T>)visitor).visitIntersect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntersectContext intersect() throws RecognitionException {
		IntersectContext _localctx = new IntersectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_intersect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(T__3);
			setState(22);
			match(T__4);
			setState(23);
			entity();
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				match(T__5);
				setState(25);
				entity();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(30);
			match(T__6);
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

	public static class JunctionContext extends ParserRuleContext {
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public JunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_junction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MewickListener ) ((MewickListener)listener).enterJunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MewickListener ) ((MewickListener)listener).exitJunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MewickVisitor ) return ((MewickVisitor<? extends T>)visitor).visitJunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JunctionContext junction() throws RecognitionException {
		JunctionContext _localctx = new JunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_junction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(T__7);
			setState(33);
			match(T__4);
			setState(34);
			entity();
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				match(T__5);
				setState(36);
				entity();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(41);
			match(T__6);
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

	public static class ExcludeContext extends ParserRuleContext {
		public List<EntityContext> entity() {
			return getRuleContexts(EntityContext.class);
		}
		public EntityContext entity(int i) {
			return getRuleContext(EntityContext.class,i);
		}
		public ExcludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MewickListener ) ((MewickListener)listener).enterExclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MewickListener ) ((MewickListener)listener).exitExclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MewickVisitor ) return ((MewickVisitor<? extends T>)visitor).visitExclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExcludeContext exclude() throws RecognitionException {
		ExcludeContext _localctx = new ExcludeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exclude);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__8);
			setState(44);
			match(T__4);
			setState(45);
			entity();
			setState(48); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				match(T__5);
				setState(47);
				entity();
				}
				}
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(52);
			match(T__6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\r9\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\6\4\35\n\4\r\4\16\4\36\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\6\5(\n\5\r\5\16\5)\3\5\3\5\3\6\3\6\3\6\3\6\3\6\6\6\63\n\6\r\6\16"+
		"\6\64\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\29\2\20\3\2\2\2\4\22\3\2\2\2\6\27"+
		"\3\2\2\2\b\"\3\2\2\2\n-\3\2\2\2\f\21\5\4\3\2\r\21\5\6\4\2\16\21\5\b\5"+
		"\2\17\21\5\n\6\2\20\f\3\2\2\2\20\r\3\2\2\2\20\16\3\2\2\2\20\17\3\2\2\2"+
		"\21\3\3\2\2\2\22\23\7\3\2\2\23\24\7\4\2\2\24\25\7\f\2\2\25\26\7\5\2\2"+
		"\26\5\3\2\2\2\27\30\7\6\2\2\30\31\7\7\2\2\31\34\5\2\2\2\32\33\7\b\2\2"+
		"\33\35\5\2\2\2\34\32\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2"+
		"\37 \3\2\2\2 !\7\t\2\2!\7\3\2\2\2\"#\7\n\2\2#$\7\7\2\2$\'\5\2\2\2%&\7"+
		"\b\2\2&(\5\2\2\2\'%\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+"+
		",\7\t\2\2,\t\3\2\2\2-.\7\13\2\2./\7\7\2\2/\62\5\2\2\2\60\61\7\b\2\2\61"+
		"\63\5\2\2\2\62\60\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\7\t\2\2\67\13\3\2\2\2\6\20\36)\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}