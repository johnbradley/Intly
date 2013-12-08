package intly.runtime;

/**
 *
 * @author johnbradley
 */
public interface Expr {
    int run(Vars args, Program program);
    
    void prettyPrint(StringBuilder sb);
}
