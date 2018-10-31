/**
 * project: designPatten
 * package: designPattern.behavior.iterator
 * file: Project.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月31日 上午9:28:43
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月31日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.iterator.good;

import java.util.ArrayList;

/**
  * class: Project<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月31日 上午9:28:43<BR>
  *
  */
public class Project implements IProject {

    private ArrayList<IProject> projectList = new ArrayList<IProject>();

    private String name = "";

    private int num = 0;

    private int cost = 0;

    /**
      * Create New Instance Project<BR>
      * description: <BR>
      */
    public Project() {
    }

    /**
      * Create New Instance Project<BR>
      * description: <BR>
      * @param name
      * @param num
      * @param cost
      */
    public Project(String name, int num, int cost) {
        super();
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月31日 上午9:29:02<BR></p>
      * @return IProject
      * @see designPattern.behavior.iterator.bad.IProject#getProjectInfo()
      */
    public String getProjectInfo() {
        return "项目名称是:" + this.name + "\t项目人数:" + this.num + "\t项目费用:" + this.cost;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月31日 上午10:14:29<BR></p>
      * @param name
      * @param num
      * @param cost IProject
      * @see designPattern.behavior.iterator.good.IProject#add(java.lang.String, int, int)
      */
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月31日 上午10:14:29<BR></p>
      * @return IProject
      * @see designPattern.behavior.iterator.good.IProject#iterator()
      */
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }

}
