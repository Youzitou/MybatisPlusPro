/*
 * hbeu liuyouyun
 */

package com.lyy.util;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Java加密解密
 * @autohor liuyouyun
 * @date 2019/8/4 - 20:35
 */
public class SecurityUtil {
    /**
    * 使用异或进行加密
    * @param([input]) 参数描述
    * @return  返回加密后的字符串
    */
    public static  String xor(String input) {
        char[] chs = input.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            chs[i] = (char)(chs[i]^3000);
        }

        return new String(chs);
    }

    /**
    * MD5加密 不可逆 速度加快
    * @param([input]) 参数描述
    * @return  返回参数描述
    */
    public static String md5Encode(byte[] input) {
        return DigestUtils.md5Hex(input);
    }

    /**
    * SHA加密 不可逆 速度慢些 安全性高些
    * @param([input]) 参数描述
    * @return  返回参数描述
    */
    public static String sha256Encode(byte[] input) {
        return DigestUtils.sha256Hex(input);
    }

    /**
    * 使用Base64加密
    * @param([input]) 参数描述
    * @return  返回参数描述
    */
    public static String base64Encode(byte[] input) {
        String result = null;
        try {
            Class clazz = Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");
            Method method = clazz.getMethod("encode", byte[].class);
            result = (String) method.invoke(null,input);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 使用Base64解密
     * @param([input]) 参数描述
     * @return  返回参数描述
     */
    public static byte[] base64Decode(String input) {
        byte[] result = null;
        try {
            Class clazz = Class.forName("com.sun.org.apache.xerces.internal.impl.dv.util.Base64");
            Method method = clazz.getMethod("decode", String.class);
            result = (byte[]) method.invoke(null,input);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
//        String str = "hello";
//        str = xor(str);  // 第一次异或：加密
//        System.out.println(str);
//
//        str = xor(str);  // 第二次异或：解密  可逆
//        System.out.println(str);

//        String str = "1314520";
//        str = md5Encode(str.getBytes());
//        System.out.println(str);
        // SHA加密
//        String str = "我的qq密码是";
//        str = sha256Encode(str.getBytes());
//        System.out.println(str);


        String str = "12345678";
        // Base64加密解密
        str = base64Encode(str.getBytes());
        System.out.println(str);
        // 解密
        byte[] result = base64Decode(str);
        System.out.println(new String(result));

    }

}
