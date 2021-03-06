/**
 * project: designPatten
 * package: designPattern.structure.decorator.better
 * file: HighScoreDecorator.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 下午2:11:45
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.decorator.better;

/**
  * class: HighScoreDecorator<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 下午2:11:45<BR>
  *
  */
public class HighScoreDecorator extends Decorator {

    /**
      * Create New Instance HighScoreDecorator<BR>
      * description: <BR>
      * @param sr
      */
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高75 数据78 自然80");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 下午2:16:37<BR></p> HighScoreDecorator
      * @see designPattern.structure.decorator.better.Decorator#report()
      */
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
