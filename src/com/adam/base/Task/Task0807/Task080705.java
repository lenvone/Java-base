package com.adam.base.Task.Task0807;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080705 {
    public static void main(String[] args) {
      //  有一个数组int[] arr = {9,1,3,4,54,56,23,22,20,43,45,78};
        //  要求打印数组中能被6整除的元素。
        int[] arr = new int[]{9,1,3,4,54,56,23,22,20,43,45,78};

        for (int i = 0;i < arr.length; i ++){
            if (arr[i] % 6 == 0){
                System.out.println(arr[i]);
            }
        }

    }
}
