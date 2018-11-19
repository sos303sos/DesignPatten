/**
 * project: designPatten
 * package: designPattern.structure.adapter.extend
 * file: OuterUserInfo.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月19日 上午10:55:25
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月19日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.adapter.extend;

import java.util.Map;

/**
  * class: OuterUserInfo<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月19日 上午10:55:25<BR>
  *
  */
public class OuterUserInfo implements IUserInfo {

    private IOuterUserBaseInfo baseInfo = null;

    private IOuterUserHomeInfo homeInfo = null;

    private IOuterUserOfficeInfo officeInfo = null;

    private Map baseMap = null;

    private Map homeMap = null;

    private Map officeMap = null;

    public OuterUserInfo(IOuterUserBaseInfo _baseInfo, IOuterUserHomeInfo _homeInfo, IOuterUserOfficeInfo _ofiiceInfo) {
        this.baseInfo = _baseInfo;
        this.homeInfo = _homeInfo;
        this.officeInfo = _ofiiceInfo;
        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }

    /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年11月19日 上午9:50:54<BR></p>
     * @return OuterUserInfo
     * @see designPattern.structure.adapter.good.IUserInfo#getUserName()
     */
    public String getUserName() {
        String userName = (String) this.baseMap.get("userName");
        System.out.println(userName);
        return userName;

    }

    /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年11月19日 上午9:50:54<BR></p>
     * @return OuterUserInfo
     * @see designPattern.structure.adapter.good.IUserInfo#getHomeAddress()
     */
    public String getHomeAddress() {
        String homeAddress = (String) this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年11月19日 上午9:50:54<BR></p>
     * @return OuterUserInfo
     * @see designPattern.structure.adapter.good.IUserInfo#getMobileNumber()
     */
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年11月19日 上午9:50:54<BR></p>
     * @return OuterUserInfo
     * @see designPattern.structure.adapter.good.IUserInfo#getOfficeTelNumber()
     */
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;

    }

    /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年11月19日 上午9:50:54<BR></p>
     * @return OuterUserInfo
     * @see designPattern.structure.adapter.good.IUserInfo#getJobPosition()
     */
    public String getJobPosition() {
        String jobPosition = (String) this.officeMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    /**
     *<p> 
     * description: TODO<BR>
     * author: 95129<BR>
     * overriding_date: 2018年11月19日 上午9:50:54<BR></p>
     * @return OuterUserInfo
     * @see designPattern.structure.adapter.good.IUserInfo#getHomeTelNumber()
     */
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

}
