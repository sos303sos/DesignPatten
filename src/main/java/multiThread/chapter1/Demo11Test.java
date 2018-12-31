/**
 * project: designPatten
 * package: multiThread.chapter1
 * file: Demo11Test.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年12月28日 上午11:22:49
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年12月28日       95129          3.0             1.0
 * modification
 */
package multiThread.chapter1;

/**
  * class: Demo11Test<BR>
  * description: getId<BR>
  * author: 95129<BR>
  * date: 2018年12月28日 上午11:22:49<BR>
  *
  */
public class Demo11Test {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + " " + thread.getId());
    }
}
