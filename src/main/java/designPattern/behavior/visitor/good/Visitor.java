/**
 * project: designPatten
 * package: designPattern.behavior.visitor.good
 * file: Visitor.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月6日 上午10:27:10
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月6日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.visitor.good;

/**
  * class: Visitor<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月6日 上午10:27:10<BR>
  *
  */
public class Visitor implements IVisitor {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月6日 上午10:27:10<BR></p>
      * @param commonEmployee Visitor
      * @see designPattern.behavior.visitor.good.IVisitor#visit(designPattern.behavior.visitor.good.CommonEmployee)
      */
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月6日 上午10:27:10<BR></p>
      * @param manager Visitor
      * @see designPattern.behavior.visitor.good.IVisitor#visit(designPattern.behavior.visitor.good.Manager)
      */
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    private String getBasicInfo(Employee employee) {
        return "Employee [name=" + employee.getName() + ", salary=" + employee.getSalary() + ", sex="
                + employee.getSex() + "]";
    }

    private String getManagerInfo(Manager manager) {
        return getBasicInfo(manager) + "---" + "业绩" + manager.getPerformance();
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        return getBasicInfo(commonEmployee) + "---" + "工作" + commonEmployee.getJob();
    }
}
