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
package designPattern.chainResponsibility.good;

/**
  * class: Father<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月18日 下午1:28:50<BR>
  *
  */
public class Father extends Handler {

    public Father() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月19日 上午9:27:33<BR></p>
      * @param women Handler
      * @see designPattern.chainResponsibility.good.Handler#response(designPattern.chainResponsibility.good.IWomen)
      */
    @Override
    protected void response(IWomen women) {
        System.out.println("妻子向丈夫请示");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是:同意");

    }

}
