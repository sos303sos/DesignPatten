/**
 * project: designPatten
 * package: designPattern.create.factory_vs_builder.builder
 * file: ChildSuperManBuilder.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月27日 下午3:19:10
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月27日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory_vs_builder.builder;

/**
  * class: ChildSuperManBuilder<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月27日 下午3:19:10<BR>
  *
  */
public class ChildSuperManBuilder extends Builder {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月27日 下午3:19:10<BR></p>
      * @return ChildSuperManBuilder
      * @see designPattern.create.factory_vs_builder.builder.Builder#getSuperMan()
      */
    @Override
    public SuperMan getSuperMan() {
        super.setBody("强壮的躯体");
        super.setSpecialTalent("刀枪不入");
        super.setSpecialSymbol("胸前带小S标记");
        return super.superMan;
    }

}
