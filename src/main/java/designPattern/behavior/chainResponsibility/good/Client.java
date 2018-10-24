/**
 * project: designPatten
 * package: designPattern.chainResponsibility.bad
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月18日 下午1:31:00
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月18日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.chainResponsibility.good;

import java.util.ArrayList;
import java.util.Random;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月18日 下午1:31:00<BR>
  *
  */
public class Client {

    /**
     *<p>
      * method:  main<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年10月18日 下午1:31:00<BR>
      * 
      * @param args  
      */
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new Women(rand.nextInt(4), "我要出去逛街"));
        }
        //
        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);

        for (IWomen women : arrayList) {
            father.HandleMessage(women);
        }
    }

}
