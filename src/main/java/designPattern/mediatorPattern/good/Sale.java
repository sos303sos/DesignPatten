/**
 * project: designPatten
 * package: designPattern.mediatorPattern.old
 * file: Sale.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月14日 上午11:10:54
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月14日       95129          3.0             1.0
 * modification
 */
package designPattern.mediatorPattern.good;

/**
  * class: Sale<BR>
  * description: 销售管理<BR>
  * author: 95129<BR>
  * date: 2018年10月14日 上午11:10:54<BR>
  *
  */
public class Sale extends AbstractColleague {

    /**
      * Create New Instance Sale<BR>
      * description: <BR>
      * @param _mediator
      */
    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell",number);
    }

    public int getSaleStatus() {
        System.out.println("销售情况为:100");
        return 100;
    }

    public void offSale() {
        super.mediator.execute("sale.offsell");

    }
}
