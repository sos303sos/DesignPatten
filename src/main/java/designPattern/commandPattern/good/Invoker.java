/**
 * project: designPatten
 * package: designPattern.commandPattern.good
 * file: Invoker.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月15日 下午2:10:41
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月15日       95129          3.0             1.0
 * modification
 */
package designPattern.commandPattern.good;

/**
  * class: Invoker<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月15日 下午2:10:41<BR>
  *
  */
public class Invoker {

    private Command command;

    /**
     * setter method
     * @param command the command to set
     */
    public void setCommand(Command command) {
        this.command = command;
    }
    public void action(){
        this.command.execute();
    }

}
