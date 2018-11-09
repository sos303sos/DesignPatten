/**
 * project: designPatten
 * package: designPattern.behavior.visitor.doubleDispatch
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月6日 下午2:03:04
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月6日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.visitor.doubleDispatch.good;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月6日 下午2:03:04<BR>
  *
  */
public class Client {

    /**
     *<p>
      * method:  main<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年11月6日 下午2:03:04<BR>
      * 
      * @param args  
      */
    public static void main(String[] args) {
        AbsActor actor = new OldActor();
        Role role = new KungFuRole();
        role.accept(actor);
    }

}
