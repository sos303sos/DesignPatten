/**
 * project: designPatten
 * package: designPattern.behavior.visitor
 * file: CommonEmployee.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月6日 上午10:09:42
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月6日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.visitor.statistics;

/**
  * class: CommonEmployee<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月6日 上午10:09:42<BR>
  *
  */
public class CommonEmployee extends Employee {

    private String job;

    /**
     * getter method
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * setter method
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月6日 上午10:34:01<BR></p>
      * @param visitor Employee
      * @see designPattern.behavior.visitor.good.Employee#accept(designPattern.behavior.visitor.good.IVisitor)
      */
    @Override
    protected void accept(IVisitor visitor) {
        visitor.visit(this);
    }

}
