package com.adam.base.task;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080708 {
    public static void main(String[] args) {
        // 定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。
        // （可以创建其他数组，不必须在原数组中改变）
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int[] arr1 = new int[arr.length];
        int head = 0;
        int tail = arr.length-1;
        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] % 2 == 0) {
                arr1[tail] = arr[i];
                tail --;
            }else{
                arr1[head] = arr[i];
                head ++;
            }
        }

        for (int i : arr1) {
            System.out.println(i);
        }
    }
}
