// Generated from Aijf.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AijfParser extends Parser {
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
	public static final int
		RULE_pNumber = 0, RULE_mNumber = 1, RULE_number = 2, RULE_listT = 3, RULE_operationsReturningList = 4, 
		RULE_operationsReturningNumber = 5, RULE_expressionsReturningList = 6, 
		RULE_expressionsReturningNumber = 7, RULE_expression = 8;
	public static final String[] ruleNames = {
		"pNumber", "mNumber", "number", "listT", "operationsReturningList", "operationsReturningNumber", 
		"expressionsReturningList", "expressionsReturningNumber", "expression"
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

	@Override
	public String getGrammarFileName() { return "Aijf.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AijfParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class PNumberContext extends ParserRuleContext {
		public TerminalNode IntPart() { return getToken(AijfParser.IntPart, 0); }
		public TerminalNode PointFloat() { return getToken(AijfParser.PointFloat, 0); }
		public PNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).enterPNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).exitPNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AijfVisitor ) return ((AijfVisitor<? extends T>)visitor).visitPNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PNumberContext pNumber() throws RecognitionException {
		PNumberContext _localctx = new PNumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
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

	public static class MNumberContext extends ParserRuleContext {
		public PNumberContext pNumber() {
			return getRuleContext(PNumberContext.class,0);
		}
		public MNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).enterMNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).exitMNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AijfVisitor ) return ((AijfVisitor<? extends T>)visitor).visitMNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MNumberContext mNumber() throws RecognitionException {
		MNumberContext _localctx = new MNumberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			pNumber();
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

	public static class NumberContext extends ParserRuleContext {
		public PNumberContext pNumber() {
			return getRuleContext(PNumberContext.class,0);
		}
		public MNumberContext mNumber() {
			return getRuleContext(MNumberContext.class,0);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AijfVisitor ) return ((AijfVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntPart:
			case PointFloat:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				pNumber();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				mNumber();
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
			if ( listener instanceof AijfListener ) ((AijfListener)listener).enterListT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).exitListT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AijfVisitor ) return ((AijfVisitor<? extends T>)visitor).visitListT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTContext listT() throws RecognitionException {
		ListTContext _localctx = new ListTContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_listT);
		try {
			int _alt;
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(T__1);
				setState(33);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(28);
						number();
						setState(29);
						match(T__2);
						}
						} 
					}
					setState(35);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(36);
				number();
				setState(37);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(T__4);
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
		public TerminalNode Reverse() { return getToken(AijfParser.Reverse, 0); }
		public TerminalNode Sort() { return getToken(AijfParser.Sort, 0); }
		public TerminalNode List() { return getToken(AijfParser.List, 0); }
		public TerminalNode RemoveDuplicates() { return getToken(AijfParser.RemoveDuplicates, 0); }
		public List<ExpressionsReturningListContext> expressionsReturningList() {
			return getRuleContexts(ExpressionsReturningListContext.class);
		}
		public ExpressionsReturningListContext expressionsReturningList(int i) {
			return getRuleContext(ExpressionsReturningListContext.class,i);
		}
		public TerminalNode Take() { return getToken(AijfParser.Take, 0); }
		public TerminalNode Drop() { return getToken(AijfParser.Drop, 0); }
		public TerminalNode Power() { return getToken(AijfParser.Power, 0); }
		public TerminalNode Add() { return getToken(AijfParser.Add, 0); }
		public TerminalNode Substract() { return getToken(AijfParser.Substract, 0); }
		public TerminalNode Multiply() { return getToken(AijfParser.Multiply, 0); }
		public ExpressionsReturningNumberContext expressionsReturningNumber() {
			return getRuleContext(ExpressionsReturningNumberContext.class,0);
		}
		public TerminalNode Join() { return getToken(AijfParser.Join, 0); }
		public TerminalNode Intersection() { return getToken(AijfParser.Intersection, 0); }
		public OperationsReturningListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationsReturningList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).enterOperationsReturningList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).exitOperationsReturningList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AijfVisitor ) return ((AijfVisitor<? extends T>)visitor).visitOperationsReturningList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsReturningListContext operationsReturningList() throws RecognitionException {
		OperationsReturningListContext _localctx = new OperationsReturningListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operationsReturningList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				{
				setState(42);
				((OperationsReturningListContext)_localctx).op1ArgList = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << List) | (1L << Reverse) | (1L << Sort) | (1L << RemoveDuplicates))) != 0)) ) {
					((OperationsReturningListContext)_localctx).op1ArgList = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(43);
				match(T__5);
				setState(44);
				expressionsReturningList();
				setState(45);
				match(T__6);
				}
				}
				}
				break;
			case 2:
				{
				{
				setState(47);
				((OperationsReturningListContext)_localctx).op2ArgListNumber = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Multiply) | (1L << Power) | (1L << Substract) | (1L << Take) | (1L << Drop))) != 0)) ) {
					((OperationsReturningListContext)_localctx).op2ArgListNumber = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(48);
				match(T__5);
				setState(49);
				expressionsReturningList();
				setState(50);
				match(T__2);
				setState(51);
				expressionsReturningNumber();
				setState(52);
				match(T__6);
				}
				}
				}
				break;
			case 3:
				{
				{
				setState(54);
				((OperationsReturningListContext)_localctx).op2ArgListList = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Join) | (1L << Add) | (1L << Multiply) | (1L << Substract) | (1L << Intersection))) != 0)) ) {
					((OperationsReturningListContext)_localctx).op2ArgListList = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(55);
				match(T__5);
				setState(56);
				expressionsReturningList();
				setState(57);
				match(T__2);
				setState(58);
				expressionsReturningList();
				setState(59);
				match(T__6);
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
		public TerminalNode Length() { return getToken(AijfParser.Length, 0); }
		public TerminalNode Total() { return getToken(AijfParser.Total, 0); }
		public TerminalNode First() { return getToken(AijfParser.First, 0); }
		public TerminalNode Last() { return getToken(AijfParser.Last, 0); }
		public TerminalNode Min() { return getToken(AijfParser.Min, 0); }
		public TerminalNode Max() { return getToken(AijfParser.Max, 0); }
		public ExpressionsReturningListContext expressionsReturningList() {
			return getRuleContext(ExpressionsReturningListContext.class,0);
		}
		public TerminalNode Count() { return getToken(AijfParser.Count, 0); }
		public TerminalNode Position() { return getToken(AijfParser.Position, 0); }
		public ExpressionsReturningNumberContext expressionsReturningNumber() {
			return getRuleContext(ExpressionsReturningNumberContext.class,0);
		}
		public OperationsReturningNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operationsReturningNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).enterOperationsReturningNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).exitOperationsReturningNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AijfVisitor ) return ((AijfVisitor<? extends T>)visitor).visitOperationsReturningNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsReturningNumberContext operationsReturningNumber() throws RecognitionException {
		OperationsReturningNumberContext _localctx = new OperationsReturningNumberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_operationsReturningNumber);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
				setState(64);
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
				setState(65);
				match(T__5);
				setState(66);
				expressionsReturningList();
				setState(67);
				match(T__6);
				}
				}
				}
				break;
			case Count:
			case Position:
				{
				{
				setState(69);
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
				setState(70);
				match(T__5);
				setState(71);
				expressionsReturningList();
				setState(72);
				match(T__2);
				setState(73);
				expressionsReturningNumber();
				setState(74);
				match(T__6);
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
			if ( listener instanceof AijfListener ) ((AijfListener)listener).enterExpressionsReturningList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).exitExpressionsReturningList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AijfVisitor ) return ((AijfVisitor<? extends T>)visitor).visitExpressionsReturningList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsReturningListContext expressionsReturningList() throws RecognitionException {
		ExpressionsReturningListContext _localctx = new ExpressionsReturningListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expressionsReturningList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__4:
				{
				setState(78);
				listT();
				}
				break;
			case EOF:
			case T__2:
			case T__6:
			case List:
			case Reverse:
			case Join:
			case Add:
			case Multiply:
			case Power:
			case Sort:
			case Substract:
			case Take:
			case Drop:
			case Intersection:
			case RemoveDuplicates:
				{
				setState(79);
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
			if ( listener instanceof AijfListener ) ((AijfListener)listener).enterExpressionsReturningNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).exitExpressionsReturningNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AijfVisitor ) return ((AijfVisitor<? extends T>)visitor).visitExpressionsReturningNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsReturningNumberContext expressionsReturningNumber() throws RecognitionException {
		ExpressionsReturningNumberContext _localctx = new ExpressionsReturningNumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expressionsReturningNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case IntPart:
			case PointFloat:
				{
				setState(82);
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
				{
				setState(83);
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
			if ( listener instanceof AijfListener ) ((AijfListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AijfListener ) ((AijfListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AijfVisitor ) return ((AijfVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case T__1:
			case T__4:
			case List:
			case Reverse:
			case Join:
			case Add:
			case Multiply:
			case Power:
			case Sort:
			case Substract:
			case Take:
			case Drop:
			case Intersection:
			case RemoveDuplicates:
				{
				setState(86);
				expressionsReturningList();
				}
				break;
			case T__0:
			case Length:
			case Total:
			case Count:
			case First:
			case Last:
			case Min:
			case Max:
			case Position:
			case IntPart:
			case PointFloat:
				{
				setState(87);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\3\3\3\4\3\4\5\4\34\n\4\3\5\3\5\3\5\3\5\7\5\"\n\5\f\5\16\5%\13\5\3"+
		"\5\3\5\3\5\3\5\5\5+\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6A\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\5\bS\n\b\3\t\3\t\5\tW\n\t\3\n"+
		"\3\n\5\n[\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\b\3\2\37 \6\2\n\n\f\f"+
		"\21\21\36\36\5\2\16\20\22\22\32\33\5\2\r\17\22\22\35\35\4\2\23\24\26\31"+
		"\4\2\25\25\34\34\2]\2\24\3\2\2\2\4\26\3\2\2\2\6\33\3\2\2\2\b*\3\2\2\2"+
		"\n@\3\2\2\2\fN\3\2\2\2\16R\3\2\2\2\20V\3\2\2\2\22Z\3\2\2\2\24\25\t\2\2"+
		"\2\25\3\3\2\2\2\26\27\7\3\2\2\27\30\5\2\2\2\30\5\3\2\2\2\31\34\5\2\2\2"+
		"\32\34\5\4\3\2\33\31\3\2\2\2\33\32\3\2\2\2\34\7\3\2\2\2\35#\7\4\2\2\36"+
		"\37\5\6\4\2\37 \7\5\2\2 \"\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$"+
		"\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\5\6\4\2\'(\7\6\2\2(+\3\2\2\2)+\7\7\2\2"+
		"*\35\3\2\2\2*)\3\2\2\2+\t\3\2\2\2,-\t\3\2\2-.\7\b\2\2./\5\16\b\2/\60\7"+
		"\t\2\2\60A\3\2\2\2\61\62\t\4\2\2\62\63\7\b\2\2\63\64\5\16\b\2\64\65\7"+
		"\5\2\2\65\66\5\20\t\2\66\67\7\t\2\2\67A\3\2\2\289\t\5\2\29:\7\b\2\2:;"+
		"\5\16\b\2;<\7\5\2\2<=\5\16\b\2=>\7\t\2\2>A\3\2\2\2?A\3\2\2\2@,\3\2\2\2"+
		"@\61\3\2\2\2@8\3\2\2\2@?\3\2\2\2A\13\3\2\2\2BC\t\6\2\2CD\7\b\2\2DE\5\16"+
		"\b\2EF\7\t\2\2FO\3\2\2\2GH\t\7\2\2HI\7\b\2\2IJ\5\16\b\2JK\7\5\2\2KL\5"+
		"\20\t\2LM\7\t\2\2MO\3\2\2\2NB\3\2\2\2NG\3\2\2\2O\r\3\2\2\2PS\5\b\5\2Q"+
		"S\5\n\6\2RP\3\2\2\2RQ\3\2\2\2S\17\3\2\2\2TW\5\6\4\2UW\5\f\7\2VT\3\2\2"+
		"\2VU\3\2\2\2W\21\3\2\2\2X[\5\16\b\2Y[\5\20\t\2ZX\3\2\2\2ZY\3\2\2\2[\23"+
		"\3\2\2\2\n\33#*@NRVZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}