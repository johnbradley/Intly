package intly.runtime;

/**
 *
 * @author johnbradley
 */
public class IntOrVar {
    private Integer intVal;
    private String name;
    private IntOrVar(Integer intVal, String name) {
        this.intVal = intVal;
        this.name = name;
    }
    
    public static IntOrVar makeInt(int val) {
        return new IntOrVar(val, null);
    }
    
    public static IntOrVar makeVar(String name) {
        return new IntOrVar(null, name);
    }    

    int getValue(Args args) {
        if(intVal != null) {
            return intVal;
        }
        return args.get(name);
    }

    @Override
    public String toString() {
        if(intVal != null) {
            return intVal.toString();
        }
        return name;
    }
    
}
