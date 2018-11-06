/**
 * project: designPatten
 * package: designPattern.behavior.memento.multiStatus
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月5日 上午10:15:05
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月5日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.memento.multiStatus;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月5日 上午10:15:05<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        Originator ori = new Originator();
        Caretaker caretaker = new Caretaker();
        ori.setState1("中国");
        ori.setState2("强盛");
        ori.setState3("繁荣");
        System.out.println("==初始化状态==" + ori);
        caretaker.setMemento(ori.createMemento());
        ori.setState1("软件");
        ori.setState2("架构");
        ori.setState3("优秀");
        System.out.println("=====修改后的状态" + ori);
        ori.restoreMemento(caretaker.getMemento());
        System.out.println("==恢复后的状态==" + ori);
    }
}
