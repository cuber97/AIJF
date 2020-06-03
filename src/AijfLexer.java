// Generated from Aijf.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AijfLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, List=8, Range=9, 
		Reverse=10, Join=11, Add=12, Multiply=13, Power=14, Sort=15, Substract=16, 
		Length=17, Total=18, Count=19, First=20, Last=21, Min=22, Max=23, Take=24, 
		Drop=25, Position=26, Intersection=27, RemoveDuplicates=28, IntPart=29, 
		PointFloat=30, WhiteSpace=31, NewLine=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "SINGLE_SPACE", 
		"TABULATION", "LINE_FEED", "CARRAIGE_RETURN", "DOT", "FRACTION", "List", 
		"Range", "Reverse", "Join", "Add", "Multiply", "Power", "Sort", "Substract", 
		"Length", "Total", "Count", "First", "Last", "Min", "Max", "Take", "Drop", 
		"Position", "Intersection", "RemoveDuplicates", "IntPart", "PointFloat", 
		"WhiteSpace", "NewLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'{'", "','", "'}'", "'{}'", "'('", "')'", "'list'", "'range'", 
		"'reverse'", "'join'", "'add'", "'mult'", "'pow'", "'sort'", "'sub'", 
		"'length'", "'total'", "'count'", "'first'", "'last'", "'min'", "'max'", 
		"'take'", "'drop'", "'position'", "'intersection'", "'removeDuplicates'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "List", "Range", "Reverse", 
		"Join", "Add", "Multiply", "Power", "Sort", "Substract", "Length", "Total", 
		"Count", "First", "Last", "Min", "Max", "Take", "Drop", "Position", "Intersection", 
		"RemoveDuplicates", "IntPart", "PointFloat", "WhiteSpace", "NewLine"
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


	public AijfLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Aijf.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\7\16k\n\16\f\16\16\16n\13\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\6$\u00f9\n$\r$\16$\u00fa\3$\7$\u00fe\n$\f$\16$"+
		"\u0101\13$\5$\u0103\n$\3%\5%\u0106\n%\3%\3%\3&\3&\6&\u010c\n&\r&\16&\u010d"+
		"\3&\3&\3\'\3\'\6\'\u0114\n\'\r\'\16\'\u0115\3\'\3\'\2\2(\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\2\23\2\25\2\27\2\31\2\33\2\35\n\37\13!\f#\r%\16\'"+
		"\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34C\35E\36"+
		"G\37I K!M\"\3\2\4\3\2\62;\3\2\63;\2\u011b\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3"+
		"O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rZ\3\2\2\2\17\\"+
		"\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2\2\31f\3\2\2\2\33"+
		"h\3\2\2\2\35q\3\2\2\2\37v\3\2\2\2!|\3\2\2\2#\u0084\3\2\2\2%\u0089\3\2"+
		"\2\2\'\u008d\3\2\2\2)\u0092\3\2\2\2+\u0096\3\2\2\2-\u009b\3\2\2\2/\u009f"+
		"\3\2\2\2\61\u00a6\3\2\2\2\63\u00ac\3\2\2\2\65\u00b2\3\2\2\2\67\u00b8\3"+
		"\2\2\29\u00bd\3\2\2\2;\u00c1\3\2\2\2=\u00c5\3\2\2\2?\u00ca\3\2\2\2A\u00cf"+
		"\3\2\2\2C\u00d8\3\2\2\2E\u00e5\3\2\2\2G\u0102\3\2\2\2I\u0105\3\2\2\2K"+
		"\u010b\3\2\2\2M\u0113\3\2\2\2OP\7/\2\2P\4\3\2\2\2QR\7}\2\2R\6\3\2\2\2"+
		"ST\7.\2\2T\b\3\2\2\2UV\7\177\2\2V\n\3\2\2\2WX\7}\2\2XY\7\177\2\2Y\f\3"+
		"\2\2\2Z[\7*\2\2[\16\3\2\2\2\\]\7+\2\2]\20\3\2\2\2^_\7\"\2\2_\22\3\2\2"+
		"\2`a\7\13\2\2a\24\3\2\2\2bc\7\f\2\2c\26\3\2\2\2de\7\17\2\2e\30\3\2\2\2"+
		"fg\7\60\2\2g\32\3\2\2\2hl\5\31\r\2ik\t\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2"+
		"\2\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\4\62;\2p\34\3\2\2\2qr\7n\2\2rs\7"+
		"k\2\2st\7u\2\2tu\7v\2\2u\36\3\2\2\2vw\7t\2\2wx\7c\2\2xy\7p\2\2yz\7i\2"+
		"\2z{\7g\2\2{ \3\2\2\2|}\7t\2\2}~\7g\2\2~\177\7x\2\2\177\u0080\7g\2\2\u0080"+
		"\u0081\7t\2\2\u0081\u0082\7u\2\2\u0082\u0083\7g\2\2\u0083\"\3\2\2\2\u0084"+
		"\u0085\7l\2\2\u0085\u0086\7q\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2"+
		"\u0088$\3\2\2\2\u0089\u008a\7c\2\2\u008a\u008b\7f\2\2\u008b\u008c\7f\2"+
		"\2\u008c&\3\2\2\2\u008d\u008e\7o\2\2\u008e\u008f\7w\2\2\u008f\u0090\7"+
		"n\2\2\u0090\u0091\7v\2\2\u0091(\3\2\2\2\u0092\u0093\7r\2\2\u0093\u0094"+
		"\7q\2\2\u0094\u0095\7y\2\2\u0095*\3\2\2\2\u0096\u0097\7u\2\2\u0097\u0098"+
		"\7q\2\2\u0098\u0099\7t\2\2\u0099\u009a\7v\2\2\u009a,\3\2\2\2\u009b\u009c"+
		"\7u\2\2\u009c\u009d\7w\2\2\u009d\u009e\7d\2\2\u009e.\3\2\2\2\u009f\u00a0"+
		"\7n\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7p\2\2\u00a2\u00a3\7i\2\2\u00a3"+
		"\u00a4\7v\2\2\u00a4\u00a5\7j\2\2\u00a5\60\3\2\2\2\u00a6\u00a7\7v\2\2\u00a7"+
		"\u00a8\7q\2\2\u00a8\u00a9\7v\2\2\u00a9\u00aa\7c\2\2\u00aa\u00ab\7n\2\2"+
		"\u00ab\62\3\2\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7"+
		"w\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7v\2\2\u00b1\64\3\2\2\2\u00b2\u00b3"+
		"\7h\2\2\u00b3\u00b4\7k\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7u\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\66\3\2\2\2\u00b8\u00b9\7n\2\2\u00b9\u00ba\7c\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb\u00bc\7v\2\2\u00bc8\3\2\2\2\u00bd\u00be\7o\2\2\u00be"+
		"\u00bf\7k\2\2\u00bf\u00c0\7p\2\2\u00c0:\3\2\2\2\u00c1\u00c2\7o\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7z\2\2\u00c4<\3\2\2\2\u00c5\u00c6\7v\2\2\u00c6"+
		"\u00c7\7c\2\2\u00c7\u00c8\7m\2\2\u00c8\u00c9\7g\2\2\u00c9>\3\2\2\2\u00ca"+
		"\u00cb\7f\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7r\2\2"+
		"\u00ce@\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1\7q\2\2\u00d1\u00d2\7u\2"+
		"\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6"+
		"\7q\2\2\u00d6\u00d7\7p\2\2\u00d7B\3\2\2\2\u00d8\u00d9\7k\2\2\u00d9\u00da"+
		"\7p\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7t\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7v\2\2"+
		"\u00e1\u00e2\7k\2\2\u00e2\u00e3\7q\2\2\u00e3\u00e4\7p\2\2\u00e4D\3\2\2"+
		"\2\u00e5\u00e6\7t\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7o\2\2\u00e8\u00e9"+
		"\7q\2\2\u00e9\u00ea\7x\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7F\2\2\u00ec"+
		"\u00ed\7w\2\2\u00ed\u00ee\7r\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7k\2\2"+
		"\u00f0\u00f1\7e\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4"+
		"\7g\2\2\u00f4\u00f5\7u\2\2\u00f5F\3\2\2\2\u00f6\u0103\7\62\2\2\u00f7\u00f9"+
		"\t\3\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\t\2\2\2\u00fd\u00fc\3\2"+
		"\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u00f6\3\2\2\2\u0102\u00f8\3\2"+
		"\2\2\u0103H\3\2\2\2\u0104\u0106\5G$\2\u0105\u0104\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\5\33\16\2\u0108J\3\2\2\2\u0109"+
		"\u010c\5\21\t\2\u010a\u010c\5\23\n\2\u010b\u0109\3\2\2\2\u010b\u010a\3"+
		"\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\3\2\2\2\u010f\u0110\b&\2\2\u0110L\3\2\2\2\u0111\u0114\5\27\f\2"+
		"\u0112\u0114\5\25\13\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\b\'\2\2\u0118N\3\2\2\2\f\2l\u00fa\u00ff\u0102\u0105\u010b\u010d"+
		"\u0113\u0115\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}