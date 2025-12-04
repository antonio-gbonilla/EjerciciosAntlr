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
		TRUE=18, False=19, NULL=20, MAYOR=21, MENOR=22, MAYOR_IGUAL=23, MENOR_IGUAL=24, 
		DISTINTO=25, IGUAL_QUE=26, INT=27, FLOAT=28, ID=29, LINE_COMMENT=30, COMMENT=31, 
		WS=32;
	public static final int
		RULE_programa = 0, RULE_sentencia = 1, RULE_avanza = 2, RULE_gira = 3, 
		RULE_frena = 4, RULE_asignacion = 5, RULE_if_sentencia = 6, RULE_bucle_while = 7, 
		RULE_expr = 8, RULE_numero = 9, RULE_bloque = 10, RULE_condicion = 11, 
		RULE_operadorCondicional = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "sentencia", "avanza", "gira", "frena", "asignacion", "if_sentencia", 
			"bucle_while", "expr", "numero", "bloque", "condicion", "operadorCondicional"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'='", "'*'", "'/'", "'+'", "'-'", "'{'", 
			"'}'", null, null, null, null, null, null, null, null, null, "'null'", 
			"'>'", "'<'", "'>='", "'<='", "'!'", "'=='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "AVANZA", 
			"GIRA", "FRENA", "WHILE", "IF", "ELSE_IF", "ELSE", "TRUE", "False", "NULL", 
			"MAYOR", "MENOR", "MAYOR_IGUAL", "MENOR_IGUAL", "DISTINTO", "IGUAL_QUE", 
			"INT", "FLOAT", "ID", "LINE_COMMENT", "COMMENT", "WS"
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 939587586L) != 0) );
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
			setState(58);
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
			setState(60);
			match(IF);
			setState(61);
			match(T__0);
			setState(62);
			condicion();
			setState(63);
			match(T__2);
			setState(64);
			bloque();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF) {
				{
				{
				setState(65);
				match(ELSE_IF);
				setState(66);
				match(T__0);
				setState(67);
				condicion();
				setState(68);
				match(T__2);
				setState(69);
				bloque();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(76);
				match(ELSE);
				setState(77);
				match(T__0);
				setState(78);
				condicion();
				setState(79);
				match(T__2);
				setState(80);
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
			setState(84);
			match(WHILE);
			setState(85);
			match(T__0);
			setState(86);
			condicion();
			setState(87);
			match(T__2);
			setState(88);
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
	public static class SumaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SumaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(PLATAParser.ID, 0); }
		public VariableExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivisionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicacionContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplicacionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NnumeroContext extends ExprContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public NnumeroContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RestaContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RestaContext(ExprContext ctx) { copyFrom(ctx); }
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
			setState(97);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case FLOAT:
				{
				_localctx = new NnumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(91);
				numero();
				}
				break;
			case ID:
				{
				_localctx = new VariableExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(ID);
				}
				break;
			case T__0:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(T__0);
				setState(94);
				expr(0);
				setState(95);
				match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicacionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(100);
						match(T__4);
						setState(101);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(103);
						match(T__5);
						setState(104);
						expr(7);
						}
						break;
					case 3:
						{
						_localctx = new SumaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(106);
						match(T__6);
						setState(107);
						expr(6);
						}
						break;
					case 4:
						{
						_localctx = new RestaContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						match(T__7);
						setState(110);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(115);
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
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PLATAParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(PLATAParser.FLOAT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
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
			setState(118);
			match(T__8);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				sentencia();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 939587586L) != 0) );
			setState(124);
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
			setState(126);
			expr(0);
			setState(127);
			operadorCondicional();
			setState(128);
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
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 132120576L) != 0)) ) {
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001 \u0085\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006H\b\u0006"+
		"\n\u0006\f\u0006K\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006S\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bb\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\bp\b\b\n\b\f\bs\t\b\u0001\t\u0001\t\u0001\n\u0001\n\u0004\ny"+
		"\b\n\u000b\n\f\nz\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0000\u0001\u0010\r\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0002\u0001\u0000"+
		"\u001b\u001c\u0001\u0000\u0015\u001a\u0087\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*\u0001\u0000\u0000\u0000\u0006"+
		"1\u0001\u0000\u0000\u0000\b6\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000"+
		"\u0000\f<\u0001\u0000\u0000\u0000\u000eT\u0001\u0000\u0000\u0000\u0010"+
		"a\u0001\u0000\u0000\u0000\u0012t\u0001\u0000\u0000\u0000\u0014v\u0001"+
		"\u0000\u0000\u0000\u0016~\u0001\u0000\u0000\u0000\u0018\u0082\u0001\u0000"+
		"\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f \u0005\u0000\u0000\u0001 \u0001\u0001\u0000\u0000\u0000"+
		"!)\u0003\u0004\u0002\u0000\")\u0003\u0006\u0003\u0000#)\u0003\b\u0004"+
		"\u0000$)\u0003\n\u0005\u0000%)\u0003\f\u0006\u0000&)\u0003\u000e\u0007"+
		"\u0000\')\u0003\u0010\b\u0000(!\u0001\u0000\u0000\u0000(\"\u0001\u0000"+
		"\u0000\u0000(#\u0001\u0000\u0000\u0000($\u0001\u0000\u0000\u0000(%\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000"+
		")\u0003\u0001\u0000\u0000\u0000*+\u0005\u000b\u0000\u0000+,\u0005\u0001"+
		"\u0000\u0000,-\u0003\u0010\b\u0000-.\u0005\u0002\u0000\u0000./\u0003\u0010"+
		"\b\u0000/0\u0005\u0003\u0000\u00000\u0005\u0001\u0000\u0000\u000012\u0005"+
		"\f\u0000\u000023\u0005\u0001\u0000\u000034\u0003\u0010\b\u000045\u0005"+
		"\u0003\u0000\u00005\u0007\u0001\u0000\u0000\u000067\u0005\r\u0000\u0000"+
		"7\t\u0001\u0000\u0000\u000089\u0005\u001d\u0000\u00009:\u0005\u0004\u0000"+
		"\u0000:;\u0003\u0010\b\u0000;\u000b\u0001\u0000\u0000\u0000<=\u0005\u000f"+
		"\u0000\u0000=>\u0005\u0001\u0000\u0000>?\u0003\u0016\u000b\u0000?@\u0005"+
		"\u0003\u0000\u0000@I\u0003\u0014\n\u0000AB\u0005\u0010\u0000\u0000BC\u0005"+
		"\u0001\u0000\u0000CD\u0003\u0016\u000b\u0000DE\u0005\u0003\u0000\u0000"+
		"EF\u0003\u0014\n\u0000FH\u0001\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000"+
		"HK\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000"+
		"\u0000JR\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005\u0011"+
		"\u0000\u0000MN\u0005\u0001\u0000\u0000NO\u0003\u0016\u000b\u0000OP\u0005"+
		"\u0003\u0000\u0000PQ\u0003\u0014\n\u0000QS\u0001\u0000\u0000\u0000RL\u0001"+
		"\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S\r\u0001\u0000\u0000\u0000"+
		"TU\u0005\u000e\u0000\u0000UV\u0005\u0001\u0000\u0000VW\u0003\u0016\u000b"+
		"\u0000WX\u0005\u0003\u0000\u0000XY\u0003\u0014\n\u0000Y\u000f\u0001\u0000"+
		"\u0000\u0000Z[\u0006\b\uffff\uffff\u0000[b\u0003\u0012\t\u0000\\b\u0005"+
		"\u001d\u0000\u0000]^\u0005\u0001\u0000\u0000^_\u0003\u0010\b\u0000_`\u0005"+
		"\u0003\u0000\u0000`b\u0001\u0000\u0000\u0000aZ\u0001\u0000\u0000\u0000"+
		"a\\\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000bq\u0001\u0000\u0000"+
		"\u0000cd\n\u0007\u0000\u0000de\u0005\u0005\u0000\u0000ep\u0003\u0010\b"+
		"\bfg\n\u0006\u0000\u0000gh\u0005\u0006\u0000\u0000hp\u0003\u0010\b\u0007"+
		"ij\n\u0005\u0000\u0000jk\u0005\u0007\u0000\u0000kp\u0003\u0010\b\u0006"+
		"lm\n\u0004\u0000\u0000mn\u0005\b\u0000\u0000np\u0003\u0010\b\u0005oc\u0001"+
		"\u0000\u0000\u0000of\u0001\u0000\u0000\u0000oi\u0001\u0000\u0000\u0000"+
		"ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000r\u0011\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tu\u0007\u0000\u0000\u0000u\u0013\u0001\u0000\u0000"+
		"\u0000vx\u0005\t\u0000\u0000wy\u0003\u0002\u0001\u0000xw\u0001\u0000\u0000"+
		"\u0000yz\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000"+
		"\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0005\n\u0000\u0000}\u0015\u0001"+
		"\u0000\u0000\u0000~\u007f\u0003\u0010\b\u0000\u007f\u0080\u0003\u0018"+
		"\f\u0000\u0080\u0081\u0003\u0010\b\u0000\u0081\u0017\u0001\u0000\u0000"+
		"\u0000\u0082\u0083\u0007\u0001\u0000\u0000\u0083\u0019\u0001\u0000\u0000"+
		"\u0000\b\u001d(IRaoqz";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}