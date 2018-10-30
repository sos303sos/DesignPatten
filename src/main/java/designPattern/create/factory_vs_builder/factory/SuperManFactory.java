/**
 * project: designPatten
 * package: designPattern.create.factory_vs_builder.factory
 * file: SuperManFactory.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月27日 下午3:08:30
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月27日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory_vs_builder.factory;

/**
  * class: SuperManFactory<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月27日 下午3:08:30<BR>
  *
  */
public class SuperManFactory {

    public static ISuperMan createSuperMan(String type) {
        if (type.equalsIgnoreCase("adult")) {
            return new AdultSuperMan();
        } else if (type.equalsIgnoreCase("child")) {
            return new ChildSuperMan();
        } else {
            return null;
        }
    }
}
