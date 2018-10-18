/**
 * project: designPatten
 * package: designPattern.commandPattern.good
 * file: DeletePageCommand.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月15日 下午2:09:21
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月15日       95129          3.0             1.0
 * modification
 */
package designPattern.commandPattern.good;


/**
  * class: DeletePageCommand<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月15日 下午2:09:21<BR>
  *
  */
public class DeletePageCommand extends Command {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月15日 下午2:09:21<BR></p> DeletePageCommand
      * @see designPattern.commandPattern.good.Command#execute()
      */
    @Override
    public void execute() {
        super.pg.find();
        super.pg.delete();
        super.pg.plan();
    }

}
