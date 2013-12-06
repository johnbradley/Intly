package intly.runtime;

import java.util.ArrayList;
import java.util.List;

/**
 * A bunch of statements that can be executed
 * @author johnbradley
 */
public class Block {
    private final List<Statement> statements = new ArrayList<>();

    public void addStatement(Statement statement) {
        statements.add(statement);
    }
    
    public void addReturnValue(int value) {
        addStatement(new ReturnStatement(ValueExpr.createValue(value)));
    }
    
    public void addReturnVar(String name) {
        addStatement(new ReturnStatement(ValueExpr.createVar(name)));
    }   
    
    public void addSimpleAssign(String name, int value) {
        addStatement(new Assignment(name, ValueExpr.createValue(value)));
    }      
    
    public void run(Args args, Program program) {
        for(Statement statement : statements) {
            statement.run(args, program);
            if(args.didExit()) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("    block:\n");
        for(Statement statement : statements) {
            sb.append(statement);
        }
        return sb.toString();
    }

    public void prettyPrint(StringBuilder sb, String prefix) {
        for(Statement statement : statements) {
            statement.prettyPrint(sb, prefix);
        }
    }
    
}
