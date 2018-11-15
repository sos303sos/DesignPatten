/**
 * project: designPatten
 * package: designPattern.behavior.observer
 * file: HanFeiZi.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月31日 下午1:45:55
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月31日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.observer.better;

import java.util.ArrayList;

/**
  * class: HanFeiZi<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月31日 下午1:45:55<BR>
  *
  */
public class HanFeiZi implements IHanFeiZi, Observable {
    private ArrayList<Observer> observerList = new ArrayList<Observer>();

    //private ILiSi liSi = new LiSi();

    private boolean isHavingBreakfast = false;

    private boolean isHavingFun = false;

    public void haveBreakfast() {
        System.out.println("韩非子:开始吃饭了......");
        this.notifyObservers("韩非子在吃饭");
    }

    public void haveFun() {
        System.out.println("韩非子:开始娱乐了");
        this.notifyObservers("韩非子在娱乐");
    }

    /**
     * getter method
     * @return the isHavingBreakfast
     */
    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    /**
     * setter method
     * @param isHavingBreakfast the isHavingBreakfast to set
     */
    public void setHavingBreakfast(boolean isHavingBreakfast) {
        this.isHavingBreakfast = isHavingBreakfast;
    }

    /**
     * getter method
     * @return the isHavingFun
     */
    public boolean isHavingFun() {
        return isHavingFun;
    }

    /**
     * setter method
     * @param isHavingFun the isHavingFun to set
     */
    public void setHavingFun(boolean isHavingFun) {
        this.isHavingFun = isHavingFun;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月31日 下午2:58:23<BR></p>
      * @param observer Observable
      * @see designPattern.behavior.observer.better.Observable#addObserver(java.util.Observer)
      */
    public void addObserver(Observer observer) {
        this.observerList.add(observer);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月31日 下午2:58:23<BR></p>
      * @param observer Observable
      * @see designPattern.behavior.observer.better.Observable#deleteObserver(java.util.Observer)
      */
    public void deleteObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月31日 下午2:58:23<BR></p>
      * @param context Observable
      * @see designPattern.behavior.observer.better.Observable#notifyObservers(java.lang.String)
      */
    public void notifyObservers(String context) {
        for (Observer observer : observerList) {
            observer.update(context);
        }
    }

}
