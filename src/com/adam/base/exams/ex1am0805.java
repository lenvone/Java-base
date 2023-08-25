package com.adam.base.exams;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class ex1am0805 {
    public static void main(String[] args) {
       /* int j = 3;
        int sum = 0;
        outer: for (int i = 0; i < 10;){
            while((i ^ j) == 0){
                j --;
                break outer;
            }
            sum = ++i + j;
        }
        System.out.println(j + " " + sum);
        */
       /*  1~100内的质数和
        int sum = 0;
   FindNum:for (int i = 2;i < 100;i ++){
            for (int j = 2;j < i; j ++){
                if (i % j == 0){
                    continue FindNum;
                }
            }
            sum += i;
        }
        System.out.println(sum);
        */

        // 输出所有的水仙花数
        /*
        for (int i = 100;i <= 999;i ++){
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;
            if (i == a * a * a + b * b * b + c * c * c){
                System.out.println(i);
            }
        }
         */


          //  斐波那契数列     1 1 2 3 5 8 13
        int n = 10;

        int a = 1;
        int b = 1;
        for (int i = 1;i <= 10;i ++){
            if (i <=2){
                System.out.println(a);
            }else {
                int c = a;
                a = b;
                b = c + a;
                System.out.println(b);
            }
        }
    }
}
