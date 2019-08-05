/*
 * hbeu liuyouyun
 */

package com.lyy.test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 遍历集合的三种方式
 * @autohor liuyouyun
 * @date 2019/8/5 - 20:46
 */
public class CollectionErgodic {
    public static void main(String[] args) {
        Collection<String> c = new HashSet<>();
        c.add("前端vue");
        c.add("中台java");
        c.add("后台oracle");
        // 1.forEach遍历集合
        for(String st : c) {
            System.out.println(st);
        }

        // 2.Iterator遍历

        for(Iterator<String> i = c.iterator();i.hasNext();) {
            System.out.println(i.next());
        }
         Iterator it = c.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 3.Lambda表达式遍历
        System.out.println("---------------------");
        c.forEach(t -> System.out.println(t));
        System.out.println(".........装逼开始，虽然我也不知道为什么");
        c.forEach(System.out::println);

        System.out.println("又开始装逼..........");
        Iterator it2 = c.iterator();
        it2.forEachRemaining(obj -> System.out.println("集合迭代元素:"+ obj));



    }
}
