/**
 * project: designPatten
 * package: designPattern.behavior.memento
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月2日 上午11:14:16
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月2日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.memento.better;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月2日 上午11:14:16<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();
        boy.setState("心情很棒!");
        System.out.println("=====男孩现在的状态=====");
        System.out.println(boy.getState());
        caretaker.setMemento(boy.createMemento());
        boy.changeState();
        System.out.println("\n=======男孩追女孩子后的状态======");
        System.out.println(boy.getState());
        boy.restoreMemento(caretaker.getMemento());
        System.out.println("\n=====男孩恢复后的状态=====");
        System.out.println(boy.getState());
    }
}
