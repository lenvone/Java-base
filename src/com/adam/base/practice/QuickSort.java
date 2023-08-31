package com.adam.base.practice;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/3
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,1,6,9,3};
        drom(arr,0,arr.length - 1);
    }

    public static void drom(int[] arr,int start,int end) {

        if (start > end) {
            return;
        }

        int base = arr[start];
        int left = start;
        int right = end;

        while(left < right){

            while(left < right && arr[right] >= base) {
                right--;
            }
            while(left < right && arr[left] <= base) {
                left++;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
        arr[start] = arr[left];
        arr[left] = base;

        drom(arr,start,left - 1);
        drom(arr,left + 1,end);

    }

}

