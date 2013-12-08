package intly;

import intly.runtime.Vars;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author johnbradley
 */
public class IntlyTest {

    @Test
    public void testSimpleReturn() throws Exception {
        testNoArgs("Simple return",
                " main() {  " +
                "   return 4;" +                
                " }",
                4);
    }

    @Test
    public void testAddReturn() throws Exception {
        testNoArgs("Add return",
                " main() {  " +
                "   return 4+2;" +                
                " }",
                6);
    }  
    
    @Test
    public void testAddMultReturn() throws Exception {
        testNoArgs("AddMult return",
                " main() {  " +
                "   return 4+2*2;" +                
                " }",
                8);
    }   
    
    @Test
    public void testSimpleFunc() throws Exception {
        testNoArgs("Simple Function",
                " main() {  " +
                "   return simple(4);" +                
                " }" +
                " simple(val) {  " +
                "   return val +1;" +                
                " }",
                5);
    } 
    
    @Test
    public void testFuncWithTwoArgs() throws Exception {
        testNoArgs("Simple Function",
                " main() {  " +
                "   return simple(8,10);" +
                " }" +
                " simple(val, val2) {  " +
                "   return val + val2;" +                
                " }",
                18);
    }   
    
    
    @Test
    public void testThreeFuncs() throws Exception {
        testNoArgs("Simple Function",
                " main() {  " +
                "   return one(1);" +
                " }" +
                " one(val) {  " +
                "   val = val + 1;" +
                "   return two(val);" +                
                " }" +
                " two(val) {  \n" +
                "   return val+2;\n" +                
                " }",
                4);
    }    
    
    @Test
    public void testWhile() throws Exception {
        testNoArgs("While loop",
                " main() { " +
                "   val = 3; " +     
                "   total = 0;"   +                             
                "   while val {"  +
                "      total = total + 3;" +                        
                "      val = val - 1;" +
                "   } \n" + 
                "   return total;" +
                " }",
                9);
    }
    
    @Test
    public void testIf() throws Exception {
        String prog = 
                " main(val) { " +
                "   if val == 1 { " +
                "      return 10;"   +
                "   }"   +                        
                "   return 20;" +
                " }";
        Vars vars = Vars.create("val", "1");
        testWithArgs("Test if true", prog, vars, 10);
        vars = Vars.create("val", "2");
        testWithArgs("Test if false", prog, vars, 20);
    }
    
    private void testNoArgs(String msg, String prog, int expected) throws Exception {
        testWithArgs(msg, prog, new Vars(), expected);
    }
    
    private void testWithArgs(String msg, String prog, Vars vars, int expected) throws Exception {
        Intly intly = new Intly();
        intly.loadProgramFromString(prog);
        int result = intly.runProgram(vars);
        assertEquals(msg, expected, result);        
    } 
    
}
