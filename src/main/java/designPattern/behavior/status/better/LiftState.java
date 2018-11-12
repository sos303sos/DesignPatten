/**
 * project: designPatten
 * package: designPattern.behavior.status.better
 * file: LiftState.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月9日 上午11:18:55
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月9日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.status.better;

/**
  * class: LiftState<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月9日 上午11:18:55<BR>
  *
  */
public abstract class LiftState {

    protected Context context;

    /**
     * setter method
     * @param context the context to set
     */
    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
