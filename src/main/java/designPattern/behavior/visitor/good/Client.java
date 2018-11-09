/**
 * project: designPatten
 * package: designPattern.behavior.visitor
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月6日 上午10:12:41
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月6日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.visitor.good;

import java.util.ArrayList;
import java.util.List;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月6日 上午10:12:41<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        for (Employee emp : mockEmployee()) {
            emp.accept(new Visitor());
        }
    }

    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<Employee>();
        //产生张三这个员工
        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(1800);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);
        //产生张三这个员工
        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("美工");
        liSi.setName("李四");
        liSi.setSalary(1800);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);
        //产生张三这个员工
        CommonEmployee wangwu = new CommonEmployee();
        wangwu.setJob("拍马屁");
        wangwu.setName("王五");
        wangwu.setSalary(18750);
        wangwu.setSex(Employee.MALE);
        empList.add(wangwu);
        return empList;

    }
}