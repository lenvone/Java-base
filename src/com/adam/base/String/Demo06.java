package com.adam.base.String;

public class Demo06 {

        public static void main(String[] args) {
        /*
               valueOf() 类方法，有很多重载方法。涵盖了所有的数据类型转换 字符串的方法；

               字符串 <---> 基本数据类型
         */
            // 任意类型转换为字符串
            byte b = 1;
            String str = String.valueOf(b);
            String.valueOf(true);
            String.valueOf(1.1);

            // int <---> String

            // 字符串 --> int  包装类.valueOf
            Integer a = Integer.valueOf("11");
            Integer.parseInt("11");
            System.out.println(a);
            // int  --> 字符串  String.valueOf()
            String s = String.valueOf(a);


        }

}
