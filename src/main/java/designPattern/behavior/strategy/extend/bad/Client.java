/**
 * project: designPatten
 * package: designPattern.behavior.strategy.extend
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月30日 下午1:48:04
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月30日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.strategy.extend.bad;

import java.util.Arrays;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月30日 下午1:48:04<BR>
  *
  */
public class Client {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为:" + Arrays.toString(args));
        Calculator cal = new Calculator();
        System.out.println("运行结果为:" + a + symbol + b + "=" + cal.exec(a, b, symbol));
    }
}
