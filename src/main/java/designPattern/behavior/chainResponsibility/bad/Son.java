/**
 * project: designPatten
 * package: designPattern.chainResponsibility.bad
 * file: Father.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月18日 下午1:28:50
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月18日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.chainResponsibility.bad;


/**
  * class: Father<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月18日 下午1:28:50<BR>
  *
  */
public class Son implements IHandler{

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月18日 下午1:29:09<BR></p>
      * @param women IHandler
      * @see designPattern.behavior.chainResponsibility.bad.IHandler#HandleMessage(designPattern.behavior.chainResponsibility.bad.IWomen)
      */
    public void HandleMessage(IWomen women) {
        System.out.println("母亲的请求是:" + women.getRequest());
        System.out.println("儿子的答复是同意");
    }

}
