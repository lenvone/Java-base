package com.adam.base.task;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/1
 */
public class Task080101 {

    /*
    **1.** 通过控制台输入一个 **4** 位整数，输出是否是四叶玫瑰数。（是 输出 true，不是 输出false**)**
    水仙花数指一个 3 位数，它的每个位上的数字的 3次幂之和等于它本身
    四叶玫瑰数指一个 4 位数，它的每个位上的数字的 4 次幂之和等于它本身
     */
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            //	System.out.println("请输入三位数字");
            System.out.println("请输入四位数字");
            int num = in.nextInt();
            int tho = num /1000; // 千分位数
            int hun = num / 100 % 10; //百分位数
            int ten = num / 10 % 10; //十分位数
            int one = num % 10;//个位数

            //	System.out.println(num == (hun*hun*hun*hun+ ten*ten*ten*ten + one*one*one*one));
            System.out.println(num == (tho*tho*tho*tho + hun*hun*hun*hun
                                    + ten*ten*ten*ten + one*one*one*one));
        }
    }

