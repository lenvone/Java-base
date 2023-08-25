package com.adam.base.task.Task0823;

import java.util.Scanner;

public class Repeat {
    /*
    去除重复字符
    编写一个程序，去除字符串中的重复字符
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        String result = repeted(str);
        System.out.println(result);
    }
    private static String repeted(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char b = str.charAt(i);
            // 找到i(下标)所对应的字符
            if (str.indexOf(b) == i ){
                // 找到该字符在原字符串中出现的位置 是否与 第一次出现该字符的位置（下标）相等
                sb.append(b);
                // 相等则把该字符给定义的新字符串sb添加进去，不相等时不进判断
            }
        }
        System.out.println(sb);
        return String.valueOf(sb);

//        char[] arr = str.toCharArray();
//        int tail = 1;
//        for (int i = 0;i< arr.length;i++){
//            int j ;
//            for ( j = 0; j < tail; j++) {
//                if (arr[i] == arr[j]){
//                    break;
//                }
//            }
//            if (j == tail) {
//                arr[tail] = arr[i];
//                tail ++;
//            }
//        }
//        return new String(arr,0,tail);
    }

}