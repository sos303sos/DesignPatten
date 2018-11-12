/**
 * project: designPatten
 * package: designPattern.behavior.status.better
 * file: ClosingState.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月9日 上午11:31:15
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月9日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.status.better;

/**
  * class: ClosingState<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月9日 上午11:31:15<BR>
  *
  */
public class ClosingState extends LiftState {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:31:24<BR></p> LiftState
      * @see designPattern.behavior.status.better.LiftState#open()
      */
    @Override
    public void open() {
        super.context.setLiftState(Context.openningState);
        super.context.getLiftState().open();
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:31:24<BR></p> LiftState
      * @see designPattern.behavior.status.better.LiftState#close()
      */
    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:31:24<BR></p> LiftState
      * @see designPattern.behavior.status.better.LiftState#run()
      */
    @Override
    public void run() {
        super.context.setLiftState(Context.runningState);
        super.context.getLiftState().run();
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:31:24<BR></p> LiftState
      * @see designPattern.behavior.status.better.LiftState#stop()
      */
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState);
        super.context.getLiftState().stop();
    }

}
