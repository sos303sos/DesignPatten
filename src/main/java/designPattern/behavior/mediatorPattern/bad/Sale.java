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
package designPattern.behavior.mediatorPattern.bad;

/**
  * class: Sale<BR>
  * description: 销售管理<BR>
  * author: 95129<BR>
  * date: 2018年10月14日 上午11:10:54<BR>
  *
  */
public class Sale {

    public void sellIBMComputer(int number) {
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStockNumber() < number) {
            purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑" + number + "台");
        stock.decrease(number);
    }

    public int getSaleStatus() {
        System.out.println("销售情况为:100");
        return 100;
    }

    public void offSale() {
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }
}
