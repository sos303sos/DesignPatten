/**
 * project: designPatten
 * package: multiThread.chapter1
 * file: Demo8CountOperate.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年12月28日 上午9:44:16
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年12月28日       95129          3.0             1.0
 * modification
 */
package multiThread.chapter1;

/**
  * class: Demo8CountOperate<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年12月28日 上午9:44:16<BR>
  *
  */
public class Demo08CountOperate extends Thread {

    public Demo08CountOperate() {
        System.out.println("begin cons");
        System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()" + Thread.currentThread().isAlive());
        System.out.println("this.getName():" + this.getName());
        System.out.println("this.isAlive():" + this.isAlive());
        System.out.println("end cons");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年12月28日 上午9:46:42<BR></p> Demo8CountOperate
      * @see java.lang.Thread#run()
      */
    @Override
    public void run() {
        System.out.println("begin run");
        System.out.println("Thread.currentThread().getName():" + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().isAlive()" + Thread.currentThread().isAlive());
        System.out.println("this.getName():" + this.getName());
        System.out.println("this.isAlive():" + this.isAlive());
        System.out.println("end run");
    }

    public static void main(String[] args) {
        Demo08CountOperate operate = new Demo08CountOperate();
        Thread thread = new Thread(operate);
        System.out.println("main begin is Alive"+thread.isAlive());
        thread.setName("A");
        thread.start();
        System.out.println("main end is Alive"+thread.isAlive());
    }
}
