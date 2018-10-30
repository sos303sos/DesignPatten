/**
 * project: designPatten
 * package: designPattern.create.factory_vs_builder.builder
 * file: SuperMan.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月27日 下午3:12:28
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月27日       95129          3.0             1.0
 * modification
 */
package designPattern.create.factory_vs_builder.builder;

/**
  * class: SuperMan<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月27日 下午3:12:28<BR>
  *
  */
public class SuperMan {

    private String body;

    private String specialTalent;

    private String specialSymbol;

    /**
     * getter method
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * setter method
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * getter method
     * @return the specialTalent
     */
    public String getSpecialTalent() {
        return specialTalent;
    }

    /**
     * setter method
     * @param specialTalent the specialTalent to set
     */
    public void setSpecialTalent(String specialTalent) {
        this.specialTalent = specialTalent;
    }

    /**
     * getter method
     * @return the specialSymbol
     */
    public String getSpecialSymbol() {
        return specialSymbol;
    }

    /**
     * setter method
     * @param specialSymbol the specialSymbol to set
     */
    public void setSpecialSymbol(String specialSymbol) {
        this.specialSymbol = specialSymbol;
    }

}
