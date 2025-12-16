// Generated from c:/Users/Antonio/Desktop/UPM/TFG/antlrEjercicios/PrimeraGramatica/PLATA.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PLATAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, AVANZA=7, GIRA=8, FRENA=9, 
		WHILE=10, ELSE_IF=11, ELSE=12, IF=13, TRUE=14, FALSE=15, NULL=16, MENOS=17, 
		MULTIPLICACION=18, DIVISION=19, MODULO=20, SUMA=21, MAYOR_IGUAL=22, MENOR_IGUAL=23, 
		MAYOR=24, MENOR=25, DISTINTO=26, IGUAL_QUE=27, NOT=28, AND=29, OR=30, 
		INT=31, FLOAT=32, STRING=33, ID=34, LINE_COMMENT=35, COMMENT=36, WS=37;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_avanza = 2, RULE_gira = 3, 
		RULE_frena = 4, RULE_asignacion = 5, RULE_if_sentencia = 6, RULE_bucle_while = 7, 
		RULE_expr = 8, RULE_atomico = 9, RULE_bloque = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "avanza", "gira", "frena", "asignacion", "if_sentencia", 
			"bucle_while", "expr", "atomico", "bloque"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'='", "'{'", "'}'", null, null, null, null, 
			"'sinosi'", "'sino'", "'si'", null, null, null, "'-'", "'*'", "'/'", 
			"'%'", "'+'", "'>='", "'<='", "'>'", "'<'", "'!='", "'=='", "'!'", "'&&'", 
			"'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "AVANZA", "GIRA", "FRENA", 
			"WHILE", "ELSE_IF", "ELSE", "IF", "TRUE", "FALSE", "NULL", "MENOS", "MULTIPLICACION", 
			"DIVISION", "MODULO", "SUMA", "MAYOR_IGUAL", "MENOR_IGUAL", "MAYOR", 
			"MENOR", "DISTINTO", "IGUAL_QUE", "NOT", "AND", "OR", "INT", "FLOAT", 
			"STRING", "ID", "LINE_COMMENT", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "PLATA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PLATAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PLATAParser.EOF, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				sentencia();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32480880514L) != 0) );
			setState(27);
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
	public static class SentenciaContext extends ParserRuleContext {
		public AvanzaContext avanza() {
			return getRuleContext(AvanzaContext.class,0);
		}
		public GiraContext gira() {
			return getRuleContext(GiraContext.class,0);
		}
		public FrenaContext frena() {
			return getRuleContext(FrenaContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public If_sentenciaContext if_sentencia() {
			return getRuleContext(If_sentenciaContext.class,0);
		}
		public Bucle_whileContext bucle_while() {
			return getRuleContext(Bucle_whileContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				avanza();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				gira();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				frena();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				asignacion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				if_sentencia();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(34);
				bucle_while();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(35);
				expr(0);
				}
				break;
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
	public static class AvanzaContext extends ParserRuleContext {
		public TerminalNode AVANZA() { return getToken(PLATAParser.AVANZA, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AvanzaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_avanza; }
	}

	public final AvanzaContext avanza() throws RecognitionException {
		AvanzaContext _localctx = new AvanzaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_avanza);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(AVANZA);
			setState(39);
			match(T__0);
			setState(40);
			expr(0);
			setState(41);
			match(T__1);
			setState(42);
			expr(0);
			setState(43);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GiraContext extends ParserRuleContext {
		public TerminalNode GIRA() { return getToken(PLATAParser.GIRA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GiraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gira; }
	}

	public final GiraContext gira() throws RecognitionException {
		GiraContext _localctx = new GiraContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gira);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(GIRA);
			setState(46);
			match(T__0);
			setState(47);
			expr(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FrenaContext extends ParserRuleContext {
		public TerminalNode FRENA() { return getToken(PLATAParser.FRENA, 0); }
		public FrenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frena; }
	}

	public final FrenaContext frena() throws RecognitionException {
		FrenaContext _localctx = new FrenaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_frena);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(FRENA);
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PLATAParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(T__3);
			setState(54);
			expr(0);
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
	public static class If_sentenciaContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PLATAParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<TerminalNode> ELSE_IF() { return getTokens(PLATAParser.ELSE_IF); }
		public TerminalNode ELSE_IF(int i) {
			return getToken(PLATAParser.ELSE_IF, i);
		}
		public TerminalNode ELSE() { return getToken(PLATAParser.ELSE, 0); }
		public If_sentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sentencia; }
	}

	public final If_sentenciaContext if_sentencia() throws RecognitionException {
		If_sentenciaContext _localctx = new If_sentenciaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_sentencia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(IF);
			setState(57);
			match(T__0);
			setState(58);
			expr(0);
			setState(59);
			match(T__2);
			setState(60);
			bloque();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(61);
				match(ELSE_IF);
				setState(62);
				match(T__0);
				setState(63);
				expr(0);
				setState(64);
				match(T__2);
				setState(65);
				bloque();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(72);
				match(ELSE);
				setState(73);
				bloque();
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
	public static class Bucle_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PLATAParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Bucle_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucle_while; }
	}

	public final Bucle_whileContext bucle_while() throws RecognitionException {
		Bucle_whileContext _localctx = new Bucle_whileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_bucle_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(WHILE);
			setState(77);
			match(T__0);
			setState(78);
			expr(0);
			setState(79);
			match(T__2);
			setState(80);
			bloque();
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(PLATAParser.AND, 0); }
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(PLATAParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentesisExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MenosExprContext extends ExprContext {
		public TerminalNode MENOS() { return getToken(PLATAParser.MENOS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MenosExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUMA() { return getToken(PLATAParser.SUMA, 0); }
		public TerminalNode MENOS() { return getToken(PLATAParser.MENOS, 0); }
		public SumaExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ORExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR() { return getToken(PLATAParser.OR, 0); }
		public ORExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelacionesExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MAYOR_IGUAL() { return getToken(PLATAParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(PLATAParser.MENOR_IGUAL, 0); }
		public TerminalNode MENOR() { return getToken(PLATAParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(PLATAParser.MAYOR, 0); }
		public RelacionesExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadesExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUAL_QUE() { return getToken(PLATAParser.IGUAL_QUE, 0); }
		public TerminalNode DISTINTO() { return getToken(PLATAParser.DISTINTO, 0); }
		public IgualdadesExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomicoExprContext extends ExprContext {
		public AtomicoContext atomico() {
			return getRuleContext(AtomicoContext.class,0);
		}
		public AtomicoExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacionExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLICACION() { return getToken(PLATAParser.MULTIPLICACION, 0); }
		public TerminalNode DIVISION() { return getToken(PLATAParser.DIVISION, 0); }
		public TerminalNode MODULO() { return getToken(PLATAParser.MODULO, 0); }
		public MultiplicacionExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
				{
				_localctx = new MenosExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				match(MENOS);
				setState(84);
				expr(10);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(NOT);
				setState(86);
				expr(9);
				}
				break;
			case TRUE:
			case FALSE:
			case INT:
			case FLOAT:
			case STRING:
			case ID:
				{
				_localctx = new AtomicoExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				atomico();
				}
				break;
			case T__0:
				{
				_localctx = new ParentesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(T__0);
				setState(89);
				expr(0);
				setState(90);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(112);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(95);
						((MultiplicacionExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
							((MultiplicacionExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(96);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new SumaExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(98);
						((SumaExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MENOS || _la==SUMA) ) {
							((SumaExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(99);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new RelacionesExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(101);
						((RelacionesExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
							((RelacionesExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(102);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new IgualdadesExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(104);
						((IgualdadesExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DISTINTO || _la==IGUAL_QUE) ) {
							((IgualdadesExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(107);
						match(AND);
						setState(108);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ORExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(110);
						match(OR);
						setState(111);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(116);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtomicoContext extends ParserRuleContext {
		public AtomicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomico; }
	 
		public AtomicoContext() { }
		public void copyFrom(AtomicoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumeroAtomicoContext extends AtomicoContext {
		public TerminalNode INT() { return getToken(PLATAParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PLATAParser.FLOAT, 0); }
		public NumeroAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanAtomicoContext extends AtomicoContext {
		public TerminalNode TRUE() { return getToken(PLATAParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(PLATAParser.FALSE, 0); }
		public BooleanAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdAtomicoContext extends AtomicoContext {
		public TerminalNode ID() { return getToken(PLATAParser.ID, 0); }
		public IdAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringAtomicoContext extends AtomicoContext {
		public TerminalNode STRING() { return getToken(PLATAParser.STRING, 0); }
		public StringAtomicoContext(AtomicoContext ctx) { copyFrom(ctx); }
	}

	public final AtomicoContext atomico() throws RecognitionException {
		AtomicoContext _localctx = new AtomicoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atomico);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				_localctx = new NumeroAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case TRUE:
			case FALSE:
				_localctx = new BooleanAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				_localctx = new IdAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(120);
				match(STRING);
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
	public static class BloqueContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__4);
			setState(125); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				sentencia();
				}
				}
				setState(127); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 32480880514L) != 0) );
			setState(129);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u0084\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001%\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006K\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b]\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bq\b"+
		"\b\n\b\f\bt\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tz\b\t\u0001\n\u0001"+
		"\n\u0004\n~\b\n\u000b\n\f\n\u007f\u0001\n\u0001\n\u0001\n\u0000\u0001"+
		"\u0010\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000"+
		"\u0006\u0001\u0000\u0012\u0014\u0002\u0000\u0011\u0011\u0015\u0015\u0001"+
		"\u0000\u0016\u0019\u0001\u0000\u001a\u001b\u0001\u0000\u001f \u0001\u0000"+
		"\u000e\u000f\u008e\u0000\u0017\u0001\u0000\u0000\u0000\u0002$\u0001\u0000"+
		"\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006-\u0001\u0000\u0000\u0000"+
		"\b2\u0001\u0000\u0000\u0000\n4\u0001\u0000\u0000\u0000\f8\u0001\u0000"+
		"\u0000\u0000\u000eL\u0001\u0000\u0000\u0000\u0010\\\u0001\u0000\u0000"+
		"\u0000\u0012y\u0001\u0000\u0000\u0000\u0014{\u0001\u0000\u0000\u0000\u0016"+
		"\u0018\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019"+
		"\u001a\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0005\u0000\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d"+
		"%\u0003\u0004\u0002\u0000\u001e%\u0003\u0006\u0003\u0000\u001f%\u0003"+
		"\b\u0004\u0000 %\u0003\n\u0005\u0000!%\u0003\f\u0006\u0000\"%\u0003\u000e"+
		"\u0007\u0000#%\u0003\u0010\b\u0000$\u001d\u0001\u0000\u0000\u0000$\u001e"+
		"\u0001\u0000\u0000\u0000$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000"+
		"\u0000\u0000$!\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$#\u0001"+
		"\u0000\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0005\u0007\u0000"+
		"\u0000\'(\u0005\u0001\u0000\u0000()\u0003\u0010\b\u0000)*\u0005\u0002"+
		"\u0000\u0000*+\u0003\u0010\b\u0000+,\u0005\u0003\u0000\u0000,\u0005\u0001"+
		"\u0000\u0000\u0000-.\u0005\b\u0000\u0000./\u0005\u0001\u0000\u0000/0\u0003"+
		"\u0010\b\u000001\u0005\u0003\u0000\u00001\u0007\u0001\u0000\u0000\u0000"+
		"23\u0005\t\u0000\u00003\t\u0001\u0000\u0000\u000045\u0005\"\u0000\u0000"+
		"56\u0005\u0004\u0000\u000067\u0003\u0010\b\u00007\u000b\u0001\u0000\u0000"+
		"\u000089\u0005\r\u0000\u00009:\u0005\u0001\u0000\u0000:;\u0003\u0010\b"+
		"\u0000;<\u0005\u0003\u0000\u0000<E\u0003\u0014\n\u0000=>\u0005\u000b\u0000"+
		"\u0000>?\u0005\u0001\u0000\u0000?@\u0003\u0010\b\u0000@A\u0005\u0003\u0000"+
		"\u0000AB\u0003\u0014\n\u0000BD\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000"+
		"\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000EF\u0001\u0000"+
		"\u0000\u0000FJ\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000HI\u0005"+
		"\f\u0000\u0000IK\u0003\u0014\n\u0000JH\u0001\u0000\u0000\u0000JK\u0001"+
		"\u0000\u0000\u0000K\r\u0001\u0000\u0000\u0000LM\u0005\n\u0000\u0000MN"+
		"\u0005\u0001\u0000\u0000NO\u0003\u0010\b\u0000OP\u0005\u0003\u0000\u0000"+
		"PQ\u0003\u0014\n\u0000Q\u000f\u0001\u0000\u0000\u0000RS\u0006\b\uffff"+
		"\uffff\u0000ST\u0005\u0011\u0000\u0000T]\u0003\u0010\b\nUV\u0005\u001c"+
		"\u0000\u0000V]\u0003\u0010\b\tW]\u0003\u0012\t\u0000XY\u0005\u0001\u0000"+
		"\u0000YZ\u0003\u0010\b\u0000Z[\u0005\u0003\u0000\u0000[]\u0001\u0000\u0000"+
		"\u0000\\R\u0001\u0000\u0000\u0000\\U\u0001\u0000\u0000\u0000\\W\u0001"+
		"\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000]r\u0001\u0000\u0000\u0000"+
		"^_\n\b\u0000\u0000_`\u0007\u0000\u0000\u0000`q\u0003\u0010\b\tab\n\u0007"+
		"\u0000\u0000bc\u0007\u0001\u0000\u0000cq\u0003\u0010\b\bde\n\u0006\u0000"+
		"\u0000ef\u0007\u0002\u0000\u0000fq\u0003\u0010\b\u0007gh\n\u0005\u0000"+
		"\u0000hi\u0007\u0003\u0000\u0000iq\u0003\u0010\b\u0006jk\n\u0004\u0000"+
		"\u0000kl\u0005\u001d\u0000\u0000lq\u0003\u0010\b\u0005mn\n\u0003\u0000"+
		"\u0000no\u0005\u001e\u0000\u0000oq\u0003\u0010\b\u0004p^\u0001\u0000\u0000"+
		"\u0000pa\u0001\u0000\u0000\u0000pd\u0001\u0000\u0000\u0000pg\u0001\u0000"+
		"\u0000\u0000pj\u0001\u0000\u0000\u0000pm\u0001\u0000\u0000\u0000qt\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"s\u0011\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uz\u0007\u0004"+
		"\u0000\u0000vz\u0007\u0005\u0000\u0000wz\u0005\"\u0000\u0000xz\u0005!"+
		"\u0000\u0000yu\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z\u0013\u0001\u0000\u0000"+
		"\u0000{}\u0005\u0005\u0000\u0000|~\u0003\u0002\u0001\u0000}|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\u0006\u0000\u0000\u0082\u0015\u0001\u0000\u0000\u0000"+
		"\t\u0019$EJ\\pry\u007f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}