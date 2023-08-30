package com.adam.base.Task.Task0807;

import java.util.Random;
import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080706 {
    public static void main(String[] args) {
        // 定义一个长度为20的数组，元素为20-40的随机数
        // 要求判断指定元素在数组中出现的次数，指定元素为键盘录入范围为20-40之间。

        Random rand = new Random();
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个在20-40之间的数：");
        int a = sc.nextInt();

        int count = 0;
        for (int i = 0;i < arr.length;i ++){

            arr[i] = rand.nextInt(21)+20;
            System.out.println(arr[i]);
            if (a == arr[i]){
                count ++;
            }
        }
        System.out.println(count);
    }
}
