/**
 * project: designPatten
 * package: designPattern.structure.adapter
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 上午10:02:05
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.adapter.good;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 上午10:02:05<BR>
  *
  */
public class Client {

    /**
     *<p>
      * method:  main<BR>
      * description:  TODO<BR>
      * author:  95129<BR>
      * date:  2018年11月19日 上午10:02:05<BR>
      * 
      * @param args  
      */
    public static void main(String[] args) {
        //原有员工
        IUserInfo youngGirl = new UserInfo();
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
        //新员工
        IUserInfo youngGirl1=new OuterUserInfo();
        for(int i=0;i<101;i++){
            youngGirl1.getMobileNumber();
        }
    }

}
