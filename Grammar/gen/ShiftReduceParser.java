// Generated from /home/dev/Pobrane/drive-download-20181210T212045Z-001/Grammar.IntelliJIdea/Grammar/ShiftReduce.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ShiftReduceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WhiteSpace=8, 
		Int=9;
	public static final int
		RULE_exprAlg = 0, RULE_exprRev = 1, RULE_rootAlg = 2, RULE_rootRev = 3;
	public static final String[] ruleNames = {
		"exprAlg", "exprRev", "rootAlg", "rootRev"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^'", "'**'", "'*'", "'/'", "':'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "WhiteSpace", "Int"
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
	public String getGrammarFileName() { return "ShiftReduce.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ShiftReduceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprAlgContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(ShiftReduceParser.Int, 0); }
		public List<ExprAlgContext> exprAlg() {
			return getRuleContexts(ExprAlgContext.class);
		}
		public ExprAlgContext exprAlg(int i) {
			return getRuleContext(ExprAlgContext.class,i);
		}
		public ExprAlgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAlg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftReduceListener ) ((ShiftReduceListener)listener).enterExprAlg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftReduceListener ) ((ShiftReduceListener)listener).exitExprAlg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShiftReduceVisitor ) return ((ShiftReduceVisitor<? extends T>)visitor).visitExprAlg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAlgContext exprAlg() throws RecognitionException {
		return exprAlg(0);
	}

	private ExprAlgContext exprAlg(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprAlgContext _localctx = new ExprAlgContext(_ctx, _parentState);
		ExprAlgContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_exprAlg, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(9);
			match(Int);
			}
			_ctx.stop = _input.LT(-1);
			setState(22);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(20);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						_localctx = new ExprAlgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprAlg);
						setState(11);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(12);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(13);
						exprAlg(4);
						}
						break;
					case 2:
						{
						_localctx = new ExprAlgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprAlg);
						setState(14);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(15);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(16);
						exprAlg(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprAlgContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprAlg);
						setState(17);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(18);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(19);
						exprAlg(3);
						}
						break;
					}
					} 
				}
				setState(24);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprRevContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(ShiftReduceParser.Int, 0); }
		public List<ExprRevContext> exprRev() {
			return getRuleContexts(ExprRevContext.class);
		}
		public ExprRevContext exprRev(int i) {
			return getRuleContext(ExprRevContext.class,i);
		}
		public ExprRevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRev; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftReduceListener ) ((ShiftReduceListener)listener).enterExprRev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftReduceListener ) ((ShiftReduceListener)listener).exitExprRev(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShiftReduceVisitor ) return ((ShiftReduceVisitor<? extends T>)visitor).visitExprRev(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRevContext exprRev() throws RecognitionException {
		return exprRev(0);
	}

	private ExprRevContext exprRev(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprRevContext _localctx = new ExprRevContext(_ctx, _parentState);
		ExprRevContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_exprRev, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(26);
			match(Int);
			}
			_ctx.stop = _input.LT(-1);
			setState(39);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(37);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new ExprRevContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRev);
						setState(28);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(29);
						match(T__0);
						setState(30);
						exprRev(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprRevContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRev);
						setState(31);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(32);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(33);
						exprRev(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprRevContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_exprRev);
						setState(34);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(35);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(36);
						exprRev(3);
						}
						break;
					}
					} 
				}
				setState(41);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RootAlgContext extends ParserRuleContext {
		public ExprAlgContext exprAlg() {
			return getRuleContext(ExprAlgContext.class,0);
		}
		public TerminalNode Int() { return getToken(ShiftReduceParser.Int, 0); }
		public RootAlgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootAlg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftReduceListener ) ((ShiftReduceListener)listener).enterRootAlg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftReduceListener ) ((ShiftReduceListener)listener).exitRootAlg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShiftReduceVisitor ) return ((ShiftReduceVisitor<? extends T>)visitor).visitRootAlg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootAlgContext rootAlg() throws RecognitionException {
		RootAlgContext _localctx = new RootAlgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_rootAlg);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				exprAlg(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(Int);
				}
				break;
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

	public static class RootRevContext extends ParserRuleContext {
		public ExprRevContext exprRev() {
			return getRuleContext(ExprRevContext.class,0);
		}
		public TerminalNode Int() { return getToken(ShiftReduceParser.Int, 0); }
		public RootRevContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rootRev; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftReduceListener ) ((ShiftReduceListener)listener).enterRootRev(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ShiftReduceListener ) ((ShiftReduceListener)listener).exitRootRev(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ShiftReduceVisitor ) return ((ShiftReduceVisitor<? extends T>)visitor).visitRootRev(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootRevContext rootRev() throws RecognitionException {
		RootRevContext _localctx = new RootRevContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rootRev);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				exprRev(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(Int);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0:
			return exprAlg_sempred((ExprAlgContext)_localctx, predIndex);
		case 1:
			return exprRev_sempred((ExprRevContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exprAlg_sempred(ExprAlgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exprRev_sempred(ExprRevContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7"+
		"\2\27\n\2\f\2\16\2\32\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3(\n\3\f\3\16\3+\13\3\3\4\3\4\5\4/\n\4\3\5\3\5\5\5\63\n\5\3\5\2"+
		"\4\2\4\6\2\4\6\b\2\5\3\2\3\4\3\2\5\7\3\2\b\t\28\2\n\3\2\2\2\4\33\3\2\2"+
		"\2\6.\3\2\2\2\b\62\3\2\2\2\n\13\b\2\1\2\13\f\7\13\2\2\f\30\3\2\2\2\r\16"+
		"\f\6\2\2\16\17\t\2\2\2\17\27\5\2\2\6\20\21\f\5\2\2\21\22\t\3\2\2\22\27"+
		"\5\2\2\6\23\24\f\4\2\2\24\25\t\4\2\2\25\27\5\2\2\5\26\r\3\2\2\2\26\20"+
		"\3\2\2\2\26\23\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\3"+
		"\3\2\2\2\32\30\3\2\2\2\33\34\b\3\1\2\34\35\7\13\2\2\35)\3\2\2\2\36\37"+
		"\f\6\2\2\37 \7\3\2\2 (\5\4\3\7!\"\f\5\2\2\"#\t\4\2\2#(\5\4\3\6$%\f\4\2"+
		"\2%&\t\3\2\2&(\5\4\3\5\'\36\3\2\2\2\'!\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*\5\3\2\2\2+)\3\2\2\2,/\5\2\2\2-/\7\13\2\2.,\3\2\2\2"+
		".-\3\2\2\2/\7\3\2\2\2\60\63\5\4\3\2\61\63\7\13\2\2\62\60\3\2\2\2\62\61"+
		"\3\2\2\2\63\t\3\2\2\2\b\26\30\').\62";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}