package com.adam.base.task;

import java.util.Arrays;
import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/8
 */
public class Task080806 {
    public static void main(String[] args) {
        /*
        给定一个整数数组，输入位置n和值k。将值k插入到数组的第n位并输出新数组的每一个元素。
        int[] arr = {2, 3, 1, 8, 3, 9, 6}; 1
        输入 n 为 3 , k 为 10 ，新数组为 [2, 3, 10, 1, 8, 3, 9, 6]
         */
        int[] arr = new int[]{2, 3, 1, 8, 3, 9, 6};
        // 接受插入值的索引
        int[] arr1 = new int[arr.length+1];

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入位置n和k:");
        int index = sc.nextInt();
        int k = sc.nextInt();

        if(index >= 0 && index <= arr.length) {
            for (int i = 0, j = 0; i < arr.length + 1; i++, j++) {
                if (i == index) {
                    arr1[index] = k;   // 如果位置n和下标相等，则将k值赋给arr1[n],arr[i]后移一位后再赋给arr1
                    j--;
                } else {
                    arr1[i] = arr[j];  // i不等于n时，则将j的值赋给新数组
                }
            }
            System.out.println(Arrays.toString(arr1));
        }
    }
}
