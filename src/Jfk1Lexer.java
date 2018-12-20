// Generated from Jfk1.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Jfk1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, List=8, Range=9, 
		Reverse=10, Join=11, Add=12, Multiply=13, Power=14, Sort=15, Substract=16, 
		Length=17, Total=18, Count=19, First=20, Last=21, Min=22, Max=23, Take=24, 
		Drop=25, Position=26, IntPart=27, PointFloat=28, WhiteSpace=29, NewLine=30;
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
		"Position", "IntPart", "PointFloat", "WhiteSpace", "NewLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'-'", "'{'", "','", "'}'", "'{}'", "'('", "')'", "'list'", "'range'", 
		"'reverse'", "'join'", "'add'", "'mult'", "'pow'", "'sort'", "'sub'", 
		"'length'", "'total'", "'count'", "'first'", "'last'", "'min'", "'max'", 
		"'take'", "'drop'", "'position'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "List", "Range", "Reverse", 
		"Join", "Add", "Multiply", "Power", "Sort", "Substract", "Length", "Total", 
		"Count", "First", "Last", "Min", "Max", "Take", "Drop", "Position", "IntPart", 
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


	public Jfk1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Jfk1.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00f7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\7\16g\n\16\f\16\16\16j\13\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\6\"\u00d7\n\"\r\"\16"+
		"\"\u00d8\3\"\7\"\u00dc\n\"\f\"\16\"\u00df\13\"\5\"\u00e1\n\"\3#\5#\u00e4"+
		"\n#\3#\3#\3$\3$\6$\u00ea\n$\r$\16$\u00eb\3$\3$\3%\3%\6%\u00f2\n%\r%\16"+
		"%\u00f3\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\2\31"+
		"\2\33\2\35\n\37\13!\f#\r%\16\'\17)\20+\21-\22/\23\61\24\63\25\65\26\67"+
		"\279\30;\31=\32?\33A\34C\35E\36G\37I \3\2\4\3\2\62;\3\2\63;\2\u00f9\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rV\3\2\2\2"+
		"\17X\3\2\2\2\21Z\3\2\2\2\23\\\3\2\2\2\25^\3\2\2\2\27`\3\2\2\2\31b\3\2"+
		"\2\2\33d\3\2\2\2\35m\3\2\2\2\37r\3\2\2\2!x\3\2\2\2#\u0080\3\2\2\2%\u0085"+
		"\3\2\2\2\'\u0089\3\2\2\2)\u008e\3\2\2\2+\u0092\3\2\2\2-\u0097\3\2\2\2"+
		"/\u009b\3\2\2\2\61\u00a2\3\2\2\2\63\u00a8\3\2\2\2\65\u00ae\3\2\2\2\67"+
		"\u00b4\3\2\2\29\u00b9\3\2\2\2;\u00bd\3\2\2\2=\u00c1\3\2\2\2?\u00c6\3\2"+
		"\2\2A\u00cb\3\2\2\2C\u00e0\3\2\2\2E\u00e3\3\2\2\2G\u00e9\3\2\2\2I\u00f1"+
		"\3\2\2\2KL\7/\2\2L\4\3\2\2\2MN\7}\2\2N\6\3\2\2\2OP\7.\2\2P\b\3\2\2\2Q"+
		"R\7\177\2\2R\n\3\2\2\2ST\7}\2\2TU\7\177\2\2U\f\3\2\2\2VW\7*\2\2W\16\3"+
		"\2\2\2XY\7+\2\2Y\20\3\2\2\2Z[\7\"\2\2[\22\3\2\2\2\\]\7\13\2\2]\24\3\2"+
		"\2\2^_\7\f\2\2_\26\3\2\2\2`a\7\17\2\2a\30\3\2\2\2bc\7\60\2\2c\32\3\2\2"+
		"\2dh\5\31\r\2eg\t\2\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2ik\3\2"+
		"\2\2jh\3\2\2\2kl\4\62;\2l\34\3\2\2\2mn\7n\2\2no\7k\2\2op\7u\2\2pq\7v\2"+
		"\2q\36\3\2\2\2rs\7t\2\2st\7c\2\2tu\7p\2\2uv\7i\2\2vw\7g\2\2w \3\2\2\2"+
		"xy\7t\2\2yz\7g\2\2z{\7x\2\2{|\7g\2\2|}\7t\2\2}~\7u\2\2~\177\7g\2\2\177"+
		"\"\3\2\2\2\u0080\u0081\7l\2\2\u0081\u0082\7q\2\2\u0082\u0083\7k\2\2\u0083"+
		"\u0084\7p\2\2\u0084$\3\2\2\2\u0085\u0086\7c\2\2\u0086\u0087\7f\2\2\u0087"+
		"\u0088\7f\2\2\u0088&\3\2\2\2\u0089\u008a\7o\2\2\u008a\u008b\7w\2\2\u008b"+
		"\u008c\7n\2\2\u008c\u008d\7v\2\2\u008d(\3\2\2\2\u008e\u008f\7r\2\2\u008f"+
		"\u0090\7q\2\2\u0090\u0091\7y\2\2\u0091*\3\2\2\2\u0092\u0093\7u\2\2\u0093"+
		"\u0094\7q\2\2\u0094\u0095\7t\2\2\u0095\u0096\7v\2\2\u0096,\3\2\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7w\2\2\u0099\u009a\7d\2\2\u009a.\3\2\2\2\u009b"+
		"\u009c\7n\2\2\u009c\u009d\7g\2\2\u009d\u009e\7p\2\2\u009e\u009f\7i\2\2"+
		"\u009f\u00a0\7v\2\2\u00a0\u00a1\7j\2\2\u00a1\60\3\2\2\2\u00a2\u00a3\7"+
		"v\2\2\u00a3\u00a4\7q\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7"+
		"\7n\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab"+
		"\7w\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7v\2\2\u00ad\64\3\2\2\2\u00ae\u00af"+
		"\7h\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7u\2\2\u00b2"+
		"\u00b3\7v\2\2\u00b3\66\3\2\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7u\2\2\u00b7\u00b8\7v\2\2\u00b88\3\2\2\2\u00b9\u00ba\7o\2\2\u00ba"+
		"\u00bb\7k\2\2\u00bb\u00bc\7p\2\2\u00bc:\3\2\2\2\u00bd\u00be\7o\2\2\u00be"+
		"\u00bf\7c\2\2\u00bf\u00c0\7z\2\2\u00c0<\3\2\2\2\u00c1\u00c2\7v\2\2\u00c2"+
		"\u00c3\7c\2\2\u00c3\u00c4\7m\2\2\u00c4\u00c5\7g\2\2\u00c5>\3\2\2\2\u00c6"+
		"\u00c7\7f\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7r\2\2"+
		"\u00ca@\3\2\2\2\u00cb\u00cc\7r\2\2\u00cc\u00cd\7q\2\2\u00cd\u00ce\7u\2"+
		"\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2"+
		"\7q\2\2\u00d2\u00d3\7p\2\2\u00d3B\3\2\2\2\u00d4\u00e1\7\62\2\2\u00d5\u00d7"+
		"\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00dd\3\2\2\2\u00da\u00dc\t\2\2\2\u00db\u00da\3\2"+
		"\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00d4\3\2\2\2\u00e0\u00d6\3\2"+
		"\2\2\u00e1D\3\2\2\2\u00e2\u00e4\5C\"\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\5\33\16\2\u00e6F\3\2\2\2\u00e7"+
		"\u00ea\5\21\t\2\u00e8\u00ea\5\23\n\2\u00e9\u00e7\3\2\2\2\u00e9\u00e8\3"+
		"\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\b$\2\2\u00eeH\3\2\2\2\u00ef\u00f2\5\27\f\2"+
		"\u00f0\u00f2\5\25\13\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\b%\2\2\u00f6J\3\2\2\2\f\2h\u00d8\u00dd\u00e0\u00e3\u00e9\u00eb"+
		"\u00f1\u00f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}