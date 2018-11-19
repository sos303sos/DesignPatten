/**
 * project: designPatten
 * package: designPattern.structure.decorator.good
 * file: SugarFouthGradeSchoolReport.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 下午1:38:33
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.decorator.good;

/**
  * class: SugarFouthGradeSchoolReport<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 下午1:38:33<BR>
  *
  */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {

    private void reportHighScore() {
        System.out.println("这次考试语文最高75,数学78,自然80");
    }

    private void reportHighSort() {
        System.out.println("我是排名第38名");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 下午1:40:12<BR></p> SugarFouthGradeSchoolReport
      * @see designPattern.structure.decorator.good.FouthGradeSchoolReport#report()
      */
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportHighSort();
    }
}
