/**
 * project: designPatten
 * package: designPattern.create.builder.good
 * file: BMWBuilder.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月25日 上午11:48:56
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
  * class: BMWBuilder<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月25日 上午11:48:56<BR>
  *
  */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月25日 上午11:49:36<BR></p>
      * @param sequence CarBuilder
      * @see designPattern.create.builder.good.CarBuilder#setSequence(java.util.ArrayList)
      */
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月25日 上午11:49:36<BR></p>
      * @return CarBuilder
      * @see designPattern.create.builder.good.CarBuilder#getCarModel()
      */
    @Override
    public CarModel getCarModel() {
        return bmw;
    }

}
