package intly.runtime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Root of the syntax tree
 * @author johnbradley
 */
public class Program {
    Map<String, Function> functions = new HashMap<>();
    
    public void addFunction(Function func) {
        String name = func.getName();
        if(functions.containsKey(name)) {
            throw new LanguageException("Function with name " + name + " has already been defined");
        }
        functions.put(name, func);
    }
    
    public int runFunction(String name, Vars args) {
        Function func = functions.get(name);
        if(func == null) {
            throw new LanguageException("Missing function named:" + name);
        }
        return func.run(args, this);
    }
    
    public List<String> getParamNames(String funcName) {
        Function func = functions.get(funcName);
        if(func == null) {
            throw new LanguageException("Missing function named:" + funcName);
        } 
        return func.getParamNames();
    }

    public String prettyPrint() {
        String prefix = "";
        StringBuilder sb = new StringBuilder();
        sb.append("Program:\n");
        List<String> sortedKeys = new ArrayList<>(functions.keySet());
        Collections.sort(sortedKeys);
        for(String key : sortedKeys) {
            Function func = functions.get(key);
            func.prettyPrint(sb, prefix);
        }
        return sb.toString();
    }
    
    
}
