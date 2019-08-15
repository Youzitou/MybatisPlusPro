/*
 * hbeu liuyouyun
 */

package com.lyy.test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @autohor liuyouyun
 * @date 2019/8/15 - 22:51
 */
public class ThreadPoolTest {
    
    public static void main(String[] args) {
        // 创建一个只有2条线程的线程池
        // 如果有超过2个任务，多出来的任务就需要排队
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer> callable = () -> {
            // 必须有返回值     
            int result = 0;
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
                result = i;
            }
            return result;
        };
        
        Runnable runnable = () -> {
            // 没有返回值
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "--->" + i);
            }
        };

        // 把这两个任务提交给线程池
        executorService.submit(callable);
        executorService.submit(runnable);

        // 关闭线程池 shutdown(),等线程池中所有任务完成后再关闭线程池
        // shutdownNow() 立即关闭 返回所有未完成的任务（Runnable或Callable实例），程序可以再次去执行这些未完成的任务

        executorService.shutdown();

    }
}
