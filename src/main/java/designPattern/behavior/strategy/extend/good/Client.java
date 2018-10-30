/**
 * project: designPatten
 * package: designPattern.behavior.strategy.extend.good
 * file: Client.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月30日 下午2:00:34
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月30日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.strategy.extend.good;

import java.util.Arrays;

/**
  * class: Client<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月30日 下午2:00:34<BR>
  *
  */
public class Client {

    public final static String ADD_SYMBOL = "+";

    public final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];//符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为:" + Arrays.toString(args));
        Context context = null;
        if (symbol.equals(ADD_SYMBOL)) {
            context = new Context(new Add());
        } else if (symbol.equals(SUB_SYMBOL)) {
            context = new Context(new Sub());
        }
        System.out.println("运行结果为" + a + symbol + b + "=" + context.exec(a, b, symbol));
    }
}
