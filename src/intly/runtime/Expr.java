package intly.runtime;

/**
 *
 * @author johnbradley
 */
public interface Expr {
    int run(Args args, Program program);
    
    void prettyPrint(StringBuilder sb);
}
