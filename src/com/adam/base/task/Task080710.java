package com.adam.base.task;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080710 {
    public static void main(String[] args) {
         /*
    现有一个int 数组，数组中有十个元素。将数组反转后输出。
     */
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = new int[arr.length];

        int j = 0;
        for (int i = arr.length-1;i >= 0;i--){
            arr1[j] = arr[i];
            j++;
        }
        for (int i = 0;i < arr1.length;i ++){
            System.out.println(arr1[i]);
        }


    }


}
