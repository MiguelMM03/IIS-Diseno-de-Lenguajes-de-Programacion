// Generated from C:/Users/UO287687/Desktop/Repositorio/IIS-Diseno-de-Lenguajes-de-Programacion/Prácticas/Python--/src/parser/Pmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class PmmLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TRASH=1, INT_CONSTANT=2, DECIMAL=3, REAL_CONSTANT=4, COMMENT=5, CHAR=6, 
		IDENT=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRASH", "INT_CONSTANT", "DECIMAL", "REAL_CONSTANT", "COMMENT", "CHAR", 
			"IDENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TRASH", "INT_CONSTANT", "DECIMAL", "REAL_CONSTANT", "COMMENT", 
			"CHAR", "IDENT"
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


	public PmmLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmm.g4"; }

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
		"\u0004\u0000\u0007o\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000"+
		"\u0001\u0000\u0003\u0000\u0012\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0018\b\u0001\n\u0001\f\u0001\u001b\t\u0001\u0001"+
		"\u0001\u0003\u0001\u001e\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002#\b\u0002\n\u0002\f\u0002&\t\u0002\u0001\u0002\u0003\u0002)\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002-\b\u0002\u000b\u0002\f\u0002.\u0003"+
		"\u00021\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003:\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003>\b\u0003\u0001\u0004\u0001\u0004\u0005\u0004B\b\u0004\n\u0004"+
		"\f\u0004E\t\u0004\u0001\u0004\u0003\u0004H\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004O\b\u0004\n\u0004\f\u0004"+
		"R\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004W\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003"+
		"\u0005e\b\u0005\u0001\u0006\u0003\u0006h\b\u0006\u0001\u0006\u0005\u0006"+
		"k\b\u0006\n\u0006\f\u0006n\t\u0006\u0002CP\u0000\u0007\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u0001\u0000"+
		"\b\u0003\u0000\t\n\r\r  \u0001\u000019\u0001\u000009\u0002\u0000EEee\u0002"+
		"\u0000++--\u0001\u0001\n\n\u0003\u0000--AZaz\u0004\u000009AZ__az\u007f"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000\u0000\u0003\u001d"+
		"\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u0007=\u0001\u0000"+
		"\u0000\u0000\tV\u0001\u0000\u0000\u0000\u000bd\u0001\u0000\u0000\u0000"+
		"\rg\u0001\u0000\u0000\u0000\u000f\u0012\u0007\u0000\u0000\u0000\u0010"+
		"\u0012\u0003\t\u0004\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0010"+
		"\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0006\u0000\u0000\u0000\u0014\u0002\u0001\u0000\u0000\u0000\u0015\u0019"+
		"\u0007\u0001\u0000\u0000\u0016\u0018\u0007\u0002\u0000\u0000\u0017\u0016"+
		"\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000\u0019\u0017"+
		"\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000\u001a\u001e"+
		"\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c\u001e"+
		"\u00050\u0000\u0000\u001d\u0015\u0001\u0000\u0000\u0000\u001d\u001c\u0001"+
		"\u0000\u0000\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0003\u0003"+
		"\u0001\u0000 $\u0005.\u0000\u0000!#\u0007\u0002\u0000\u0000\"!\u0001\u0000"+
		"\u0000\u0000#&\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001"+
		"\u0000\u0000\u0000%1\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"\')\u0003\u0003\u0001\u0000(\'\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)*\u0001\u0000\u0000\u0000*,\u0005.\u0000\u0000+-\u0007\u0002\u0000"+
		"\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000"+
		"\u0000\u0000./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000\u001f"+
		"\u0001\u0000\u0000\u00000(\u0001\u0000\u0000\u00001\u0006\u0001\u0000"+
		"\u0000\u00002>\u0003\u0005\u0002\u000036\u0003\u0003\u0001\u000046\u0003"+
		"\u0005\u0002\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u0000"+
		"67\u0001\u0000\u0000\u000079\u0007\u0003\u0000\u00008:\u0007\u0004\u0000"+
		"\u000098\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;<\u0003\u0003\u0001\u0000<>\u0001\u0000\u0000\u0000=2\u0001"+
		"\u0000\u0000\u0000=5\u0001\u0000\u0000\u0000>\b\u0001\u0000\u0000\u0000"+
		"?C\u0005#\u0000\u0000@B\t\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FH\u0007\u0005"+
		"\u0000\u0000GF\u0001\u0000\u0000\u0000HW\u0001\u0000\u0000\u0000IJ\u0005"+
		"\"\u0000\u0000JK\u0005\"\u0000\u0000KL\u0005\"\u0000\u0000LP\u0001\u0000"+
		"\u0000\u0000MO\t\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000"+
		"\u0000\u0000PQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QS\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\"\u0000\u0000TU\u0005"+
		"\"\u0000\u0000UW\u0005\"\u0000\u0000V?\u0001\u0000\u0000\u0000VI\u0001"+
		"\u0000\u0000\u0000W\n\u0001\u0000\u0000\u0000XY\u0005\'\u0000\u0000Ye"+
		"\b\u0002\u0000\u0000Z[\u0005\\\u0000\u0000[e\u0003\u0003\u0001\u0000\\"+
		"]\u0005\'\u0000\u0000]^\u0005\t\u0000\u0000^e\u0005\'\u0000\u0000_`\u0005"+
		"\'\u0000\u0000`a\u0005\n\u0000\u0000ab\u0005\'\u0000\u0000bc\u0001\u0000"+
		"\u0000\u0000ce\u0005\'\u0000\u0000dX\u0001\u0000\u0000\u0000dZ\u0001\u0000"+
		"\u0000\u0000d\\\u0001\u0000\u0000\u0000d_\u0001\u0000\u0000\u0000e\f\u0001"+
		"\u0000\u0000\u0000fh\u0007\u0006\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"hl\u0001\u0000\u0000\u0000ik\u0007\u0007\u0000\u0000ji\u0001\u0000\u0000"+
		"\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000m\u000e\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000"+
		"\u0013\u0000\u0011\u0019\u001d$(.059=CGPVdgjl\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}