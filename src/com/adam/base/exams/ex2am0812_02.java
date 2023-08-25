package com.adam.base.exams;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/14
 */
public class ex2am0812_02 {
    public static int find(int[] arr,int num){
        /*
        从键盘输入一个数字，设计一个方法通过二分查找返回其位置（不存在返回-1）
         */
        int left = 0;
        int right = arr.length - 1;


        while(left <= right){
            int middle = (left + right) / 2;
            if (arr[middle] == num){
                return middle;
            } else if (arr[middle] > num) {
                right = middle - 1;
            }else{
                left = middle + 1;
            }
        }
        return -1;
    }

    public static int input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数：");
        int num = sc.nextInt();

        return num;
    }
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7,8};
        int n = input();
        int index = find(arr,n);
        System.out.println(index);
    }


}
