/**
 * project: designPatten
 * package: designPattern.structure.proxy
 * file: IGamePlayer.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月23日 下午7:44:44
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月23日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.proxy.bad;

/**
  * class: IGamePlayer<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 下午7:44:44<BR>
  *
  */
public interface IGamePlayer {

    public void login(String user, String password);

    public void killBoss();

    public void upgrade();
}
