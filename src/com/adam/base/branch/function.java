package com.adam.base.branch;

import java.util.Arrays;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/11
 */
public class function {
    public static void main(String[] args) {

        int[] arr = {5, 8, 3, 9, 2, 12};
    //     arr = sort(arr);
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
//        for (int i = 0; i < arr.length - 1; i++) {
//            int min = i;
//            for (int j = 1; j < arr.length; j++) {
//                if (arr[j] < min){
//                    min = j;
//                }
//                int temp = arr[j];
//                arr[j] = arr[min];
//                arr[min] = temp;
//            }
//        }
        // 插入排序 升序
//        for (int i = 1; i < arr.length; i++) {
//            int current = arr[i];
//            int j = i - 1;
//
//            while(j >= 0 && arr[j] > current){
//                arr[j + 1] = arr[j];
//                j --;
//            }
//            arr[j + 1] = current;
//        }

//        // 二分查找
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入要查找的数");
//
//        int num = sc.nextInt();
//
//        int left = 0;
//        int right = arr.length - 1;
//
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (arr[mid] == num) {
//                System.out.println(mid);
//                break;
//            } else if (arr[mid] < num) {
//                left = mid + 1;
//            } else if (arr[mid] > num) {
//                right = mid - 1;
//            }
//        }

        //  插入
//        int[] arr1 = new int[arr.length + 1];
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入要插入的位置n和值k");
//        int index = sc.nextInt();
//        int k = sc.nextInt();
//
//        for (int i = 0,j = 0; i < arr.length + 1; i ++,j ++) {
//            if (i == index){
//                arr1[index] = k;
//                j --;
//            }else {
//                arr1[i] = arr[j];
//            }
//        }
//        return arr1;

    }
}

