package com.adam.base.task;

import java.util.Arrays;
import java.util.Random;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080707 {
    public static void main(String[] args) {
        /*
        有一个整数数组，数组中的每个元素都是[0-9]之间的数字，从数组的最大索引位开始到最小索引位置，
        依次表示整数的个位、十位、百位。。。依次类推。请编写程序计算，这个数组所表示的整数值。
        数组：{2, 1, 3, 5, 4}
        表示的整数为：21354 // 注：是整数类型的两万一千三百五十四，不是字符串拼起来的。
         */

        Random rand = new Random(10);
        int arr[] =new int[5];

        int sum = 0;
        for (int i = 0;i < arr.length;i ++) {
            arr[i] = rand.nextInt(10);

        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length-1) {
                sum += arr[i];
                sum *= 10;
            }else{
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
