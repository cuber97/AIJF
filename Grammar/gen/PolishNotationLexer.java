// Generated from /home/dev/Pobrane/drive-download-20181210T212045Z-001/Grammar.IntelliJIdea/Grammar/PolishNotation.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolishNotationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Add=3, Subtract=4, Multiply=5, Divide=6, Power=7, Max=8, 
		Min=9, IntPart=10, PointFloat=11, WhiteSpace=12, NewLine=13, Colon=14, 
		DoubleMultiply=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", 
		"DOT", "FRACTION", "Add", "Subtract", "Multiply", "Divide", "Colon", "Power", 
		"DoubleMultiply", "Max", "Min", "IntPart", "PointFloat", "WhiteSpace", 
		"NewLine"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'^'", "'max'", "'min'", 
		null, null, null, null, "':'", "'**'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Add", "Subtract", "Multiply", "Divide", "Power", "Max", 
		"Min", "IntPart", "PointFloat", "WhiteSpace", "NewLine", "Colon", "DoubleMultiply"
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


	public PolishNotationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PolishNotation.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\t>\n\t\f\t\16\tA\13\t\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\6\23b\n\23\r\23\16\23c\3\23\7\23g\n\23\f\23\16\23j\13\23\5\23l\n\23\3"+
		"\24\5\24o\n\24\3\24\3\24\3\25\3\25\6\25u\n\25\r\25\16\25v\3\25\3\25\3"+
		"\26\3\26\6\26}\n\26\r\26\16\26~\3\26\3\26\2\2\27\3\3\5\4\7\2\t\2\13\2"+
		"\r\2\17\2\21\2\23\5\25\6\27\7\31\b\33\20\35\t\37\21!\n#\13%\f\'\r)\16"+
		"+\17\3\2\4\3\2\62;\3\2\63;\2\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\63\3\2\2\2\13\65\3\2\2"+
		"\2\r\67\3\2\2\2\179\3\2\2\2\21;\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3"+
		"\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35P\3\2\2\2\37R\3\2\2\2!W\3\2\2\2#[\3\2"+
		"\2\2%k\3\2\2\2\'n\3\2\2\2)t\3\2\2\2+|\3\2\2\2-.\7*\2\2.\4\3\2\2\2/\60"+
		"\7+\2\2\60\6\3\2\2\2\61\62\7\"\2\2\62\b\3\2\2\2\63\64\7\13\2\2\64\n\3"+
		"\2\2\2\65\66\7\f\2\2\66\f\3\2\2\2\678\7\17\2\28\16\3\2\2\29:\7\60\2\2"+
		":\20\3\2\2\2;?\5\17\b\2<>\t\2\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2"+
		"\2\2@B\3\2\2\2A?\3\2\2\2BC\4\63;\2C\22\3\2\2\2DE\7-\2\2E\24\3\2\2\2FG"+
		"\7/\2\2G\26\3\2\2\2HI\7,\2\2I\30\3\2\2\2JK\7\61\2\2K\32\3\2\2\2LM\7<\2"+
		"\2MN\3\2\2\2NO\b\16\2\2O\34\3\2\2\2PQ\7`\2\2Q\36\3\2\2\2RS\7,\2\2ST\7"+
		",\2\2TU\3\2\2\2UV\b\20\3\2V \3\2\2\2WX\7o\2\2XY\7c\2\2YZ\7z\2\2Z\"\3\2"+
		"\2\2[\\\7o\2\2\\]\7k\2\2]^\7p\2\2^$\3\2\2\2_l\7\62\2\2`b\t\3\2\2a`\3\2"+
		"\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2dh\3\2\2\2eg\t\2\2\2fe\3\2\2\2gj\3\2"+
		"\2\2hf\3\2\2\2hi\3\2\2\2il\3\2\2\2jh\3\2\2\2k_\3\2\2\2ka\3\2\2\2l&\3\2"+
		"\2\2mo\5%\23\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\5\21\t\2q(\3\2\2\2ru\5"+
		"\7\4\2su\5\t\5\2tr\3\2\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3"+
		"\2\2\2xy\b\25\4\2y*\3\2\2\2z}\5\r\7\2{}\5\13\6\2|z\3\2\2\2|{\3\2\2\2}"+
		"~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\26\4"+
		"\2\u0081,\3\2\2\2\f\2?chkntv|~\5\t\b\2\t\t\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}