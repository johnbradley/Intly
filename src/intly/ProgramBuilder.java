package intly;

import intly.parser.IntlyBaseListener;
import intly.parser.IntlyLexer;
import intly.parser.IntlyParser;
import intly.parser.IntlyParser.Var_or_intContext;
import intly.runtime.Assignment;
import intly.runtime.Block;
import intly.runtime.Expr;
import intly.runtime.FuncExpr;
import intly.runtime.Function;
import intly.runtime.IfStatement;
import intly.runtime.IntOrVar;
import intly.runtime.MathExpr;
import intly.runtime.Program;
import intly.runtime.ReturnStatement;
import intly.runtime.ValueExpr;
import intly.runtime.WhileStatement;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Visits all the nodes in the parser package syntax tree and creates a program via the runtime package
 * @author johnbradley
 */
public class ProgramBuilder extends IntlyBaseListener {
    private final Program prog = new Program();
    /** top of the stack of blocks that are currently being built */
    private final Deque<Block> blockStack = new LinkedList<>();
    /** top of the stack of blocks that are currently being built */
    private final Deque<Expr> exprStack = new LinkedList<>();

    public Program getProg() {
        return prog;
    }

    @Override
    public void enterFdecl(IntlyParser.FdeclContext ctx) {
        blockStack.push(new Block());
        super.enterFdecl(ctx);
    }

    @Override
    public void exitFdecl(IntlyParser.FdeclContext ctx) {
        String funcName = ctx.Name().getText();
        IntlyParser.FparamsContext fparams = ctx.fparams();
        List<TerminalNode> paramNodes = fparams.Name();
        List<String> paramNames = new ArrayList<>();
        for(TerminalNode tn : paramNodes) {
            paramNames.add(tn.getText());
        }
        Block finishedBlock = blockStack.pop();
        prog.addFunction(new Function(funcName, finishedBlock, paramNames));
        super.exitFdecl(ctx);
    }

    @Override
    public void exitAssignment(IntlyParser.AssignmentContext ctx) {
        String varName = ctx.Name().getText();
        Expr expr = exprStack.pop();
        Block top = blockStack.peek();
        top.addStatement(new Assignment(varName, expr));
        super.exitAssignment(ctx);
    }

    @Override
    public void exitReturn(IntlyParser.ReturnContext ctx) {
        Expr expr = exprStack.pop();
        Block top = blockStack.peek();
        top.addStatement(new ReturnStatement(expr));
        super.exitReturn(ctx);
    }

    @Override
    public void enterIf(IntlyParser.IfContext ctx) {
        blockStack.push(new Block());
        super.enterIf(ctx);
    }

    @Override
    public void exitIf(IntlyParser.IfContext ctx) {
        
        Expr expr = exprStack.pop();
        Block child = blockStack.pop();
        Block top = blockStack.peek();
        top.addStatement(new IfStatement(expr, child));        
        super.exitIf(ctx);
    }

    @Override
    public void enterWhile(IntlyParser.WhileContext ctx) {
        blockStack.push(new Block());
        super.enterWhile(ctx);
    }
    
    @Override
    public void exitWhile(IntlyParser.WhileContext ctx) {
        Block child = blockStack.pop();
        Block top = blockStack.peek();
        Expr expr = exprStack.pop();
        top.addStatement(new WhileStatement(expr, child));
        super.exitWhile(ctx);
    }

    @Override
    public void exitInteger(IntlyParser.IntegerContext ctx) {
        int value = Integer.parseInt(ctx.Int().getText());
        exprStack.push(ValueExpr.createValue(value));
    }

    @Override
    public void exitVar(IntlyParser.VarContext ctx) {
        String varName = ctx.Name().getText();
        exprStack.push(ValueExpr.createVar(varName));
    }
    
    private void createMathExpr(MathExpr.Operation op) {
        Expr expr1 = exprStack.pop();
        Expr expr2 = exprStack.pop();
        exprStack.push(new MathExpr(op, expr2, expr1));
    }

    @Override
    public void exitMultExpr(IntlyParser.MultExprContext ctx) {
        createMathExpr(MathExpr.Operation.MULT);
    }

    @Override
    public void exitDivExpr(IntlyParser.DivExprContext ctx) {
        createMathExpr(MathExpr.Operation.DIV);
    }

    @Override
    public void exitAddExpr(IntlyParser.AddExprContext ctx) {
        createMathExpr(MathExpr.Operation.ADD);
    }

    @Override
    public void exitSubExpr(IntlyParser.SubExprContext ctx) {
        createMathExpr(MathExpr.Operation.SUB);
    }
    

    @Override
    public void exitLtExpr(IntlyParser.LtExprContext ctx) {
        createMathExpr(MathExpr.Operation.LT);
    }

    @Override
    public void exitLeExpr(IntlyParser.LeExprContext ctx) {
        createMathExpr(MathExpr.Operation.LE);
    }

    @Override
    public void exitGtExpr(IntlyParser.GtExprContext ctx) {
        createMathExpr(MathExpr.Operation.GT);
    }
    
    @Override
    public void exitGeExpr(IntlyParser.GeExprContext ctx) {
        createMathExpr(MathExpr.Operation.GE);
    }

    @Override
    public void exitEqExpr(IntlyParser.EqExprContext ctx) {
        createMathExpr(MathExpr.Operation.EQ);
    }

    @Override
    public void exitFuncExpr(IntlyParser.FuncExprContext ctx) {
        String name = ctx.Name().getText();
        List<IntlyParser.Var_or_intContext> params = ctx.params().var_or_int();
        List<IntOrVar> list = new ArrayList<>();
        for(Var_or_intContext vori : params) {
            Token token = vori.getStart();
            if(token.getType() == IntlyLexer.Name) {
                String varName = vori.var().Name().getText();
                list.add(IntOrVar.makeVar(varName));
            } else {
                String intStr = vori.integer().Int().getText();
                list.add(IntOrVar.makeInt(Integer.parseInt(intStr)));
            }
        }
        exprStack.push(new FuncExpr(name, list));
    }
    

}
