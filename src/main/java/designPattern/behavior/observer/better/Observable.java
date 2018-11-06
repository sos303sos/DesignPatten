/**
 * project: designPatten
 * package: designPattern.behavior.observer.better
 * file: Observable.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月31日 下午2:52:39
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月31日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.observer.better;

/**
  * class: Observable<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月31日 下午2:52:39<BR>
  *
  */
public interface Observable {

    public void addObserver(Observer observer);

    public void deleteObserver(Observer observer);

    public void notifyObservers(String context);
}
