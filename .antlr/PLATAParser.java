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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, AVANZA=11, GIRA=12, FRENA=13, WHILE=14, IF=15, ELSE_IF=16, ELSE=17, 
		TRUE=18, FALSE=19, NULL=20, MAYOR_IGUAL=21, MENOR_IGUAL=22, MAYOR=23, 
		MENOR=24, DISTINTO=25, IGUAL_QUE=26, NOT=27, AND=28, OR=29, INT=30, FLOAT=31, 
		STRING=32, ID=33, LINE_COMMENT=34, COMMENT=35, WS=36;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_avanza = 2, RULE_gira = 3, 
		RULE_frena = 4, RULE_asignacion = 5, RULE_if_sentencia = 6, RULE_bucle_while = 7, 
		RULE_expr = 8, RULE_atomico = 9, RULE_bloque = 10, RULE_condicion = 11, 
		RULE_operadorCondicional = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "avanza", "gira", "frena", "asignacion", "if_sentencia", 
			"bucle_while", "expr", "atomico", "bloque", "condicion", "operadorCondicional"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'='", "'*'", "'/'", "'+'", "'-'", "'{'", 
			"'}'", null, null, null, null, null, null, null, null, null, null, "'>='", 
			"'<='", "'>'", "'<'", "'!='", "'=='", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "AVANZA", 
			"GIRA", "FRENA", "WHILE", "IF", "ELSE_IF", "ELSE", "TRUE", "FALSE", "NULL", 
			"MAYOR_IGUAL", "MENOR_IGUAL", "MAYOR", "MENOR", "DISTINTO", "IGUAL_QUE", 
			"NOT", "AND", "OR", "INT", "FLOAT", "STRING", "ID", "LINE_COMMENT", "COMMENT", 
			"WS"
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				sentencia();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16241195010L) != 0) );
			setState(31);
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
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				avanza();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				gira();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				frena();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				asignacion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				if_sentencia();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				bucle_while();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(39);
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
			setState(42);
			match(AVANZA);
			setState(43);
			match(T__0);
			setState(44);
			expr(0);
			setState(45);
			match(T__1);
			setState(46);
			expr(0);
			setState(47);
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
			setState(49);
			match(GIRA);
			setState(50);
			match(T__0);
			setState(51);
			expr(0);
			setState(52);
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
			setState(54);
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
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
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
			setState(56);
			match(ID);
			setState(57);
			match(T__3);
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(58);
				expr(0);
				}
				break;
			case 2:
				{
				setState(59);
				condicion();
				}
				break;
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
	public static class If_sentenciaContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(PLATAParser.IF, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
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
			setState(62);
			match(IF);
			setState(63);
			match(T__0);
			setState(64);
			condicion();
			setState(65);
			match(T__2);
			setState(66);
			bloque();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(67);
				match(ELSE_IF);
				setState(68);
				match(T__0);
				setState(69);
				condicion();
				setState(70);
				match(T__2);
				setState(71);
				bloque();
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(78);
				match(ELSE);
				setState(79);
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
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
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
			setState(82);
			match(WHILE);
			setState(83);
			match(T__0);
			setState(84);
			condicion();
			setState(85);
			match(T__2);
			setState(86);
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
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(PLATAParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivisionExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentesisExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SumaExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RestaExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RestaExprContext(ExprContext ctx) { copyFrom(ctx); }
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(89);
				match(NOT);
				setState(90);
				expr(7);
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
				setState(91);
				atomico();
				}
				break;
			case T__0:
				{
				_localctx = new ParentesisExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(T__0);
				setState(93);
				expr(0);
				setState(94);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(98);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(99);
						match(T__4);
						setState(100);
						expr(7);
						}
						break;
					case 2:
						{
						_localctx = new DivisionExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(101);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(102);
						match(T__5);
						setState(103);
						expr(6);
						}
						break;
					case 3:
						{
						_localctx = new SumaExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(104);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(105);
						match(T__6);
						setState(106);
						expr(5);
						}
						break;
					case 4:
						{
						_localctx = new RestaExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(108);
						match(T__7);
						setState(109);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				_localctx = new NumeroAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
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
				setState(116);
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
				setState(117);
				match(ID);
				}
				break;
			case STRING:
				_localctx = new StringAtomicoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
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
			setState(121);
			match(T__8);
			setState(123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(122);
				sentencia();
				}
				}
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 16241195010L) != 0) );
			setState(127);
			match(T__9);
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
	public static class CondicionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperadorCondicionalContext operadorCondicional() {
			return getRuleContext(OperadorCondicionalContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			expr(0);
			setState(130);
			operadorCondicional();
			setState(131);
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
	public static class OperadorCondicionalContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(PLATAParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(PLATAParser.MENOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(PLATAParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(PLATAParser.MENOR_IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(PLATAParser.DISTINTO, 0); }
		public TerminalNode IGUAL_QUE() { return getToken(PLATAParser.IGUAL_QUE, 0); }
		public TerminalNode AND() { return getToken(PLATAParser.AND, 0); }
		public TerminalNode OR() { return getToken(PLATAParser.OR, 0); }
		public OperadorCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorCondicional; }
	}

	public final OperadorCondicionalContext operadorCondicional() throws RecognitionException {
		OperadorCondicionalContext _localctx = new OperadorCondicionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operadorCondicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 937426944L) != 0)) ) {
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
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u0088\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"=\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006J\b\u0006\n\u0006\f\u0006M\t\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006Q\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\ba\b\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bo\b"+
		"\b\n\b\f\br\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tx\b\t\u0001\n\u0001"+
		"\n\u0004\n|\b\n\u000b\n\f\n}\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0000\u0001\u0010\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0003\u0001"+
		"\u0000\u001e\u001f\u0001\u0000\u0012\u0013\u0002\u0000\u0015\u001a\u001c"+
		"\u001d\u008e\u0000\u001b\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000"+
		"\u0000\u0004*\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b"+
		"6\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\f>\u0001\u0000\u0000"+
		"\u0000\u000eR\u0001\u0000\u0000\u0000\u0010`\u0001\u0000\u0000\u0000\u0012"+
		"w\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016\u0081\u0001"+
		"\u0000\u0000\u0000\u0018\u0085\u0001\u0000\u0000\u0000\u001a\u001c\u0003"+
		"\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005\u0000"+
		"\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!)\u0003\u0004\u0002\u0000"+
		"\")\u0003\u0006\u0003\u0000#)\u0003\b\u0004\u0000$)\u0003\n\u0005\u0000"+
		"%)\u0003\f\u0006\u0000&)\u0003\u000e\u0007\u0000\')\u0003\u0010\b\u0000"+
		"(!\u0001\u0000\u0000\u0000(\"\u0001\u0000\u0000\u0000(#\u0001\u0000\u0000"+
		"\u0000($\u0001\u0000\u0000\u0000(%\u0001\u0000\u0000\u0000(&\u0001\u0000"+
		"\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000\u0000"+
		"*+\u0005\u000b\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0003\u0010\b\u0000"+
		"-.\u0005\u0002\u0000\u0000./\u0003\u0010\b\u0000/0\u0005\u0003\u0000\u0000"+
		"0\u0005\u0001\u0000\u0000\u000012\u0005\f\u0000\u000023\u0005\u0001\u0000"+
		"\u000034\u0003\u0010\b\u000045\u0005\u0003\u0000\u00005\u0007\u0001\u0000"+
		"\u0000\u000067\u0005\r\u0000\u00007\t\u0001\u0000\u0000\u000089\u0005"+
		"!\u0000\u00009<\u0005\u0004\u0000\u0000:=\u0003\u0010\b\u0000;=\u0003"+
		"\u0016\u000b\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000\u0000\u0000"+
		"=\u000b\u0001\u0000\u0000\u0000>?\u0005\u000f\u0000\u0000?@\u0005\u0001"+
		"\u0000\u0000@A\u0003\u0016\u000b\u0000AB\u0005\u0003\u0000\u0000BK\u0003"+
		"\u0014\n\u0000CD\u0005\u0010\u0000\u0000DE\u0005\u0001\u0000\u0000EF\u0003"+
		"\u0016\u000b\u0000FG\u0005\u0003\u0000\u0000GH\u0003\u0014\n\u0000HJ\u0001"+
		"\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LP\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000NO\u0005\u0011\u0000\u0000OQ\u0003\u0014"+
		"\n\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\r\u0001"+
		"\u0000\u0000\u0000RS\u0005\u000e\u0000\u0000ST\u0005\u0001\u0000\u0000"+
		"TU\u0003\u0016\u000b\u0000UV\u0005\u0003\u0000\u0000VW\u0003\u0014\n\u0000"+
		"W\u000f\u0001\u0000\u0000\u0000XY\u0006\b\uffff\uffff\u0000YZ\u0005\u001b"+
		"\u0000\u0000Za\u0003\u0010\b\u0007[a\u0003\u0012\t\u0000\\]\u0005\u0001"+
		"\u0000\u0000]^\u0003\u0010\b\u0000^_\u0005\u0003\u0000\u0000_a\u0001\u0000"+
		"\u0000\u0000`X\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000`\\\u0001"+
		"\u0000\u0000\u0000ap\u0001\u0000\u0000\u0000bc\n\u0006\u0000\u0000cd\u0005"+
		"\u0005\u0000\u0000do\u0003\u0010\b\u0007ef\n\u0005\u0000\u0000fg\u0005"+
		"\u0006\u0000\u0000go\u0003\u0010\b\u0006hi\n\u0004\u0000\u0000ij\u0005"+
		"\u0007\u0000\u0000jo\u0003\u0010\b\u0005kl\n\u0003\u0000\u0000lm\u0005"+
		"\b\u0000\u0000mo\u0003\u0010\b\u0004nb\u0001\u0000\u0000\u0000ne\u0001"+
		"\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000nk\u0001\u0000\u0000\u0000"+
		"or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000q\u0011\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000sx\u0007"+
		"\u0000\u0000\u0000tx\u0007\u0001\u0000\u0000ux\u0005!\u0000\u0000vx\u0005"+
		" \u0000\u0000ws\u0001\u0000\u0000\u0000wt\u0001\u0000\u0000\u0000wu\u0001"+
		"\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x\u0013\u0001\u0000\u0000"+
		"\u0000y{\u0005\t\u0000\u0000z|\u0003\u0002\u0001\u0000{z\u0001\u0000\u0000"+
		"\u0000|}\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0080\u0005\n\u0000"+
		"\u0000\u0080\u0015\u0001\u0000\u0000\u0000\u0081\u0082\u0003\u0010\b\u0000"+
		"\u0082\u0083\u0003\u0018\f\u0000\u0083\u0084\u0003\u0010\b\u0000\u0084"+
		"\u0017\u0001\u0000\u0000\u0000\u0085\u0086\u0007\u0002\u0000\u0000\u0086"+
		"\u0019\u0001\u0000\u0000\u0000\n\u001d(<KP`npw}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}