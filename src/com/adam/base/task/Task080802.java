package com.adam.base.task;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/8
 */
public class Task080802 {
    public static void main(String[] args) {
        /*
       给定一个整数数组，输入一个值 n ，输出 n 在数组中的下标(如果不存在输出 -1 )
        如：int[] arr = {3, 2, 1, 4, 5}; 1
        1. 输入： 3  输出： 0    2. 输入： 6  输出： -1
         */
        int[] arr = new int[]{3, 2, 1, 4, 5};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n值:");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println("下标是" + i);
                break;
            }
            if (i == arr.length-1) {   // 插入时原有的下标加一，为了不跳过原来的i+1处的数所以要减一
                // 下标不存在
                System.out.println(-1);
            }
        }
    }
}

