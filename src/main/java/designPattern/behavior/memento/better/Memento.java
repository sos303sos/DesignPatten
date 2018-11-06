/**
 * project: designPatten
 * package: designPattern.behavior.memento.good
 * file: Memento.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月2日 上午11:22:15
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月2日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.memento.better;

/**
  * class: Memento<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月2日 上午11:22:15<BR>
  *
  */
public class Memento {

    private String state = "";

    /**
      * Create New Instance Memento<BR>
      * description: <BR>
      * @param state
      */
    public Memento(String state) {
        super();
        this.state = state;
    }

    /**
     * getter method
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * setter method
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

}
