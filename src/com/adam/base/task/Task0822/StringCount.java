package com.adam.base.task.Task0822;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/22
 */
public class StringCount {

    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//    String n = "Hello12345World";

        select(str);
    }

    public static void select (String str){
        int numCount = 0;
        int letterCount = 0;
        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
               numCount ++;
           }
           if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')||
                str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
               letterCount ++;
           }
        }
        System.out.println("数字数量" + numCount);
        System.out.println("字母数量" + letterCount);
    }
}
