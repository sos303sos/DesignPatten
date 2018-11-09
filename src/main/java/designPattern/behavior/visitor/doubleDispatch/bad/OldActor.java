/**
 * project: designPatten
 * package: designPattern.behavior.visitor.doubleDispatch
 * file: YoungActor.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月6日 下午1:57:54
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月6日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.visitor.doubleDispatch.bad;

/**
  * class: YoungActor<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月6日 下午1:57:54<BR>
  *
  */
public class OldActor extends AbsActor {

    public void act(KungFuRole role) {
        System.out.println("年龄大了,不能演功夫角色");
    }
}
