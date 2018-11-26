/**
 * project: designPatten
 * package: designPattern.structure.proxy.dynamic
 * file: GamePlayIH.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月26日 下午1:31:09
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月26日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.proxy.dynamic.good;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
  * class: GamePlayIH<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月26日 下午1:31:09<BR>
  *
  */
public class GamePlayIH implements InvocationHandler {

    Class cls = null;

    Object obj = null;

    /**
      * Create New Instance GamePlayIH<BR>
      * description: <BR>
      * @param obj
      */
    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月26日 下午1:31:37<BR></p>
      * @param proxy
      * @param method
      * @param args
      * @return
      * @throws Throwable InvocationHandler
      * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
      */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登陆");
        }
        Object result = method.invoke(this.obj, args);
        return result;
    }

}
