/**
 * project: designPatten
 * package: designPattern.create.builder.good
 * file: Director.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月26日 上午9:36:11
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月26日       95129          3.0             1.0
 * modification
 */
package designPattern.create.builder.good;

import java.util.ArrayList;

/**
  * class: Director<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月26日 上午9:36:11<BR>
  *
  */
public class Director {

    private ArrayList<String> sequence = new ArrayList<String>();

    private BenzBuilder benzBuilder = new BenzBuilder();

    private BMWBuilder bmwBuilder = new BMWBuilder();

    public BenzModel getABenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getBBenzModel() {
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BenzModel getCBenzModel() {
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(this.sequence);
        return (BenzModel) this.benzBuilder.getCarModel();
    }

    public BMWModel getDBMWModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.benzBuilder.setSequence(this.sequence);
        return (BMWModel) this.bmwBuilder.getCarModel();
    }

}
