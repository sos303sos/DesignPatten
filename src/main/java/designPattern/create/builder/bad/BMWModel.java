/**
 * project: designPatten
 * package: designPattern.create.builder
 * file: BenzModel.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月24日 下午2:33:23
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月24日       95129          3.0             1.0
 * modification
 */
package designPattern.create.builder.bad;

/**
  * class: BenzModel<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月24日 下午2:33:23<BR>
  *
  */
public class BMWModel extends CarModel {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月24日 下午2:33:23<BR></p> BenzModel
      * @see designPattern.create.builder.bad.CarModel#start()
      */
    @Override
    protected void start() {
        System.out.println("宝马拍起来");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月24日 下午2:33:23<BR></p> BenzModel
      * @see designPattern.create.builder.bad.CarModel#stop()
      */
    @Override
    protected void stop() {
        System.out.println("宝马停下来");

    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月24日 下午2:33:23<BR></p> BenzModel
      * @see designPattern.create.builder.bad.CarModel#alarm()
      */
    @Override
    protected void alarm() {
        System.out.println("宝马的喇叭声");

    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月24日 下午2:33:23<BR></p> BenzModel
      * @see designPattern.create.builder.bad.CarModel#engineBoom()
      */
    @Override
    protected void engineBoom() {
        System.out.println("宝马的引擎");

    }

}
