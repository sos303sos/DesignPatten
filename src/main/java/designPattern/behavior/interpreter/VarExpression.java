/**
 * project: designPatten
 * package: designPattern.behavior.interpreter
 * file: VarExpression.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月12日 下午3:10:05
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月12日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.interpreter;

import java.util.HashMap;

/**
  * class: VarExpression<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月12日 下午3:10:05<BR>
  *
  */
public class VarExpression extends Expression {

    private String key;

    /**
      * Create New Instance VarExpression<BR>
      * description: <BR>
      */
    public VarExpression(String _key) {
        this.key = _key;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月12日 下午3:10:05<BR></p>
      * @param var
      * @return VarExpression
      * @see designPattern.behavior.interpreter.Expression#interpreter(java.util.HashMap)
      */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }

}
