/**
 * project: designPatten
 * package: designPattern.structure.flyweight.multiThread
 * file: MultiThread.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月23日 上午10:43:41
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月23日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.flyweight.multiThread;

/**
  * class: MultiThread<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 上午10:43:41<BR>
  *
  */
public class MultiThread extends Thread {

    private SignInfo signInfo;

    /**
      * Create New Instance MultiThread<BR>
      * description: <BR>
      * @param signInfo
      */
    public MultiThread(SignInfo signInfo) {
        super();
        this.signInfo = signInfo;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月23日 上午10:44:17<BR></p> MultiThread
      * @see java.lang.Thread#run()
      */
    @Override
    public void run() {
        if (!signInfo.getId().equals(signInfo.getLocation())) {
            System.out.println("编号：" + signInfo.getId());
            System.out.println("考试地址：" + signInfo.getLocation());
            System.out.println("线程不安全了！");
        }
    }
}
