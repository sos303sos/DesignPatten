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
package designPattern.mediatorPattern.bad;

/**
  * class: Purchase<BR>
  * description: 采购管理<BR>
  * author: 95129<BR>
  * date: 2018年10月14日 上午11:07:03<BR>
  *
  */
public class Purchase {

    public void buyIBMcomputer(int number) {
        Stock stock=new Stock();
        Sale sale=new Sale();
        int saleStatus=sale.getSaleStatus();
        if(saleStatus>80){
            System.out.println("采购IBM电脑:"+number+"台");
            stock.increase(number);
        }else{
            System.out.println("采购IBM电脑:"+number/2+"台");
            stock.increase(number/2);
        }
    }
    public void refuseBuyIBM(){
        System.out.println("不在采购IBM电脑");
    }
}
