package com.adam.base.task.Task0823;

import java.util.Arrays;
import java.util.Random;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/23
 * 生成幸运数字
 * 随机生成 20 个 1 ~ 40 之间的不重复幸运数字存储到数组中。 要求：
 * 数组中的数字乱序
 */
public class LuckNum {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[20];

        outer:for (int i = 0; i <arr.length; i++) {
            int num = rand.nextInt(40)+ 1;
            for (int j = 0;j < i;j++){
                if (num == arr[j]){
                    i--;
                    continue outer;
                }
            }
            arr[i] = num;
        }
//        Collections.shuffle(Collections.singletonList(arr));
        System.out.println(Arrays.toString(arr));
    }

}
