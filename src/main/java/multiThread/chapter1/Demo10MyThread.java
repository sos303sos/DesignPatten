/**
 * project: designPatten
 * package: multiThread.chapter1
 * file: Demo10MyThread.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年12月28日 上午11:15:02
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年12月28日       95129          3.0             1.0
 * modification
 */
package multiThread.chapter1;

/**
  * class: Demo10MyThread<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年12月28日 上午11:15:02<BR>
  *
  */
public class Demo10MyThread extends Thread {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年12月28日 上午11:16:50<BR></p> Demo10MyThread
      * @see java.lang.Thread#run()
      */
    @Override
    public void run() {
        try {
            System.out.println(
                    "run threadName=" + this.currentThread().getName() + " begin =" + System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println(
                    "run threadName=" + this.currentThread().getName() + " end =" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Demo10MyThread thread = new Demo10MyThread();
        System.out.println("begin=" + System.currentTimeMillis());
        thread.start();
        System.out.println("end=" + System.currentTimeMillis());
    }
}
