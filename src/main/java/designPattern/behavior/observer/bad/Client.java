/**
 * project: designPatten
 * package: designPattern.behavior.observer
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月31日 下午2:22:16
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月31日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.observer.bad;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月31日 下午2:22:16<BR>
  *
  */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        LiSi liSi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        Spy watchBreakfast = new Spy(hanFeiZi, liSi, "breakfast");
        watchBreakfast.start();
        Spy watchFun = new Spy(hanFeiZi, liSi, "fun");
        watchFun.start();
        Thread.sleep(1000);
        hanFeiZi.haveBreakfast();
        Thread.sleep(1000);
        hanFeiZi.haveFun();

    }
}
