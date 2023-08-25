package com.adam.base.task;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/4
 */
public class Task080102 {
    /*
        定义两个整变量，交换两个变量的值。
        通过位运算(异或运算)
        通过加法计算
        定义临时(中间)变量
     */

        public static void main(String[] args){
            Scanner str = new Scanner(System.in);
            int a = 2;
            int b = 7;
		/*  按位异或交换赋值
			a = a^b;
			b = a^b;
			a = a^b;
		*/

		/*  通过加法运算交换赋值
			a = a + b;
			b = a - b;
			a = a - b;
		*/
		//  通过定义临时(中间)变量
		int c = a;
			a = b;
			b = c;

            System.out.println(a);
            System.out.println(b);
        }
    }

