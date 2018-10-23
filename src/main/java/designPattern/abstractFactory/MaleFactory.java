/**
 * project: designPatten
 * package: designPattern.abstractFactory
 * file: MaleFactory.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月23日 上午10:52:06
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月23日       95129          3.0             1.0
 * modification
 */
package designPattern.abstractFactory;

/**
  * class: MaleFactory<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月23日 上午10:52:06<BR>
  *
  */
public class MaleFactory implements HumanFactory {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月23日 上午10:52:37<BR></p>
      * @return HumanFactory
      * @see designPattern.abstractFactory.HumanFactory#createYellowHuman()
      */
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月23日 上午10:52:37<BR></p>
      * @return HumanFactory
      * @see designPattern.abstractFactory.HumanFactory#createWhiteHuman()
      */
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月23日 上午10:52:37<BR></p>
      * @return HumanFactory
      * @see designPattern.abstractFactory.HumanFactory#createBlackHuman()
      */
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

}
