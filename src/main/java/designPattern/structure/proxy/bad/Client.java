/**
 * project: designPatten
 * package: designPattern.structure.proxy
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月26日 上午9:30:20
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月26日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.proxy.bad;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月26日 上午9:30:20<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间是 10:45");
        player.login("zhangSan", "password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间为:03:40");
    }
}
