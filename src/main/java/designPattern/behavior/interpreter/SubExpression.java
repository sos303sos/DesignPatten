/**
 * project: designPatten
 * package: designPattern.behavior.interpreter
 * file: AddExpression.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月12日 下午3:13:10
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
  * class: AddExpression<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月12日 下午3:13:10<BR>
  *
  */
public class SubExpression extends SymbolExpression {

    /**
      * Create New Instance AddExpression<BR>
      * description: <BR>
      * @param left
      * @param right
      */
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月12日 下午3:13:51<BR></p>
      * @param var
      * @return Expression
      * @see designPattern.behavior.interpreter.Expression#interpreter(java.util.HashMap)
      */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }

}
