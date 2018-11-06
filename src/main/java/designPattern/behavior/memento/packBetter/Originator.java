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
package designPattern.behavior.memento.packBetter;

/**
  * class: Originator<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月5日 上午9:48:13<BR>
  *
  */
public class Originator {

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

    public IMemento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento _memento) {
        this.setState(((Memento) _memento).getState());
    }

    private class Memento implements IMemento {

        private String state = "";

        private Memento(String _state) {
            this.state = _state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

    }

}
