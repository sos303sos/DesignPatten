/**
 * project: designPatten
 * package: designPattern.structure.decorator.better
 * file: Decorator.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 下午2:05:49
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.decorator.better;

/**
  * class: Decorator<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 下午2:05:49<BR>
  *
  */
public abstract class Decorator extends SchoolReport {

    private SchoolReport sr;

    /**
      * Create New Instance Decorator<BR>
      * description: <BR>
      */
    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    public void report() {
        this.sr.report();
    }

    public void sign(String name) {
        this.sr.sign(name);
    }
}
