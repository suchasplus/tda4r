// Generated from C:/dev/IdeaProjects/parser/src/main/resources\MineCraft.g4 by ANTLR 4.7
package com.suchasplus.gen.minecraft;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MineCraftParser extends Parser {
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
	public static final int
		RULE_exclude = 0, RULE_dataset = 1, RULE_pkg = 2, RULE_frequency = 3, 
		RULE_timespan = 4, RULE_userbhv = 5, RULE_pkgtype = 6, RULE_pkgids = 7, 
		RULE_entity_ubhv = 8;
	public static final String[] ruleNames = {
		"exclude", "dataset", "pkg", "frequency", "timespan", "userbhv", "pkgtype", 
		"pkgids", "entity_ubhv"
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

	@Override
	public String getGrammarFileName() { return "MineCraft.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MineCraftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExcludeContext extends ParserRuleContext {
		public TerminalNode EXCLUDE_TOKEN() { return getToken(MineCraftParser.EXCLUDE_TOKEN, 0); }
		public List<DatasetContext> dataset() {
			return getRuleContexts(DatasetContext.class);
		}
		public DatasetContext dataset(int i) {
			return getRuleContext(DatasetContext.class,i);
		}
		public ExcludeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterExclude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitExclude(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitExclude(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExcludeContext exclude() throws RecognitionException {
		ExcludeContext _localctx = new ExcludeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exclude);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(EXCLUDE_TOKEN);
			setState(19);
			match(LBRACE);
			setState(20);
			dataset();
			setState(21);
			match(COMMA);
			setState(22);
			dataset();
			setState(23);
			match(RBRACE);
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

	public static class DatasetContext extends ParserRuleContext {
		public PkgtypeContext pkgtype() {
			return getRuleContext(PkgtypeContext.class,0);
		}
		public PkgContext pkg() {
			return getRuleContext(PkgContext.class,0);
		}
		public UserbhvContext userbhv() {
			return getRuleContext(UserbhvContext.class,0);
		}
		public TimespanContext timespan() {
			return getRuleContext(TimespanContext.class,0);
		}
		public FrequencyContext frequency() {
			return getRuleContext(FrequencyContext.class,0);
		}
		public DatasetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterDataset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitDataset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitDataset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasetContext dataset() throws RecognitionException {
		DatasetContext _localctx = new DatasetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dataset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			pkgtype();
			setState(26);
			match(LBRACE);
			setState(27);
			pkg();
			setState(28);
			match(SEMI);
			setState(29);
			userbhv();
			setState(30);
			match(SEMI);
			setState(31);
			timespan();
			setState(32);
			match(SEMI);
			setState(33);
			frequency();
			setState(34);
			match(RBRACE);
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

	public static class PkgContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(MineCraftParser.COLON, 0); }
		public PkgidsContext pkgids() {
			return getRuleContext(PkgidsContext.class,0);
		}
		public PkgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterPkg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitPkg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitPkg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PkgContext pkg() throws RecognitionException {
		PkgContext _localctx = new PkgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pkg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(COLON);
			setState(38);
			pkgids();
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

	public static class FrequencyContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ENTITY_PARAM_FREQ() { return getToken(MineCraftParser.ENTITY_PARAM_FREQ, 0); }
		public TerminalNode COLON() { return getToken(MineCraftParser.COLON, 0); }
		public TerminalNode INT() { return getToken(MineCraftParser.INT, 0); }
		public TerminalNode ALL() { return getToken(MineCraftParser.ALL, 0); }
		public FrequencyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frequency; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterFrequency(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitFrequency(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitFrequency(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrequencyContext frequency() throws RecognitionException {
		FrequencyContext _localctx = new FrequencyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_frequency);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(ENTITY_PARAM_FREQ);
			setState(41);
			match(COLON);
			setState(42);
			((FrequencyContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==ALL) ) {
				((FrequencyContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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

	public static class TimespanContext extends ParserRuleContext {
		public TerminalNode ENTITY_PARAM_TS() { return getToken(MineCraftParser.ENTITY_PARAM_TS, 0); }
		public TerminalNode COLON() { return getToken(MineCraftParser.COLON, 0); }
		public List<TerminalNode> INT() { return getTokens(MineCraftParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MineCraftParser.INT, i);
		}
		public TerminalNode ARROW() { return getToken(MineCraftParser.ARROW, 0); }
		public TimespanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timespan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterTimespan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitTimespan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitTimespan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimespanContext timespan() throws RecognitionException {
		TimespanContext _localctx = new TimespanContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_timespan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ENTITY_PARAM_TS);
			setState(45);
			match(COLON);
			setState(46);
			match(INT);
			setState(47);
			match(ARROW);
			setState(48);
			match(INT);
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

	public static class UserbhvContext extends ParserRuleContext {
		public List<Entity_ubhvContext> entity_ubhv() {
			return getRuleContexts(Entity_ubhvContext.class);
		}
		public Entity_ubhvContext entity_ubhv(int i) {
			return getRuleContext(Entity_ubhvContext.class,i);
		}
		public UserbhvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userbhv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterUserbhv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitUserbhv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitUserbhv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserbhvContext userbhv() throws RecognitionException {
		UserbhvContext _localctx = new UserbhvContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_userbhv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__1);
			setState(51);
			match(COLON);
			setState(52);
			entity_ubhv();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(53);
				match(BITOR);
				setState(54);
				entity_ubhv();
				}
				}
				setState(59);
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

	public static class PkgtypeContext extends ParserRuleContext {
		public TerminalNode ENTITY_CAMPAIGN_TOKEN() { return getToken(MineCraftParser.ENTITY_CAMPAIGN_TOKEN, 0); }
		public TerminalNode ENTITY_AD_TOKEN() { return getToken(MineCraftParser.ENTITY_AD_TOKEN, 0); }
		public TerminalNode ENTITY_CREATIVE_TOKEN() { return getToken(MineCraftParser.ENTITY_CREATIVE_TOKEN, 0); }
		public PkgtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkgtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterPkgtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitPkgtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitPkgtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PkgtypeContext pkgtype() throws RecognitionException {
		PkgtypeContext _localctx = new PkgtypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pkgtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTITY_CAMPAIGN_TOKEN) | (1L << ENTITY_AD_TOKEN) | (1L << ENTITY_CREATIVE_TOKEN))) != 0)) ) {
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

	public static class PkgidsContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(MineCraftParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MineCraftParser.INT, i);
		}
		public PkgidsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pkgids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterPkgids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitPkgids(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitPkgids(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PkgidsContext pkgids() throws RecognitionException {
		PkgidsContext _localctx = new PkgidsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pkgids);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(INT);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(63);
				match(COMMA);
				setState(64);
				match(INT);
				}
				}
				setState(69);
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

	public static class Entity_ubhvContext extends ParserRuleContext {
		public TerminalNode ENTITY_UBHV_VIEW() { return getToken(MineCraftParser.ENTITY_UBHV_VIEW, 0); }
		public TerminalNode ENTITY_UBHV_CLICK() { return getToken(MineCraftParser.ENTITY_UBHV_CLICK, 0); }
		public TerminalNode ENTITY_UBHV_COMMENT() { return getToken(MineCraftParser.ENTITY_UBHV_COMMENT, 0); }
		public TerminalNode ENTITY_UBHV_REPOST() { return getToken(MineCraftParser.ENTITY_UBHV_REPOST, 0); }
		public TerminalNode ENTITY_UBHV_LIKE() { return getToken(MineCraftParser.ENTITY_UBHV_LIKE, 0); }
		public Entity_ubhvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity_ubhv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterEntity_ubhv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitEntity_ubhv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitEntity_ubhv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entity_ubhvContext entity_ubhv() throws RecognitionException {
		Entity_ubhvContext _localctx = new Entity_ubhvContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_entity_ubhv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ENTITY_UBHV_VIEW) | (1L << ENTITY_UBHV_CLICK) | (1L << ENTITY_UBHV_COMMENT) | (1L << ENTITY_UBHV_REPOST) | (1L << ENTITY_UBHV_LIKE))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3CK\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7:"+
		"\n\7\f\7\16\7=\13\7\3\b\3\b\3\t\3\t\3\t\7\tD\n\t\f\t\16\tG\13\t\3\n\3"+
		"\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\5\3\2\5\6\3\2\f\16\3\2\21\25\2C\2"+
		"\24\3\2\2\2\4\33\3\2\2\2\6&\3\2\2\2\b*\3\2\2\2\n.\3\2\2\2\f\64\3\2\2\2"+
		"\16>\3\2\2\2\20@\3\2\2\2\22H\3\2\2\2\24\25\7\n\2\2\25\26\7\31\2\2\26\27"+
		"\5\4\3\2\27\30\7\36\2\2\30\31\5\4\3\2\31\32\7\32\2\2\32\3\3\2\2\2\33\34"+
		"\5\16\b\2\34\35\7\31\2\2\35\36\5\6\4\2\36\37\7\35\2\2\37 \5\f\7\2 !\7"+
		"\35\2\2!\"\5\n\6\2\"#\7\35\2\2#$\5\b\5\2$%\7\32\2\2%\5\3\2\2\2&\'\7\3"+
		"\2\2\'(\7&\2\2()\5\20\t\2)\7\3\2\2\2*+\7\17\2\2+,\7&\2\2,-\t\2\2\2-\t"+
		"\3\2\2\2./\7\20\2\2/\60\7&\2\2\60\61\7\5\2\2\61\62\7\67\2\2\62\63\7\5"+
		"\2\2\63\13\3\2\2\2\64\65\7\4\2\2\65\66\7&\2\2\66;\5\22\n\2\678\7\64\2"+
		"\28:\5\22\n\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\r\3\2\2\2=;\3"+
		"\2\2\2>?\t\3\2\2?\17\3\2\2\2@E\7\5\2\2AB\7\36\2\2BD\7\5\2\2CA\3\2\2\2"+
		"DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\21\3\2\2\2GE\3\2\2\2HI\t\4\2\2I\23\3\2"+
		"\2\2\4;E";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}