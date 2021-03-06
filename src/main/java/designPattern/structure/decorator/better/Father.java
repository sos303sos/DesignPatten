/**
 * project: designPatten
 * package: designPattern.structure.decorator
 * file: Father.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 下午1:32:20
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.decorator.better;

/**
  * class: Father<BR>
  * description: <BR>
  * author: 95129<BR>
  * date: 2018年11月19日 下午1:32:20<BR>
  *
  */
public class Father {

    public static void main(String[] args) {
        SchoolReport sr;
        sr = new FouthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("老三");
    }
}
