package com.adam.base.task;

import java.util.Random;
import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080704 {
    public static void main(String[] args) {
      /*
        a. 定义一个长度为5的int型数组arr，提示用户输入5个1-60之间的数字作为数组元素
        b. 生成2-10（范围包含2和10）之间的随机数num
        c. 遍历数组arr,筛选出数组中不是num倍数的元素并输出
       */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        Random rand = new Random();
        int num = rand.nextInt(9)+2;

        System.out.println(num);

        for (int i = 0;i <arr.length;i ++ ) {
            System.out.println("请输入5个1-60之间的数：");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <arr.length;i ++){
            if (arr[i] % num != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
