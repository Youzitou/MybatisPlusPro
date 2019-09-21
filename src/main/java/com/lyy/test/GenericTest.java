/*
 * hbeu liuyouyun
 */

package com.lyy.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;

/**
 * @autohor liuyouyun
 * @date 2019/8/9 - 19:27
 */
public class GenericTest {

    public static void foreach(List<? extends Object> list) {
//        list.add("java");
//        Integer
    }
    public static void main(String[] args) {
//        Callable
//                Runnable
        Executors
        List<String> list = new ArrayList();
        list.add("语文");
        list.add("数学");
        list.add("英语");
        for (String a : list) {
            System.out.println(a);
        }
    }
}
