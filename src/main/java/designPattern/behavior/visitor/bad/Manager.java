/**
 * project: designPatten
 * package: designPattern.behavior.visitor
 * file: Manager.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月6日 上午10:11:27
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月6日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.visitor.bad;

/**
  * class: Manager<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月6日 上午10:11:27<BR>
  *
  */
public class Manager extends Employee {

    private String performance;

    /**
     * getter method
     * @return the performance
     */
    public String getPerformance() {
        return performance;
    }

    /**
     * setter method
     * @param performance the performance to set
     */
    public void setPerformance(String performance) {
        this.performance = performance;
    }

    protected String getOtherInfo() {
        return "业绩" + this.performance + "\t";
    }

}
