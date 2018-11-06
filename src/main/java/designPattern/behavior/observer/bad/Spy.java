/**
 * project: designPatten
 * package: designPattern.behavior.observer
 * file: Spy.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月31日 下午2:01:43
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月31日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.observer.bad;

/**
  * class: Spy<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月31日 下午2:01:43<BR>
  *
  */
public class Spy extends Thread {

    private HanFeiZi hanFeiZi;

    private LiSi liSi;

    private String type;

    /**
      * Create New Instance Spy<BR>
      * description: <BR>
      * @param hanFeiZi
      * @param liSi
      * @param type
      */
    public Spy(HanFeiZi hanFeiZi, LiSi liSi, String type) {
        super();
        this.hanFeiZi = hanFeiZi;
        this.liSi = liSi;
        this.type = type;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年10月31日 下午2:03:01<BR></p> Spy
      * @see java.lang.Thread#run()
      */
    @Override
    public void run() {
        while (true) {
            if (this.type.equals("breakfast")) {
                if (this.hanFeiZi.isHavingBreakfast()) {
                    this.liSi.update("韩非子在吃饭");
                    this.hanFeiZi.setHavingBreakfast(false);
                }
            } else {
                if (this.hanFeiZi.isHavingFun()) {
                    this.liSi.update("韩非子在娱乐");
                    this.hanFeiZi.setHavingFun(false);
                }
            }
        }
    }

}
