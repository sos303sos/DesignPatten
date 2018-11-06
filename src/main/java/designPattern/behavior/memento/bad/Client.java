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
package designPattern.behavior.memento.bad;

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
        boy.setState("心情很棒!");
        System.out.println("=====男孩现在的状态=====");
        System.out.println(boy.getState());
        Boy backup = new Boy();
        backup.setState(boy.getState());
        boy.changeState();
        System.out.println("\n-----男孩追女孩子后的状态------");
        System.out.println(boy.getState());
        boy.setState(backup.getState());
        System.out.println("\n======男孩恢复后的状态==========");
        System.out.println(boy.getState());
    }
}
