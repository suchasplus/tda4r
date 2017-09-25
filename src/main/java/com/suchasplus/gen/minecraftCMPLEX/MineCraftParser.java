// Generated from C:/dev/IdeaProjects/parser/src/main/resources\MineCraft.g4 by ANTLR 4.7
package com.suchasplus.gen.minecraftCMPLEX;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MineCraftParser extends Parser {
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
	public static final int
		RULE_prog = 0, RULE_result = 1, RULE_datasetLogical = 2, RULE_intersectOp = 3, 
		RULE_junctionOp = 4, RULE_excludeOp = 5, RULE_uploadType = 6, RULE_campaignType = 7, 
		RULE_adType = 8, RULE_creativeType = 9, RULE_datasetValidContent = 10, 
		RULE_datasetType = 11, RULE_entityId = 12;
	public static final String[] ruleNames = {
		"prog", "result", "datasetLogical", "intersectOp", "junctionOp", "excludeOp", 
		"uploadType", "campaignType", "adType", "creativeType", "datasetValidContent", 
		"datasetType", "entityId"
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

	@Override
	public String getGrammarFileName() { return "MineCraftCMPLEX.g4"; }

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
	public static class ProgContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			result();
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

	public static class ResultContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(MineCraftParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(MineCraftParser.RBRACE, 0); }
		public DatasetTypeContext datasetType() {
			return getRuleContext(DatasetTypeContext.class,0);
		}
		public IntersectOpContext intersectOp() {
			return getRuleContext(IntersectOpContext.class,0);
		}
		public JunctionOpContext junctionOp() {
			return getRuleContext(JunctionOpContext.class,0);
		}
		public ExcludeOpContext excludeOp() {
			return getRuleContext(ExcludeOpContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(T__0);
			setState(29);
			match(LBRACE);
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATASET_TOKEN:
				{
				setState(30);
				datasetType();
				}
				break;
			case INTERSECT_TOKEN:
				{
				setState(31);
				intersectOp();
				}
				break;
			case JUNCTION_TOKEN:
				{
				setState(32);
				junctionOp();
				}
				break;
			case EXCLUDE_TOKEN:
				{
				setState(33);
				excludeOp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(36);
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

	public static class DatasetLogicalContext extends ParserRuleContext {
		public DatasetTypeContext datasetType() {
			return getRuleContext(DatasetTypeContext.class,0);
		}
		public IntersectOpContext intersectOp() {
			return getRuleContext(IntersectOpContext.class,0);
		}
		public JunctionOpContext junctionOp() {
			return getRuleContext(JunctionOpContext.class,0);
		}
		public ExcludeOpContext excludeOp() {
			return getRuleContext(ExcludeOpContext.class,0);
		}
		public DatasetLogicalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetLogical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterDatasetLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitDatasetLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitDatasetLogical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasetLogicalContext datasetLogical() throws RecognitionException {
		DatasetLogicalContext _localctx = new DatasetLogicalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_datasetLogical);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATASET_TOKEN:
				{
				setState(38);
				datasetType();
				}
				break;
			case INTERSECT_TOKEN:
				{
				setState(39);
				intersectOp();
				}
				break;
			case JUNCTION_TOKEN:
				{
				setState(40);
				junctionOp();
				}
				break;
			case EXCLUDE_TOKEN:
				{
				setState(41);
				excludeOp();
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

	public static class IntersectOpContext extends ParserRuleContext {
		public TerminalNode INTERSECT_TOKEN() { return getToken(MineCraftParser.INTERSECT_TOKEN, 0); }
		public TerminalNode LBRACE() { return getToken(MineCraftParser.LBRACE, 0); }
		public List<DatasetLogicalContext> datasetLogical() {
			return getRuleContexts(DatasetLogicalContext.class);
		}
		public DatasetLogicalContext datasetLogical(int i) {
			return getRuleContext(DatasetLogicalContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(MineCraftParser.RBRACE, 0); }
		public IntersectOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intersectOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterIntersectOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitIntersectOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitIntersectOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntersectOpContext intersectOp() throws RecognitionException {
		IntersectOpContext _localctx = new IntersectOpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intersectOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(INTERSECT_TOKEN);
			setState(45);
			match(LBRACE);
			setState(46);
			datasetLogical();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(47);
				match(COMMA);
				setState(48);
				datasetLogical();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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

	public static class JunctionOpContext extends ParserRuleContext {
		public TerminalNode JUNCTION_TOKEN() { return getToken(MineCraftParser.JUNCTION_TOKEN, 0); }
		public TerminalNode LBRACE() { return getToken(MineCraftParser.LBRACE, 0); }
		public List<DatasetLogicalContext> datasetLogical() {
			return getRuleContexts(DatasetLogicalContext.class);
		}
		public DatasetLogicalContext datasetLogical(int i) {
			return getRuleContext(DatasetLogicalContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(MineCraftParser.RBRACE, 0); }
		public JunctionOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_junctionOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterJunctionOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitJunctionOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitJunctionOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JunctionOpContext junctionOp() throws RecognitionException {
		JunctionOpContext _localctx = new JunctionOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_junctionOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(JUNCTION_TOKEN);
			setState(57);
			match(LBRACE);
			setState(58);
			datasetLogical();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(59);
				match(COMMA);
				setState(60);
				datasetLogical();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
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

	public static class ExcludeOpContext extends ParserRuleContext {
		public TerminalNode EXCLUDE_TOKEN() { return getToken(MineCraftParser.EXCLUDE_TOKEN, 0); }
		public TerminalNode LBRACE() { return getToken(MineCraftParser.LBRACE, 0); }
		public List<DatasetLogicalContext> datasetLogical() {
			return getRuleContexts(DatasetLogicalContext.class);
		}
		public DatasetLogicalContext datasetLogical(int i) {
			return getRuleContext(DatasetLogicalContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(MineCraftParser.RBRACE, 0); }
		public ExcludeOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_excludeOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterExcludeOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitExcludeOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitExcludeOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExcludeOpContext excludeOp() throws RecognitionException {
		ExcludeOpContext _localctx = new ExcludeOpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_excludeOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(EXCLUDE_TOKEN);
			setState(69);
			match(LBRACE);
			setState(70);
			datasetLogical();
			setState(71);
			match(COMMA);
			setState(72);
			datasetLogical();
			setState(73);
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

	public static class UploadTypeContext extends ParserRuleContext {
		public UploadTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uploadType; }
	 
		public UploadTypeContext() { }
		public void copyFrom(UploadTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UploadPkgContext extends UploadTypeContext {
		public TerminalNode ENTITY_UPLOAD_TOKEN() { return getToken(MineCraftParser.ENTITY_UPLOAD_TOKEN, 0); }
		public TerminalNode LBRACE() { return getToken(MineCraftParser.LBRACE, 0); }
		public TerminalNode COLON() { return getToken(MineCraftParser.COLON, 0); }
		public EntityIdContext entityId() {
			return getRuleContext(EntityIdContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MineCraftParser.RBRACE, 0); }
		public UploadPkgContext(UploadTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterUploadPkg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitUploadPkg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitUploadPkg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UploadTypeContext uploadType() throws RecognitionException {
		UploadTypeContext _localctx = new UploadTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_uploadType);
		try {
			_localctx = new UploadPkgContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(ENTITY_UPLOAD_TOKEN);
			setState(76);
			match(LBRACE);
			setState(77);
			match(T__1);
			setState(78);
			match(COLON);
			setState(79);
			entityId();
			setState(80);
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

	public static class CampaignTypeContext extends ParserRuleContext {
		public CampaignTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campaignType; }
	 
		public CampaignTypeContext() { }
		public void copyFrom(CampaignTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CampaignInfoContext extends CampaignTypeContext {
		public TerminalNode ENTITY_CAMPAIGN_TOKEN() { return getToken(MineCraftParser.ENTITY_CAMPAIGN_TOKEN, 0); }
		public TerminalNode LBRACE() { return getToken(MineCraftParser.LBRACE, 0); }
		public TerminalNode COLON() { return getToken(MineCraftParser.COLON, 0); }
		public EntityIdContext entityId() {
			return getRuleContext(EntityIdContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MineCraftParser.RBRACE, 0); }
		public CampaignInfoContext(CampaignTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterCampaignInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitCampaignInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitCampaignInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CampaignTypeContext campaignType() throws RecognitionException {
		CampaignTypeContext _localctx = new CampaignTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_campaignType);
		try {
			_localctx = new CampaignInfoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ENTITY_CAMPAIGN_TOKEN);
			setState(83);
			match(LBRACE);
			setState(84);
			match(T__1);
			setState(85);
			match(COLON);
			setState(86);
			entityId();
			setState(87);
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

	public static class AdTypeContext extends ParserRuleContext {
		public AdTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adType; }
	 
		public AdTypeContext() { }
		public void copyFrom(AdTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AdInfoContext extends AdTypeContext {
		public TerminalNode ENTITY_AD_TOKEN() { return getToken(MineCraftParser.ENTITY_AD_TOKEN, 0); }
		public TerminalNode LBRACE() { return getToken(MineCraftParser.LBRACE, 0); }
		public TerminalNode COLON() { return getToken(MineCraftParser.COLON, 0); }
		public EntityIdContext entityId() {
			return getRuleContext(EntityIdContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MineCraftParser.RBRACE, 0); }
		public AdInfoContext(AdTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterAdInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitAdInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitAdInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdTypeContext adType() throws RecognitionException {
		AdTypeContext _localctx = new AdTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_adType);
		try {
			_localctx = new AdInfoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(ENTITY_AD_TOKEN);
			setState(90);
			match(LBRACE);
			setState(91);
			match(T__1);
			setState(92);
			match(COLON);
			setState(93);
			entityId();
			setState(94);
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

	public static class CreativeTypeContext extends ParserRuleContext {
		public CreativeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creativeType; }
	 
		public CreativeTypeContext() { }
		public void copyFrom(CreativeTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CreativeInfoContext extends CreativeTypeContext {
		public TerminalNode ENTITY_CREATIVE_TOKEN() { return getToken(MineCraftParser.ENTITY_CREATIVE_TOKEN, 0); }
		public TerminalNode LBRACE() { return getToken(MineCraftParser.LBRACE, 0); }
		public TerminalNode COLON() { return getToken(MineCraftParser.COLON, 0); }
		public EntityIdContext entityId() {
			return getRuleContext(EntityIdContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(MineCraftParser.RBRACE, 0); }
		public CreativeInfoContext(CreativeTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterCreativeInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitCreativeInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitCreativeInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreativeTypeContext creativeType() throws RecognitionException {
		CreativeTypeContext _localctx = new CreativeTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_creativeType);
		try {
			_localctx = new CreativeInfoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(ENTITY_CREATIVE_TOKEN);
			setState(97);
			match(LBRACE);
			setState(98);
			match(T__1);
			setState(99);
			match(COLON);
			setState(100);
			entityId();
			setState(101);
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

	public static class DatasetValidContentContext extends ParserRuleContext {
		public UploadTypeContext uploadType() {
			return getRuleContext(UploadTypeContext.class,0);
		}
		public CampaignTypeContext campaignType() {
			return getRuleContext(CampaignTypeContext.class,0);
		}
		public AdTypeContext adType() {
			return getRuleContext(AdTypeContext.class,0);
		}
		public CreativeTypeContext creativeType() {
			return getRuleContext(CreativeTypeContext.class,0);
		}
		public DatasetValidContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetValidContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterDatasetValidContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitDatasetValidContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitDatasetValidContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasetValidContentContext datasetValidContent() throws RecognitionException {
		DatasetValidContentContext _localctx = new DatasetValidContentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_datasetValidContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTITY_UPLOAD_TOKEN:
				{
				setState(103);
				uploadType();
				}
				break;
			case ENTITY_CAMPAIGN_TOKEN:
				{
				setState(104);
				campaignType();
				}
				break;
			case ENTITY_AD_TOKEN:
				{
				setState(105);
				adType();
				}
				break;
			case ENTITY_CREATIVE_TOKEN:
				{
				setState(106);
				creativeType();
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

	public static class DatasetTypeContext extends ParserRuleContext {
		public TerminalNode DATASET_TOKEN() { return getToken(MineCraftParser.DATASET_TOKEN, 0); }
		public TerminalNode LBRACE() { return getToken(MineCraftParser.LBRACE, 0); }
		public List<DatasetValidContentContext> datasetValidContent() {
			return getRuleContexts(DatasetValidContentContext.class);
		}
		public DatasetValidContentContext datasetValidContent(int i) {
			return getRuleContext(DatasetValidContentContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(MineCraftParser.RBRACE, 0); }
		public DatasetTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datasetType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterDatasetType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitDatasetType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitDatasetType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatasetTypeContext datasetType() throws RecognitionException {
		DatasetTypeContext _localctx = new DatasetTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_datasetType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(DATASET_TOKEN);
			setState(110);
			match(LBRACE);
			setState(111);
			datasetValidContent();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(112);
				match(COMMA);
				setState(113);
				datasetValidContent();
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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

	public static class EntityIdContext extends ParserRuleContext {
		public TerminalNode EntityId() { return getToken(MineCraftParser.EntityId, 0); }
		public EntityIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entityId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).enterEntityId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MineCraftListener ) ((MineCraftListener)listener).exitEntityId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MineCraftVisitor ) return ((MineCraftVisitor<? extends T>)visitor).visitEntityId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityIdContext entityId() throws RecognitionException {
		EntityIdContext _localctx = new EntityIdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_entityId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(EntityId);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=~\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f"+
		"\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3%\n\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\7\5\64\n\5\f\5\16\5\67"+
		"\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6@\n\6\f\6\16\6C\13\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\5\fn\n\f\3\r\3\r\3\r\3\r\3\r\7\ru\n\r\f\r\16\rx\13"+
		"\r\3\r\3\r\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2"+
		"\2|\2\34\3\2\2\2\4\36\3\2\2\2\6,\3\2\2\2\b.\3\2\2\2\n:\3\2\2\2\fF\3\2"+
		"\2\2\16M\3\2\2\2\20T\3\2\2\2\22[\3\2\2\2\24b\3\2\2\2\26m\3\2\2\2\30o\3"+
		"\2\2\2\32{\3\2\2\2\34\35\5\4\3\2\35\3\3\2\2\2\36\37\7\3\2\2\37$\7\23\2"+
		"\2 %\5\30\r\2!%\5\b\5\2\"%\5\n\6\2#%\5\f\7\2$ \3\2\2\2$!\3\2\2\2$\"\3"+
		"\2\2\2$#\3\2\2\2%&\3\2\2\2&\'\7\24\2\2\'\5\3\2\2\2(-\5\30\r\2)-\5\b\5"+
		"\2*-\5\n\6\2+-\5\f\7\2,(\3\2\2\2,)\3\2\2\2,*\3\2\2\2,+\3\2\2\2-\7\3\2"+
		"\2\2./\7\t\2\2/\60\7\23\2\2\60\65\5\6\4\2\61\62\7\30\2\2\62\64\5\6\4\2"+
		"\63\61\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67"+
		"\65\3\2\2\289\7\24\2\29\t\3\2\2\2:;\7\n\2\2;<\7\23\2\2<A\5\6\4\2=>\7\30"+
		"\2\2>@\5\6\4\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2"+
		"\2\2DE\7\24\2\2E\13\3\2\2\2FG\7\13\2\2GH\7\23\2\2HI\5\6\4\2IJ\7\30\2\2"+
		"JK\5\6\4\2KL\7\24\2\2L\r\3\2\2\2MN\7\f\2\2NO\7\23\2\2OP\7\4\2\2PQ\7 \2"+
		"\2QR\5\32\16\2RS\7\24\2\2S\17\3\2\2\2TU\7\r\2\2UV\7\23\2\2VW\7\4\2\2W"+
		"X\7 \2\2XY\5\32\16\2YZ\7\24\2\2Z\21\3\2\2\2[\\\7\16\2\2\\]\7\23\2\2]^"+
		"\7\4\2\2^_\7 \2\2_`\5\32\16\2`a\7\24\2\2a\23\3\2\2\2bc\7\17\2\2cd\7\23"+
		"\2\2de\7\4\2\2ef\7 \2\2fg\5\32\16\2gh\7\24\2\2h\25\3\2\2\2in\5\16\b\2"+
		"jn\5\20\t\2kn\5\22\n\2ln\5\24\13\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2"+
		"\2\2n\27\3\2\2\2op\7\b\2\2pq\7\23\2\2qv\5\26\f\2rs\7\30\2\2su\5\26\f\2"+
		"tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\24\2"+
		"\2z\31\3\2\2\2{|\7\5\2\2|\33\3\2\2\2\b$,\65Amv";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}