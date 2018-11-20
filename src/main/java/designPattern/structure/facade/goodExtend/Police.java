/**
 * project: designPatten
 * package: designPattern.structure.facade.goodExtend
 * file: Police.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月20日 上午9:13:16
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月20日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.facade.goodExtend;

/**
  * class: Police<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月20日 上午9:13:16<BR>
  *
  */
public class Police {

    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + "信件已经检查过了");
    }
}
