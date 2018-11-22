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
package designPattern.structure.composite.bad;

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
        IRoot ceo = new Root("王大麻子", "总经理", 10000);
        IBranch developDep = new Branch("刘大瘸子", "研发部门经理", 10000);
        IBranch salesDep = new Branch("马", "销售部门经理", 20000);
        IBranch financeDep = new Branch("赵", "财务部经理", 30000);
        IBranch firstDevGroup = new Branch("杨", "研发一组组长", 5000);
        IBranch secondDevGroup = new Branch("吴", "研发二组组长", 6000);
        ILeaf a = new Leaf("a", "开发人员", 2000);
        ILeaf b = new Leaf("b", "开发人员", 2000);
        ILeaf c = new Leaf("c", "开发人员", 2000);
        ILeaf d = new Leaf("d", "开发人员", 2000);
        ILeaf e = new Leaf("e", "开发人员", 2000);
        ILeaf f = new Leaf("f", "开发人员", 2000);
        ILeaf g = new Leaf("g", "开发人员", 2000);
        ILeaf k = new Leaf("k", "ceo秘书", 2000);
        ILeaf zhenglaoliu = new Leaf("郑老六", "研发部副总", 20000);
        ceo.add(developDep);
        ceo.add(salesDep);
        ceo.add(financeDep);
        ceo.add(k);
        developDep.add(firstDevGroup);
        developDep.add(secondDevGroup);
        developDep.add(zhenglaoliu);
        firstDevGroup.add(a);
        firstDevGroup.add(b);
        firstDevGroup.add(c);
        secondDevGroup.add(d);
        secondDevGroup.add(e);
        secondDevGroup.add(f);
        System.out.println(ceo.getInfo());
        getAllSubordinateInfo(ceo.getSubordinateInfo());
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
                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }

}
