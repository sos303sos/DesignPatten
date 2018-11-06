/**
 * project: designPatten
 * package: designPattern.behavior.memento.better
 * file: Caretaker.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月2日 上午11:35:10
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月2日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.memento.packBetter;

/**
  * class: Caretaker<BR>
  * description: 备忘录管理员<BR>
  * author: 95129<BR>
  * date: 2018年11月2日 上午11:35:10<BR>
  *
  */
public class Caretaker {

    private IMemento memento;

    /**
     * getter method
     * @return the memento
     */
    public IMemento getMemento() {
        return memento;
    }

    /**
     * setter method
     * @param memento the memento to set
     */
    public void setMemento(IMemento memento) {
        this.memento = memento;
    }

}
