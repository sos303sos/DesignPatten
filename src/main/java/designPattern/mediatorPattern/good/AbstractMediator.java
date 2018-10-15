/**
 * project: designPatten
 * package: designPattern.mediatorPattern.good
 * file: AbstractMediator.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月14日 上午11:57:02
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月14日       95129          3.0             1.0
 * modification
 */
package designPattern.mediatorPattern.good;

/**
  * class: AbstractMediator<BR>
  * description: 抽象中介者<BR>
  * author: 95129<BR>
  * date: 2018年10月14日 上午11:57:02<BR>
  *
  */
public abstract class AbstractMediator {

    protected Purchase purchase;

    protected Sale sale;

    protected Stock stock;

    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    public abstract void execute(String str, Object... objects);
}
