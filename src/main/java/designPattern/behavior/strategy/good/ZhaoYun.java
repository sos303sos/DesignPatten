/**
 * project: designPatten
 * package: designPattern.behavior.strategy.good
 * file: ZhaoYun.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月30日 上午11:02:38
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月30日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.strategy.good;

/**
  * class: ZhaoYun<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月30日 上午11:02:38<BR>
  *
  */
public class ZhaoYun {

    public static void main(String[] args) {
        Context context;
        System.out.println("刚刚到吴国的时候拆第一个");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n\n\n");
        System.out.println("孙权的小兵追了,咋办?拆第三个");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("");

    }
}
