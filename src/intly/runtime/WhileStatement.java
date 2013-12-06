package intly.runtime;

import intly.runtime.Block;
import intly.runtime.Program;

/**
 *
 * @author johnbradley
 */
public class WhileStatement implements Statement {
    private final Expr expr;
    private final Block block;

    public WhileStatement(Expr expr, Block block) {
        this.expr = expr;
        this.block = block;
    }
    
    @Override
    public void run(Args args, Program program) {
        while(expr.run(args, program) != 0) {
            block.run(args, program);
        }
    }

    @Override
    public void prettyPrint(StringBuilder sb, String prefix) {
        sb.append(prefix).append("while\n");
        if(block != null) {
            block.prettyPrint(sb, prefix + "  ");
        }        
    }
    
}
