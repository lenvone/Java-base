package com.adam.base.Task.Task0808;

import java.util.Arrays;
import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/8
 */
public class Task080801 {
    public static void main(String[] args) {
        /*
        一个班级有若干学生，每个学生的成绩以整数表示。请实现一个程序，根据学生的成绩对
        他们进行排名并输出。
        排名 成绩
        1 xxx
        2 xxx
        3 xxx‘
         */
        int[] scores = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("请输入第 %d 位同学的成绩：", i + 1);
            scores[i] = input.nextInt();
        }

        // 遍历数组
       // for (int i = 0; i < scores.length; i++) {
         //   System.out.print(scores[i]);
       // }
        System.out.println();
        System.out.println(Arrays.toString(scores));

        for (int i = 0; i < scores.length; i++) {
            int max = i;
            for (int j = i + 1;j < scores.length;j ++){
                if (scores[j] > scores[max]){
                    max = j;
                }
            }
            int temp = scores[i];
            scores[i] = scores[max];
            scores[max] = temp;
            System.out.println("排名：" + (i + 1)+" " +"成绩："  + scores[i]);
        }

    //    System.out.println(Arrays.toString(scores));
    }
}
