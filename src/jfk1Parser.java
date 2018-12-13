// Generated from jfk1.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class jfk1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, List=7, Range=8, Reverse=9, 
		Join=10, Add=11, Multiply=12, Power=13, Sort=14, Subtract=15, Length=16, 
		Total=17, Count=18, First=19, Last=20, Min=21, Max=22, IntegerDigits=23, 
		Take=24, Drop=25, Position=26, None=27, IntPart=28, PointFloat=29, WhiteSpace=30, 
		NewLine=31;
	public static final int
		RULE_number = 0, RULE_listBase = 1, RULE_listT = 2, RULE_operationsReturningList = 3, 
		RULE_operationsReturningNumber = 4, RULE_basicExpressionsReturningList = 5, 
		RULE_extendedExpressionsReturningList = 6, RULE_basicExpressionsReturningNumber = 7, 
		RULE_extendedExpressionsReturningNumber = 8, RULE_expression = 9;
	public static final String[] ruleNames = {
		"number", "listBase", "listT", "operationsReturningList", "operationsReturningNumber", 
		"basicExpressionsReturningList", "extendedExpressionsReturningList", "basicExpressionsReturningNumber", 
		"extendedExpressionsReturningNumber", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "'{}'", "'('", "')'", "'list'", "'range'", 
		"'reverse'", "'join'", "'+'", "'*'", "'pow'", "'sort'", "'-'", "'length'", 
		"'total'", "'count'", "'first'", "'last'", "'min'", "'max'", "'integerDigits'", 
		"'take'", "'drop'", "'position'", "'none'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "List", "Range", "Reverse", 
		"Join", "Add", "Multiply", "Power", "Sort", "Subtract", "Length", "Total", 
		"Count", "First", "Last", "Min", "Max", "IntegerDigits", "Take", "Drop", 
		"Position", "None", "IntPart", "PointFloat", "WhiteSpace", "NewLine"
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
	public String getGrammarFileName() { return "jfk1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jfk1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode IntPart() { return getToken(jfk1Parser.IntPart, 0); }
		public TerminalNode PointFloat() { return getToken(jfk1Parser.PointFloat, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitNumber(this);
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
			setState(20);
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

	public static class ListBaseContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public ListBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterListBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitListBase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitListBase(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListBaseContext listBase() throws RecognitionException {
		ListBaseContext _localctx = new ListBaseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listBase);
		try {
			int _alt;
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(T__0);
				setState(28);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(23);
						number();
						setState(24);
						match(T__1);
						}
						} 
					}
					setState(30);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(31);
				number();
				setState(32);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(T__3);
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

	public static class ListTContext extends ParserRuleContext {
		public ListBaseContext listBase() {
			return getRuleContext(ListBaseContext.class,0);
		}
		public ListTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterListT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitListT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitListT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTContext listT() throws RecognitionException {
		ListTContext _localctx = new ListTContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			listBase();
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

	public static class OperationsReturningListContext extends ParserRuleContext {
		public Token op1ArgList;
		public Token op2ArgListNumber;
		public Token op2ArgListList;
		public TerminalNode Reverse() { return getToken(jfk1Parser.Reverse, 0); }
		public TerminalNode IntegerDigits() { return getToken(jfk1Parser.IntegerDigits, 0); }
		public TerminalNode Sort() { return getToken(jfk1Parser.Sort, 0); }
		public TerminalNode List() { return getToken(jfk1Parser.List, 0); }
		public List<ExtendedExpressionsReturningListContext> extendedExpressionsReturningList() {
			return getRuleContexts(ExtendedExpressionsReturningListContext.class);
		}
		public ExtendedExpressionsReturningListContext extendedExpressionsReturningList(int i) {
			return getRuleContext(ExtendedExpressionsReturningListContext.class,i);
		}
		public TerminalNode Take() { return getToken(jfk1Parser.Take, 0); }
		public TerminalNode Drop() { return getToken(jfk1Parser.Drop, 0); }
		public TerminalNode Power() { return getToken(jfk1Parser.Power, 0); }
		public ExtendedExpressionsReturningNumberContext extendedExpressionsReturningNumber() {
			return getRuleContext(ExtendedExpressionsReturningNumberContext.class,0);
		}
		public TerminalNode Join() { return getToken(jfk1Parser.Join, 0); }
		public TerminalNode None() { return getToken(jfk1Parser.None, 0); }
		public OperationsReturningListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationsReturningList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterOperationsReturningList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitOperationsReturningList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitOperationsReturningList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsReturningListContext operationsReturningList() throws RecognitionException {
		OperationsReturningListContext _localctx = new OperationsReturningListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_operationsReturningList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case List:
			case Reverse:
			case Sort:
			case IntegerDigits:
				{
				{
				setState(39);
				((OperationsReturningListContext)_localctx).op1ArgList = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << Reverse) | (1L << Sort) | (1L << IntegerDigits))) != 0)) ) {
					((OperationsReturningListContext)_localctx).op1ArgList = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(40);
				match(T__4);
				setState(41);
				extendedExpressionsReturningList();
				setState(42);
				match(T__5);
				}
				}
				}
				break;
			case Power:
			case Take:
			case Drop:
				{
				{
				setState(44);
				((OperationsReturningListContext)_localctx).op2ArgListNumber = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Power) | (1L << Take) | (1L << Drop))) != 0)) ) {
					((OperationsReturningListContext)_localctx).op2ArgListNumber = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(45);
				match(T__4);
				setState(46);
				extendedExpressionsReturningList();
				setState(47);
				match(T__1);
				setState(48);
				extendedExpressionsReturningNumber();
				setState(49);
				match(T__5);
				}
				}
				}
				break;
			case Join:
			case None:
				{
				{
				setState(51);
				((OperationsReturningListContext)_localctx).op2ArgListList = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Join || _la==None) ) {
					((OperationsReturningListContext)_localctx).op2ArgListList = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(52);
				match(T__4);
				setState(53);
				extendedExpressionsReturningList();
				setState(54);
				match(T__1);
				setState(55);
				extendedExpressionsReturningList();
				setState(56);
				match(T__5);
				}
				}
				}
				break;
			case EOF:
			case T__1:
			case T__5:
			case Add:
			case Multiply:
			case Subtract:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class OperationsReturningNumberContext extends ParserRuleContext {
		public Token op1ArgList;
		public Token op2ArgListNumber;
		public Token op3ArgListList;
		public TerminalNode Length() { return getToken(jfk1Parser.Length, 0); }
		public TerminalNode Total() { return getToken(jfk1Parser.Total, 0); }
		public TerminalNode First() { return getToken(jfk1Parser.First, 0); }
		public TerminalNode Last() { return getToken(jfk1Parser.Last, 0); }
		public TerminalNode Min() { return getToken(jfk1Parser.Min, 0); }
		public TerminalNode Max() { return getToken(jfk1Parser.Max, 0); }
		public List<ExtendedExpressionsReturningListContext> extendedExpressionsReturningList() {
			return getRuleContexts(ExtendedExpressionsReturningListContext.class);
		}
		public ExtendedExpressionsReturningListContext extendedExpressionsReturningList(int i) {
			return getRuleContext(ExtendedExpressionsReturningListContext.class,i);
		}
		public TerminalNode Count() { return getToken(jfk1Parser.Count, 0); }
		public TerminalNode Position() { return getToken(jfk1Parser.Position, 0); }
		public ExtendedExpressionsReturningNumberContext extendedExpressionsReturningNumber() {
			return getRuleContext(ExtendedExpressionsReturningNumberContext.class,0);
		}
		public TerminalNode None() { return getToken(jfk1Parser.None, 0); }
		public OperationsReturningNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationsReturningNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterOperationsReturningNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitOperationsReturningNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitOperationsReturningNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsReturningNumberContext operationsReturningNumber() throws RecognitionException {
		OperationsReturningNumberContext _localctx = new OperationsReturningNumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operationsReturningNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Length:
			case Total:
			case First:
			case Last:
			case Min:
			case Max:
				{
				{
				setState(61);
				((OperationsReturningNumberContext)_localctx).op1ArgList = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Length) | (1L << Total) | (1L << First) | (1L << Last) | (1L << Min) | (1L << Max))) != 0)) ) {
					((OperationsReturningNumberContext)_localctx).op1ArgList = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(62);
				match(T__4);
				setState(63);
				extendedExpressionsReturningList();
				setState(64);
				match(T__5);
				}
				}
				}
				break;
			case Count:
			case Position:
				{
				{
				setState(66);
				((OperationsReturningNumberContext)_localctx).op2ArgListNumber = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Count || _la==Position) ) {
					((OperationsReturningNumberContext)_localctx).op2ArgListNumber = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(67);
				match(T__4);
				setState(68);
				extendedExpressionsReturningList();
				setState(69);
				match(T__1);
				setState(70);
				extendedExpressionsReturningNumber();
				setState(71);
				match(T__5);
				}
				}
				}
				break;
			case None:
				{
				{
				setState(73);
				((OperationsReturningNumberContext)_localctx).op3ArgListList = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==None) ) {
					((OperationsReturningNumberContext)_localctx).op3ArgListList = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(74);
				match(T__4);
				setState(75);
				extendedExpressionsReturningList();
				setState(76);
				match(T__1);
				setState(77);
				extendedExpressionsReturningList();
				setState(78);
				match(T__5);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BasicExpressionsReturningListContext extends ParserRuleContext {
		public ListTContext listT() {
			return getRuleContext(ListTContext.class,0);
		}
		public List<OperationsReturningListContext> operationsReturningList() {
			return getRuleContexts(OperationsReturningListContext.class);
		}
		public OperationsReturningListContext operationsReturningList(int i) {
			return getRuleContext(OperationsReturningListContext.class,i);
		}
		public List<TerminalNode> Add() { return getTokens(jfk1Parser.Add); }
		public TerminalNode Add(int i) {
			return getToken(jfk1Parser.Add, i);
		}
		public List<TerminalNode> Subtract() { return getTokens(jfk1Parser.Subtract); }
		public TerminalNode Subtract(int i) {
			return getToken(jfk1Parser.Subtract, i);
		}
		public List<TerminalNode> Multiply() { return getTokens(jfk1Parser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(jfk1Parser.Multiply, i);
		}
		public BasicExpressionsReturningListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpressionsReturningList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterBasicExpressionsReturningList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitBasicExpressionsReturningList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitBasicExpressionsReturningList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicExpressionsReturningListContext basicExpressionsReturningList() throws RecognitionException {
		BasicExpressionsReturningListContext _localctx = new BasicExpressionsReturningListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_basicExpressionsReturningList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(82);
				listT();
				}
				break;
			case 2:
				{
				setState(83);
				operationsReturningList();
				}
				break;
			case 3:
				{
				{
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(84);
						operationsReturningList();
						setState(85);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Multiply) | (1L << Subtract))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(91);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(92);
				operationsReturningList();
				}
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

	public static class ExtendedExpressionsReturningListContext extends ParserRuleContext {
		public List<BasicExpressionsReturningListContext> basicExpressionsReturningList() {
			return getRuleContexts(BasicExpressionsReturningListContext.class);
		}
		public BasicExpressionsReturningListContext basicExpressionsReturningList(int i) {
			return getRuleContext(BasicExpressionsReturningListContext.class,i);
		}
		public ExtendedExpressionsReturningNumberContext extendedExpressionsReturningNumber() {
			return getRuleContext(ExtendedExpressionsReturningNumberContext.class,0);
		}
		public List<TerminalNode> Add() { return getTokens(jfk1Parser.Add); }
		public TerminalNode Add(int i) {
			return getToken(jfk1Parser.Add, i);
		}
		public List<TerminalNode> Subtract() { return getTokens(jfk1Parser.Subtract); }
		public TerminalNode Subtract(int i) {
			return getToken(jfk1Parser.Subtract, i);
		}
		public List<TerminalNode> Multiply() { return getTokens(jfk1Parser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(jfk1Parser.Multiply, i);
		}
		public ExtendedExpressionsReturningListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedExpressionsReturningList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterExtendedExpressionsReturningList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitExtendedExpressionsReturningList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitExtendedExpressionsReturningList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedExpressionsReturningListContext extendedExpressionsReturningList() throws RecognitionException {
		ExtendedExpressionsReturningListContext _localctx = new ExtendedExpressionsReturningListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_extendedExpressionsReturningList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(95);
				basicExpressionsReturningList();
				}
				break;
			case 2:
				{
				{
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(96);
						basicExpressionsReturningList();
						setState(97);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Multiply) | (1L << Subtract))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				{
				setState(104);
				extendedExpressionsReturningNumber();
				}
				}
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

	public static class BasicExpressionsReturningNumberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<OperationsReturningNumberContext> operationsReturningNumber() {
			return getRuleContexts(OperationsReturningNumberContext.class);
		}
		public OperationsReturningNumberContext operationsReturningNumber(int i) {
			return getRuleContext(OperationsReturningNumberContext.class,i);
		}
		public List<TerminalNode> Add() { return getTokens(jfk1Parser.Add); }
		public TerminalNode Add(int i) {
			return getToken(jfk1Parser.Add, i);
		}
		public List<TerminalNode> Subtract() { return getTokens(jfk1Parser.Subtract); }
		public TerminalNode Subtract(int i) {
			return getToken(jfk1Parser.Subtract, i);
		}
		public List<TerminalNode> Multiply() { return getTokens(jfk1Parser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(jfk1Parser.Multiply, i);
		}
		public BasicExpressionsReturningNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicExpressionsReturningNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterBasicExpressionsReturningNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitBasicExpressionsReturningNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitBasicExpressionsReturningNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasicExpressionsReturningNumberContext basicExpressionsReturningNumber() throws RecognitionException {
		BasicExpressionsReturningNumberContext _localctx = new BasicExpressionsReturningNumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_basicExpressionsReturningNumber);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(107);
				number();
				}
				break;
			case 2:
				{
				setState(108);
				operationsReturningNumber();
				}
				break;
			case 3:
				{
				{
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						operationsReturningNumber();
						setState(110);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Multiply) | (1L << Subtract))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(116);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(117);
				operationsReturningNumber();
				}
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

	public static class ExtendedExpressionsReturningNumberContext extends ParserRuleContext {
		public List<BasicExpressionsReturningNumberContext> basicExpressionsReturningNumber() {
			return getRuleContexts(BasicExpressionsReturningNumberContext.class);
		}
		public BasicExpressionsReturningNumberContext basicExpressionsReturningNumber(int i) {
			return getRuleContext(BasicExpressionsReturningNumberContext.class,i);
		}
		public List<TerminalNode> Add() { return getTokens(jfk1Parser.Add); }
		public TerminalNode Add(int i) {
			return getToken(jfk1Parser.Add, i);
		}
		public List<TerminalNode> Subtract() { return getTokens(jfk1Parser.Subtract); }
		public TerminalNode Subtract(int i) {
			return getToken(jfk1Parser.Subtract, i);
		}
		public List<TerminalNode> Multiply() { return getTokens(jfk1Parser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(jfk1Parser.Multiply, i);
		}
		public ExtendedExpressionsReturningNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extendedExpressionsReturningNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterExtendedExpressionsReturningNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitExtendedExpressionsReturningNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitExtendedExpressionsReturningNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtendedExpressionsReturningNumberContext extendedExpressionsReturningNumber() throws RecognitionException {
		ExtendedExpressionsReturningNumberContext _localctx = new ExtendedExpressionsReturningNumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_extendedExpressionsReturningNumber);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(120);
				basicExpressionsReturningNumber();
				}
				break;
			case 2:
				{
				{
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(121);
						basicExpressionsReturningNumber();
						setState(122);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Multiply) | (1L << Subtract))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						} 
					}
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(129);
				basicExpressionsReturningNumber();
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExtendedExpressionsReturningListContext extendedExpressionsReturningList() {
			return getRuleContext(ExtendedExpressionsReturningListContext.class,0);
		}
		public ExtendedExpressionsReturningNumberContext extendedExpressionsReturningNumber() {
			return getRuleContext(ExtendedExpressionsReturningNumberContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(132);
				extendedExpressionsReturningList();
				}
				break;
			case 2:
				{
				setState(133);
				extendedExpressionsReturningNumber();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u008b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\3\3\3"+
		"\5\3&\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6S\n\6\3\7\3\7\3\7\3\7"+
		"\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\5\7`\n\7\3\b\3\b\3\b\3\b\7\bf\n\b\f\b"+
		"\16\bi\13\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\t\7\ts\n\t\f\t\16\tv\13\t\3"+
		"\t\5\ty\n\t\3\n\3\n\3\n\3\n\7\n\177\n\n\f\n\16\n\u0082\13\n\3\n\5\n\u0085"+
		"\n\n\3\13\3\13\5\13\u0089\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\n"+
		"\3\2\36\37\6\2\t\t\13\13\20\20\31\31\4\2\17\17\32\33\4\2\f\f\35\35\4\2"+
		"\22\23\25\30\4\2\24\24\34\34\3\2\35\35\4\2\r\16\21\21\2\u0092\2\26\3\2"+
		"\2\2\4%\3\2\2\2\6\'\3\2\2\2\b=\3\2\2\2\nR\3\2\2\2\f_\3\2\2\2\16k\3\2\2"+
		"\2\20x\3\2\2\2\22\u0084\3\2\2\2\24\u0088\3\2\2\2\26\27\t\2\2\2\27\3\3"+
		"\2\2\2\30\36\7\3\2\2\31\32\5\2\2\2\32\33\7\4\2\2\33\35\3\2\2\2\34\31\3"+
		"\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2"+
		"!\"\5\2\2\2\"#\7\5\2\2#&\3\2\2\2$&\7\6\2\2%\30\3\2\2\2%$\3\2\2\2&\5\3"+
		"\2\2\2\'(\5\4\3\2(\7\3\2\2\2)*\t\3\2\2*+\7\7\2\2+,\5\16\b\2,-\7\b\2\2"+
		"->\3\2\2\2./\t\4\2\2/\60\7\7\2\2\60\61\5\16\b\2\61\62\7\4\2\2\62\63\5"+
		"\22\n\2\63\64\7\b\2\2\64>\3\2\2\2\65\66\t\5\2\2\66\67\7\7\2\2\678\5\16"+
		"\b\289\7\4\2\29:\5\16\b\2:;\7\b\2\2;>\3\2\2\2<>\3\2\2\2=)\3\2\2\2=.\3"+
		"\2\2\2=\65\3\2\2\2=<\3\2\2\2>\t\3\2\2\2?@\t\6\2\2@A\7\7\2\2AB\5\16\b\2"+
		"BC\7\b\2\2CS\3\2\2\2DE\t\7\2\2EF\7\7\2\2FG\5\16\b\2GH\7\4\2\2HI\5\22\n"+
		"\2IJ\7\b\2\2JS\3\2\2\2KL\t\b\2\2LM\7\7\2\2MN\5\16\b\2NO\7\4\2\2OP\5\16"+
		"\b\2PQ\7\b\2\2QS\3\2\2\2R?\3\2\2\2RD\3\2\2\2RK\3\2\2\2S\13\3\2\2\2T`\5"+
		"\6\4\2U`\5\b\5\2VW\5\b\5\2WX\t\t\2\2XZ\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^`\5\b\5\2_T\3\2\2\2_U\3\2\2\2_"+
		"[\3\2\2\2`\r\3\2\2\2al\5\f\7\2bc\5\f\7\2cd\t\t\2\2df\3\2\2\2eb\3\2\2\2"+
		"fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jl\5\22\n\2ka\3\2\2"+
		"\2kg\3\2\2\2l\17\3\2\2\2my\5\2\2\2ny\5\n\6\2op\5\n\6\2pq\t\t\2\2qs\3\2"+
		"\2\2ro\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wy\5\n"+
		"\6\2xm\3\2\2\2xn\3\2\2\2xt\3\2\2\2y\21\3\2\2\2z\u0085\5\20\t\2{|\5\20"+
		"\t\2|}\t\t\2\2}\177\3\2\2\2~{\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2"+
		"\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085"+
		"\5\20\t\2\u0084z\3\2\2\2\u0084\u0080\3\2\2\2\u0085\23\3\2\2\2\u0086\u0089"+
		"\5\16\b\2\u0087\u0089\5\22\n\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2"+
		"\u0089\25\3\2\2\2\17\36%=R[_gktx\u0080\u0084\u0088";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}