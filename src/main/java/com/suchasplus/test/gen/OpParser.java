// Generated from C:/dev/IdeaProjects/parser/src/main/resources\Op.g4 by ANTLR 4.7
package com.suchasplus.test.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OpParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, INTERSECT_TOKEN=7, JUNCTION_TOKEN=8, 
		EXCLUDE_TOKEN=9, INT=10, ALL=11, WS=12;
	public static final int
		RULE_entity = 0, RULE_operator = 1, RULE_intersect = 2, RULE_junction = 3, 
		RULE_exclude = 4, RULE_item = 5;
	public static final String[] ruleNames = {
		"entity", "operator", "intersect", "junction", "exclude", "item"
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

	@Override
	public String getGrammarFileName() { return "Op.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OpParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class EntityContext extends ParserRuleContext {
		public ItemContext item() {
			return getRuleContext(ItemContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpListener ) ((OpListener)listener).enterEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpListener ) ((OpListener)listener).exitEntity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpVisitor ) return ((OpVisitor<? extends T>)visitor).visitEntity(this);
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
			case T__3:
				{
				setState(12);
				item();
				}
				break;
			case INTERSECT_TOKEN:
			case JUNCTION_TOKEN:
			case EXCLUDE_TOKEN:
				{
				setState(13);
				operator();
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

	public static class OperatorContext extends ParserRuleContext {
		public IntersectContext intersect() {
			return getRuleContext(IntersectContext.class,0);
		}
		public JunctionContext junction() {
			return getRuleContext(JunctionContext.class,0);
		}
		public ExcludeContext exclude() {
			return getRuleContext(ExcludeContext.class,0);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpListener ) ((OpListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpListener ) ((OpListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpVisitor ) return ((OpVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTERSECT_TOKEN:
				{
				setState(16);
				intersect();
				}
				break;
			case JUNCTION_TOKEN:
				{
				setState(17);
				junction();
				}
				break;
			case EXCLUDE_TOKEN:
				{
				setState(18);
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

	public static class IntersectContext extends ParserRuleContext {
		public TerminalNode INTERSECT_TOKEN() { return getToken(OpParser.INTERSECT_TOKEN, 0); }
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
			if ( listener instanceof OpListener ) ((OpListener)listener).enterIntersect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpListener ) ((OpListener)listener).exitIntersect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpVisitor ) return ((OpVisitor<? extends T>)visitor).visitIntersect(this);
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
			match(INTERSECT_TOKEN);
			setState(22);
			match(T__0);
			setState(23);
			entity();
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				match(T__1);
				setState(25);
				entity();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(30);
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

	public static class JunctionContext extends ParserRuleContext {
		public TerminalNode JUNCTION_TOKEN() { return getToken(OpParser.JUNCTION_TOKEN, 0); }
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
			if ( listener instanceof OpListener ) ((OpListener)listener).enterJunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpListener ) ((OpListener)listener).exitJunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpVisitor ) return ((OpVisitor<? extends T>)visitor).visitJunction(this);
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
			match(JUNCTION_TOKEN);
			setState(33);
			match(T__0);
			setState(34);
			entity();
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				match(T__1);
				setState(36);
				entity();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(41);
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

	public static class ExcludeContext extends ParserRuleContext {
		public TerminalNode EXCLUDE_TOKEN() { return getToken(OpParser.EXCLUDE_TOKEN, 0); }
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
			if ( listener instanceof OpListener ) ((OpListener)listener).enterExclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpListener ) ((OpListener)listener).exitExclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpVisitor ) return ((OpVisitor<? extends T>)visitor).visitExclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExcludeContext exclude() throws RecognitionException {
		ExcludeContext _localctx = new ExcludeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exclude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(EXCLUDE_TOKEN);
			setState(44);
			match(T__0);
			setState(45);
			entity();
			setState(46);
			match(T__1);
			setState(47);
			entity();
			setState(48);
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

	public static class ItemContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(OpParser.INT, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OpListener ) ((OpListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OpListener ) ((OpListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpVisitor ) return ((OpVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__3);
			setState(51);
			match(T__4);
			setState(52);
			match(INT);
			setState(53);
			match(T__5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16:\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\5\2\21\n\2\3\3\3\3\3\3\5\3"+
		"\26\n\3\3\4\3\4\3\4\3\4\3\4\6\4\35\n\4\r\4\16\4\36\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\6\5(\n\5\r\5\16\5)\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2\28\2\20\3\2\2\2\4\25\3\2\2\2"+
		"\6\27\3\2\2\2\b\"\3\2\2\2\n-\3\2\2\2\f\64\3\2\2\2\16\21\5\f\7\2\17\21"+
		"\5\4\3\2\20\16\3\2\2\2\20\17\3\2\2\2\21\3\3\2\2\2\22\26\5\6\4\2\23\26"+
		"\5\b\5\2\24\26\5\n\6\2\25\22\3\2\2\2\25\23\3\2\2\2\25\24\3\2\2\2\26\5"+
		"\3\2\2\2\27\30\7\t\2\2\30\31\7\3\2\2\31\34\5\2\2\2\32\33\7\4\2\2\33\35"+
		"\5\2\2\2\34\32\3\2\2\2\35\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3"+
		"\2\2\2 !\7\5\2\2!\7\3\2\2\2\"#\7\n\2\2#$\7\3\2\2$\'\5\2\2\2%&\7\4\2\2"+
		"&(\5\2\2\2\'%\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\5\2"+
		"\2,\t\3\2\2\2-.\7\13\2\2./\7\3\2\2/\60\5\2\2\2\60\61\7\4\2\2\61\62\5\2"+
		"\2\2\62\63\7\5\2\2\63\13\3\2\2\2\64\65\7\6\2\2\65\66\7\7\2\2\66\67\7\f"+
		"\2\2\678\7\b\2\28\r\3\2\2\2\6\20\25\36)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}