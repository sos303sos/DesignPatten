/**
 * project: designPatten
 * package: designPattern.commandPattern
 * file: RequirementGroup.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月15日 上午11:45:38
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月15日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.commandPattern.good;


/**
  * class: RequirementGroup<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月15日 上午11:45:38<BR>
  *
  */
public class RequirementGroup extends Group {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月15日 上午11:45:38<BR></p> RequirementGroup
      * @see designPattern.behavior.commandPattern.bad.Group#find()
      */
    @Override
    public void find() {
        System.out.println("找到需求");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月15日 上午11:45:38<BR></p> RequirementGroup
      * @see designPattern.behavior.commandPattern.bad.Group#add()
      */
    @Override
    public void add() {
        System.out.println("增加一个需求");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月15日 上午11:45:38<BR></p> RequirementGroup
      * @see designPattern.behavior.commandPattern.bad.Group#delete()
      */
    @Override
    public void delete() {
        System.out.println("删除需求");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月15日 上午11:45:38<BR></p> RequirementGroup
      * @see designPattern.behavior.commandPattern.bad.Group#change()
      */
    @Override
    public void change() {
        System.out.println("修改需求");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月15日 上午11:45:38<BR></p> RequirementGroup
      * @see designPattern.behavior.commandPattern.bad.Group#plan()
      */
    @Override
    public void plan() {
        System.out.println("变更计划");

    }

}
