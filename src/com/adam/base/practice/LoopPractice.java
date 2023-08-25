package com.adam.base.practice;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/4
 */
public class LoopPractice {
    public static void main(String[] args) {
        // while
       /* int i = 1,sum = 0;
        while(i <= 100){
            sum += i;
            i ++;
        }
        System.out.println(sum);
        */
        // do ~ while 1~100的和
        /* int i = 1,sum = 0;
         do{
             sum += i;
             i++;
         }while(i <= 100);
        System.out.println(sum);
         */
        // 7的阶乘
        /*
        int i = 1,mul = 1;
        while(i <= 7){
            mul *= i;
            i ++;
        }
        System.out.println(mul);
         */
        // do - while 7的阶乘
        /*int i = 1,mul = 1;
        do{
            mul *= i;
            i ++;
        }while(i <= 7);
        System.out.println(mul);
         */
        // for  1~100奇数和
        /*
        int sum = 1;
        for (int i = 1;i <=100;i ++){
            if(i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
         */
        /*for (int r = 1; r <= 5; r ++){
            for (int k = 1;k <= r; k ++){
                System.out.print("* ");
            }
            System.out.println();
        }
         */
        // 99乘法表   int i = 9;i >=1; i --
        /*for (int i = 1;i <= 9;i ++){
            for (int j = 1; j <= i;j++){
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
         */
        //菱形图
       /* int r = 7;
        for (int i = 1;i <= r;i++){
            for (int j = 1;j<= r - i;j ++){
                System.out.print(" ");
            }
            for (int j = 1;j <= i;j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1;i <= r - 1;i ++){
            for (int j =1; j<= i;j++){
                System.out.print(" ");
            }
            for (int j = 1;j <=r-i;j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        // 树形图
     /*   for (int i = 1;i <= 4;i ++){
            for (int j = 0;j <=5 - i;j++){
                System.out.print("  ");
            }
            for (int j = 2;j <=2*i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 3;i <= 5;i ++){
            for (int j = 0;j <=5 - i;j++){
                System.out.print("  ");
            }
            for (int j = 2;j <=2*i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 4;i <= 6;i ++){
            for (int j = 0;j <=5 - i;j++){
                System.out.print("  ");
            }
            for (int j = 2;j <=2*i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i <=4;i++){
            for (int j =1;j<=7;j++){
                System.out.print(" ");
            }
            for (int j =1;j<=4;j++){
                System.out.print("# ");
            }
            System.out.println();
        }

      */

    }
}
