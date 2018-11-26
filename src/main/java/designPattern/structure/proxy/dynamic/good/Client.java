/**
 * project: designPatten
 * package: designPattern.structure.proxy.dynamic
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月26日 下午1:35:46
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月26日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.proxy.dynamic.good;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月26日 下午1:35:46<BR>
  *
  */
public class Client {

    /**
     *<p>
      * method:  main<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年11月26日 下午1:35:46<BR>
      * 
      * @param args  
     * @throws Exception 
      */
    public static void main(String[] args) throws Exception {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);
        ClassLoader cl = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();

    }

}
