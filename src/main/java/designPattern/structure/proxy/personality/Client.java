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
package designPattern.structure.proxy.personality;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月26日 上午9:30:20<BR>
  *
  */
public class Client {

    public static void main(String[] args) throws Exception {
        //不能直接访问
        IGamePlayer player = new GamePlayer("张三");
        //可以直接访问
        IGamePlayer proxy = player.getProxy();
        proxy.killBoss();
        proxy.upgrade();
    }
}
