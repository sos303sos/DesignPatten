/**
 * project: designPatten
 * package: designPattern.structure.facade
 * file: LetterProcessImpl.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 下午6:53:45
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.facade.bad;

/**
  * class: LetterProcessImpl<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 下午6:53:45<BR>
  *
  */
public class LetterProcessImpl implements ILetterProcess {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 下午6:53:45<BR></p>
      * @param context LetterProcessImpl
      * @see designPattern.structure.facade.bad.ILetterProcess#writeContext(java.lang.String)
      */
    public void writeContext(String context) {
        System.out.println("填写信的内容...." + context);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 下午6:53:45<BR></p>
      * @param address LetterProcessImpl
      * @see designPattern.structure.facade.bad.ILetterProcess#fillEnvelope(java.lang.String)
      */
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址和姓名...." + address);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 下午6:53:45<BR></p> LetterProcessImpl
      * @see designPattern.structure.facade.bad.ILetterProcess#letterInotoEnvelope()
      */
    public void letterInotoEnvelope() {
        System.out.println("把心放到信封中...");
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月19日 下午6:53:45<BR></p> LetterProcessImpl
      * @see designPattern.structure.facade.bad.ILetterProcess#sendLetter()
      */
    public void sendLetter() {
        System.out.println("邮递信件......");
    }

}
