/**
 * project: designPatten
 * package: designPattern.structure.adapter
 * file: OuterUser.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 上午9:40:56
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.adapter.good;

import java.util.HashMap;
import java.util.Map;

/**
  * class: OuterUser<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 上午9:40:56<BR>
  *
  */
public class OuterUser implements IOuterUser {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 上午9:40:56<BR></p>
      * @return OuterUser
      * @see designPattern.structure.adapter.good.IOuterUser#getUserBaseInfo()
      */
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "混世魔王");
        baseInfoMap.put("mobileNumber", "员工电话是");
        return baseInfoMap;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 上午9:40:56<BR></p>
      * @return OuterUser
      * @see designPattern.structure.adapter.good.IOuterUser#getUserOfficeInfo()
      */
    public Map getUserOfficeInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("jobPosition", "职位是bos");
        baseInfoMap.put("officeTelNumber", "办公电话");
        return baseInfoMap;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 上午9:40:56<BR></p>
      * @return OuterUser
      * @see designPattern.structure.adapter.good.IOuterUser#getUserHomeInfo()
      */
    public Map getUserHomeInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("homeTelNumber", "家庭电话");
        baseInfoMap.put("mobileAddress", "家庭地址");
        return baseInfoMap;
    }

}
