package com.adam.base.Task.Task0808;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/8
 */
public class Task080805 {
    public static void main(String[] args) {
        /*
        给定一个整数数组，输入一个值 n, 输出去掉数组中第 n 大的数后的数组。
         */
        int[] arr = new int[]{3, 5, 7, 9, 12, 15, 6};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n值:");
        int n = sc.nextInt();
        // 输入n值
        // 插入降序
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        // 去掉数组中第 n 大的数后的数组
        // 遍历  此时第n大的数的下标为n-1
        for (int i = 0; i < arr.length; i++) {
            if (i != n-1){
                System.out.println(arr[i]);
            }
        }
    }
}
