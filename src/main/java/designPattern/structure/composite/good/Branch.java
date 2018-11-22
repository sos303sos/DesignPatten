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
package designPattern.structure.composite.good;

import java.util.ArrayList;

/**
  * class: Branch<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午7:37:47<BR>
  *
  */
public class Branch implements IBranch {

    private ArrayList<ICorp> subordinateList = new ArrayList<ICorp>();

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
      * overriding_date: 2018年11月22日 下午8:06:59<BR></p>
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
