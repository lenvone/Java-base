package com.adam.base.Task;

import java.util.Arrays;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/11
 */
public class Task081101_07 {
    /*
    1.设计一个方法，用于计算整数的和
     */
//    public static int Math(int[] num) {
//        int sum = 0;
//        for (int i = 0; i < num.length; i++) {
//            sum += num[i];
//        }
//        return sum;
//    }

    /*
    2.编写一个方法，接受一个正整数作为参数，并返回它的阶乘
     */
//    public static int Math(int num){
//        int mul = 1;
//        int i = 2;
//        do{
//            mul *= i;
//            i ++;
//        }while (i <= num);
//        return mul;
//    }

    /*
    3.编写一个方法，接受一个整数作为参数，并判断它是否为素数（质数）
     */
//    public static boolean prinum(int num){
//        for (int i = 2; i < num; i++) {
//                if (num % i == 0) {
//                     return false;
//                }
//        }
//        return true;
//    }

    /*
    4.编写一个方法，接受一个字符数组，将其翻转并输出。
     */
//    public static int[][] Arrays(int[][] arr){
////        int[][] arr = new int[][]{
////                {1,2,3},
////                {4,5,6},
////                {7,8,9}
////        };
//        for (int j = 0; j < arr.length; j++) {
//            for (int i = arr[0].length - 1;i >=0; i--) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }
//        return arr;
//
//    }

    /*
    5.编写一个方法，接受一个整数作为参数，判断它是否为回文数（正着读和倒着读都一样)
     */

//    public static boolean drome(int num) {
//        int num1 = 0;
//        if (num < 0 || (num % 10 == 0 && num != 0)) {
//            return false;
//        }
    //
//            while (num1 < num) {
//                num1 = num1 * 10 + num % 10;
//                num = num / 10;
//            }
//            return num == num1 || num == num1 / 10;
//        }

    /*
    6.编写一个方法，接受一个整数数组和两个索引作为参数，交换数组中指定索引位置的两个元素。
     */
//    public static void index(int[] arr,int index1,int index2){
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }

    /*
    7.数组元素左移
    编写一个方法，接受一个整数数组和一个正整数 k 作为参数，将数组中的元素左移 k 个位置。
     */
    public static void moveleft(int[] arr,int k){
//    public static int[] moveleft(int[] arr,int k){

        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {  // 左移k个位置
            int newIndex = (i + n - k) % 2;
            temp[newIndex] =arr[i];
        }
        for (int i = 0; i < n; i++) {  // 左移后的元素赋值回原数组
            arr[i] = temp[i];
        }
//        int[] arr1 = new int[arr.length];
//        System.arraycopy(arr,k,arr1,0,arr.length - k);
//        System.arraycopy(arr,0,arr1,arr.length - k,k);
//        return arr1;
    }

    public static void main(String[] args) {
        // 1.
//        int[] nums = {2,3,4,1};
//        int sum = Math(nums);
//        System.out.println(sum);

//        // 2.
//        int num = 5;
//        int mul = Math(num);
//        System.out.println(mul);

         //3.
//        int num = 16;
//        boolean a = prinum(num);
//        System.out.println(num+ "is" + a);

        // 4.
//        int[][] arr = new int[][]{
//                {19,18,17},
//                {16,15,14},
//                {13,18,17}km,
//        };
//        Arrays(arr);

        // 5.
//        int num = 12121;
//        drome(num);
//        System.out.println(num + " is " + drome(num));
//

        // 6.
//        int[] arr = {2,3,4,5,6};
//        System.out.println(Arrays.toString(arr));
//        index(arr,2,7);
//        System.out.println(Arrays.toString(arr));

        // 7 .
        int[] arr = {1,2,3,4,5};
        moveleft(arr,3);
        System.out.println(Arrays.toString(arr));

//        int[] arr = {1,2,3,4,5};
//        arr = moveleft(arr,3);
//        System.out.println(Arrays.toString(arr));
    }
}
