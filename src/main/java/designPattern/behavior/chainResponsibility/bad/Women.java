/**
 * project: designPatten
 * package: designPattern.chainResponsibility.bad
 * file: Women.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月18日 下午1:24:59
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月18日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.chainResponsibility.bad;

/**
  * class: Women<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月18日 下午1:24:59<BR>
  *
  */
public class Women implements IWomen {

    private int type = 0;//1 未婚 2已结婚 3丈夫去世

    private String request = "";

    /**
      * Create New Instance Women<BR>
      * description: <BR>
      */
    public Women(int type, String request) {
        this.type = type;
        this.request = request;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月18日 下午1:25:10<BR></p>
      * @return IWomen
      * @see designPattern.behavior.chainResponsibility.bad.IWomen#getType()
      */
    public int getType() {
        return this.type;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月18日 下午1:25:10<BR></p>
      * @return IWomen
      * @see designPattern.behavior.chainResponsibility.bad.IWomen#getRequest()
      */
    public String getRequest() {
        return this.request;
    }

}
