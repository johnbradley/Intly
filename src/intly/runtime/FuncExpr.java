package intly.runtime;

import java.util.List;

/**
 *
 * @author johnbradley
 */
public class FuncExpr implements Expr {
    private final String funcName;
    private final List<IntOrVar> params;

    public FuncExpr(String funcName, List<IntOrVar> params) {
        this.funcName = funcName;
        this.params = params;
    }
    
    @Override
    public int run(Vars args, Program program) {
        Vars newArgs = new Vars();
        Function func = program.functions.get(funcName);
        List<String> paramNames = func.getParamNames();
        for(int i = 0; i < paramNames.size(); i++) {
            IntOrVar param = params.get(i);
            String paramName = paramNames.get(i);
            newArgs.set(paramName, param.getValue(args));
        }
        func.run(newArgs, program);
        return program.runFunction(funcName, newArgs);
    }

    @Override
    public void prettyPrint(StringBuilder sb) {
        String prefix = "";
        sb.append(funcName).append("(");
        for(IntOrVar param : params) {
            sb.append(prefix).append(param);
            prefix = ",";
        }
        sb.append(")");
    }
    
}
