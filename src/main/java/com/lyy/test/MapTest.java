/*
 * hbeu liuyouyun
 */

package com.lyy.test;

import java.util.*;
import java.util.function.BiConsumer;

/**
 * @autohor liuyouyun
 * @date 2019/8/8 - 22:21
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",90);
        map.put("数学",98);
        map.put("英语",76);

        // Map不能直接用foreach遍历，不能直接用iterator遍历
        // 但是改为对Map的所有key进行遍历，接下来即可通过key访问value


        // 1.foreach遍历,只能遍历map的key
        for(String key :map.keySet()) {
            System.out.println(key + "-->" + map.get(key));
        }

        // 2.用Iterator遍历器进行遍历
        for(Iterator<String> i = map.keySet().iterator(); i.hasNext();) {
            String key = i.next();  // 取出下一个
            System.out.println(key+ "----------"+ map.get(key));
        }

        Iterator<String> i = map.keySet().iterator();
        while (i.hasNext()) {
            String str = i.next();
            System.out.println(str + "===" + map.get(str));
        }

        // 3.Lambda表达式遍历
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String key, Integer value) {
                System.out.println(key+"======"+ value);
            }
        });

        map.forEach((key,value) -> System.out.println("啦啦啦啦"+key + "--------" + value));

        //  遍历value
        Collection values = map.values();
        Iterator itValues = values.iterator();
        while(itValues.hasNext()){
            System.out.println("值："+itValues.next());
        }

        //  通过 map中的实体类（key  value）遍历
        Set<Map.Entry<String,Integer>> sets =  map.entrySet();
        // Set<Map.Entry<K, V>> entrySet();   获取map中所有的key对应value ，并将它们作为一个Entry实体类存在在Set集合中
        for(Map.Entry entry : sets){
            System.out.println("通过 map中的内部接口Entry遍历：      "+ entry.getKey()+"======="+entry.getValue());
        }
    }
}
