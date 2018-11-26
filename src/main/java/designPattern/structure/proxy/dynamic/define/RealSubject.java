/**
 * project: designPatten
 * package: designPattern.structure.proxy.dynamic.define
 * file: RealSubject.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月26日 下午2:01:21
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月26日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.proxy.dynamic.define;

/**
  * class: RealSubject<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月26日 下午2:01:21<BR>
  *
  */
public class RealSubject implements Subject {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月26日 下午2:01:21<BR></p>
      * @param str RealSubject
      * @see designPattern.structure.proxy.dynamic.define.Subject#doSomething(java.lang.String)
      */
    public void doSomething(String str) {
        System.out.println("do something! ---->" + str);
    }

}
