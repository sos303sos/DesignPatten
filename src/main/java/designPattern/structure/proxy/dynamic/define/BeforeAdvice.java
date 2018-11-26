/**
 * project: designPatten
 * package: designPattern.structure.proxy.dynamic.define
 * file: BeforeAdvice.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月26日 下午2:10:19
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月26日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.proxy.dynamic.define;

/**
  * class: BeforeAdvice<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月26日 下午2:10:19<BR>
  *
  */
public class BeforeAdvice implements IAdvice {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月26日 下午2:10:19<BR></p> BeforeAdvice
      * @see designPattern.structure.proxy.dynamic.define.IAdvice#exec()
      */
    public void exec() {
        System.out.println("我是前置通知,我被执行了!");
    }

}
