/**
 * project: designPatten
 * package: designPattern.behavior.status.better
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月12日 上午9:43:54
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月12日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.status.better;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月12日 上午9:43:54<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
