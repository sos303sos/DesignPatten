/**
 * project: designPatten
 * package: designPattern.structure.facade.good
 * file: ModenPostOffice.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 下午7:03:33
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.facade.good;

/**
  * class: ModenPostOffice<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 下午7:03:33<BR>
  *
  */
public class ModenPostOffice {

    private ILetterProcess letterProcess = new LetterProcessImpl();

    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
