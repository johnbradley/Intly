/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package intly.runtime;

import intly.runtime.Expr;
import intly.runtime.Program;
import intly.runtime.Program;

/**
 *
 * @author johnbradley
 */
public class ValueExpr implements Expr {
    private final String varName;
    private final int value;

    private ValueExpr(String varName, int value) {
        this.varName = varName;
        this.value = value;
    }
    
    public static ValueExpr createVar(String name) {
        return new ValueExpr(name, 0);
    }

    public static ValueExpr createValue(int value) {
        return new ValueExpr(null, value);
    }
    
    @Override
    public int run(Vars args, Program program) {
        if(varName == null) {
            return value;
        } else {
            return args.get(varName);
        }
    }

    @Override
    public void prettyPrint(StringBuilder sb) {
        if(varName == null) {
            sb.append(value);
        } else {
            sb.append(varName);
        }
    }
    
}
