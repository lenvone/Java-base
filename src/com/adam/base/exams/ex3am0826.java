package com.adam.base.exams;

import java.util.Random;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/3
 */
public class ex3am0826 {
// 选择6
//class Person{
//    private String name = "Person";
//    int age = 0;
//}
//class Child extends Person{
//    public String grade;
//    public static void main(String[] args){
//        Person p = new Child();
//        System.out.println(p.name);
//    }
//}


    // 选择11
//    public static void main(String[] args) {
//        String s1 = new String("hello");
//        String s2 = s1.intern();
//        String s3 = "hello";
//
//        System.out.println(s1 == s2);
//        System.out.println(s2 == s3);  // true
//        System.out.println(s1 == s3);
//    }

    // 选择12
//    public class Test{
//        public int x;
//
//        public static void main(String[] args) {
//            System.out.println("Value is" + x);
//        }
//    }

    // 选择 17 选项D
//    class A {
//        public A(int a) {
//        }
//    }
//
//    class B extends A {
//    }

class Passward{
    // 随机密码，不重复，字母和数字，不以数字开头
    public static void main(String[] args) {
        Random rand = new Random();
        String str = "";

        int n = rand.nextInt(65,122);
        if (n >= 65 && n <= 90 || n >= 97&& n<= 122){
            char ch = (char)n;
            str = str + ch;
        }
        outer:for (int i = 0; i < 5; i ++) {
            n = rand.nextInt(48,112);
            int[] arr = new int[5];
            for (int j = 0; j < i; j++) {
                if (arr[j] == n){
                    i --;
                    continue outer;
                }
            }

            arr[i] = n;
            if (n >= 48 && n <= 57 || n >= 65 && n <= 90 || n >= 97 && n<= 122){
                char ch = (char)n;
                str = str + ch;
            }else {
                i --;
            }
        }
        System.out.println(str);


    }
}


}
//    // 选择 23
    class Base{
        Base(){
            System.out.println("Base");
        }
    }
     class Alpha extends Base {
        public static void main(String[] args) {
            new Alpha();
            new Base();
        }
    }