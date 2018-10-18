/**
 * project: designPatten
 * package: designPattern.commandPattern.good
 * file: Command.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月15日 下午2:02:15
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月15日       95129          3.0             1.0
 * modification
 */
package designPattern.commandPattern.good;

/**
  * class: Command<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月15日 下午2:02:15<BR>
  *
  */
public abstract class Command {

    protected RequirementGroup rp = new RequirementGroup();

    protected PageGroup pg = new PageGroup();

    protected CodeGroup cg = new CodeGroup();

    public abstract void execute();

}
