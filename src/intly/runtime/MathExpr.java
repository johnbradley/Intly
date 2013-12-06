package intly.runtime;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author johnbradley
 */
public class MathExpr implements Expr {
    private final Operation op;
    private final Expr expr1;
    private final Expr expr2;
    
    private static final Map<String, Operation> opLookup = new HashMap<>();
    static {
        for (Operation op : Operation.values()) {
            opLookup.put(op.str, op);
        }
    }

    public MathExpr(Operation op, Expr expr1, Expr expr2) {
        this.op = op;
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public int run(Args args, Program program) {
        int value1 = expr1.run(args, program);
        int value2 = expr2.run(args, program);
        return calc(value1, value2);
    }
    
    private int calc(int value1, int value2) {
        switch(op) {
            case MULT: return value1 * value2;
            case DIV: return value1 / value2;
            case ADD: return value1 + value2;
            case SUB: return value1 - value2;
            case LT: return value1 < value2 ? 1 : 0;
            case LE: return value1 <= value2 ? 1 : 0;
            case GT: return value1 > value2 ? 1 : 0;
            case GE: return value1 >= value2 ? 1 : 0;
            case EQ: return value1 == value2 ? 1 : 0;
        }
        throw new LanguageException("Operation not implemented:" + op.name());
    }
    
    @Override
    public void prettyPrint(StringBuilder sb) {
        expr1.prettyPrint(sb);
        sb.append(" ").append(op.str).append(" ");
        expr2.prettyPrint(sb);
    }

    
    public enum Operation {
        MULT("*"),
        DIV("/"),
        ADD("+"),
        SUB("-"),
        LT("<"),
        LE("<="),
        GT(">"),
        GE(">="),
        EQ("==");
        
        private final String str;
        Operation(String str) {
            this.str = str;
        }
    }
    
    public static Operation getOperationForString(String str) {
        Operation op = opLookup.get(str);
        if(op == null) {
            throw new LanguageException("Invalid operation:" + str);
        }
        return op;
    }    
}
