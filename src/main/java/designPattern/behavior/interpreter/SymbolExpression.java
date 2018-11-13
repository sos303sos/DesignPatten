/**
 * project: designPatten
 * package: designPattern.behavior.interpreter
 * file: SymbolExpression.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月12日 下午3:11:49
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月12日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.interpreter;

/**
  * class: SymbolExpression<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月12日 下午3:11:49<BR>
  *
  */
public abstract class SymbolExpression extends Expression {

    protected Expression left;

    protected Expression right;

    /**
      * Create New Instance SymbolExpression<BR>
      * description: <BR>
      * @param left
      * @param right
      */
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
