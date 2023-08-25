package com.adam.base.task;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/8
 */
public class Task080804 {
    public static void main(String[] args) {
         /*
        给定一个整数数组，输入一个值 n, 输出数组中第 n 大的数。
        int[] arr = {2, 3, 1, 8, 3, 9, 6};
        输入 n 的值为 4，输出 3
         */
        int[] arr = new int[]{2, 3, 1, 8, 3, 3, 9, 6};

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入n值:");
        int n = sc.nextInt();
        // 输入n值
        // 选择降序
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
        // 输出数组中第 n 大的数
         // 遍历
        for (int i = 0; i < arr.length; i++) {
            if (i == n-1){    //此时n的下标为n-1
                System.out.println(arr[i]);
            }
        }
    }
}
