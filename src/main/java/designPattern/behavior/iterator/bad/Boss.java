/**
 * project: designPatten
 * package: designPattern.behavior.iterator
 * file: Boss.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月31日 上午9:33:45
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月31日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.iterator.bad;

import java.util.ArrayList;

/**
  * class: Boss<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月31日 上午9:33:45<BR>
  *
  */
public class Boss {

    public static void main(String[] args) {
        ArrayList<IProject> projectList = new ArrayList<IProject>();
        projectList.add(new Project("星球大战项目", 10, 10000));
        projectList.add(new Project("扭转时空项目", 100, 1000000));
        projectList.add(new Project("超人改造项目", 10000, 100000000));
        for (int i = 4; i < 104; i++) {
            projectList.add(new Project("第" + i + "个项目", i * 5, i * 10000));
        }
        for (IProject project : projectList) {
            System.out.println(project.getProjectInfo());
        }
    }
}
