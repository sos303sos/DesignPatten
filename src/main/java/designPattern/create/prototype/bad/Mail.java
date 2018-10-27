/**
 * project: designPatten
 * package: designPattern.create.prototype.bad
 * file: Mail.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月26日 上午10:33:41
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月26日       95129          3.0             1.0
 * modification
 */
package designPattern.create.prototype.bad;

/**
  * class: Mail<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月26日 上午10:33:41<BR>
  *
  */
public class Mail {

    private String receiver;

    private String subject;

    private String appellation;

    private String contxt;

    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    /**
     * getter method
     * @return the receiver
     */
    public String getReceiver() {
        return receiver;
    }

    /**
     * setter method
     * @param receiver the receiver to set
     */
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    /**
     * getter method
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * setter method
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * getter method
     * @return the appellation
     */
    public String getAppellation() {
        return appellation;
    }

    /**
     * setter method
     * @param appellation the appellation to set
     */
    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    /**
     * getter method
     * @return the contxt
     */
    public String getContxt() {
        return contxt;
    }

    /**
     * setter method
     * @param contxt the contxt to set
     */
    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    /**
     * getter method
     * @return the tail
     */
    public String getTail() {
        return tail;
    }

    /**
     * setter method
     * @param tail the tail to set
     */
    public void setTail(String tail) {
        this.tail = tail;
    }

}
