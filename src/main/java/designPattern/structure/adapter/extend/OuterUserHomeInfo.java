/**
 * project: designPatten
 * package: designPattern.structure.adapter.extend
 * file: OuterUserHomeInfo.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 上午10:44:47
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.adapter.extend;

import java.util.HashMap;
import java.util.Map;

/**
  * class: OuterUserHomeInfo<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 上午10:44:47<BR>
  *
  */
public class OuterUserHomeInfo implements IOuterUserHomeInfo {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 上午10:44:47<BR></p>
      * @return OuterUserHomeInfo
      * @see designPattern.structure.adapter.extend.IOuterUserHomeInfo#getUserHomeInfo()
      */
    public Map getUserHomeInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("homeTelNumber", "家庭电话");
        baseInfoMap.put("mobileAddress", "家庭地址");
        return baseInfoMap;
    }

}
