/**
 * project: designPatten
 * package: designPattern.behavior.observer.better
 * file: LiSi.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月1日 下午1:41:04
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月1日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.observer.better;

/**
  * class: LiSi<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月1日 下午1:41:04<BR>
  *
  */
public class LiSi implements Observer {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月1日 下午1:41:36<BR></p>
      * @param context Observer
      * @see designPattern.behavior.observer.better.Observer#update(java.lang.String)
      */
    public void update(String context) {
        System.out.println("李斯:观察到李斯活动,开始向老板汇报了");
        this.reportToQiShiHuang(context);
        System.out.println("李斯:汇报完毕");
    }

    private void reportToQiShiHuang(String reportContext) {
        System.out.println("李斯:报告,秦老板!韩非子有活动了--->" + reportContext);
    }
}
