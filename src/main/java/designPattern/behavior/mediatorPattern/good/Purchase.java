/**
 * project: designPatten
 * package: designPattern.mediatorPattern.old
 * file: Purchase.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月14日 上午11:07:03
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月14日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.mediatorPattern.good;

/**
  * class: Purchase<BR>
  * description: 采购管理<BR>
  * author: 95129<BR>
  * date: 2018年10月14日 上午11:07:03<BR>
  *
  */
public class Purchase extends AbstractColleague{

    /**
      * Create New Instance Purchase<BR>
      * description: <BR>
      * @param _mediator
      */
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }
    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", number);
    }
    public void refuseBuyIBM(){
        System.out.println("不在采购IBM电脑");
    }
}
