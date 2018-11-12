/**
 * project: designPatten
 * package: designPattern.behavior.status
 * file: ILift.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月9日 上午10:18:27
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月9日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.status.good;

/**
  * class: ILift<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月9日 上午10:18:27<BR>
  *
  */
public interface ILift {

    public final static int OPENING_STATE = 1;

    public final static int CLOSING_STATE = 2;

    public final static int RUNNING_STATE = 3;

    public final static int STOPPING_STATE = 4;

    public void setState(int state);

    public void open();

    public void close();

    public void run();

    public void stop();
}
