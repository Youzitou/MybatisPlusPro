/*
 * hbeu liuyouyun
 */

package com.lyy.test;

import java.io.File;

/**
 * @autohor liuyouyun
 * @date 2019/8/9 - 23:46
 */
public class FileIterator {

    public static void main(String[] args) {
        File start = new File("E:/Temp");
        access(start);
    }

    public static void access(File start) {
        // 列出start目录下的所有文件和目录
        File[] subFiles = start.listFiles();
        for (File sub : subFiles) {
            if (sub.isFile()) { // 是文件，无需向下遍历
                // 可操作该文件
                System.out.println("正在访问" +sub+ "文件");
                // sub.delete();
            }
            else if (sub.isDirectory()) {  // 如果是目录
                System.out.println("进入" + sub + "目录");
                access(sub);  // 递归
            }
        }

    }
}
