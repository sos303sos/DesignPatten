/**
 * project: designPatten
 * package: designPattern.structure.composite.bad
 * file: IBranch.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午7:28:59
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.composite.good;

import java.util.ArrayList;

/**
  * class: IBranch<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午7:28:59<BR>
  *
  */
public interface IBranch extends ICorp {

    public void addSubordinate(ICorp corp);

    public ArrayList<ICorp> getSubordinate();

}
