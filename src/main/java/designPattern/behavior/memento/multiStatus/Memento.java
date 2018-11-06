/**
 * project: designPatten
 * package: designPattern.behavior.memento.multiStatus
 * file: Memento.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月5日 上午9:55:23
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月5日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.memento.multiStatus;

import java.util.HashMap;

/**
  * class: Memento<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月5日 上午9:55:23<BR>
  *
  */
public class Memento {

    private HashMap<String, Object> stateMap;

    public Memento(HashMap<String, Object> map) {
        this.stateMap = map;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

}
