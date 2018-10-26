/**
 * project: designPatten
 * package: designPattern.create.builder.good
 * file: BenzBuilder.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月25日 上午11:26:20
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月25日       95129          3.0             1.0
 * modification
 */
package designPattern.create.builder.good;

import java.util.ArrayList;

/**
  * class: BenzBuilder<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月25日 上午11:26:20<BR>
  *
  */
public class BenzBuilder extends CarBuilder {

    private CarModel benz = new BenzModel();

    public CarModel getCarModel() {
        return this.benz;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月25日 上午11:26:20<BR></p>
      * @param sequence BenzBuilder
      * @see designPattern.create.builder.good.CarBuilder#setSequence(java.util.ArrayList)
      */
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

}
