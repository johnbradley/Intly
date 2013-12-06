// Generated from Intly.g4 by ANTLR 4.1
package intly.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IntlyParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Ret=1, LeftParen=2, RightParen=3, LeftBracket=4, RightBracket=5, Colon=6, 
		Comma=7, Semi=8, Assign=9, Eq=10, IfCmd=11, While=12, Mult=13, Div=14, 
		Sub=15, Add=16, Lt=17, Gt=18, Le=19, Ge=20, Name=21, Int=22, WS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'return'", "'('", "')'", "'{'", "'}'", "':'", "','", "';'", 
		"'='", "'=='", "'if'", "'while'", "'*'", "'/'", "'-'", "'+'", "'<'", "'>'", 
		"'<='", "'>='", "Name", "Int", "WS"
	};
	public static final int
		RULE_program = 0, RULE_fdecl = 1, RULE_fparams = 2, RULE_statement = 3, 
		RULE_expr = 4, RULE_params = 5, RULE_var_or_int = 6, RULE_var = 7, RULE_integer = 8;
	public static final String[] ruleNames = {
		"program", "fdecl", "fparams", "statement", "expr", "params", "var_or_int", 
		"var", "integer"
	};

	@Override
	public String getGrammarFileName() { return "Intly.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public IntlyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<FdeclContext> fdecl() {
			return getRuleContexts(FdeclContext.class);
		}
		public FdeclContext fdecl(int i) {
			return getRuleContext(FdeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18); fdecl();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Name );
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

	public static class FdeclContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public FparamsContext fparams() {
			return getRuleContext(FparamsContext.class,0);
		}
		public TerminalNode Name() { return getToken(IntlyParser.Name, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterFdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitFdecl(this);
		}
	}

	public final FdeclContext fdecl() throws RecognitionException {
		FdeclContext _localctx = new FdeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fdecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); match(Name);
			setState(24); match(LeftParen);
			setState(26);
			_la = _input.LA(1);
			if (_la==Name) {
				{
				setState(25); fparams();
				}
			}

			setState(28); match(RightParen);
			setState(29); match(LeftBracket);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30); statement();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ret) | (1L << IfCmd) | (1L << While) | (1L << Name))) != 0) );
			setState(35); match(RightBracket);
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

	public static class FparamsContext extends ParserRuleContext {
		public TerminalNode Name(int i) {
			return getToken(IntlyParser.Name, i);
		}
		public List<TerminalNode> Name() { return getTokens(IntlyParser.Name); }
		public FparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterFparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitFparams(this);
		}
	}

	public final FparamsContext fparams() throws RecognitionException {
		FparamsContext _localctx = new FparamsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); match(Name);
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(38); match(Comma);
				setState(39); match(Name);
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignmentContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Name() { return getToken(IntlyParser.Name, 0); }
		public AssignmentContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitAssignment(this);
		}
	}
	public static class IfContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitIf(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitReturn(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitWhile(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(74);
			switch (_input.LA(1)) {
			case Name:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(45); match(Name);
				setState(46); match(Assign);
				setState(47); expr(0);
				setState(48); match(Semi);
				}
				break;
			case Ret:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50); match(Ret);
				setState(51); expr(0);
				setState(52); match(Semi);
				}
				break;
			case IfCmd:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54); match(IfCmd);
				setState(55); expr(0);
				setState(56); match(LeftBracket);
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57); statement();
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ret) | (1L << IfCmd) | (1L << While) | (1L << Name))) != 0) );
				setState(62); match(RightBracket);
				}
				break;
			case While:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(64); match(While);
				setState(65); expr(0);
				setState(66); match(LeftBracket);
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(67); statement();
					}
					}
					setState(70); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ret) | (1L << IfCmd) | (1L << While) | (1L << Name))) != 0) );
				setState(72); match(RightBracket);
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

	public static class ExprContext extends ParserRuleContext {
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class MultExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterMultExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitMultExpr(this);
		}
	}
	public static class ValueExprContext extends ExprContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterValueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitValueExpr(this);
		}
	}
	public static class SubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitSubExpr(this);
		}
	}
	public static class GtExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterGtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitGtExpr(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitAddExpr(this);
		}
	}
	public static class FuncExprContext extends ExprContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode Name() { return getToken(IntlyParser.Name, 0); }
		public FuncExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterFuncExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitFuncExpr(this);
		}
	}
	public static class LtExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LtExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitLtExpr(this);
		}
	}
	public static class GeExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterGeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitGeExpr(this);
		}
	}
	public static class LeExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LeExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterLeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitLeExpr(this);
		}
	}
	public static class EqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitEqExpr(this);
		}
	}
	public static class DivExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitDivExpr(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(79);
				switch (_input.LA(1)) {
				case Name:
					{
					setState(77); var();
					}
					break;
				case Int:
					{
					setState(78); integer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;

			case 2:
				{
				_localctx = new FuncExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81); match(Name);
				setState(82); match(LeftParen);
				setState(83); params();
				setState(84); match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(88);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(89); match(Mult);
						setState(90); expr(11);
						}
						break;

					case 2:
						{
						_localctx = new DivExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(91);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(92); match(Div);
						setState(93); expr(10);
						}
						break;

					case 3:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(95); match(Add);
						setState(96); expr(9);
						}
						break;

					case 4:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(97);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(98); match(Sub);
						setState(99); expr(8);
						}
						break;

					case 5:
						{
						_localctx = new LtExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(100);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(101); match(Lt);
						setState(102); expr(7);
						}
						break;

					case 6:
						{
						_localctx = new LeExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(103);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(104); match(Le);
						setState(105); expr(6);
						}
						break;

					case 7:
						{
						_localctx = new GtExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(106);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(107); match(Gt);
						setState(108); expr(5);
						}
						break;

					case 8:
						{
						_localctx = new GeExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(109);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(110); match(Ge);
						setState(111); expr(4);
						}
						break;

					case 9:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(112);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(113); match(Eq);
						setState(114); expr(3);
						}
						break;
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<Var_or_intContext> var_or_int() {
			return getRuleContexts(Var_or_intContext.class);
		}
		public Var_or_intContext var_or_int(int i) {
			return getRuleContext(Var_or_intContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(120); var_or_int();
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(121); match(Comma);
				{
				setState(122); var_or_int();
				}
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Var_or_intContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Var_or_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_or_int; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterVar_or_int(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitVar_or_int(this);
		}
	}

	public final Var_or_intContext var_or_int() throws RecognitionException {
		Var_or_intContext _localctx = new Var_or_intContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_var_or_int);
		try {
			setState(130);
			switch (_input.LA(1)) {
			case Name:
				enterOuterAlt(_localctx, 1);
				{
				setState(128); var();
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(129); integer();
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode Name() { return getToken(IntlyParser.Name, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); match(Name);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(IntlyParser.Int, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IntlyListener ) ((IntlyListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_integer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(Int);
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
		case 4: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 10 >= _localctx._p;

		case 1: return 9 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;

		case 4: return 6 >= _localctx._p;

		case 5: return 5 >= _localctx._p;

		case 6: return 4 >= _localctx._p;

		case 7: return 3 >= _localctx._p;

		case 8: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\31\u008b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6"+
		"\2\26\n\2\r\2\16\2\27\3\3\3\3\3\3\5\3\35\n\3\3\3\3\3\3\3\6\3\"\n\3\r\3"+
		"\16\3#\3\3\3\3\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5=\n\5\r\5\16\5>\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\6\5G\n\5\r\5\16\5H\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\5\6R\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6Y\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6v\n"+
		"\6\f\6\16\6y\13\6\3\7\3\7\3\7\7\7~\n\7\f\7\16\7\u0081\13\7\3\b\3\b\5\b"+
		"\u0085\n\b\3\t\3\t\3\n\3\n\3\n\2\13\2\4\6\b\n\f\16\20\22\2\2\u0097\2\25"+
		"\3\2\2\2\4\31\3\2\2\2\6\'\3\2\2\2\bL\3\2\2\2\nX\3\2\2\2\fz\3\2\2\2\16"+
		"\u0084\3\2\2\2\20\u0086\3\2\2\2\22\u0088\3\2\2\2\24\26\5\4\3\2\25\24\3"+
		"\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\3\3\2\2\2\31\32\7"+
		"\27\2\2\32\34\7\4\2\2\33\35\5\6\4\2\34\33\3\2\2\2\34\35\3\2\2\2\35\36"+
		"\3\2\2\2\36\37\7\5\2\2\37!\7\6\2\2 \"\5\b\5\2! \3\2\2\2\"#\3\2\2\2#!\3"+
		"\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\7\2\2&\5\3\2\2\2\',\7\27\2\2()\7\t\2\2"+
		")+\7\27\2\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\7\3\2\2\2.,\3\2\2"+
		"\2/\60\7\27\2\2\60\61\7\13\2\2\61\62\5\n\6\2\62\63\7\n\2\2\63M\3\2\2\2"+
		"\64\65\7\3\2\2\65\66\5\n\6\2\66\67\7\n\2\2\67M\3\2\2\289\7\r\2\29:\5\n"+
		"\6\2:<\7\6\2\2;=\5\b\5\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2"+
		"\2\2@A\7\7\2\2AM\3\2\2\2BC\7\16\2\2CD\5\n\6\2DF\7\6\2\2EG\5\b\5\2FE\3"+
		"\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JK\7\7\2\2KM\3\2\2\2L/\3"+
		"\2\2\2L\64\3\2\2\2L8\3\2\2\2LB\3\2\2\2M\t\3\2\2\2NQ\b\6\1\2OR\5\20\t\2"+
		"PR\5\22\n\2QO\3\2\2\2QP\3\2\2\2RY\3\2\2\2ST\7\27\2\2TU\7\4\2\2UV\5\f\7"+
		"\2VW\7\5\2\2WY\3\2\2\2XN\3\2\2\2XS\3\2\2\2Yw\3\2\2\2Z[\6\6\2\3[\\\7\17"+
		"\2\2\\v\5\n\6\2]^\6\6\3\3^_\7\20\2\2_v\5\n\6\2`a\6\6\4\3ab\7\22\2\2bv"+
		"\5\n\6\2cd\6\6\5\3de\7\21\2\2ev\5\n\6\2fg\6\6\6\3gh\7\23\2\2hv\5\n\6\2"+
		"ij\6\6\7\3jk\7\25\2\2kv\5\n\6\2lm\6\6\b\3mn\7\24\2\2nv\5\n\6\2op\6\6\t"+
		"\3pq\7\26\2\2qv\5\n\6\2rs\6\6\n\3st\7\f\2\2tv\5\n\6\2uZ\3\2\2\2u]\3\2"+
		"\2\2u`\3\2\2\2uc\3\2\2\2uf\3\2\2\2ui\3\2\2\2ul\3\2\2\2uo\3\2\2\2ur\3\2"+
		"\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\13\3\2\2\2yw\3\2\2\2z\177\5\16\b\2"+
		"{|\7\t\2\2|~\5\16\b\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080\r\3\2\2\2\u0081\177\3\2\2\2\u0082\u0085\5\20\t\2\u0083"+
		"\u0085\5\22\n\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\17\3\2\2"+
		"\2\u0086\u0087\7\27\2\2\u0087\21\3\2\2\2\u0088\u0089\7\30\2\2\u0089\23"+
		"\3\2\2\2\17\27\34#,>HLQXuw\177\u0084";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}