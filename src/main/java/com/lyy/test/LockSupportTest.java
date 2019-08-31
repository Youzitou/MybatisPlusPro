/*
 * hbeu liuyouyun
 */

package com.lyy.test;

import java.util.concurrent.locks.LockSupport;

/**
 * 多线程学习
 * 线程1输出1 2 3 4 5 6 7
 * 线程2输出A B C D E F G
 * 要求输出  1A2B3C4D5E6F7G
 * @autohor liuyouyun
 * @date 2019/8/31 - 16:19
 */
public class LockSupportTest {
    static Thread t1 = null, t2 = null;

    public static void main(String[] args) {
        char[] ch1 = "1234567".toCharArray();
        char[] ch2 = "ABCDEFG".toCharArray();

        t1 = new Thread(() -> {
            for (char c : ch1) {
                System.out.println(c);
                LockSupport.unpark(t2);
                LockSupport.park();
            }
        }, "t1");

        t2 = new Thread(() -> {
            for (char c : ch2) {
                LockSupport.park();
                System.out.println(c);
                LockSupport.unpark(t1);
            }
        }, "t2");

        t1.start();
        t2.start();
    }

}
