/**
 * project: designPatten
 * package: multiThread.chapter1
 * file: Demo5MyThread.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年12月27日 上午10:01:29
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年12月27日       95129          3.0             1.0
 * modification
 */
package multiThread.chapter1;

/**
  * class: Demo5MyThread<BR>
  * description: currentThread<BR>
  * author: 95129<BR>
  * date: 2018年12月27日 上午10:01:29<BR>
  *
  */
public class Demo5MyThread extends Thread {

    /**
      * Create New Instance Demo5MyThread<BR>
      * description: <BR>
      */
    public Demo5MyThread() {
        System.out.println("构造方法打印" + Thread.currentThread().getName());
        System.out.println("this.getName():" + this.getName());
    }

    /**
     *<p>
      * method:  run<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年12月27日 上午10:02:57<BR>
      *   
      */
    public void run() {
        System.out.println("run方法打印" + Thread.currentThread().getName());
        System.out.println("this.getName():" + this.getName());

    }

    /**
     *<p>
      * method:  main<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年12月27日 上午10:01:29<BR>
      * 
      * @param args  
      */
    public static void main(String[] args) {
        Demo5MyThread thread = new Demo5MyThread();//主线程调用
        thread.start();//Thread-0线程调用
        //thread.run();
    }

}
