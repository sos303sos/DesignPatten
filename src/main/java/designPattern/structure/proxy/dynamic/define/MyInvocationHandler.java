/**
 * project: designPatten
 * package: designPattern.structure.proxy.dynamic.define
 * file: MyInvocationHandler.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月26日 下午2:05:25
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月26日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.proxy.dynamic.define;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
  * class: MyInvocationHandler<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月26日 下午2:05:25<BR>
  *
  */
public class MyInvocationHandler implements InvocationHandler {

    private Object target = null;

    /**
      * Create New Instance MyInvocationHandler<BR>
      * description: <BR>
      * @param target
      */
    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月26日 下午2:05:25<BR></p>
      * @param proxy
      * @param method
      * @param args
      * @return
      * @throws Throwable MyInvocationHandler
      * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
      */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        return null;
    }

}
