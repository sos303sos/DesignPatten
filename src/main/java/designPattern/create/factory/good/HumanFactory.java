/**
 * project: designPatten
 * package: designPattern.factory.bad
 * file: HumanFactory.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月22日 上午11:45:24
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月22日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory.good;

/**
  * class: HumanFactory<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月22日 上午11:45:24<BR>
  *
  */
public class HumanFactory extends AbstractHumanFactory {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月22日 上午11:45:24<BR></p>
      * @param c
      * @return HumanFactory
      * @see designPattern.create.factory.good.AbstractHumanFactory#createHuman(java.lang.Class)
      */
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误");
        }
        return (T) human;
    }

}
