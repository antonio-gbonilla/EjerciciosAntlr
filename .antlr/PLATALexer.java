// Generated from c:/Users/Antonio/Desktop/UPM/TFG/antlrEjercicios/PrimeraGramatica/PLATA.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PLATALexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, AVANZA=9, 
		GIRA=10, FRENA=11, INT=12, FLOAT=13, ID=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "AVANZA", 
			"GIRA", "FRENA", "INT", "FLOAT", "DIGITO", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "','", "')'", "'='", "'+'", "'-'", "'*'", "'/'", "'avanza'", 
			"'gira'", "'frena'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "AVANZA", "GIRA", 
			"FRENA", "INT", "FLOAT", "ID", "WS"
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


	public PLATALexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PLATA.g4"; }

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
		"\u0004\u0000\u000fc\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bE\b\u000b\u000b\u000b\f\u000bF\u0001\f\u0004\fJ\b\f"+
		"\u000b\f\f\fK\u0001\f\u0001\f\u0004\fP\b\f\u000b\f\f\fQ\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0005\u000eX\b\u000e\n\u000e\f\u000e[\t\u000e"+
		"\u0001\u000f\u0004\u000f^\b\u000f\u000b\u000f\f\u000f_\u0001\u000f\u0001"+
		"\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u0000\u001d\u000e\u001f\u000f\u0001\u0000\u0004\u0001"+
		"\u000009\u0002\u0000AZaz\u0004\u000009AZ__az\u0003\u0000\t\n\r\r  f\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0001!\u0001\u0000\u0000\u0000\u0003#\u0001\u0000"+
		"\u0000\u0000\u0005%\u0001\u0000\u0000\u0000\u0007\'\u0001\u0000\u0000"+
		"\u0000\t)\u0001\u0000\u0000\u0000\u000b+\u0001\u0000\u0000\u0000\r-\u0001"+
		"\u0000\u0000\u0000\u000f/\u0001\u0000\u0000\u0000\u00111\u0001\u0000\u0000"+
		"\u0000\u00138\u0001\u0000\u0000\u0000\u0015=\u0001\u0000\u0000\u0000\u0017"+
		"D\u0001\u0000\u0000\u0000\u0019I\u0001\u0000\u0000\u0000\u001bS\u0001"+
		"\u0000\u0000\u0000\u001dU\u0001\u0000\u0000\u0000\u001f]\u0001\u0000\u0000"+
		"\u0000!\"\u0005(\u0000\u0000\"\u0002\u0001\u0000\u0000\u0000#$\u0005,"+
		"\u0000\u0000$\u0004\u0001\u0000\u0000\u0000%&\u0005)\u0000\u0000&\u0006"+
		"\u0001\u0000\u0000\u0000\'(\u0005=\u0000\u0000(\b\u0001\u0000\u0000\u0000"+
		")*\u0005+\u0000\u0000*\n\u0001\u0000\u0000\u0000+,\u0005-\u0000\u0000"+
		",\f\u0001\u0000\u0000\u0000-.\u0005*\u0000\u0000.\u000e\u0001\u0000\u0000"+
		"\u0000/0\u0005/\u0000\u00000\u0010\u0001\u0000\u0000\u000012\u0005a\u0000"+
		"\u000023\u0005v\u0000\u000034\u0005a\u0000\u000045\u0005n\u0000\u0000"+
		"56\u0005z\u0000\u000067\u0005a\u0000\u00007\u0012\u0001\u0000\u0000\u0000"+
		"89\u0005g\u0000\u00009:\u0005i\u0000\u0000:;\u0005r\u0000\u0000;<\u0005"+
		"a\u0000\u0000<\u0014\u0001\u0000\u0000\u0000=>\u0005f\u0000\u0000>?\u0005"+
		"r\u0000\u0000?@\u0005e\u0000\u0000@A\u0005n\u0000\u0000AB\u0005a\u0000"+
		"\u0000B\u0016\u0001\u0000\u0000\u0000CE\u0003\u001b\r\u0000DC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001"+
		"\u0000\u0000\u0000G\u0018\u0001\u0000\u0000\u0000HJ\u0003\u001b\r\u0000"+
		"IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MO\u0005.\u0000"+
		"\u0000NP\u0003\u001b\r\u0000ON\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000"+
		"\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u001a\u0001"+
		"\u0000\u0000\u0000ST\u0007\u0000\u0000\u0000T\u001c\u0001\u0000\u0000"+
		"\u0000UY\u0007\u0001\u0000\u0000VX\u0007\u0002\u0000\u0000WV\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\u001e\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\^\u0007\u0003\u0000\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000"+
		"\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000ab\u0006\u000f\u0000\u0000b \u0001\u0000\u0000\u0000"+
		"\u0006\u0000FKQY_\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}