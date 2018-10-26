/**
 * project: designPatten
 * package: designPattern.create.builder.good
 * file: CarBuilder.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月25日 上午11:22:01
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
  * class: CarBuilder<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月25日 上午11:22:01<BR>
  *
  */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
