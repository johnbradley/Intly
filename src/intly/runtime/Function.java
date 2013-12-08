package intly.runtime;

import java.util.List;

/**
 *
 * @author johnbradley
 */
public class Function {
    private final String name;
    private final List<String> paramNames;
    private final Block block;
    
    public Function(String name, Block block, List<String> paramNames) {
        this.name = name;
        this.block = block;
        this.paramNames = paramNames;
    }
    
    public String getName() {
        return name;
    }

    public List<String> getParamNames() {
        return paramNames;
    }
    
    public int run(Vars args, Program program) {
        block.run(args, program);
        return args.getResult();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[func:").append(name).append(" ");
        sb.append(block);
        sb.append("]");
        return sb.toString();
    }

    public void prettyPrint(StringBuilder sb, String prefix) {
        sb.append(prefix).append("func:").append(name).append("\n");
        block.prettyPrint(sb, prefix + "  ");
    }
    
    
    
}
