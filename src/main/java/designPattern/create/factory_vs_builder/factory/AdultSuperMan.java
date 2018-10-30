/**
 * project: designPatten
 * package: designPattern.create.factory_vs_builder.factory
 * file: AdultSuperMan.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月27日 下午3:06:45
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月27日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory_vs_builder.factory;

/**
  * class: AdultSuperMan<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月27日 下午3:06:45<BR>
  *
  */
public class AdultSuperMan implements ISuperMan {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月27日 下午3:06:45<BR></p> AdultSuperMan
      * @see designPattern.create.factory_vs_builder.factory.ISuperMan#specialTalent()
      */
    public void specialTalent() {
        System.out.println("超人力大无穷");
    }

}
