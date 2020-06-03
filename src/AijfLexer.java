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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, Reverse=8, Join=9, 
		Add=10, Multiply=11, Power=12, Sort=13, Substract=14, Length=15, Total=16, 
		Count=17, First=18, Last=19, Min=20, Max=21, Take=22, Drop=23, Position=24, 
		Intersection=25, RemoveDuplicates=26, Average=27, Median=28, Shuffle=29, 
		Singleton=30, IntPart=31, PointFloat=32, WhiteSpace=33, NewLine=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "SINGLE_SPACE", 
		"TABULATION", "LINE_FEED", "CARRAIGE_RETURN", "DOT", "FRACTION", "Reverse", 
		"Join", "Add", "Multiply", "Power", "Sort", "Substract", "Length", "Total", 
		"Count", "First", "Last", "Min", "Max", "Take", "Drop", "Position", "Intersection", 
		"RemoveDuplicates", "Average", "Median", "Shuffle", "Singleton", "IntPart", 
		"PointFloat", "WhiteSpace", "NewLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'{'", "','", "'}'", "'{}'", "'('", "')'", "'reverse'", "'join'", 
		"'add'", "'mult'", "'pow'", "'sort'", "'sub'", "'length'", "'total'", 
		"'count'", "'first'", "'last'", "'min'", "'max'", "'take'", "'drop'", 
		"'position'", "'intersection'", "'removeDuplicates'", "'average'", "'median'", 
		"'shuffle'", "'singleton'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "Reverse", "Join", "Add", 
		"Multiply", "Power", "Sort", "Substract", "Length", "Total", "Count", 
		"First", "Last", "Min", "Max", "Take", "Drop", "Position", "Intersection", 
		"RemoveDuplicates", "Average", "Median", "Shuffle", "Singleton", "IntPart", 
		"PointFloat", "WhiteSpace", "NewLine"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0133\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\7\16o\n\16\f\16\16\16r\13\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\6&\u0113\n&\r&\16&\u0114\3&\7&\u0118\n"+
		"&\f&\16&\u011b\13&\5&\u011d\n&\3\'\5\'\u0120\n\'\3\'\3\'\3(\3(\6(\u0126"+
		"\n(\r(\16(\u0127\3(\3(\3)\3)\6)\u012e\n)\r)\16)\u012f\3)\3)\2\2*\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\2\31\2\33\2\35\n\37\13!\f#"+
		"\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67\279\30;\31=\32?\33A\34"+
		"C\35E\36G\37I K!M\"O#Q$\3\2\4\3\2\62;\3\2\63;\2\u0135\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W\3\2\2\2\tY\3"+
		"\2\2\2\13[\3\2\2\2\r^\3\2\2\2\17`\3\2\2\2\21b\3\2\2\2\23d\3\2\2\2\25f"+
		"\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2\33l\3\2\2\2\35u\3\2\2\2\37}\3\2\2\2!"+
		"\u0082\3\2\2\2#\u0086\3\2\2\2%\u008b\3\2\2\2\'\u008f\3\2\2\2)\u0094\3"+
		"\2\2\2+\u0098\3\2\2\2-\u009f\3\2\2\2/\u00a5\3\2\2\2\61\u00ab\3\2\2\2\63"+
		"\u00b1\3\2\2\2\65\u00b6\3\2\2\2\67\u00ba\3\2\2\29\u00be\3\2\2\2;\u00c3"+
		"\3\2\2\2=\u00c8\3\2\2\2?\u00d1\3\2\2\2A\u00de\3\2\2\2C\u00ef\3\2\2\2E"+
		"\u00f7\3\2\2\2G\u00fe\3\2\2\2I\u0106\3\2\2\2K\u011c\3\2\2\2M\u011f\3\2"+
		"\2\2O\u0125\3\2\2\2Q\u012d\3\2\2\2ST\7/\2\2T\4\3\2\2\2UV\7}\2\2V\6\3\2"+
		"\2\2WX\7.\2\2X\b\3\2\2\2YZ\7\177\2\2Z\n\3\2\2\2[\\\7}\2\2\\]\7\177\2\2"+
		"]\f\3\2\2\2^_\7*\2\2_\16\3\2\2\2`a\7+\2\2a\20\3\2\2\2bc\7\"\2\2c\22\3"+
		"\2\2\2de\7\13\2\2e\24\3\2\2\2fg\7\f\2\2g\26\3\2\2\2hi\7\17\2\2i\30\3\2"+
		"\2\2jk\7\60\2\2k\32\3\2\2\2lp\5\31\r\2mo\t\2\2\2nm\3\2\2\2or\3\2\2\2p"+
		"n\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\4\62;\2t\34\3\2\2\2uv\7t\2\2"+
		"vw\7g\2\2wx\7x\2\2xy\7g\2\2yz\7t\2\2z{\7u\2\2{|\7g\2\2|\36\3\2\2\2}~\7"+
		"l\2\2~\177\7q\2\2\177\u0080\7k\2\2\u0080\u0081\7p\2\2\u0081 \3\2\2\2\u0082"+
		"\u0083\7c\2\2\u0083\u0084\7f\2\2\u0084\u0085\7f\2\2\u0085\"\3\2\2\2\u0086"+
		"\u0087\7o\2\2\u0087\u0088\7w\2\2\u0088\u0089\7n\2\2\u0089\u008a\7v\2\2"+
		"\u008a$\3\2\2\2\u008b\u008c\7r\2\2\u008c\u008d\7q\2\2\u008d\u008e\7y\2"+
		"\2\u008e&\3\2\2\2\u008f\u0090\7u\2\2\u0090\u0091\7q\2\2\u0091\u0092\7"+
		"t\2\2\u0092\u0093\7v\2\2\u0093(\3\2\2\2\u0094\u0095\7u\2\2\u0095\u0096"+
		"\7w\2\2\u0096\u0097\7d\2\2\u0097*\3\2\2\2\u0098\u0099\7n\2\2\u0099\u009a"+
		"\7g\2\2\u009a\u009b\7p\2\2\u009b\u009c\7i\2\2\u009c\u009d\7v\2\2\u009d"+
		"\u009e\7j\2\2\u009e,\3\2\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7q\2\2\u00a1"+
		"\u00a2\7v\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7n\2\2\u00a4.\3\2\2\2\u00a5"+
		"\u00a6\7e\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7p\2\2"+
		"\u00a9\u00aa\7v\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7"+
		"k\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7u\2\2\u00af\u00b0\7v\2\2\u00b0\62"+
		"\3\2\2\2\u00b1\u00b2\7n\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7u\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\64\3\2\2\2\u00b6\u00b7\7o\2\2\u00b7\u00b8\7k\2\2\u00b8"+
		"\u00b9\7p\2\2\u00b9\66\3\2\2\2\u00ba\u00bb\7o\2\2\u00bb\u00bc\7c\2\2\u00bc"+
		"\u00bd\7z\2\2\u00bd8\3\2\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7m\2\2\u00c1\u00c2\7g\2\2\u00c2:\3\2\2\2\u00c3\u00c4\7f\2\2\u00c4"+
		"\u00c5\7t\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7r\2\2\u00c7<\3\2\2\2\u00c8"+
		"\u00c9\7r\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7k\2\2"+
		"\u00cc\u00cd\7v\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0"+
		"\7p\2\2\u00d0>\3\2\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7p\2\2\u00d3\u00d4"+
		"\7v\2\2\u00d4\u00d5\7g\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7u\2\2\u00d7"+
		"\u00d8\7g\2\2\u00d8\u00d9\7e\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7k\2\2"+
		"\u00db\u00dc\7q\2\2\u00dc\u00dd\7p\2\2\u00dd@\3\2\2\2\u00de\u00df\7t\2"+
		"\2\u00df\u00e0\7g\2\2\u00e0\u00e1\7o\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3"+
		"\7x\2\2\u00e3\u00e4\7g\2\2\u00e4\u00e5\7F\2\2\u00e5\u00e6\7w\2\2\u00e6"+
		"\u00e7\7r\2\2\u00e7\u00e8\7n\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7e\2\2"+
		"\u00ea\u00eb\7c\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7g\2\2\u00ed\u00ee"+
		"\7u\2\2\u00eeB\3\2\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7x\2\2\u00f1\u00f2"+
		"\7g\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7c\2\2\u00f4\u00f5\7i\2\2\u00f5"+
		"\u00f6\7g\2\2\u00f6D\3\2\2\2\u00f7\u00f8\7o\2\2\u00f8\u00f9\7g\2\2\u00f9"+
		"\u00fa\7f\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7p\2\2"+
		"\u00fdF\3\2\2\2\u00fe\u00ff\7u\2\2\u00ff\u0100\7j\2\2\u0100\u0101\7w\2"+
		"\2\u0101\u0102\7h\2\2\u0102\u0103\7h\2\2\u0103\u0104\7n\2\2\u0104\u0105"+
		"\7g\2\2\u0105H\3\2\2\2\u0106\u0107\7u\2\2\u0107\u0108\7k\2\2\u0108\u0109"+
		"\7p\2\2\u0109\u010a\7i\2\2\u010a\u010b\7n\2\2\u010b\u010c\7g\2\2\u010c"+
		"\u010d\7v\2\2\u010d\u010e\7q\2\2\u010e\u010f\7p\2\2\u010fJ\3\2\2\2\u0110"+
		"\u011d\7\62\2\2\u0111\u0113\t\3\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3"+
		"\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0119\3\2\2\2\u0116"+
		"\u0118\t\2\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u0110\3\2\2\2\u011c\u0112\3\2\2\2\u011dL\3\2\2\2\u011e\u0120\5K&\2\u011f"+
		"\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\5\33"+
		"\16\2\u0122N\3\2\2\2\u0123\u0126\5\21\t\2\u0124\u0126\5\23\n\2\u0125\u0123"+
		"\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b(\2\2\u012aP\3\2\2\2\u012b"+
		"\u012e\5\27\f\2\u012c\u012e\5\25\13\2\u012d\u012b\3\2\2\2\u012d\u012c"+
		"\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\u0132\b)\2\2\u0132R\3\2\2\2\f\2p\u0114\u0119\u011c"+
		"\u011f\u0125\u0127\u012d\u012f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}