/**
 * project: designPatten
 * package: designPattern.structure.composite.better
 * file: Corp.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午8:12:57
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.composite.better;

/**
  * class: Corp<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午8:12:57<BR>
  *
  */
public abstract class Corp {

    private String name = "";

    private String position = "";

    private int salary = 0;

    /**
      * Create New Instance Corp<BR>
      * description: <BR>
      * @param name
      * @param position
      * @param salary
      */
    public Corp(String name, String position, int salary) {
        super();
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        String info = "";
        info = "名称：" + this.name;
        info = info + "\t职位：" + this.position;
        info = info + "\t薪水：" + this.salary;
        return info;
    }
}
