/**
 * project: designPatten
 * package: designPattern.behavior.memento.multiStatus
 * file: Originator.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月5日 上午9:48:13
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月5日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.memento.multiStatus;

/**
  * class: Originator<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月5日 上午9:48:13<BR>
  *
  */
public class Originator {

    private String state1 = "";

    private String state2 = "";

    private String state3 = "";

    /**
     * getter method
     * @return the state1
     */
    public String getState1() {
        return state1;
    }

    /**
     * setter method
     * @param state1 the state1 to set
     */
    public void setState1(String state1) {
        this.state1 = state1;
    }

    /**
     * getter method
     * @return the state2
     */
    public String getState2() {
        return state2;
    }

    /**
     * setter method
     * @param state2 the state2 to set
     */
    public void setState2(String state2) {
        this.state2 = state2;
    }

    /**
     * getter method
     * @return the state3
     */
    public String getState3() {
        return state3;
    }

    /**
     * setter method
     * @param state3 the state3 to set
     */
    public void setState3(String state3) {
        this.state3 = state3;
    }

    public Memento createMemento() {
        return new Memento(BeanUtils.backupProp(this));
    }

    public void restoreMemento(Memento _memento) {
        BeanUtils.restoreProp(this, _memento.getStateMap());
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月5日 上午9:52:02<BR></p>
      * @return designPattern.behavior.memento.multiStatus.Originator
      * @see java.lang.Object#toString()
      */
    @Override
    public String toString() {
        return "Originator [state1=" + state1 + ", state2=" + state2 + ", state3=" + state3 + "]";
    }

}
