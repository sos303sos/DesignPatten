/**
 * project: designPatten
 * package: designPattern.structure.flyweight.performance
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月23日 上午11:37:49
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月23日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.flyweight.performance;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 上午11:37:49<BR>
  *
  */
public class Client {

    /**
     *<p>
      * method:  main<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年11月23日 上午11:37:49<BR>
      * 
      * @param args  
      */
    public static void main(String[] args) {
        method1();
        method2();
    }

    public static void method1() {
        ExtrinsicState state1 = new ExtrinsicState();
        state1.setSubject("科目1");
        state1.setLocation("上海");
        SignInfoFactory.getSignInfo(state1);
        ExtrinsicState state2 = new ExtrinsicState();
        state2.setSubject("科目1");
        state2.setLocation("上海");
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            SignInfoFactory.getSignInfo(state2);
        }
        System.out.println("method1执行时间为:" + (System.currentTimeMillis() - currentTime));
    }

    public static void method2() {
        String key1 = "科目1上海";
        String key2 = "科目1上海";
        SignInfoFactory.getSignInfo(key1);
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            SignInfoFactory.getSignInfo(key2);
        }
        System.out.println("method2执行时间为:" + (System.currentTimeMillis() - currentTime));
    }

}
