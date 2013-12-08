package intly.runtime;

/**
 *
 * @author johnbradley
 */
public interface Statement {

    void run(Vars args, Program program);

    void prettyPrint(StringBuilder sb, String prefix);
    
}
