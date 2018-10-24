/**
 * project: designPatten
 * package: designPattern.factory.bad
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月22日 下午1:19:34
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月22日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory.good;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月22日 下午1:19:34<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        AbstractHumanFactory yinyanglu = new HumanFactory();
        System.out.println("--造出的第一批是白人--");
        Human whiteHuman = yinyanglu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("第二批是黑人");
        Human blackHuman = yinyanglu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("第三批是黄人");
        Human yellowHuman = yinyanglu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();

    }
}
