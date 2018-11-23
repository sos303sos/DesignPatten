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
package designPattern.structure.flyweight.performance;

/**
  * class: SignInfo<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 上午9:28:59<BR>
  *
  */
public class SignInfo {

    private String id;

    private String postAddress;

    private ExtrinsicState state;

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

    /**
     * getter method
     * @return the state
     */
    public ExtrinsicState getState() {
        return state;
    }

    /**
     * setter method
     * @param state the state to set
     */
    public void setState(ExtrinsicState state) {
        this.state = state;
    }

}
