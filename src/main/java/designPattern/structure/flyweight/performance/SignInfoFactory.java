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
package designPattern.structure.flyweight.performance;

import java.util.HashMap;

import designPattern.structure.flyweight.multiThread.SignInfo;
import designPattern.structure.flyweight.multiThread.SignInfo4Pool;

/**
  * class: SignInfoFactory<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 上午9:31:08<BR>
  *
  */
public class SignInfoFactory {

    private static HashMap<Object, SignInfo> pool = new HashMap<Object, SignInfo>();

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = pool.get(key);
        }
        return result;
    }

    public static SignInfo getSignInfo(ExtrinsicState key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            result = new SignInfo();
            pool.put(key, result);
        } else {
            result = pool.get(key);
        }
        return result;
    }
}
