package com.adam.base.exams;

import java.util.Arrays;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/14
 */
public class ex2am0812_03 {
    public static int[] insert(int[] arr,int index,int num){
        /*
        给定一个数组，请根据输入在数组的指定位置插入指定的值
         */
        int[] arr1 = new int[arr.length - 1];
        System.arraycopy(arr,0,arr1,0,index - 1);
        System.arraycopy(arr,index + 1,arr1,index,arr.length - index - 1);
        return arr1;
//        int[] arr1 = new int[arr.length + 1];
//        System.arraycopy(arr,0,arr1,0,index);
//        arr1[index] = num;
//        System.arraycopy(arr,index,arr1,index + 1,arr.length - index);
//        return arr1;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7};
        int index = 1;
        int num = 2;
        int[] arr1 = insert(arr,index,num);
        System.out.println(Arrays.toString(arr1));
    }
}
