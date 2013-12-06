package intly.runtime;

import intly.runtime.Program;

/**
 *
 * @author johnbradley
 */
public class ReturnStatement implements Statement {
    private final Expr expr;
    
    public ReturnStatement(Expr expr) {
        this.expr = expr;
    }
    
    @Override
    public void run(Args args, Program program) {
        args.setReturn(expr.run(args, program));
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Return ").append(expr).append("\n");
        return sb.toString();
    }    

    @Override
    public void prettyPrint(StringBuilder sb, String prefix) {
        sb.append(prefix).append("return ");
        expr.prettyPrint(sb);
        sb.append("\n");
    }
    
}
