/**
 * project: designPatten
 * package: designPattern.factory.bad
 * file: AbstractHumanFactory.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月22日 上午11:43:12
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月22日       95129          3.0             1.0
 * modification
 */
package designPattern.abstractFactory;

/**
  * class: AbstractHumanFactory<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月22日 上午11:43:12<BR>
  *
  */
public interface HumanFactory {

    public Human createYellowHuman();

    public Human createWhiteHuman();

    public Human createBlackHuman();
}
