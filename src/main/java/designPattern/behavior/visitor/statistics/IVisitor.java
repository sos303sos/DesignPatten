/**
 * project: designPatten
 * package: designPattern.behavior.visitor.good
 * file: IVisitor.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月6日 上午10:25:46
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月6日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.visitor.statistics;

/**
  * class: IVisitor<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月6日 上午10:25:46<BR>
  *
  */
public interface IVisitor {

    public void visit(CommonEmployee commonEmployee);

    public void visit(Manager manager);

    public int getTotalSalary();
}
