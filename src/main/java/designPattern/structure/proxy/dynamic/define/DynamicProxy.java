/**
 * project: designPatten
 * package: designPattern.structure.proxy.dynamic.define
 * file: DynamicProxy.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月26日 下午2:07:34
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月26日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.proxy.dynamic.define;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
  * class: DynamicProxy<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月26日 下午2:07:34<BR>
  *
  */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h) {
        if (true) {
            (new BeforeAdvice()).exec();
        }
        return (T) Proxy.newProxyInstance(loader, interfaces, h);
    }
}
