/**
 * project: designPatten
 * package: designPattern.structure.facade
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 下午6:56:14
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.facade.bad;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 下午6:56:14<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("Hellp");
        letterProcess.fillEnvelope("Happy Road No.666");
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
