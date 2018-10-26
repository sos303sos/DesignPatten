/**
 * project: designPatten
 * package: designPattern.factory.bad
 * file: WhiteHuman.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月22日 上午11:40:45
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月22日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory;

/**
  * class: WhiteHuman<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月22日 上午11:40:45<BR>
  *
  */
public class WhiteHuman implements Human {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月22日 上午11:41:36<BR></p> Human
      * @see designPattern.create.factory.Human#getColor()
      */
    public void getColor() {
        System.out.println("白人白");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月22日 上午11:41:36<BR></p> Human
      * @see designPattern.create.factory.Human#talk()
      */
    public void talk() {
        System.out.println("白人说话都是单字节的");
    }

}
