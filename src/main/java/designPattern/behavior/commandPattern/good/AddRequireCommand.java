/**
 * project: designPatten
 * package: designPattern.commandPattern.good
 * file: AddRequireCommand.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月15日 下午2:05:04
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月15日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.commandPattern.good;

/**
  * class: AddRequireCommand<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月15日 下午2:05:04<BR>
  *
  */
public class AddRequireCommand extends Command {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月15日 下午2:05:04<BR></p> AddRequireCommand
      * @see designPattern.behavior.commandPattern.good.Command#execute()
      */
    @Override
    public void execute() {
        super.rp.find();
        super.rp.add();
        super.rp.plan();
    }

}
