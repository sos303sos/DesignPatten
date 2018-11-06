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
package designPattern.behavior.memento.clone;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月2日 上午11:14:16<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("初始状态......");
        System.out.println("初始状态是:" + originator.getState());
    }
}
