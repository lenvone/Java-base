package com.adam.base.branch;

import java.util.Arrays;
import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/9
 */
public class array {
    public static void main(String[] args) {
        // 冒泡排序法
     /*   int[] arr = {12,5,8,3,10,15,13};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length-1-i;j ++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
      */
        // 选择排序法
       /* int[] arr = {12,2,7,8,13,15,9,7,3};

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;  // 最小值的下标
            for (int j  = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;   // 索引互换
                }
            }
             // 交换位置
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
        */
        // 插入排序  升序
      /* int[] arr = {8,12,2,7,9,14,15,5,4};

        // 遍历每一个元素
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];        // 设arr[i]为当前值
            int j = i - 1;            // 前一个元素的下标
            while (j >= 0 && arr[j] > current){       // 不知道循环次数，用while
                arr[j + 1] = arr[j];            // 如果前一位大于当前值，则将前一位后移一位
                j --;                    // 下标随着前移的位数减小
            }
            arr[j+1] = current;       // 当前值的位置
        }
        System.out.println(Arrays.toString(arr));
        */
        // 二分查找
        int[] arr = {4,6,8,9,2,5,7};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数：");
        int num = sc.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int index = -1;

        while(left <= right){
            int middle = (left + right) >> 1;
            if (arr[middle] == num){
                index = middle;
                break;
            }else if(arr[middle] > num){
                right = middle - 1;
            }else if (arr[middle] < num){
                left = middle + 1;
            }
        }
        System.out.println(index);
    }
}
