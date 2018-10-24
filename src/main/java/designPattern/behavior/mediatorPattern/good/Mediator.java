/**
 * project: designPatten
 * package: designPattern.mediatorPattern.good
 * file: Mediator.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月14日 下午12:25:26
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月14日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.mediatorPattern.good;

/**
  * class: Mediator<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月14日 下午12:25:26<BR>
  *
  */
public class Mediator extends AbstractMediator {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月14日 下午12:25:26<BR></p>
      * @param str
      * @param objects Mediator
      * @see designPattern.behavior.mediatorPattern.good.AbstractMediator#execute(java.lang.String, java.lang.Object[])
      */
    @Override
    public void execute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale.sell")) {
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            this.offSale();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }

    }

    private void buyComputer(int number) {
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑:" + number + "台");
            super.stock.increase(number);
        } else {
            System.out.println("采购IBM电脑:" + number / 2 + "台");
            super.stock.increase(number / 2);
        }
    }

    public void sellComputer(int number) {
        if (stock.getStockNumber() < number) {
            purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑" + number + "台");
        stock.decrease(number);
    }

    public void offSale() {
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

    public void clearStock() {
        sale.offSale();
        purchase.refuseBuyIBM();
    }
}
