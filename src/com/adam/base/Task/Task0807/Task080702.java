package com.adam.base.Task.Task0807;

import java.util.Random;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080702 {
    public static void main(String[] args) {
        /*
        创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包
含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
         */
        int[] arr = new int[6];
        Random rand = new Random();

        for (int i = 0;i < arr.length;i ++ ){
            arr[i] = rand.nextInt(100)+1;
        }
        for (int i = 0;i < arr.length;i ++){
            System.out.println(arr[i]);
        }

    }
}
