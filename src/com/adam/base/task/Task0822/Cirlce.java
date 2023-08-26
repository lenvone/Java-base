package com.adam.base.task.Task0822;

public class Cirlce {
    /*
    判断字符串是否为回文数字
     */

    public static void main(String[] args) {
        String str = "abcba";

        boolean flag = isReverse(str);
        System.out.println(flag);

    }

    private static boolean isReverse(String str) {
        String s = "";

        for (int i = str.length() - 1; i >= 0 ; i--) {
            char ch = str.charAt(i);
            s += ch;
        }

        System.out.println(s);
        return s.equals(str);
    }
}
