/**
 * project: designPatten
 * package: designPattern.structure.bridge
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月22日 下午2:34:03
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月22日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.bridge.bad;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月22日 下午2:34:03<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        System.out.println("---房地产公司是这样运行的---");
        HouseCorp houseCorp = new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("---服装公司是这样运行的---");
        ClothesCorp clothesCorp = new ClothesCorp();
        clothesCorp.makeMoney();
    }
}
