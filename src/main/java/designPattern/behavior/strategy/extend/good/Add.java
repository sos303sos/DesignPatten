/**
 * project: designPatten
 * package: designPattern.behavior.strategy.extend.good
 * file: Add.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月30日 下午1:54:36
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月30日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.strategy.extend.good;

/**
  * class: Add<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月30日 下午1:54:36<BR>
  *
  */
public class Add implements Calculator {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月30日 下午1:54:51<BR></p>
      * @param a
      * @param b
      * @return Calculator
      * @see designPattern.behavior.strategy.extend.good.Calculator#exec(int, int)
      */
    public int exec(int a, int b) {
        return a + b;
    }

}
