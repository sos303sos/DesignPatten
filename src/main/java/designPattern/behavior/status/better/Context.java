/**
 * project: designPatten
 * package: designPattern.behavior.status.better
 * file: Context.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月9日 上午11:19:17
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月9日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.status.better;

/**
  * class: Context<BR>
  * description: 环境角色,串联各个状态的过渡<BR>
  * author: 95129<BR>
  * date: 2018年11月9日 上午11:19:17<BR>
  *
  */
public class Context {

    public final static OpenningState openningState = new OpenningState();

    public final static ClosingState closingState = new ClosingState();

    public final static RunningState runningState = new RunningState();

    public final static StoppingState stoppingState = new StoppingState();

    private LiftState liftState;

    /**
     * getter method
     * @return the liftState
     */
    public LiftState getLiftState() {
        return liftState;
    }

    /**
     * setter method
     * @param liftState the liftState to set
     */
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open() {
        this.liftState.open();
    }

    public void close() {
        this.liftState.close();
    }

    public void run() {
        this.liftState.run();
    }

    public void stop() {
        this.liftState.stop();
    }

}
