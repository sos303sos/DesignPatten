/**
 * project: designPatten
 * package: designPattern.structure.bridge.good
 * file: ShanZhaiCorp.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午3:38:51
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.bridge.good;

/**
  * class: ShanZhaiCorp<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午3:38:51<BR>
  *
  */
public class ShanZhaiCorp extends Corp {

    /**
      * Create New Instance ShanZhaiCorp<BR>
      * description: <BR>
      * @param product
      */
    public ShanZhaiCorp(Product product) {
        super(product);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午3:39:46<BR></p> ShanZhaiCorp
      * @see designPattern.structure.bridge.good.Corp#makeMoney()
      */
    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }

}
