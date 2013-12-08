package intly.runtime;

import intly.runtime.Program;

/**
 *
 * @author johnbradley
 */
public class Assignment implements Statement {
    private final String name;
    private final Expr expr;

    public Assignment(String name, Expr expr) {
        this.name = name;
        this.expr = expr;
    }
 
    @Override
    public void run(Vars args, Program program) {
        int value = expr.run(args, program);
        args.set(name, value);
    }

    @Override
    public void prettyPrint(StringBuilder sb, String prefix) {
        sb.append(prefix).append("assign ");
        expr.prettyPrint(sb);
        sb.append(" to ").append(name).append("\n");
    }
    
    
    
}
