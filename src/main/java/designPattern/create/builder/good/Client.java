/**
 * project: designPatten
 * package: designPattern.create.builder
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月24日 下午2:37:42
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月24日       95129          3.0             1.0
 * modification
 */
package designPattern.create.builder.good;

import java.util.ArrayList;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月24日 下午2:37:42<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }
        for (int i = 0; i < 100000; i++) {
            director.getBBenzModel().run();
        }
    }
}
