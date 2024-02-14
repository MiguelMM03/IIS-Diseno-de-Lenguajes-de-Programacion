// Generated from /home/miguel/OneDrive/3ºSoftware/Repositorios/DLP/IIS-Diseno-de-Lenguajes-de-Programacion/Prácticas/Python--/src/parser/Pmm.g4 by ANTLR 4.13.1
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
		TRASH=1, INT_CONSTANT=2, REAL_CONSTANT=3, COMMENT=4, CHAR_CONSTANT=5, 
		ID=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TRASH", "INT_CONSTANT", "REAL_CONSTANT", "COMMENT", "CHAR_CONSTANT", 
			"ID"
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
			null, "TRASH", "INT_CONSTANT", "REAL_CONSTANT", "COMMENT", "CHAR_CONSTANT", 
			"ID"
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
		"\u0004\u0000\u0006x\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0001\u0000\u0001\u0000\u0003\u0000"+
		"\u0010\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"\u0016\b\u0001\n\u0001\f\u0001\u0019\t\u0001\u0001\u0001\u0003\u0001\u001c"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002!\b\u0002\n\u0002"+
		"\f\u0002$\t\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0004\u0002+\b\u0002\u000b\u0002\f\u0002,\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u00023\b\u0002\n\u0002\f\u00026\t\u0002"+
		"\u0001\u0002\u0003\u00029\b\u0002\u0001\u0002\u0001\u0002\u0004\u0002"+
		"=\b\u0002\u000b\u0002\f\u0002>\u0003\u0002A\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002E\b\u0002\u0001\u0002\u0003\u0002H\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003L\b\u0003\n\u0003\f\u0003O\t\u0003\u0001\u0003"+
		"\u0003\u0003R\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003Y\b\u0003\n\u0003\f\u0003\\\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003a\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004l\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0003\u0005q\b\u0005\u0001\u0005\u0005\u0005t\b\u0005\n\u0005\f\u0005"+
		"w\t\u0005\u0002MZ\u0000\u0006\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\u0001\u0000\b\u0003\u0000\t\n\r\r  \u0001\u0000"+
		"19\u0001\u000009\u0002\u0000EEee\u0002\u0000++--\u0001\u0001\n\n\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u008d\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0001\u000f\u0001\u0000\u0000\u0000\u0003"+
		"\u001b\u0001\u0000\u0000\u0000\u0005G\u0001\u0000\u0000\u0000\u0007`\u0001"+
		"\u0000\u0000\u0000\tb\u0001\u0000\u0000\u0000\u000bp\u0001\u0000\u0000"+
		"\u0000\r\u0010\u0007\u0000\u0000\u0000\u000e\u0010\u0003\u0007\u0003\u0000"+
		"\u000f\r\u0001\u0000\u0000\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010"+
		"\u0011\u0001\u0000\u0000\u0000\u0011\u0012\u0006\u0000\u0000\u0000\u0012"+
		"\u0002\u0001\u0000\u0000\u0000\u0013\u0017\u0007\u0001\u0000\u0000\u0014"+
		"\u0016\u0007\u0002\u0000\u0000\u0015\u0014\u0001\u0000\u0000\u0000\u0016"+
		"\u0019\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0017"+
		"\u0018\u0001\u0000\u0000\u0000\u0018\u001c\u0001\u0000\u0000\u0000\u0019"+
		"\u0017\u0001\u0000\u0000\u0000\u001a\u001c\u00050\u0000\u0000\u001b\u0013"+
		"\u0001\u0000\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u0004"+
		"\u0001\u0000\u0000\u0000\u001d\u001e\u0003\u0003\u0001\u0000\u001e\"\u0005"+
		".\u0000\u0000\u001f!\u0007\u0002\u0000\u0000 \u001f\u0001\u0000\u0000"+
		"\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#H\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%\'\u0003"+
		"\u0003\u0001\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'(\u0001\u0000\u0000\u0000(*\u0005.\u0000\u0000)+\u0007\u0002\u0000\u0000"+
		"*)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000"+
		"\u0000,-\u0001\u0000\u0000\u0000-H\u0001\u0000\u0000\u0000.A\u0003\u0003"+
		"\u0001\u0000/0\u0003\u0003\u0001\u000004\u0005.\u0000\u000013\u0007\u0002"+
		"\u0000\u000021\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u00005A\u0001\u0000\u0000\u0000"+
		"64\u0001\u0000\u0000\u000079\u0003\u0003\u0001\u000087\u0001\u0000\u0000"+
		"\u000089\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0005.\u0000"+
		"\u0000;=\u0007\u0002\u0000\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001"+
		"\u0000\u0000\u0000@.\u0001\u0000\u0000\u0000@/\u0001\u0000\u0000\u0000"+
		"@8\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BD\u0007\u0003\u0000"+
		"\u0000CE\u0007\u0004\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0003\u0003\u0001\u0000G\u001d"+
		"\u0001\u0000\u0000\u0000G&\u0001\u0000\u0000\u0000G@\u0001\u0000\u0000"+
		"\u0000H\u0006\u0001\u0000\u0000\u0000IM\u0005#\u0000\u0000JL\t\u0000\u0000"+
		"\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MN\u0001\u0000"+
		"\u0000\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000PR\u0007\u0005\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"Ra\u0001\u0000\u0000\u0000ST\u0005\"\u0000\u0000TU\u0005\"\u0000\u0000"+
		"UV\u0005\"\u0000\u0000VZ\u0001\u0000\u0000\u0000WY\t\u0000\u0000\u0000"+
		"XW\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000ZX\u0001\u0000\u0000\u0000[]\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000]^\u0005\"\u0000\u0000^_\u0005\"\u0000\u0000_a\u0005\"\u0000"+
		"\u0000`I\u0001\u0000\u0000\u0000`S\u0001\u0000\u0000\u0000a\b\u0001\u0000"+
		"\u0000\u0000bk\u0005\'\u0000\u0000cl\u0001\u0000\u0000\u0000de\u0005\\"+
		"\u0000\u0000el\u0003\u0003\u0001\u0000fg\u0005\\\u0000\u0000gl\u0005t"+
		"\u0000\u0000hi\u0005\\\u0000\u0000il\u0005n\u0000\u0000jl\t\u0000\u0000"+
		"\u0000kc\u0001\u0000\u0000\u0000kd\u0001\u0000\u0000\u0000kf\u0001\u0000"+
		"\u0000\u0000kh\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000lm\u0001"+
		"\u0000\u0000\u0000mn\u0005\'\u0000\u0000n\n\u0001\u0000\u0000\u0000oq"+
		"\u0007\u0006\u0000\u0000po\u0001\u0000\u0000\u0000qu\u0001\u0000\u0000"+
		"\u0000rt\u0007\u0007\u0000\u0000sr\u0001\u0000\u0000\u0000tw\u0001\u0000"+
		"\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000v\f\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000\u0015\u0000\u000f\u0017\u001b"+
		"\"&,48>@DGMQZ`kpsu\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}