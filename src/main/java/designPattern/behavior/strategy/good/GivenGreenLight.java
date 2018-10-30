/**
 * project: designPatten
 * package: designPattern.behavior.strategy.good
 * file: BackDoor.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月29日 上午11:46:10
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月29日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.strategy.good;


/**
  * class: BackDoor<BR>
  * description: 
  * author: 95129<BR>
  * date: 2018年10月29日 上午11:46:10<BR>
  *
  */
public class GivenGreenLight implements IStrategy{

    /**
      *<p> 
      * description: 
      * author: 95129<BR>
      * overriding_date: 2018年10月29日 上午11:46:34<BR></p> IStrategy
      * @see designPattern.behavior.strategy.good.IStrategy#operate()
      */
    public void operate() {
        System.out.println("找乔国老帮忙");
    }

}
