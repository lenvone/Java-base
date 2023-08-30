package com.adam.base.string;

public class Demo07 {
        public static void main(String[] args) {
        /*
            包装类
                自动装箱操作是通过 包装类.valueOf 进行的
                自动拆箱操作是通过 包装类对象.xxxValue() 进行
            包装类结构
         */

            Integer a = 1;
            int b = a;
//        Integer n = Integer.valueOf(1);
//        Integer num = new Integer(1);
//        Integer num1 = new Integer("12");

            Integer num = 100;//  Integer.valueOf(100)
            Integer num1 = 100; // Integer.valueOf(100)

            System.out.println(num == num1);

            num = 200; // new Integer()
            num1 = 200; // new Integer();
            System.out.println(num == num1);

            // Byte  Short Character(0~127)  Integer Long 都有缓存对象数组
            Character c = '(';

            System.out.println(Character.isMirrored('['));



        }

}
