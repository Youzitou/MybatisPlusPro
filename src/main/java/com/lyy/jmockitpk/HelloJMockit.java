/*
 * Nothing is impossible to a willing heart
 */

package com.lyy.jmockitpk;

import java.util.Locale;

/**
 * @autohor liuyouyun
 * @date 2019/9/16 - 23:15
 */
public class HelloJMockit {
    // 向JMockit打招呼
    public String sayHello() {
        Locale locale = Locale.getDefault();
        if (locale.equals(Locale.CHINA)) {
            // 在中国，就说中文
            return "你好，JMockit!";
        } else {
            // 在其它国家，就说英文
            return "Hello，JMockit!";
        }
    }
}
