/**
 * project: designPatten
 * package: designPattern.structure.flyweight
 * file: SignInfo.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月23日 上午9:28:59
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月23日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.flyweight.good;

/**
  * class: SignInfo<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 上午9:28:59<BR>
  *
  */
public class SignInfo {

    private String id;

    private String location;

    private String subject;

    private String postAddress;

    /**
     * getter method
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * setter method
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * getter method
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * setter method
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
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
     * @return the postAddress
     */
    public String getPostAddress() {
        return postAddress;
    }

    /**
     * setter method
     * @param postAddress the postAddress to set
     */
    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

}
