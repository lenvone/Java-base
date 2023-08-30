package com.adam.base.string;

public class Demo02 {

        public static void main(String[] args) {
            String a = "a";
            String b = "b";

            String c = "ab";
            String d = "a" + "b"; // 编译时优化 ab
            String e = a + "b";
            String f = "a" + b;
            String g = a + b;
            String h = new String("ab"); // 1个

            System.out.println(c == d); // true
            System.out.println(c == e); // false
            System.out.println(c == f); // false
            System.out.println(c == g); // false
            System.out.println(c == h); // false

            System.out.println("-------------------");
            System.out.println(d == e); // false
            System.out.println(e == f); // false
            System.out.println(e == g); // false
            System.out.println(f == g); // false

        }

}
