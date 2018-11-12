/**
 * project: designPatten
 * package: designPattern.behavior.status
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月9日 上午10:20:56
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月9日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.status.good;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月9日 上午10:20:56<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        ILift lift = new Lift();
        lift.setState(ILift.STOPPING_STATE);
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
