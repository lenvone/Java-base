package com.adam.base.Task.Task0801;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/4
 */
public class Task080103 {
    /*
     通过用户输入三个数(三条边长)，判断是否能够组成一个三角形。（是 输出 true，不是 输出false**)**
     构成三角形的三条边满足：任意两边之和大于第三边
     */

        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入边长A");
            int A = input.nextInt();
            System.out.println("请输入边长B");
            int B = input.nextInt();
            System.out.println("请输入边长C");
            int C = input.nextInt();
            input.close();

            System.out.println(A + B > C && A + C > B && C + B > A );
        }

    }

