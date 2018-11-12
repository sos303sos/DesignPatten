/**
 * project: designPatten
 * package: designPattern.behavior.status.better
 * file: OpenningState.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月9日 上午11:27:07
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月9日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.status.better;

/**
  * class: OpenningState<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月9日 上午11:27:07<BR>
  *
  */
public class OpenningState extends LiftState {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:27:07<BR></p> OpenningState
      * @see designPattern.behavior.status.better.LiftState#open()
      */
    @Override
    public void open() {
        System.out.println("电梯门开启");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:27:07<BR></p> OpenningState
      * @see designPattern.behavior.status.better.LiftState#close()
      */
    @Override
    public void close() {
        super.context.setLiftState(Context.closingState);
        super.context.getLiftState().close();
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:27:07<BR></p> OpenningState
      * @see designPattern.behavior.status.better.LiftState#run()
      */
    @Override
    public void run() {

    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月9日 上午11:27:07<BR></p> OpenningState
      * @see designPattern.behavior.status.better.LiftState#stop()
      */
    @Override
    public void stop() {

    }

}
