/**
 * project: designPatten
 * package: designPattern.behavior.iterator.good
 * file: ProjectIterator.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月31日 上午10:19:01
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
  * class: ProjectIterator<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月31日 上午10:19:01<BR>
  *
  */
public class ProjectIterator implements IProjectIterator {

    private ArrayList<IProject> projectList = new ArrayList<IProject>();

    private int currentItem = 0;

    /**
      * Create New Instance ProjectIterator<BR>
      * description: <BR>
      * @param projectList
      */
    public ProjectIterator(ArrayList<IProject> projectList) {
        super();
        this.projectList = projectList;
    }

    /**
     * getter method
     * @return the projectList
     */
    public ArrayList<IProject> getProjectList() {
        return projectList;
    }

    /**
     * setter method
     * @param projectList the projectList to set
     */
    public void setProjectList(ArrayList<IProject> projectList) {
        this.projectList = projectList;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月31日 上午10:19:01<BR></p>
      * @return ProjectIterator
      * @see java.util.Iterator#hasNext()
      */
    public boolean hasNext() {
        boolean b = true;
        if (this.currentItem >= projectList.size() || this.projectList.get(this.currentItem) == null) {
            b = false;
        }
        return b;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月31日 上午10:19:01<BR></p>
      * @return ProjectIterator
      * @see java.util.Iterator#next()
      */
    public IProject next() {
        return (IProject) this.projectList.get(this.currentItem++);
    }

    public void remove() {

    }
}
