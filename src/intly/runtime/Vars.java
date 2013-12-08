package intly.runtime;

import java.util.HashMap;
import java.util.Map;

/**
 * Holds integer variables and a return value for a function
 * @author johnbradley
 */
public class Vars {
    final private Map<String, Integer> values = new HashMap<>();
    private boolean exit = false;
    private int result = 0;
    
    public static Vars create(String... keyValuePairs) {
        Vars args = new Vars();
        for (int i = 0; i < keyValuePairs.length; i +=2) {
            args.set(keyValuePairs[i], Integer.parseInt(keyValuePairs[i+1]));
        }
        return args;
    }
    
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
