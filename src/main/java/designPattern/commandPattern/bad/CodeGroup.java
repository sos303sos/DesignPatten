/**
 * project: designPatten
 * package: designPattern.commandPattern
 * file: CodeGroup.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月15日 上午11:51:18
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月15日       95129          3.0             1.0
 * modification
 */
package designPattern.commandPattern.bad;


/**
  * class: CodeGroup<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月15日 上午11:51:18<BR>
  *
  */
public class CodeGroup extends Group {

    /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年10月15日 上午11:45:38<BR></p> RequirementGroup
     * @see designPattern.commandPattern.bad.Group#find()
     */
   @Override
   public void find() {
       System.out.println("找到程序员");
   }

   /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年10月15日 上午11:45:38<BR></p> RequirementGroup
     * @see designPattern.commandPattern.bad.Group#add()
     */
   @Override
   public void add() {
       System.out.println("增加一个功能");
   }

   /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年10月15日 上午11:45:38<BR></p> RequirementGroup
     * @see designPattern.commandPattern.bad.Group#delete()
     */
   @Override
   public void delete() {
       System.out.println("删除功能");
   }

   /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年10月15日 上午11:45:38<BR></p> RequirementGroup
     * @see designPattern.commandPattern.bad.Group#change()
     */
   @Override
   public void change() {
       System.out.println("修改功能");
   }

   /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年10月15日 上午11:45:38<BR></p> RequirementGroup
     * @see designPattern.commandPattern.bad.Group#plan()
     */
   @Override
   public void plan() {
       System.out.println("变更计划");

   }

}
