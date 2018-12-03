/**
 * project: designPatten
 * package: designPattern.factory.bad
 * file: BlackHuman.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月22日 上午11:37:44
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月22日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory;


/**
  * class: BlackHuman<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月22日 上午11:37:44<BR>
  *
  */
public class BlackHuman implements Human {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月22日 上午11:37:44<BR></p> BlackHuman
      * @see designPattern.create.factory.Human#getColor()
      */
    public void getColor() {
        System.out.println("黑人皮肤黑    ");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月22日 上午11:37:44<BR></p> BlackHuman
      * @see designPattern.create.factory.Human#talk()
      */
    public void talk() {
        System.out.println("黑人会说话 一般人不懂");
    }

}
