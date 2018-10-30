/**
 * project: designPatten
 * package: designPattern.create.factory_vs_builder.builder
 * file: Builder.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月27日 下午3:13:39
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月27日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory_vs_builder.builder;

/**
  * class: Builder<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月27日 下午3:13:39<BR>
  *
  */
public abstract class Builder {

    protected final SuperMan superMan = new SuperMan();

    public void setBody(String body) {
        this.superMan.setBody(body);
    }

    public void setSpecialTalent(String st) {
        this.superMan.setSpecialTalent(st);
    }

    public void setSpecialSymbol(String ss) {
        this.superMan.setSpecialSymbol(ss);
    }

    public abstract SuperMan getSuperMan();
}
