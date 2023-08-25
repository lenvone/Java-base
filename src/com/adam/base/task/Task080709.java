package com.adam.base.task;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080709 {
    public static void main(String[] args) {
    /*
     在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。选手的
最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算
出选手的得分。
     */
        int[] scores = new int[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <6; i++) {
            System.out.println("请依次输入六位个评委的成绩");
            int score = sc.nextInt();
            scores[i] = score;
        }
        int max = scores[0];
        int min = scores[0];
        for (int i = 0;i <scores.length;i ++){
            if(max < scores[i]){
                max = scores[i];
            }
            if (min > scores[i]){
                min = scores[i];
            }
        }
        double sum = 0;
        double avg = 0;
        for (int i = 0;i<scores.length;i ++){
            sum += scores[i];
        }
        sum = sum -max-min;
        avg = sum /(scores.length - 2);
        System.out.println(avg);
    }


}
