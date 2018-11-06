/**
 * project: designPatten
 * package: designPattern.behavior.memento.clone
 * file: Originator.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月2日 上午11:45:28
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月2日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.memento.clone;

/**
  * class: Originator<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月2日 上午11:45:28<BR>
  *
  */
public class Originator implements Cloneable {

    private Originator backup;

    private String state = "";

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

    public void createMemento() throws Exception {
        this.backup = this.clone();
    }

    public void restoreMemento() {
        this.setState(this.backup.getState());
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月2日 上午11:48:06<BR></p>
      * @return
      * @throws CloneNotSupportedException Originator
      * @see java.lang.Object#clone()
      */
    @Override
    protected Originator clone() throws CloneNotSupportedException {
        return (Originator) super.clone();
    }

}
