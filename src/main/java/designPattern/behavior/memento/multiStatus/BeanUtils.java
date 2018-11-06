/**
 * project: designPatten
 * package: designPattern.behavior.memento.multiStatus
 * file: BeanUtils.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月5日 上午9:52:15
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月5日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.memento.multiStatus;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
  * class: BeanUtils<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月5日 上午9:52:15<BR>
  *
  */
public class BeanUtils {

    public static HashMap<String, Object> backupProp(Object bean) {
        HashMap<String, Object> result = new HashMap<String, Object>();
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : descriptors) {
                String fieldName = des.getName();
                Method getter = des.getReadMethod();
                Object fieldValue = getter.invoke(bean, new Object[]{});
                if (!fieldName.equalsIgnoreCase("class")) {
                    result.put(fieldName, fieldValue);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }

    public static void restoreProp(Object bean, HashMap<String, Object> propMap) {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor des : descriptors) {
                String fieldName = des.getName();
                if (propMap.containsKey(fieldName)) {
                    Method setter = des.getWriteMethod();
                    setter.invoke(bean, new Object[]{propMap.get(fieldName)});
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
