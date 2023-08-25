package com.adam.base.practice;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/4
 */
public class MathSymbol {
    // 算术运算符
    public static void main(String[] args) {
      /*  // 逻辑与与短路与
        int x = 4;
        int y = 5;
       */
      /*  System.out.println("逻辑与");
        boolean b1 = (x++ == 3) & (y++ == 4);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("b1");
       */
        /*
        System.out.println("短路与");
        boolean b2 = (x++ == 3) && (y++ == 4);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        */

        // 输入一个四位整数，求得各位数之和
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个四位整数:");
        int num = sc.nextInt();
        // 分解
        int a = num / 1000;  //获得千分位
        int b = num / 100 % 10; // 获得百分位
        int c = num / 10 % 10;  // 获得十分位
        int d = num % 10;   // 获得个位
        // 输出
        int k = a + b + c + d;
        System.out.println(k);
    }
}
