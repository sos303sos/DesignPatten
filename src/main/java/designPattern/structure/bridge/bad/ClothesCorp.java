/**
 * project: designPatten
 * package: designPattern.structure.bridge
 * file: ClothesCorp.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午2:32:33
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.bridge.bad;

/**
  * class: ClothesCorp<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午2:32:33<BR>
  *
  */
public class ClothesCorp extends Corp {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午2:32:33<BR></p> ClothesCorp
      * @see designPattern.structure.bridge.bad.Corp#produce()
      */
    @Override
    protected void produce() {
        System.out.println("服装公司生产衣服...");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午2:32:33<BR></p> ClothesCorp
      * @see designPattern.structure.bridge.bad.Corp#sell()
      */
    @Override
    protected void sell() {
        System.out.println("服装公司出售衣服...");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午2:33:21<BR></p> ClothesCorp
      * @see designPattern.structure.bridge.bad.Corp#makeMoney()
      */
    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("服装公司赚小钱");
    }

}
