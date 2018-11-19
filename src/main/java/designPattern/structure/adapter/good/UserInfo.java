/**
 * project: designPatten
 * package: designPattern.structure.adapter
 * file: UserInfo.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月17日 下午3:39:03
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月17日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.adapter.good;

/**
  * class: UserInfo<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月17日 下午3:39:03<BR>
  *
  */
public class UserInfo implements IUserInfo {

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月17日 下午3:39:03<BR></p>
      * @return UserInfo
      * @see designPattern.structure.adapter.good.IUserInfo#getUserName()
      */
    public String getUserName() {
        System.out.println("姓名叫做....");
        return null;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月17日 下午3:39:03<BR></p>
      * @return UserInfo
      * @see designPattern.structure.adapter.good.IUserInfo#getHomeAddress()
      */
    public String getHomeAddress() {
        System.out.println("这里是员工的家庭地址");
        return null;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月17日 下午3:39:03<BR></p>
      * @return UserInfo
      * @see designPattern.structure.adapter.good.IUserInfo#getMobileNumber()
      */
    public String getMobileNumber() {
        System.out.println("这个人的手机号码是0000......");
        return null;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月17日 下午3:39:03<BR></p>
      * @return UserInfo
      * @see designPattern.structure.adapter.good.IUserInfo#getOfficeTelNumber()
      */
    public String getOfficeTelNumber() {
        System.out.println("办公室电话是...");
        return null;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月17日 下午3:39:03<BR></p>
      * @return UserInfo
      * @see designPattern.structure.adapter.good.IUserInfo#getJobPosition()
      */
    public String getJobPosition() {
        System.out.println("这个人的职位是BOSS");
        return null;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月17日 下午3:39:03<BR></p>
      * @return UserInfo
      * @see designPattern.structure.adapter.good.IUserInfo#getHomeTelNumber()
      */
    public String getHomeTelNumber() {
        System.out.println("员工的家庭电话是....");
        return null;
    }

}
