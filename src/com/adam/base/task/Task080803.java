package com.adam.base.task;

import java.util.Arrays;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/8
 */
public class Task080803 {
    public static void main(String[] args) {
       /*\
        给定一个整数数组，编写一个程序，移除数组中的重复元素，输出一个去重后的数组。
        */
        int[] arr = new int[]{2,5,7,9,6,2,4,2,8,4};

    /*    int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1;j < len; j ++){
                if(i != j && arr[i] == arr[j]) {
                    arr[j] = arr[len - 1];
                    len--;     // 每次去重，长度减一
                    j--;
                }
            }
        }
        int[] arr1 = new int[len];
        for (int i = 0; i < len;i ++){
            if (arr[i] != 0){
                arr1[i] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr1));
     */
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[arr.length];
        int count = 0;

        old: for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < count; j++) {
                if (arr[i] == arr1[j]){
                    continue old;
                }
            }
            arr1[count] = arr[i];
            count ++;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(arr1[i]);
        }
    }
}
