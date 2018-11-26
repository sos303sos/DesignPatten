/**
 * project: designPatten
 * package: designPattern.structure.proxy
 * file: GamePlayer.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月23日 下午7:46:11
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月23日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.proxy.force;

/**
  * class: GamePlayer<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 下午7:46:11<BR>
  *
  */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer proxy = null;

    /**
      * Create New Instance GamePlayer<BR>
      * description: <BR>
      * @param name
     * @throws Exception 
      */
    public GamePlayer(String name) {
        this.name = name;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月23日 下午7:46:11<BR></p>
      * @param user
      * @param password GamePlayer
      * @see designPattern.structure.proxy.bad.IGamePlayer#login(java.lang.String, java.lang.String)
      */
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功!");
        } else {
            System.out.println("请使用指定代理");
        }

    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月23日 下午7:46:11<BR></p> GamePlayer
      * @see designPattern.structure.proxy.bad.IGamePlayer#killBoss()
      */
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪!");
        } else {
            System.out.println("请使用指定代理");
        }
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月23日 下午7:46:11<BR></p> GamePlayer
      * @see designPattern.structure.proxy.bad.IGamePlayer#upgrade()
      */
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + "又生了一级!");
        } else {
            System.out.println("请使用指定代理");
        }

    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月26日 上午10:23:51<BR></p>
      * @return IGamePlayer
     * @throws Exception 
      * @see designPattern.structure.proxy.force.IGamePlayer#getProxy()
      */
    public IGamePlayer getProxy() throws Exception {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
