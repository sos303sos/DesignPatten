/**
 * project: designPatten
 * package: designPattern.structure.adapter.extend
 * file: OuterUserBaseInfo.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 上午10:42:31
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
  * class: OuterUserBaseInfo<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 上午10:42:31<BR>
  *
  */
public class OuterUserBaseInfo implements IOuterUserBaseInfo {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 上午10:42:56<BR></p>
      * @return IOuterUserBaseInfo
      * @see designPattern.structure.adapter.extend.IOuterUserBaseInfo#getUserBaseInfo()
      */
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "混世魔王");
        baseInfoMap.put("mobileNumber", "员工电话是");
        return baseInfoMap;
    }

}
