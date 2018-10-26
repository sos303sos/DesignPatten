/**
 * project: designPatten
 * package: designPattern.create.builder
 * file: CarModel.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月24日 下午2:26:41
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月24日       95129          3.0             1.0
 * modification
 */
package designPattern.create.builder.bad;

import java.util.ArrayList;

/**
  * class: CarModel<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月24日 下午2:26:41<BR>
  *
  */
public abstract class CarModel {

    public ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

}
