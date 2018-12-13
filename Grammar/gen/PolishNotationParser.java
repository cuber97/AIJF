// Generated from /home/dev/Pobrane/drive-download-20181210T212045Z-001/Grammar.IntelliJIdea/Grammar/PolishNotation.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PolishNotationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Add=3, Subtract=4, Multiply=5, Divide=6, Power=7, Max=8, 
		Min=9, IntPart=10, PointFloat=11, WhiteSpace=12, NewLine=13, Colon=14, 
		DoubleMultiply=15;
	public static final int
		RULE_number = 0, RULE_operation = 1, RULE_expression = 2;
	public static final String[] ruleNames = {
		"number", "operation", "expression"
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

	@Override
	public String getGrammarFileName() { return "PolishNotation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PolishNotationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode IntPart() { return getToken(PolishNotationParser.IntPart, 0); }
		public TerminalNode PointFloat() { return getToken(PolishNotationParser.PointFloat, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishNotationListener ) ((PolishNotationListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishNotationListener ) ((PolishNotationListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolishNotationVisitor ) return ((PolishNotationVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			_la = _input.LA(1);
			if ( !(_la==IntPart || _la==PointFloat) ) {
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

	public static class OperationContext extends ParserRuleContext {
		public Token op;
		public TerminalNode Add() { return getToken(PolishNotationParser.Add, 0); }
		public TerminalNode Subtract() { return getToken(PolishNotationParser.Subtract, 0); }
		public TerminalNode Multiply() { return getToken(PolishNotationParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(PolishNotationParser.Divide, 0); }
		public TerminalNode Power() { return getToken(PolishNotationParser.Power, 0); }
		public TerminalNode Max() { return getToken(PolishNotationParser.Max, 0); }
		public TerminalNode Min() { return getToken(PolishNotationParser.Min, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishNotationListener ) ((PolishNotationListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishNotationListener ) ((PolishNotationListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolishNotationVisitor ) return ((PolishNotationVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operation);
		int _la;
		try {
			setState(21);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Add:
			case Subtract:
			case Multiply:
			case Divide:
			case Power:
			case Max:
			case Min:
				enterOuterAlt(_localctx, 1);
				{
				setState(8);
				((OperationContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Subtract) | (1L << Multiply) | (1L << Divide) | (1L << Power) | (1L << Max) | (1L << Min))) != 0)) ) {
					((OperationContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(11);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntPart:
				case PointFloat:
					{
					setState(9);
					number();
					}
					break;
				case T__0:
				case Add:
				case Subtract:
				case Multiply:
				case Divide:
				case Power:
				case Max:
				case Min:
					{
					setState(10);
					operation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(15);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IntPart:
				case PointFloat:
					{
					setState(13);
					number();
					}
					break;
				case T__0:
				case Add:
				case Subtract:
				case Multiply:
				case Divide:
				case Power:
				case Max:
				case Min:
					{
					setState(14);
					operation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				match(T__0);
				setState(18);
				operation();
				setState(19);
				match(T__1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PolishNotationListener ) ((PolishNotationListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PolishNotationListener ) ((PolishNotationListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PolishNotationVisitor ) return ((PolishNotationVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case Add:
			case Subtract:
			case Multiply:
			case Divide:
			case Power:
			case Max:
			case Min:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				operation();
				}
				break;
			case IntPart:
			case PointFloat:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				number();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\36\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\3\3\3\3\3\5\3\16\n\3\3\3\3\3\5\3\22\n\3\3\3\3\3"+
		"\3\3\3\3\5\3\30\n\3\3\4\3\4\5\4\34\n\4\3\4\2\2\5\2\4\6\2\4\3\2\f\r\3\2"+
		"\5\13\2\36\2\b\3\2\2\2\4\27\3\2\2\2\6\33\3\2\2\2\b\t\t\2\2\2\t\3\3\2\2"+
		"\2\n\r\t\3\2\2\13\16\5\2\2\2\f\16\5\4\3\2\r\13\3\2\2\2\r\f\3\2\2\2\16"+
		"\21\3\2\2\2\17\22\5\2\2\2\20\22\5\4\3\2\21\17\3\2\2\2\21\20\3\2\2\2\22"+
		"\30\3\2\2\2\23\24\7\3\2\2\24\25\5\4\3\2\25\26\7\4\2\2\26\30\3\2\2\2\27"+
		"\n\3\2\2\2\27\23\3\2\2\2\30\5\3\2\2\2\31\34\5\4\3\2\32\34\5\2\2\2\33\31"+
		"\3\2\2\2\33\32\3\2\2\2\34\7\3\2\2\2\6\r\21\27\33";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}