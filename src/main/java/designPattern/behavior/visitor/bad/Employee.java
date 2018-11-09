/**
 * project: designPatten
 * package: designPattern.behavior.visitor
 * file: Employee.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月6日 上午10:06:56
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月6日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.visitor.bad;

/**
  * class: Employee<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月6日 上午10:06:56<BR>
  *
  */
public abstract class Employee {

    public final static int MALE = 0;

    public final static int FEMALE = 1;

    private String name;

    private int salary;

    private int sex;

    /**
     * getter method
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * setter method
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter method
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * setter method
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * getter method
     * @return the sex
     */
    public int getSex() {
        return sex;
    }

    /**
     * setter method
     * @param sex the sex to set
     */
    public void setSex(int sex) {
        this.sex = sex;
    }

    public void report() {
        System.out.println(
                "Employee [name=" + name + ", salary=" + salary + ", sex=" + sex + "]" + "---" + getOtherInfo());
    }

    protected abstract String getOtherInfo();
}
