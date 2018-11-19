/**
 * project: designPatten
 * package: designPattern.structure.decorator
 * file: FouthGradeSchoolReport.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 上午11:50:22
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.decorator.better;

/**
  * class: FouthGradeSchoolReport<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 上午11:50:22<BR>
  *
  */
public class FouthGradeSchoolReport extends SchoolReport {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 上午11:50:22<BR></p> FouthGradeSchoolReport
      * @see designPattern.structure.decorator.bad.SchoolReport#report()
      */
    @Override
    public void report() {
        System.out.println("尊敬的家长");
        System.out.println("...");
        System.out.println("语文62数学65体育98自然63");
        System.out.println("...");
        System.out.println("家长签名");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 上午11:50:22<BR></p> FouthGradeSchoolReport
      * @see designPattern.structure.decorator.bad.SchoolReport#sign()
      */
    @Override
    public void sign(String name) {
        System.out.println("家长签名为" + name);
    }

}
