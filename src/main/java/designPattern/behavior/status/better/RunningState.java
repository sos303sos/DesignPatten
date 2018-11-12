/**
 * project: designPatten
 * package: designPattern.behavior.status.better
 * file: RunningState.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月9日 上午11:31:47
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月9日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.status.better;

/**
  * class: RunningState<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月9日 上午11:31:47<BR>
  *
  */
public class RunningState extends LiftState {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:31:47<BR></p> RunningState
      * @see designPattern.behavior.status.better.LiftState#open()
      */
    @Override
    public void open() {

    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:31:47<BR></p> RunningState
      * @see designPattern.behavior.status.better.LiftState#close()
      */
    @Override
    public void close() {

    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:31:47<BR></p> RunningState
      * @see designPattern.behavior.status.better.LiftState#run()
      */
    @Override
    public void run() {
        System.out.println("电梯上下运行....");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:31:47<BR></p> RunningState
      * @see designPattern.behavior.status.better.LiftState#stop()
      */
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }

}
