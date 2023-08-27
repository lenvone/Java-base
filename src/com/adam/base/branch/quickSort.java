package com.adam.base.branch;

import java.util.Arrays;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/15
 */
public class quickSort {

    public static void main(String[] args) {
        /*
        https://blog.csdn.net/shujuelin/article/details/82423852
         */
        int[] arr = {6, 1, 2, 7, 9, 11, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end){
        // 递归结束条件
        if (start >= end){
            return;
        }

        int base = arr[start];
        int left = start;
        int right = end;

        while(left < right){

            while (left < right && arr[right] >= base){
                right --;
            }
            while(left < right && arr[left] <= base){
                left ++;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }

        // 交换基准值的位置
        arr[start] = arr[left];
        arr[left] = base;

        // 对左边元素进行快排
        quickSort(arr, start, left - 1);
        // 对右边元素进行快排
        quickSort(arr, left + 1, end);
    }

}
