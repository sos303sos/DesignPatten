/**
 * project: designPatten
 * package: designPattern.create.factory_vs_builder.factory
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月27日 下午3:10:58
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月27日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory_vs_builder.factory;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月27日 下午3:10:58<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        ISuperMan adultSuperMan = SuperManFactory.createSuperMan("child");
        adultSuperMan.specialTalent();
    }
}
