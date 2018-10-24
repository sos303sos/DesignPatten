/**
 * project: designPatten
 * package: designPattern.template.bad
 * file: HummerH1Model.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月24日 上午11:10:35
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月24日       95129          3.0             1.0
 * modification
 */
package designPattern.template.bad;

/**
  * class: HummerH1Model<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月24日 上午11:10:35<BR>
  *
  */
public class HummerH2Model extends HummerModel {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月24日 上午11:10:35<BR></p> HummerH1Model
      * @see designPattern.template.bad.HummerModel#start()
      */
    @Override
    public void start() {
        System.out.println("悍马H2发动");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月24日 上午11:10:35<BR></p> HummerH1Model
      * @see designPattern.template.bad.HummerModel#stop()
      */
    @Override
    public void stop() {
        System.out.println("悍马H2停车");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月24日 上午11:10:35<BR></p> HummerH1Model
      * @see designPattern.template.bad.HummerModel#alarm()
      */
    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月24日 上午11:10:35<BR></p> HummerH1Model
      * @see designPattern.template.bad.HummerModel#engineBoom()
      */
    @Override
    public void engineBoom() {
        System.out.println("悍马H2引擎是这样的声音");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月24日 上午11:10:35<BR></p> HummerH1Model
      * @see designPattern.template.bad.HummerModel#run()
      */
    @Override
    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }

}
