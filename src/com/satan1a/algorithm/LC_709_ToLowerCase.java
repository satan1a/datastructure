package com.satan1a.algorithm;

import java.util.ArrayList;

/**
 * LC_709_ToLowerCase
 * @author satan1a
 * @date 2018.9.28
 * 第 1 天
 */
public class LC_709_ToLowerCase {

    public static void main(String[] args) {
        LC_709_ToLowerCase question = new LC_709_ToLowerCase();
        System.out.printf(question.toLowerCase("abcDEF123"));

    }

    public String toLowerCase(String str) {

        // 使用 toCharArray()方法 将字符串转化为一个 Character字符数组
        char[] charsList = str.toCharArray();
        // 使用 StringBuffer 储存最后转化后输出的字符串
        StringBuffer stringBuffer = new StringBuffer();
        // 循环遍历数组
        for (int i = 0; i < charsList.length; i++) {
            // 根据ASCII, 将大写字母字符 转化为小写字母字符 +32
            if (charsList[i] < 97 && charsList[i] >= 65) {
                charsList[i] += 32;
            }
            // append() 方法 将转化后的字符添加到 StringBuffer 对象最后面
            stringBuffer.append(charsList[i]);
        }
        // toString() 方法转化为字符串输出
        return stringBuffer.toString();
    }

}
