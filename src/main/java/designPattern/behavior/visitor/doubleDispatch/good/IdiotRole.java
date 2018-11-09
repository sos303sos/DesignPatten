/**
 * project: designPatten
 * package: designPattern.behavior.visitor.doubleDispatch
 * file: IdiotRole.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月6日 下午1:55:52
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月6日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.visitor.doubleDispatch.good;

/**
  * class: IdiotRole<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月6日 下午1:55:52<BR>
  *
  */
public class IdiotRole implements Role {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月7日 上午11:37:43<BR></p>
      * @param actor Role
      * @see designPattern.behavior.visitor.doubleDispatch.good.Role#accept(designPattern.behavior.visitor.doubleDispatch.good.AbsActor)
      */
    public void accept(AbsActor actor) {
        actor.act(this);
    }

}
