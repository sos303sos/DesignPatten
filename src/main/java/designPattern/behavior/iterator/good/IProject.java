/**
 * project: designPatten
 * package: designPattern.behavior.iterator
 * file: IProject.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月31日 上午9:25:31
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月31日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.iterator.good;

/**
  * class: IProject<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月31日 上午9:25:31<BR>
  *
  */
public interface IProject {

    public void add(String name, int num, int cost);

    public String getProjectInfo();

    public IProjectIterator iterator();
}
