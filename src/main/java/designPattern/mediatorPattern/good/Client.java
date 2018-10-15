/**
 * project: designPatten
 * package: designPattern.mediatorPattern.old
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月14日 上午11:29:10
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月14日       95129          3.0             1.0
 * modification
 */
package designPattern.mediatorPattern.good;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月14日 上午11:29:10<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator=new Mediator();
        //采购人员采购电脑
        System.out.println("采购人员采购电脑");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        //销售人员销售电脑
        System.out.println("\n ----销售人员销售电脑");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(55);
        //库存管理人员管理库存
        System.out.println("\n库房管理人员清库处理--");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
