/**
 * project: designPatten
 * package: designPattern.structure.proxy.dynamic.define
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月26日 下午2:16:41
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月26日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.proxy.dynamic.define;

import java.lang.reflect.InvocationHandler;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月26日 下午2:16:41<BR>
  *
  */
public class Client {

    /**
     *<p>
      * method:  main<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年11月26日 下午2:16:41<BR>
      * 
      * @param args  
      */
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);
        proxy.doSomething("Finish");
    }

}
