/*
 * hbeu liuyouyun
 */

package com.lyy.test;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @autohor liuyouyun
 * @date 2019/8/12 - 22:34
 */
 class ThirdThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()
                + "--->" + i);
            result = i;
        }
        return result;
    }
}

public class ThirdThreadTest {
    public static void main(String[] args) {
        // 创建Callable实现类的实例，
        ThirdThread r = new ThirdThread();
        // 并包装成FutureTask对象
        FutureTask<Integer> ft = new FutureTask<>(r);
        // 以FutureTask的实例为Target，创建Thread对象，再调用start方法
        new Thread(ft).start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()
                + "--->" + i);
        }

    }

}
