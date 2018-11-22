/**
 * project: designPatten
 * package: designPattern.structure.composite.bad
 * file: Branch.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午7:37:47
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.composite.bad;

import java.util.ArrayList;

/**
  * class: Branch<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午7:37:47<BR>
  *
  */
public class Branch implements IBranch {

    private ArrayList subordinateList = new ArrayList();

    private String name = "";

    private String position = "";

    private int salary = 0;

    /**
      * Create New Instance Branch<BR>
      * description: <BR>
      * @param name
      * @param position
      * @param salary
      */
    public Branch(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午7:37:47<BR></p>
      * @return Branch
      * @see designPattern.structure.composite.bad.IBranch#getInfo()
      */
    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午7:37:47<BR></p>
      * @param branch Branch
      * @see designPattern.structure.composite.bad.IBranch#add(designPattern.structure.composite.bad.IBranch)
      */
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午7:37:47<BR></p>
      * @param leaf Branch
      * @see designPattern.structure.composite.bad.IBranch#add(designPattern.structure.composite.bad.ILeaf)
      */
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);

    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午7:37:47<BR></p>
      * @return Branch
      * @see designPattern.structure.composite.bad.IBranch#getSubordinateInfo()
      */
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }

}
