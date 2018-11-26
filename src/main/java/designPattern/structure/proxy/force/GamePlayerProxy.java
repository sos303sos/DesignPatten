/**
 * project: designPatten
 * package: designPattern.structure.proxy.good
 * file: GamePlayerProxy.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月26日 上午9:35:07
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月26日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.proxy.force;

/**
  * class: GamePlayerProxy<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月26日 上午9:35:07<BR>
  *
  */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    /**
      * Create New Instance GamePlayerProxy<BR>
      * description: <BR>
      * @param gamePlayer
     * @throws Exception 
      */
    public GamePlayerProxy(IGamePlayer gamePlayer) throws Exception {
        this.gamePlayer = gamePlayer;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月26日 上午9:35:07<BR></p>
      * @param user
      * @param password GamePlayerProxy
      * @see designPattern.structure.proxy.good.IGamePlayer#login(java.lang.String, java.lang.String)
      */
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月26日 上午9:35:07<BR></p> GamePlayerProxy
      * @see designPattern.structure.proxy.good.IGamePlayer#killBoss()
      */
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月26日 上午9:35:07<BR></p> GamePlayerProxy
      * @see designPattern.structure.proxy.good.IGamePlayer#upgrade()
      */
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月26日 上午10:28:05<BR></p>
      * @return IGamePlayer
      * @see designPattern.structure.proxy.force.IGamePlayer#getProxy()
      */
    public IGamePlayer getProxy() {
        return this;
    }

}
