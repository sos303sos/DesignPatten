/**
 * project: designPatten
 * package: designPattern.behavior.observer
 * file: LiSi.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月31日 下午1:58:02
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月31日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.observer.bad;

/**
  * class: LiSi<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月31日 下午1:58:02<BR>
  *
  */
public class LiSi implements ILiSi {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月31日 下午1:58:02<BR></p>
      * @param context LiSi
      * @see designPattern.behavior.observer.bad.ILiSi#update(java.lang.String)
      */
    public void update(String context) {
        System.out.println("李斯:观察到韩非子活动,开始想老板汇报了");
        this.reportToQiShiHuang(context);
    }

    private void reportToQiShiHuang(String reportContext) {
        System.out.println("李斯:报告,秦老板!韩非子有活动了--->" + reportContext);
    }

}
