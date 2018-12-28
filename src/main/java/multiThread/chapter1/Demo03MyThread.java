/**
 * project: designPatten
 * package: multiThread.chapter1
 * file: Demo3MyThread.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年12月27日 上午9:41:10
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年12月27日       95129          3.0             1.0
 * modification
 */
package multiThread.chapter1;

/**
  * class: Demo3MyThread<BR>
  * description: 不共享数据的线程<BR>
  * author: 95129<BR>
  * date: 2018年12月27日 上午9:41:10<BR>
  *
  */
public class Demo03MyThread extends Thread {

    private int count = 5;

    /**
     *<p>
      * method:  MyThread<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年12月27日 上午9:42:04<BR>
      *   
      */
    private Demo03MyThread(String name) {
        super();
        this.setName(name);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年12月27日 上午9:43:58<BR></p> Demo3MyThread
      * @see java.lang.Thread#run()
      */
    @Override
    public void run() {
        super.run();
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算,count=" + count);
        }
    }

    public static void main(String[] args) {
        Demo03MyThread a = new Demo03MyThread("A");
        a.start();
        Demo03MyThread b = new Demo03MyThread("B");
        b.start();
        Demo03MyThread c = new Demo03MyThread("C");
        c.start();
    }

}
