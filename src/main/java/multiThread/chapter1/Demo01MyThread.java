/**
 * project: designPatten
 * package: multiThread.chapter1
 * file: MyThread.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年12月27日 上午9:30:31
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年12月27日       95129          3.0             1.0
 * modification
 */
package multiThread.chapter1;

/**
  * class: MyThread<BR>
  * description: 继承线程<BR>
  * author: 95129<BR>
  * date: 2018年12月27日 上午9:30:31<BR>
  *
  */
public class Demo01MyThread extends Thread {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年12月27日 上午9:30:42<BR></p> MyThread
      * @see java.lang.Thread#run()
      */
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }

    public static void main(String[] args) {
        new Demo01MyThread().start();
        new Demo01MyThread().start();
        System.out.println("运行结束");
    }

}
