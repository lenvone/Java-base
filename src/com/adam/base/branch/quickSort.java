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
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int[] arr,int start,int end){
        if (start > end){
            return;
        }

        // 基准值
        int base = arr[start];
        int left = start;
        int right = end;

        // 递归结束条件
        while(left < right){

            while(left < right && arr[right] >= base){
                right --;
            }
            while (left < right && arr[left] <= base){
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
        quickSort(arr,start,left - 1);
        // 对右边的元素进行快排
        quickSort(arr,left + 1,end);
    }

    public static void main(String[] args) {
        int[] arr = {2,6,4,8,9,5,1,7};

        quickSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
