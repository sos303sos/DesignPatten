/**
 * project: designPatten
 * package: designPattern.abstractFactory
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月23日 上午10:56:31
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月23日       95129          3.0             1.0
 * modification
 */
package designPattern.create.abstractFactory;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月23日 上午10:56:31<BR>
  *
  */
public class Client {

    /**
     *<p>
      * method:  main<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年10月23日 上午10:56:31<BR>
      * 
      * @param args  
      */
    public static void main(String[] args) {
        HumanFactory maleHumanFactory = new MaleFactory();
        HumanFactory femaleHumanFactory = new FemaleFactory();
        Human maleYellowHuman = maleHumanFactory.createYellowHuman();
        Human femaleYellowHuman = femaleHumanFactory.createYellowHuman();
        System.out.println("--生产一个黄色女性--");
        femaleYellowHuman.getColor();
        femaleYellowHuman.talk();
        femaleYellowHuman.getSex();
        System.out.println("--生产一个黄色男性--");
        maleYellowHuman.getColor();
        maleYellowHuman.talk();
        maleYellowHuman.getSex();
    }

}
