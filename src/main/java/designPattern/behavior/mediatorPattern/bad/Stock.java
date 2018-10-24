/**
 * project: designPatten
 * package: designPattern.mediatorPattern.old
 * file: Stock.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月14日 上午11:08:25
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月14日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.mediatorPattern.bad;

/**
  * class: Stock<BR>
  * description: 库存类<BR>
  * author: 95129<BR>
  * date: 2018年10月14日 上午11:08:25<BR>
  *
  */
public class Stock {

    private static int COMPUTER_NUMBER = 100;

    public void increase(int number) {
        COMPUTER_NUMBER+=number;
        System.out.println("库存数量为:"+COMPUTER_NUMBER);
    }

    public void decrease(int number) {
        COMPUTER_NUMBER-=number;
        System.out.println("库存数量为:"+COMPUTER_NUMBER);
    }

    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    public void clearStock() {
        Purchase purchase=new Purchase();
        Sale sale=new Sale();
        System.out.println("清理存货数量为:"+COMPUTER_NUMBER);
        sale.offSale();
        purchase.refuseBuyIBM();
    }
}
