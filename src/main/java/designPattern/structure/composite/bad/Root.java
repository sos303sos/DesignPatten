/**
 * project: designPatten
 * package: designPattern.structure.composite.bad
 * file: Root.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午7:28:08
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
  * class: Root<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午7:28:08<BR>
  *
  */
public class Root implements IRoot {

    private ArrayList subordinateList = new ArrayList();

    private String name = "";

    private String position = "";

    private int salary = 0;

    /**
      * Create New Instance Root<BR>
      * description: <BR>
      * @param name
      * @param position
      * @param salary
      */
    public Root(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午7:28:24<BR></p>
      * @return IRoot
      * @see designPattern.structure.composite.bad.IRoot#getInfo()
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
      * overriding_date: 2018年11月22日 下午7:28:24<BR></p>
      * @param branch IRoot
      * @see designPattern.structure.composite.bad.IRoot#add(designPattern.structure.composite.bad.IBranch)
      */
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午7:28:24<BR></p>
      * @param leaf IRoot
      * @see designPattern.structure.composite.bad.IRoot#add(designPattern.structure.composite.bad.ILeaf)
      */
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午7:28:24<BR></p>
      * @return IRoot
      * @see designPattern.structure.composite.bad.IRoot#getSubordinateInfo()
      */
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }

}
