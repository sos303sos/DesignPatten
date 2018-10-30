/**
 * project: designPatten
 * package: designPattern.behavior.strategy.good
 * file: Context.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月30日 上午10:22:39
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月30日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.strategy.good;

/**
  * class: Context<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月30日 上午10:22:39<BR>
  *
  */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
