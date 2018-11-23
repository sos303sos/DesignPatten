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
package designPattern.structure.flyweight.bad;

/**
  * class: SignInfoFactory<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 上午9:31:08<BR>
  *
  */
public class SignInfoFactory {

    public static SignInfo getSignInfo() {
        return new SignInfo();
    }
}
