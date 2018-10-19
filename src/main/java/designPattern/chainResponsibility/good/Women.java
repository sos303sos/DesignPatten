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
package designPattern.chainResponsibility.good;

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
        switch (this.type) {
            case 1:
                this.request = "女儿的请求是：" + request;
                break;
            case 2:
                this.request = "妻子的请求是：" + request;
                break;
            case 3:
                this.request = "母亲的请求是：" + request;
        }
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月18日 下午1:25:10<BR></p>
      * @return IWomen
      * @see designPattern.chainResponsibility.bad.IWomen#getType()
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
      * @see designPattern.chainResponsibility.bad.IWomen#getRequest()
      */
    public String getRequest() {
        return this.request;
    }

}
