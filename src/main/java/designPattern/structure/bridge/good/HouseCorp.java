/**
 * project: designPatten
 * package: designPattern.structure.bridge.good
 * file: HouseCorp.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午3:33:41
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.bridge.good;

/**
  * class: HouseCorp<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午3:33:41<BR>
  *
  */
public class HouseCorp extends Corp {

    /**
      * Create New Instance HouseCorp<BR>
      * description: <BR>
      */
    public HouseCorp(House house) {
        super(house);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午3:37:01<BR></p> HouseCorp
      * @see designPattern.structure.bridge.good.Corp#makeMoney()
      */
    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了");
    }

}
