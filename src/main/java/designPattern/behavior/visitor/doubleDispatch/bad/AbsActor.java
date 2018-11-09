/**
 * project: designPatten
 * package: designPattern.behavior.visitor.doubleDispatch
 * file: AbsActor.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月6日 下午1:56:11
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月6日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.visitor.doubleDispatch.bad;

/**
  * class: AbsActor<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月6日 下午1:56:11<BR>
  *
  */
public abstract class AbsActor {

    public void act(Role role) {
        System.out.println("演员可以扮演任何角色");
    }

    public void act(KungFuRole role) {
        System.out.println("演员都可以烟功夫角色");
    }

}
