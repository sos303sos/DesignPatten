/**
 * project: designPatten
 * package: designPattern.structure.adapter.extend
 * file: OuterUserOffice.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 上午10:47:25
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
  * class: OuterUserOffice<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 上午10:47:25<BR>
  *
  */
public class OuterUserOffice implements IOuterUserOfficeInfo {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 上午10:47:25<BR></p>
      * @return OuterUserOffice
      * @see designPattern.structure.adapter.extend.IOuterUserOfficeInfo#getUserOfficeInfo()
      */
    public Map getUserOfficeInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("jobPosition", "职位是bos");
        baseInfoMap.put("officeTelNumber", "办公电话");
        return baseInfoMap;
    }

}
