package com.adam.base.Task.Task0808;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/8
 */
public class Task080807 {
    public static void main(String[] args) {
        /*
        给定两个各不包含重复元素的数组 arr 和 arr1 ，求 arr 和 arr1 的交集(在 arr 中有，arr1 中也包含的元素集合)，将交集中的元素放到一个数组中并输出。
        int[] arr = {1, 2, 3};     int[] arr1 = {2, 3};
        输出: [2, 3]
         */
        int[] arr = {7,1,2,3};
        int[] arr1 = {2,7,3};

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr1.length;j++){
                if (arr[i] == arr1[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
