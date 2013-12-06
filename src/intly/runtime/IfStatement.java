package intly.runtime;

/**
 *
 * @author johnbradley
 */
public class IfStatement implements Statement {
    private final Expr expr;
    private final Block block;

    public IfStatement(Expr expr, Block block) {
        this.expr = expr;
        this.block = block;
    }
    
    @Override
    public void run(Args args, Program program) {
        if(expr.run(args, program) != 0) {
            block.run(args, program);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("if ").append(expr).append("\n");
        sb.append(block);
        sb.append("\n");
        return sb.toString();
    }  
    
    @Override
    public void prettyPrint(StringBuilder sb, String prefix) {
        sb.append(prefix).append("if ");
        if(expr != null) {
            expr.prettyPrint(sb);
        }
        sb.append("\n");
        if(block != null) {
            block.prettyPrint(sb, prefix + "  ");
        }
        
    }

}
