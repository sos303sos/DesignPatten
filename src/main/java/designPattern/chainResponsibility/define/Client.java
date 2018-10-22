/**
 * project: designPatten
 * package: designPattern.chainResponsibility.define
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月20日 上午11:19:18
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月20日       95129          3.0             1.0
 * modification
 */
package designPattern.chainResponsibility.define;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月20日 上午11:19:18<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        //声明所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        //设置链中的阶段顺序1--＞2--＞3
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        //提交请求，返回结果
        Response response = handler1.handlerMessage(new Request());
    }
}
