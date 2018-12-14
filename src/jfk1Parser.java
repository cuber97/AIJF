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
		RULE_number = 0, RULE_listT = 1, RULE_operationsReturningList = 2, RULE_operationsReturningNumber = 3, 
		RULE_expressionsReturningList = 4, RULE_expressionsReturningNumber = 5, 
		RULE_expression = 6;
	public static final String[] ruleNames = {
		"number", "listT", "operationsReturningList", "operationsReturningNumber", 
		"expressionsReturningList", "expressionsReturningNumber", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "'{}'", "'('", "')'", "'list'", "'range'", 
		"'reverse'", "'join'", "'add'", "'mult'", "'pow'", "'sort'", "'sub'", 
		"'length'", "'total'", "'count'", "'first'", "'last'", "'min'", "'max'", 
		"'integerDigits'", "'take'", "'drop'", "'position'", "'none'"
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
			setState(14);
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

	public static class ListTContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 2, RULE_listT);
		try {
			int _alt;
			setState(29);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				match(T__0);
				setState(22);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(17);
						number();
						setState(18);
						match(T__1);
						}
						} 
					}
					setState(24);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				setState(25);
				number();
				setState(26);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
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

	public static class OperationsReturningListContext extends ParserRuleContext {
		public Token op1ArgList;
		public Token op2ArgListNumber;
		public Token op2ArgListList;
		public TerminalNode Reverse() { return getToken(jfk1Parser.Reverse, 0); }
		public TerminalNode IntegerDigits() { return getToken(jfk1Parser.IntegerDigits, 0); }
		public TerminalNode Sort() { return getToken(jfk1Parser.Sort, 0); }
		public TerminalNode List() { return getToken(jfk1Parser.List, 0); }
		public List<ExpressionsReturningListContext> expressionsReturningList() {
			return getRuleContexts(ExpressionsReturningListContext.class);
		}
		public ExpressionsReturningListContext expressionsReturningList(int i) {
			return getRuleContext(ExpressionsReturningListContext.class,i);
		}
		public TerminalNode Take() { return getToken(jfk1Parser.Take, 0); }
		public TerminalNode Drop() { return getToken(jfk1Parser.Drop, 0); }
		public TerminalNode Power() { return getToken(jfk1Parser.Power, 0); }
		public TerminalNode Add() { return getToken(jfk1Parser.Add, 0); }
		public TerminalNode Subtract() { return getToken(jfk1Parser.Subtract, 0); }
		public TerminalNode Multiply() { return getToken(jfk1Parser.Multiply, 0); }
		public ExpressionsReturningNumberContext expressionsReturningNumber() {
			return getRuleContext(ExpressionsReturningNumberContext.class,0);
		}
		public TerminalNode Join() { return getToken(jfk1Parser.Join, 0); }
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
		enterRule(_localctx, 4, RULE_operationsReturningList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(31);
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
				setState(32);
				match(T__4);
				setState(33);
				expressionsReturningList();
				setState(34);
				match(T__5);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(36);
				((OperationsReturningListContext)_localctx).op2ArgListNumber = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Multiply) | (1L << Power) | (1L << Subtract) | (1L << Take) | (1L << Drop))) != 0)) ) {
					((OperationsReturningListContext)_localctx).op2ArgListNumber = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(37);
				match(T__4);
				setState(38);
				expressionsReturningList();
				setState(39);
				match(T__1);
				setState(40);
				expressionsReturningNumber();
				setState(41);
				match(T__5);
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(43);
				((OperationsReturningListContext)_localctx).op2ArgListList = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Join) | (1L << Add) | (1L << Multiply) | (1L << Subtract))) != 0)) ) {
					((OperationsReturningListContext)_localctx).op2ArgListList = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(44);
				match(T__4);
				setState(45);
				expressionsReturningList();
				setState(46);
				match(T__1);
				setState(47);
				expressionsReturningList();
				setState(48);
				match(T__5);
				}
				}
				}
				break;
			case 4:
				{
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
		public List<ExpressionsReturningListContext> expressionsReturningList() {
			return getRuleContexts(ExpressionsReturningListContext.class);
		}
		public ExpressionsReturningListContext expressionsReturningList(int i) {
			return getRuleContext(ExpressionsReturningListContext.class,i);
		}
		public TerminalNode Count() { return getToken(jfk1Parser.Count, 0); }
		public TerminalNode Position() { return getToken(jfk1Parser.Position, 0); }
		public ExpressionsReturningNumberContext expressionsReturningNumber() {
			return getRuleContext(ExpressionsReturningNumberContext.class,0);
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
		enterRule(_localctx, 6, RULE_operationsReturningNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
				setState(53);
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
				setState(54);
				match(T__4);
				setState(55);
				expressionsReturningList();
				setState(56);
				match(T__5);
				}
				}
				}
				break;
			case Count:
			case Position:
				{
				{
				setState(58);
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
				setState(59);
				match(T__4);
				setState(60);
				expressionsReturningList();
				setState(61);
				match(T__1);
				setState(62);
				expressionsReturningNumber();
				setState(63);
				match(T__5);
				}
				}
				}
				break;
			case None:
				{
				{
				setState(65);
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
				setState(66);
				match(T__4);
				setState(67);
				expressionsReturningList();
				setState(68);
				match(T__1);
				setState(69);
				expressionsReturningList();
				setState(70);
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

	public static class ExpressionsReturningListContext extends ParserRuleContext {
		public ListTContext listT() {
			return getRuleContext(ListTContext.class,0);
		}
		public OperationsReturningListContext operationsReturningList() {
			return getRuleContext(OperationsReturningListContext.class,0);
		}
		public ExpressionsReturningListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionsReturningList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterExpressionsReturningList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitExpressionsReturningList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitExpressionsReturningList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsReturningListContext expressionsReturningList() throws RecognitionException {
		ExpressionsReturningListContext _localctx = new ExpressionsReturningListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_expressionsReturningList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__3:
				{
				setState(74);
				listT();
				}
				break;
			case EOF:
			case T__1:
			case T__5:
			case List:
			case Reverse:
			case Join:
			case Add:
			case Multiply:
			case Power:
			case Sort:
			case Subtract:
			case IntegerDigits:
			case Take:
			case Drop:
				{
				setState(75);
				operationsReturningList();
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

	public static class ExpressionsReturningNumberContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public OperationsReturningNumberContext operationsReturningNumber() {
			return getRuleContext(OperationsReturningNumberContext.class,0);
		}
		public ExpressionsReturningNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionsReturningNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).enterExpressionsReturningNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jfk1Listener ) ((jfk1Listener)listener).exitExpressionsReturningNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jfk1Visitor ) return ((jfk1Visitor<? extends T>)visitor).visitExpressionsReturningNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsReturningNumberContext expressionsReturningNumber() throws RecognitionException {
		ExpressionsReturningNumberContext _localctx = new ExpressionsReturningNumberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionsReturningNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntPart:
			case PointFloat:
				{
				setState(78);
				number();
				}
				break;
			case Length:
			case Total:
			case Count:
			case First:
			case Last:
			case Min:
			case Max:
			case Position:
			case None:
				{
				setState(79);
				operationsReturningNumber();
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionsReturningListContext expressionsReturningList() {
			return getRuleContext(ExpressionsReturningListContext.class,0);
		}
		public ExpressionsReturningNumberContext expressionsReturningNumber() {
			return getRuleContext(ExpressionsReturningNumberContext.class,0);
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
		enterRule(_localctx, 12, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
			case T__3:
			case List:
			case Reverse:
			case Join:
			case Add:
			case Multiply:
			case Power:
			case Sort:
			case Subtract:
			case IntegerDigits:
			case Take:
			case Drop:
				{
				setState(82);
				expressionsReturningList();
				}
				break;
			case Length:
			case Total:
			case Count:
			case First:
			case Last:
			case Min:
			case Max:
			case Position:
			case None:
			case IntPart:
			case PointFloat:
				{
				setState(83);
				expressionsReturningNumber();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!Y\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\3\3\3\7\3\27"+
		"\n\3\f\3\16\3\32\13\3\3\3\3\3\3\3\3\3\5\3 \n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\66\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5K\n\5\3\6\3\6\5\6O\n\6\3\7\3\7\5\7S\n\7\3\b\3\b\5\bW\n\b\3\b\2"+
		"\2\t\2\4\6\b\n\f\16\2\t\3\2\36\37\6\2\t\t\13\13\20\20\31\31\5\2\r\17\21"+
		"\21\32\33\4\2\f\16\21\21\4\2\22\23\25\30\4\2\24\24\34\34\3\2\35\35\2["+
		"\2\20\3\2\2\2\4\37\3\2\2\2\6\65\3\2\2\2\bJ\3\2\2\2\nN\3\2\2\2\fR\3\2\2"+
		"\2\16V\3\2\2\2\20\21\t\2\2\2\21\3\3\2\2\2\22\30\7\3\2\2\23\24\5\2\2\2"+
		"\24\25\7\4\2\2\25\27\3\2\2\2\26\23\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2"+
		"\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3\2\2\2\33\34\5\2\2\2\34\35\7\5\2\2"+
		"\35 \3\2\2\2\36 \7\6\2\2\37\22\3\2\2\2\37\36\3\2\2\2 \5\3\2\2\2!\"\t\3"+
		"\2\2\"#\7\7\2\2#$\5\n\6\2$%\7\b\2\2%\66\3\2\2\2&\'\t\4\2\2\'(\7\7\2\2"+
		"()\5\n\6\2)*\7\4\2\2*+\5\f\7\2+,\7\b\2\2,\66\3\2\2\2-.\t\5\2\2./\7\7\2"+
		"\2/\60\5\n\6\2\60\61\7\4\2\2\61\62\5\n\6\2\62\63\7\b\2\2\63\66\3\2\2\2"+
		"\64\66\3\2\2\2\65!\3\2\2\2\65&\3\2\2\2\65-\3\2\2\2\65\64\3\2\2\2\66\7"+
		"\3\2\2\2\678\t\6\2\289\7\7\2\29:\5\n\6\2:;\7\b\2\2;K\3\2\2\2<=\t\7\2\2"+
		"=>\7\7\2\2>?\5\n\6\2?@\7\4\2\2@A\5\f\7\2AB\7\b\2\2BK\3\2\2\2CD\t\b\2\2"+
		"DE\7\7\2\2EF\5\n\6\2FG\7\4\2\2GH\5\n\6\2HI\7\b\2\2IK\3\2\2\2J\67\3\2\2"+
		"\2J<\3\2\2\2JC\3\2\2\2K\t\3\2\2\2LO\5\4\3\2MO\5\6\4\2NL\3\2\2\2NM\3\2"+
		"\2\2O\13\3\2\2\2PS\5\2\2\2QS\5\b\5\2RP\3\2\2\2RQ\3\2\2\2S\r\3\2\2\2TW"+
		"\5\n\6\2UW\5\f\7\2VT\3\2\2\2VU\3\2\2\2W\17\3\2\2\2\t\30\37\65JNRV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}