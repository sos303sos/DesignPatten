/**
 * project: designPatten
 * package: designPattern.structure.bridge.good
 * file: Corp.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午3:31:30
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.bridge.good;

/**
  * class: Corp<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午3:31:30<BR>
  *
  */
public abstract class Corp {

    private Product product;

    /**
      * Create New Instance Corp<BR>
      * description: <BR>
      * @param product
      */
    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProducted();
        this.product.beSelled();
    }

}
