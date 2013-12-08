package intly;

import intly.parser.IntlyLexer;
import intly.parser.IntlyParser;
import intly.runtime.Vars;
import intly.runtime.Program;
import java.io.IOException;
import java.util.List;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author johnbradley
 */
public class Intly {

    private Program program = null;
    private static final String MAIN_FUNC = "main";

    public void loadProgramFromFile(String filename) throws IOException {
        IntlyLexer lexer = new IntlyLexer(new ANTLRFileStream(filename));
        IntlyParser parser = new IntlyParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        ProgramBuilder builder = new ProgramBuilder();
        ParseTreeWalker.DEFAULT.walk(builder, tree);
        program = builder.getProg();
    }
    
    public void loadProgramFromString(String progStr) {
        IntlyLexer lexer = new IntlyLexer(new ANTLRInputStream(progStr));
        IntlyParser parser = new IntlyParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        ProgramBuilder builder = new ProgramBuilder();
        ParseTreeWalker.DEFAULT.walk(builder, tree);
        program = builder.getProg();        
    }

    private Vars buildVars(String[] args) {
        int numParams = args.length - 1;
        List<String> paramNames = program.getParamNames(MAIN_FUNC);
        checkParamCount(paramNames, numParams);
        Vars vars = new Vars();
        for (int i = 1; i < args.length; i++) {
            String paramName = paramNames.get(i - 1);
            int value = parseInt(args, i);
            vars.set(paramName, value);
        }
        return vars;
    }

    private void checkParamCount(List<String> paramNames, int numParams) {
        if (paramNames.size() != numParams) {
            throw new IllegalArgumentException("Received " + numParams
                    + " arguments but main method requires " + paramNames.size());
        }
    }

    private int parseInt(String[] args, int idx) {
        try {
            return Integer.parseInt(args[idx]);
        } catch (NumberFormatException ex) {
            throw new IllegalArgumentException(
                    "Arguments should all be integer #" + idx
                    + " was not:" + ex.getMessage());
        }
    }

    public int run(String[] args) throws IOException {
        loadProgramFromFile(args[0]);
        Vars vars = buildVars(args);
        return runProgram(vars);
    }
    
    public int runProgram(Vars vars) {
        return program.runFunction(MAIN_FUNC, vars);
    }        

    private static void usage() {
        System.out.println("Usage: intly <scriptname> <args...>");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        if (args.length < 1) {
            usage();
            System.exit(1);
            return;
        }
        try {
            Intly intly = new Intly();
            int result = intly.run(args);
            System.out.println(result);
            System.exit(0);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            System.exit(2);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());            
            System.exit(3);
        }
    }

}
