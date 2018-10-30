/**
 * project: designPatten
 * package: designPattern.create.factory_vs_builder.builder
 * file: Director.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月27日 下午3:20:21
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月27日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory_vs_builder.builder;

import designPattern.create.factory_vs_builder.factory.AdultSuperMan;

/**
  * class: Director<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月27日 下午3:20:21<BR>
  *
  */
public class Director {

    private static Builder adultBuilder = new AdultSuperManBuilder();

    private static Builder childBuilder = new ChildSuperManBuilder();

    /**
     * getter method
     * @return the adultBuilder
     */
    public static SuperMan getAdultBuilder() {
        return adultBuilder.getSuperMan();
    }

    /**
     * getter method
     * @return the childBuilder
     */
    public static SuperMan getChildBuilder() {
        return childBuilder.getSuperMan();
    }

}
