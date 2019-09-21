/*
 * Nothing is impossible to a willing heart
 */

package com.lyy.test;

import java.io.Closeable;
import java.io.FileInputStream;

/**
 * @autohor liuyouyun
 * @date 2019/8/31 - 17:12
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("D:/aaaaa.tx");)
        {
//            fileInputStream = new FileInputStream("D:/abbb.tx");
        } catch (Exception ex) {

        }

//        Closeable
//        fileInputStream = new FileInputStream("D:/abbb.tx");
    }

}
