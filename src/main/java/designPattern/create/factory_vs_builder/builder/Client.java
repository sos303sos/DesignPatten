/**
 * project: designPatten
 * package: designPattern.create.factory_vs_builder.builder
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月27日 下午3:23:23
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月27日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory_vs_builder.builder;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月27日 下午3:23:23<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        SuperMan adultSuperMan = Director.getAdultBuilder();
        adultSuperMan.getSpecialTalent();
    }
}
