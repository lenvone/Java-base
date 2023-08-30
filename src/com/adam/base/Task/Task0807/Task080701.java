package com.adam.base.Task.Task0807;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080701 {
    public static void main(String[] args) {
    //    定义一个含有五个元素的数组,并为每个元素赋值,求数组中所有元素的最小值
        // 定义5个元素数组，赋值
        int[] arr = new int[]{3,6,9,5,2,4};
        // 遍历求数组最小值
        int min = arr[0];
        for (int i = 1;i < arr.length;i ++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最小值是：" + min);

    }
}
