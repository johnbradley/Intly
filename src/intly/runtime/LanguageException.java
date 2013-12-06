package intly.runtime;

/**
 * Core exception for Intly language
 * @author johnbradley
 */
public class LanguageException extends RuntimeException {
    public LanguageException(String msg) {
        super(msg);
    }
    public LanguageException(String msg, Exception cause) {
        super(msg, cause);
    }
}
