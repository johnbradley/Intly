package intly.runtime;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds integer variables and a return value for a function
 * @author johnbradley
 */
public class Args {
    final private Map<String, Integer> values = new HashMap<>();
    private boolean exit = false;
    private int result = 0;
    
    public void set(String name, int value) {
        values.put(name, value);
    }
    
    public int get(String name) {
        Integer value = values.get(name);
        if(value == null) {
            throw new LanguageException("No value for field named:" + name);
        }
        return value.intValue();
    }
        
    public void setReturn(int value) {
        exit = true;
        result = value;
    }
    
    public int getResult() {
        return result;
    }
    
    public boolean didExit() {
        return exit;
    }
}
