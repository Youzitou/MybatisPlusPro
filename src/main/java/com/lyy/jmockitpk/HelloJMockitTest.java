/*
 * Nothing is impossible to a willing heart
 */

package com.lyy.jmockitpk;

import mockit.Expectations;
import mockit.Mock;
import mockit.Tested;
import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

/**
 * @autohor liuyouyun
 * @date 2019/9/16 - 23:17
 */
public class HelloJMockitTest {

    /**
     * 测试场景：当前是在中国
     */
    @Test
    public void testSayHelloAtChina() {
        // 假设当前位置是在中国
        new Expectations(Locale.class) {
            {
                Locale.getDefault();
                result = Locale.CHINA;
            }
        };
        // 断言说中文
        Assert.assertTrue("你好，JMockit!".equals((new HelloJMockit()).sayHello()));
    }

    /**
     * 测试场景：当前是在美国
     */
    @Test
    public void testSayHelloAtUS() {
        // 假设当前位置是在美国
        new Expectations(Locale.class) {
            {
                Locale.getDefault();
                result = Locale.US;
            }
        };
        // 断言说英文
        Assert.assertTrue("Hello，JMockit!".equals((new HelloJMockit()).sayHello()));
    }
}
