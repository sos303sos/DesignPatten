/**
 * project: designPatten
 * package: designPattern.structure.composite.better
 * file: Branch.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午8:19:25
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.composite.better;

import java.util.ArrayList;

import designPattern.structure.composite.good.ICorp;

/**
  * class: Branch<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午8:19:25<BR>
  *
  */
public class Branch extends Corp {

    private ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();

    /**
      * Create New Instance Branch<BR>
      * description: <BR>
      * @param name
      * @param position
      * @param salary
      */
    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date:   2018年11月22日 下午8:06:59<BR></p>
     * @param corp IBranch
     * @see designPattern.structure.composite.good.IBranch#addSubordinate(designPattern.structure.composite.good.ICorp)
     */
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年11月22日 下午8:06:59<BR></p>
     * @return IBranch
     * @see designPattern.structure.composite.good.IBranch#getSubordinate()
     */
    public ArrayList<ICorp> getSubordinate() {
        return this.subordinateList;
    }
}
