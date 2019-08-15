/*
 * hbeu liuyouyun
 */

package com.lyy.test;

/**
 * 线程组学习
 * @autohor liuyouyun
 * @date 2019/8/15 - 23:23
 */
public class ThreadGroupTest {
    // 创建Thread对象时，可以传入一个ThreadGroup对象，这就设置了该线程所属的线程组
    //
    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("tg1") {

            /*
             * 线程组有用地方：线程组将作为组中所有线程的异常处理器
             * 只要线程组中的线程出现异常，线程组的uncaughtException(Thread t,Throwable e)
             */

            // 只要线程组中任何一条线程出现异常，该方法就会被自动激发
            @Override
            public void uncaughtException() {

            }

        };
        // 线程加入到threadGroup线程组中，以后将永远属于threadGroup，不得叛变
        Thread t = new Thread(threadGroup, ()-> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+"--->"+i);
            }
        });

        System.out.println(threadGroup.activeCount());
        t.start();
        System.out.println(threadGroup.activeCount());




    }
}
