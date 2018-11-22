/**
 * project: designPatten
 * package: designPattern.structure.bridge
 * file: HouseCorp.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午2:30:03
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.bridge.bad;

/**
  * class: HouseCorp<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午2:30:03<BR>
  *
  */
public class HouseCorp extends Corp {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午2:30:03<BR></p> HouseCorp
      * @see designPattern.structure.bridge.bad.Corp#produce()
      */
    @Override
    protected void produce() {
        System.out.println("房地产公司盖房子");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午2:30:03<BR></p> HouseCorp
      * @see designPattern.structure.bridge.bad.Corp#sell()
      */
    @Override
    protected void sell() {
        System.out.println("房地产公司出售房子");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午2:31:27<BR></p> HouseCorp
      * @see designPattern.structure.bridge.bad.Corp#makeMoney()
      */
    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了");
    }

}
