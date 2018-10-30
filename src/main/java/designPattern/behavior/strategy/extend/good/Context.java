/**
 * project: designPatten
 * package: designPattern.behavior.strategy.extend.good
 * file: Context.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月30日 下午1:55:28
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月30日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.strategy.extend.good;

/**
  * class: Context<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月30日 下午1:55:28<BR>
  *
  */
public class Context {

    private Calculator cal = null;

    public Context(Calculator _cal) {
        this.cal = _cal;
    }

    public int exec(int a, int b, String symbol) {
        return this.cal.exec(a, b);
    }
}
