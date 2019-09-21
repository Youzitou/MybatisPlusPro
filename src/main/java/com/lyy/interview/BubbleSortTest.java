/*
 * Nothing is impossible to a willing heart
 */

package com.lyy.interview;

import java.util.Arrays;

/**
 * @autohor liuyouyun
 * @date 2019/9/21 - 23:40
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = {1,5,7,3,2,6,9};
        bubbleSort(arr);
    }

    /**
     *  给定一个数组  ，将数组按从小到大(或从大到小)的顺序排列
     *  1、冒泡排序 ：
     *       将数组的每个元素，从第一个位置开始，两两相互比较，
     *       	 如果从小到大排序， 将最大的元素放在最后面
     *            依次类推
     *           如果从大到小排序，将最小的元素放在最后面
     *
     */
    public static void bubbleSort(int[] array) {
//        int [] array = {5,4,3,2,1};
        int temp = 0;
        for (int j = 0; j < array.length - 1; j++) {

            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                System.out.println(Arrays.toString(array));
            }

            System.out.println();

        }


    }

}
