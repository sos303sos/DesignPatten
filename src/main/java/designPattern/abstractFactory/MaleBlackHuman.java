/**
 * project: designPatten
 * package: designPattern.abstractFactory
 * file: MaleYellowHuman.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月23日 上午10:47:09
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月23日       95129          3.0             1.0
 * modification
 */
package designPattern.abstractFactory;

/**
  * class: MaleYellowHuman<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月23日 上午10:47:09<BR>
  *
  */
public class MaleBlackHuman extends AbstractYellowHuman {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月23日 上午10:47:09<BR></p> MaleYellowHuman
      * @see designPattern.abstractFactory.Human#getSex()
      */
    public void getSex() {
        System.out.println("黑人男性");
    }

}
