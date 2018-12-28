/**
 * project: designPatten
 * package: multiThread.chapter1
 * file: Demo7MyThread.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年12月27日 上午10:33:20
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年12月27日       95129          3.0             1.0
 * modification
 */
package multiThread.chapter1;

/**
  * class: Demo7MyThread<BR>
  * description: isAlive()方法<BR>
  * author: 95129<BR>
  * date: 2018年12月27日 上午10:33:20<BR>
  *
  */
public class Demo07MyThread extends Thread {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年12月27日 上午10:33:39<BR></p> Demo7MyThread
      * @see java.lang.Thread#run()
      */
    @Override
    public void run() {
        System.out.println("run=" + this.isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        Demo07MyThread thread = new Demo07MyThread();
        System.out.println("begin ==" + thread.isAlive());
        thread.start();
        Thread.sleep(1000);
        System.out.println("end ==" + thread.isAlive());
    }
}
