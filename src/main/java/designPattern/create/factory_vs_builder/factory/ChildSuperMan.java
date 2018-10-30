/**
 * project: designPatten
 * package: designPattern.create.factory_vs_builder.factory
 * file: ChildSuperMan.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月27日 下午3:07:29
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月27日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory_vs_builder.factory;

/**
  * class: ChildSuperMan<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月27日 下午3:07:29<BR>
  *
  */
public class ChildSuperMan implements ISuperMan {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月27日 下午3:07:44<BR></p> ISuperMan
      * @see designPattern.create.factory_vs_builder.factory.ISuperMan#specialTalent()
      */
    public void specialTalent() {
        System.out.println("小超人的能力是刀枪不入,快速运动");
    }

}
