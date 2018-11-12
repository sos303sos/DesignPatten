/**
 * project: designPatten
 * package: designPattern.behavior.status
 * file: Lift.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月9日 上午10:19:19
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月9日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.status.bad;

/**
  * class: Lift<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月9日 上午10:19:19<BR>
  *
  */
public class Lift implements ILift {

    public void open() {
        System.out.println("电梯门开启");
    }

    public void close() {
        System.out.println("电梯门关闭");
    }

    public void run() {
        System.out.println("电梯上下运行起来");
    }

    public void stop() {
        System.out.println("电梯停止了");
    }

}
