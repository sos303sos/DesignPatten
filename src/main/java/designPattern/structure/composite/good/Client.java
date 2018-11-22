/**
 * project: designPatten
 * package: designPattern.structure.composite.bad
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午7:45:42
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.composite.good;

import java.util.ArrayList;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午7:45:42<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        IBranch ceo = new Branch("王大麻子", "总经理", 10000);
        Branch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        Branch salesDep = new Branch("马", "销售部门经理", 20000);
        Branch financeDep = new Branch("赵", "财务部经理", 30000);
        Branch firstDevGroup = new Branch("杨", "研发一组组长", 5000);
        Branch secondDevGroup = new Branch("吴", "研发二组组长", 6000);
        Leaf a = new Leaf("a", "开发人员", 2000);
        Leaf b = new Leaf("b", "开发人员", 2000);
        Leaf c = new Leaf("c", "开发人员", 2000);
        Leaf d = new Leaf("d", "开发人员", 2000);
        Leaf e = new Leaf("e", "开发人员", 2000);
        Leaf f = new Leaf("f", "开发人员", 2000);
        Leaf g = new Leaf("g", "开发人员", 2000);
        Leaf k = new Leaf("k", "ceo秘书", 2000);
        Leaf zhenglaoliu = new Leaf("郑老六", "研发部副总", 20000);
        ceo.addSubordinate(developDep);
        ceo.addSubordinate(salesDep);
        ceo.addSubordinate(financeDep);
        ceo.addSubordinate(k);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        developDep.addSubordinate(zhenglaoliu);
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        System.out.println(ceo.getInfo());
        getAllSubordinateInfo(ceo.getSubordinate());
    }

    private static void getAllSubordinateInfo(ArrayList subordinateList) {
        int length = subordinateList.size();
        for (int m = 0; m < length; m++) {
            Object s = subordinateList.get(m);
            if (s instanceof Leaf) {
                ILeaf employee = (ILeaf) s;
                System.out.println(employee.getInfo());
            } else {
                IBranch branch = (IBranch) s;
                System.out.println(branch.getInfo());
                getAllSubordinateInfo(branch.getSubordinate());
            }
        }
    }

}
