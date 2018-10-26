/**
 * project: designPatten
 * package: designPattern.factory.bad
 * file: YellowHuman.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月22日 上午11:39:28
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月22日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory;


/**
  * class: YellowHuman<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月22日 上午11:39:28<BR>
  *
  */
public class YellowHuman implements Human {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月22日 上午11:39:28<BR></p> YellowHuman
      * @see designPattern.create.factory.Human#getColor()
      */
    public void getColor() {
        System.out.println("黄种人皮肤黄黄的");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月22日 上午11:39:28<BR></p> YellowHuman
      * @see designPattern.create.factory.Human#talk()
      */
    public void talk() {
        System.out.println("黄种人说话都是双字节的");
    }

}
