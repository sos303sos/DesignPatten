/**
 * project: designPatten
 * package: designPattern.structure.facade
 * file: ILetterProcess.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 下午6:00:05
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.facade.bad;

/**
  * class: ILetterProcess<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 下午6:00:05<BR>
  *
  */
public interface ILetterProcess {

    public void writeContext(String context);

    public void fillEnvelope(String address);

    public void letterInotoEnvelope();

    public void sendLetter();
}
