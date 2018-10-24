/**
 * project: designPatten
 * package: designPattern.commandPattern.old
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月15日 上午11:55:35
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月15日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.commandPattern.bad;


/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月15日 上午11:55:35<BR>
  *
  */
public class Client {

    /**
     *<p>
      * method:  main<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年10月15日 上午11:55:36<BR>
      * 
      * @param args  
      */
    public static void main(String[] args) {
        System.out.println("客户要求增加一项需求");
        Group rg=new RequirementGroup();
        rg.find();
        rg.add();
        rg.plan();
        
    }

}
