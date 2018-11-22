/**
 * project: designPatten
 * package: designPattern.structure.bridge.good
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午3:41:00
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.bridge.good;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午3:41:00<BR>
  *
  */
public class Client {

    /**
     *<p>
      * method:  main<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年11月22日 下午3:41:00<BR>
      * 
      * @param args  
      */
    public static void main(String[] args) {
        House house = new House();
        System.out.println("---房地产公司是这样运行的---");
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("---山寨公司是这样运行的---");
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(new Ipod());
        shanZhaiCorp.makeMoney();

    }

}
