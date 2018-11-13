/**
 * project: designPatten
 * package: designPattern.behavior.interpreter
 * file: Expression.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月12日 下午3:08:13
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
  * class: Expression<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月12日 下午3:08:13<BR>
  *
  */
public abstract class Expression {

    public abstract int interpreter(HashMap<String, Integer> var);
}
