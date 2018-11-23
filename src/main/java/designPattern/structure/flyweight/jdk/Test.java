/**
 * project: designPatten
 * package: designPattern.structure.flyweight.jdk
 * file: Test.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年11月23日 下午2:01:17
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年11月23日       95129          3.0             1.0
 * modification
 */
package designPattern.structure.flyweight.jdk;

/**
  * class: Test<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年11月23日 下午2:01:17<BR>
  *
  */
public class Test {

    public static void main(String[] args) {
        String str1 = "和谐";
        String str2 = "社会";
        String str3 = "和谐社会";
        String str4;
        str4 = str1 + str2;
        System.out.println(str3==str4);
        str4=(str1+str2).intern();
        System.out.println(str3 == str4);        

    }
}
