/**
 * project: designPatten
 * package: multiThread.chapter1
 * file: Demo6MyThread.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年12月27日 上午10:06:35
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年12月27日       95129          3.0             1.0
 * modification
 */
package multiThread.chapter1;

/**
  * class: Demo6MyThread<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年12月27日 上午10:06:35<BR>
  *
  */
public class Demo6CountOperate extends Thread {

    /**
      * Create New Instance Demo6CountOperate<BR>
      * description: <BR>
      */
    public Demo6CountOperate() {
        System.out.println("begin");
        System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
        System.out.println("this.getName():" + this.getName());
        System.out.println("end");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年12月27日 上午10:09:05<BR></p> Demo6CountOperate
      * @see java.lang.Thread#run()
      */
    @Override
    public void run() {
        System.out.println("run---begin");
        System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
        System.out.println("this.getName():" + this.getName());
        System.out.println("run---end");
    }

    public static void main(String[] args) {
        Demo6CountOperate operate = new Demo6CountOperate();
        Thread t1 = new Thread(operate);
        t1.setName("A");
        t1.start();
    }
}
