/*
 * Nothing is impossible to a willing heart
 */

package com.lyy.test;

/**
 * @autohor liuyouyun
 * @date 2019/8/31 - 16:33
 */
public class CasTest {
    enum ReadyToRun{T1, T2}

    static volatile ReadyToRun rtr = ReadyToRun.T1;

    public static void main(String[] args) {
        char[] ch1 = "1234567".toCharArray();
        char[] ch2 = "ABCDEFG".toCharArray();

        new Thread( () -> {
            for (char c : ch1) {
                while (rtr != ReadyToRun.T1) {}
                System.out.println(c);
                rtr = ReadyToRun.T2;
            }

        },"t1").start();

        new Thread( () -> {
            for (char c : ch2) {
                while (rtr != ReadyToRun.T2) {}
                System.out.println(c);
                rtr = ReadyToRun.T1;
            }
        },"t2").start();
    }

}
