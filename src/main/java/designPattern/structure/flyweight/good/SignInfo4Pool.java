/**
 * project: designPatten
 * package: designPattern.structure.flyweight.good
 * file: SignInfo4Pool.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月23日 上午9:48:57
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月23日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.flyweight.good;

/**
  * class: SignInfo4Pool<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 上午9:48:57<BR>
  *
  */
public class SignInfo4Pool extends SignInfo {

    private String key;

    /**
      * Create New Instance SignInfo4Pool<BR>
      * description: <BR>
      * @param key
      */
    public SignInfo4Pool(String key) {
        super();
        this.key = key;
    }

    /**
     * getter method
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * setter method
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

}
