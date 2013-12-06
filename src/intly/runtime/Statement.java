package intly.runtime;

/**
 *
 * @author johnbradley
 */
public interface Statement {

    void run(Args args, Program program);

    void prettyPrint(StringBuilder sb, String prefix);
    
}
