/**
 * project: designPatten
 * package: designPattern.structure.adapter
 * file: IOuterUser.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 上午9:36:16
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.adapter.good;

import java.util.Map;

/**
  * class: IOuterUser<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 上午9:36:16<BR>
  *
  */
public interface IOuterUser {

    public Map getUserBaseInfo();

    public Map getUserOfficeInfo();

    public Map getUserHomeInfo();
}
