package intly.runtime;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johnbradley
 */
public class ProgramTest {
    private Program prog;
    private Args args;
    private Block mainBlock;
    
    @Before
    public void setup() {
        prog = new Program();
        args = new Args();
        mainBlock = new Block();
    }
    
    private void addFunc(String name, Block block) {
        prog.addFunction(new Function(name, block));
    }
    
    private int runMain() {
        addFunc("main", mainBlock);
        return prog.runFunction("main", args);        
    }
    
    @Test
    public void testSimpleReturn() {
        mainBlock.addReturnValue(6);
        int result = runMain();
        assertEquals(6, result);
    }

    @Test
    public void testAssignReturn() {
        mainBlock.addSimpleAssign("it", 5);
        mainBlock.addReturnVar("it");
        int result = runMain();
        assertEquals(5, result);
    }
    
    @Test
    public void testReturnArg() {
        args.set("it", 9);
        mainBlock.addReturnVar("it");
        int result = runMain();
        assertEquals(9, result);
    }
    
    @Test
    public void testSimpleCall() {
        Block other = new Block();
        other.addReturnValue(5);
        addFunc("other", other);
        
        mainBlock.addStatement(new ReturnStatement(new FuncExpr("other")));
        
        int result = runMain();
        assertEquals(5, result);
    }
    
    @Test(expected=intly.runtime.LanguageException.class)
    public void testTwoMain() {
        Block other = new Block();
        addFunc("main", other);
        runMain();
    }
    
    @Test(expected=intly.runtime.LanguageException.class)
    public void testReturnNoSet() {
        mainBlock.addReturnVar("it");
        runMain();
    }
    
    @Test
    public void testSimpleMath() {
        Expr four = ValueExpr.createValue(4);
        Expr five = ValueExpr.createValue(5);
        
        Expr expr = new MathExpr(MathExpr.Operation.ADD, four, five);
        mainBlock.addStatement(new ReturnStatement(expr));
        
        int result = runMain();
        assertEquals(9, result);
    }
    
    @Test
    public void testSimpleMath2() {
        //2 * 3 * 2
        Expr two = ValueExpr.createValue(2);
        Expr three = ValueExpr.createValue(3);
        
        Expr multExpr = new MathExpr(MathExpr.Operation.MULT, two, three);
        Expr expr = new MathExpr(MathExpr.Operation.MULT, multExpr, two);
        mainBlock.addStatement(new ReturnStatement(expr));
        
        int result = runMain();
        assertEquals(12, result);
    }    
    
    @Test
    public void testIfTrue() {
        //if it == 0 return 1
        args.set("it", 0);
        
        Expr expr = new MathExpr(MathExpr.Operation.EQ, 
                ValueExpr.createVar("it"), 
                ValueExpr.createValue(0));
        Block block = new Block();
        block.addReturnValue(1);
        mainBlock.addStatement(new IfStatement(expr, block));
        mainBlock.addReturnValue(0);
        
        int result = runMain();
        assertEquals(1, result);
    }    
    
    @Test
    public void testIfFalse() {
        //if it == 0 return 1
        args.set("it", 2);
        
        Expr expr = new MathExpr(MathExpr.Operation.EQ, 
                ValueExpr.createVar("it"), 
                ValueExpr.createValue(0));
        Block block = new Block();
        block.addReturnValue(1);
        mainBlock.addStatement(new IfStatement(expr, block));
        mainBlock.addReturnValue(0);
        
        int result = runMain();
        assertEquals(0, result);
    }     
    
    @Test
    public void testWhile() {
        //if it == 0 return 1
        args.set("it", 5);
        
        Expr expr = new MathExpr(MathExpr.Operation.GT, 
                ValueExpr.createVar("it"), 
                ValueExpr.createValue(0));
        mainBlock.addSimpleAssign("total", 0);
        Block block = new Block();
        //subtract 1 from it
        MathExpr decrementIt = new MathExpr(MathExpr.Operation.SUB, 
                ValueExpr.createVar("it"), 
                ValueExpr.createValue(1));
        block.addStatement(new Assignment("it", decrementIt));
        //add 2 to total
        MathExpr addTwoToTotal = new MathExpr(MathExpr.Operation.ADD, 
                ValueExpr.createVar("total"), 
                ValueExpr.createValue(2));
        block.addStatement(new Assignment("total", addTwoToTotal));        
        
        mainBlock.addStatement(new WhileStatement(expr, block));
        mainBlock.addReturnVar("total");
        
        int result = runMain();
        assertEquals(10, result);
    }      
    
    
}
