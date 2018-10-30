/**
 * project: designPatten
 * package: designPattern.behavior.strategy.extend.good
 * file: Calculator.java
 * description: TODO
 * Senyint
 * Copyright 2018 All rights Reserved
 * 
 * author: 95129
 * version: V3.0
 * date: 2018年10月30日 下午1:54:06
 *
 * history:
 * date          author          version          description
 * -----------------------------------------------------------------------------------
 * 2018年10月30日       95129          3.0             1.0
 * modification
 */
package designPattern.behavior.strategy.extend.better;

/**
  * class: Calculator<BR>
  * description: TODO<BR>
  * author: 95129<BR>
  * date: 2018年10月30日 下午1:54:06<BR>
  *
  */
public enum Calculator {

    ADD("+") {

        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-") {

        public int exec(int a, int b) {
            return a - b;
        }
    };

    String value = "";

    private Calculator(String _value) {
        this.value = _value;
    }

    /**
     * getter method
     * @return the value
     */
    public String getValue() {
        return value;
    }

    public abstract int exec(int a, int b);
}
