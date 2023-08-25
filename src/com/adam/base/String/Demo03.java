package com.adam.base.String;

public class Demo03 {

        public static void main(String[] args) {
            // 空串 != null
            String str = ""; // 空串
            String s = null;

            System.out.println(str.length()); // 0
            System.out.println(str);
//        System.out.println(s.length()); // NullPointerException

            str.isEmpty(); // length == 0
            System.out.println(str.isEmpty()); // true
            str = "\t";
            System.out.println(str.length()); // 1
            System.out.println(str.isEmpty());// false
            str = "";
            System.out.println(str.isBlank()); // true
            str = "\t";
            System.out.println(str.length()); // 1
            System.out.println(str.isBlank());// true

            str = " \t   hello  word    \t";
            System.out.println(str.length()); // 21
            // 去除两端空格返回新的字符串
//        str = str.trim();
            str = str.strip();

            // 去除前边的空白
//        str = str.stripLeading();
            // 去除后边的空白
//        str = str.stripTrailing();
            // 去除缩进
//        str = str.stripIndent();
            System.out.println(str.length());// 11
            System.out.println(str);

            // 随机访问
            str = "hello world";
            // 获取指定字符
            char c = str.charAt(0);
            System.out.println(c);

            // 子串
            // [beginIndex ~)
            String sub = str.substring(5);
            // [beginIndex, endIndex)
            sub = str.substring(3, 10);
            System.out.println(sub); // lo worl

            // 比较字符串  0  小于0 大于0
            String a = "Abc";
            String b = "abc";

            System.out.println(a.compareTo(b)); // -32
            // 忽略大小写
            System.out.println(a.compareToIgnoreCase(b)); // 0


        }


}
