/**
 * project: designPatten
 * package: designPattern.structure.flyweight
 * file: SignInfoFactory.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月23日 上午9:31:08
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月23日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.flyweight.multiThread;

import java.util.HashMap;

/**
  * class: SignInfoFactory<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 上午9:31:08<BR>
  *
  */
public class SignInfoFactory {

    private static HashMap<String, SignInfo> pool = new HashMap<String, SignInfo>();

    @Deprecated
    public static SignInfo getSignInfo() {
        return new SignInfo();
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key + "---建立对象,并放置到池中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
            System.out.println(key + "---直接从池中获取");
        }
        return result;
    }
}
