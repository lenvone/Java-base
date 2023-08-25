package com.adam.base.practice;

import java.util.Arrays;

public class array {

    public static void main(String[] args) {
        /*
        给定一个整数数组，编写一个程序，移除数组中的重复元素，输出一个去重后的数组。
         */

/*
        int[] arr = {1, 2, 3, 2, 5, 4, 1, 0};
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
 */
         /*
          System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            src: 源数组，被复制的数组
            srcPos： 源数组的起始位置，从这一位开始复制
            dest： 目标数组
            destPos： 目标数组的位置
            length： 复制多少元素, 不能比 src.length 大

            从 src 数组的 srcPos 位置开始复制 length 个元素到 dest 数组的 destPos
         */
         /*
            给 arr 数组的第 3 位添加元素 6
         */
        int[] arr = {1,2,3,4,5};

        int[] arr1 = new int[arr.length + 1];
        int index = 2;
        System.arraycopy(arr,0, arr1,0,index);
        arr1[2] = 6;
        System.arraycopy(arr,2,arr1,3,arr.length - index);

        System.out.println(Arrays.toString(arr1));
    }
}
