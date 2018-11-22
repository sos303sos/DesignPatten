/**
 * project: designPatten
 * package: designPattern.structure.bridge
 * file: Corp.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午2:25:46
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.bridge.bad;

/**
  * class: Corp<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午2:25:46<BR>
  *
  */
public abstract class Corp {

    protected abstract void produce();

    protected abstract void sell();

    public void makeMoney() {
        this.produce();
        this.sell();
    }
}
