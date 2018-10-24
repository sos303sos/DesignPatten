/**
 * project: designPatten
 * package: designPattern.Singleton
 * file: Singleton.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月22日 上午11:02:44
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月22日       95129          3.0             1.0
 * modification
 */
package designPattern.create.Singleton;

/**
  * class: Singleton<BR>
  * description: <BR>
  * author: 95129<BR>
  * date: 2018年10月22日 上午11:02:44<BR>
  *
  */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {

    }
    public static Singleton getInstance(){
        return singleton;
    }
}
