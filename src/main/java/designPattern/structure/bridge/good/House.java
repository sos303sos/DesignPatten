/**
 * project: designPatten
 * package: designPattern.structure.bridge.good
 * file: House.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午3:25:58
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.bridge.good;

/**
  * class: House<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午3:25:58<BR>
  *
  */
public class House extends Product {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午3:25:58<BR></p> House
      * @see designPattern.structure.bridge.good.Product#beProducted()
      */
    @Override
    public void beProducted() {
        System.out.println("生产出的放啥子是这样的...");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午3:25:58<BR></p> House
      * @see designPattern.structure.bridge.good.Product#beSelled()
      */
    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了...");
    }

}
