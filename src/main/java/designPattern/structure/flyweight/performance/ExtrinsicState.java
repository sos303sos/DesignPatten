/**
 * project: designPatten
 * package: designPattern.structure.flyweight.performance
 * file: ExtrinsicState.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月23日 上午11:03:07
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月23日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.flyweight.performance;

/**
  * class: ExtrinsicState<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 上午11:03:07<BR>
  *
  */
public class ExtrinsicState {

    private String subject;

    private String location;

    /**
     * getter method
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * setter method
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * getter method
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * setter method
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月23日 上午11:04:06<BR></p>
      * @param obj
      * @return ExtrinsicState
      * @see java.lang.Object#equals(java.lang.Object)
      */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ExtrinsicState) {
            ExtrinsicState state = (ExtrinsicState) obj;
            return state.getLocation().equals(location) && state.getSubject().equals(subject);
        }
        return false;
    }

    /**
      *<p> 
      * description: TODO<BR>
      * author: 95129<BR>
      * overriding_date: 2018年11月23日 上午11:08:17<BR></p>
      * @return ExtrinsicState
      * @see java.lang.Object#hashCode()
      */
    @Override
    public int hashCode() {
        return subject.hashCode() + location.hashCode();
    }
}
