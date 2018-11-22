/**
 * project: designPatten
 * package: designPattern.structure.composite.bad
 * file: Leaf.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午7:40:10
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.composite.bad;

/**
  * class: Leaf<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午7:40:10<BR>
  *
  */
public class Leaf implements ILeaf {

    private String name = "";

    private String position = "";

    private int salary = 0;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月22日 下午7:40:10<BR></p>
      * @return Leaf
      * @see designPattern.structure.composite.bad.ILeaf#getInfo()
      */
    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }

}
