/**
 * project: designPatten
 * package: designPattern.behavior.strategy.good
 * file: BlockEnemy.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月30日 上午10:19:21
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月30日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.strategy.good;

/**
  * class: BlockEnemy<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月30日 上午10:19:21<BR>
  *
  */
public class BlockEnemy implements IStrategy {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月30日 上午10:19:21<BR></p> BlockEnemy
      * @see designPattern.behavior.strategy.good.IStrategy#operate()
      */
    public void operate() {
        System.out.println("孙夫人断后,挡住追兵");
    }

}
