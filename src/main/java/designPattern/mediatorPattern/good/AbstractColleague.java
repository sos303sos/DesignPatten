/**
 * project: designPatten
 * package: designPattern.mediatorPattern.good
 * file: AbstractColleague.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月14日 下午1:23:29
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月14日       95129          3.0             1.0
 * modification
 */
package designPattern.mediatorPattern.good;

/**
  * class: AbstractColleague<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月14日 下午1:23:29<BR>
  *
  */
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator=_mediator;
    }
}
