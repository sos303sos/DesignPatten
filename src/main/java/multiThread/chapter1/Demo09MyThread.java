/**
 * project: designPatten
 * package: multiThread.chapter1
 * file: Demo9MyThread.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年12月28日 上午11:01:53
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年12月28日       95129          3.0             1.0
 * modification
 */
package multiThread.chapter1;

/**
  * class: Demo9MyThread<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年12月28日 上午11:01:53<BR>
  *
  */
public class Demo09MyThread extends Thread {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年12月28日 上午11:11:25<BR></p> Demo9MyThread
      * @see java.lang.Thread#run()
      */
    @Override
    public void run() {
        try {
            System.out.println("run threadName=" + this.currentThread().getName() + " begin ");
            Thread.sleep(5000);
            System.out.println("run threadName=" + this.currentThread().getName() + " end ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Demo09MyThread thread = new Demo09MyThread();
        System.out.println("begin=" + System.currentTimeMillis());
        thread.run();
        System.out.println("end=" + System.currentTimeMillis());

    }
}
