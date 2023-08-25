package com.adam.base.branch;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/14
 */
public class function2 {
    /*
    二分查找
     */
    public static int invoke(int[] arr,int key) {
        int left = 0;
        int right = arr.length - 1;

        int index = invoke(arr,key,left,right);
        return index;
    }
    public static int invoke(int[] arr,int key,int left, int right){
        if (left > right){
            return -1;
        }
        int middle = (left + right) / 2;
        if (arr[middle] == key){
            return middle;
        } else if (arr[middle] > key) {
            right = middle - 1;
        } else if (arr[middle] < key) {
            left = middle + 1;
        }
        return invoke(arr,key,left,right);
    }
    public static int mul(int num){
        // 5 的阶乘
        if (num == 1){
            return 1;
        }
        return num = num * mul(num - 1);
    }

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7};
//        int key = 3;
//        int index = invoke(arr,key);
//        System.out.println(index);
//
        int num = 5;
        int result = mul(num);
        System.out.println(result);
    }

}
