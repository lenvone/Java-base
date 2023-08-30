package com.adam.base.Task.Task0804;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080402 {
    public static void main(String[] args) {
        /*
        李四每天跑步
        第一周周一跑 100 米，周二到周天每天比前一天多 100 米。
        往后每周以比前一周周一多 100 米。
        请问李四 n（控制台输入） 天后跑了多少米
         */
        Scanner input = new Scanner(System.in);
        System.out.println("请输入天数：");
        int n = input.nextInt();
        int sum1=0;
        int sum2=0;
        int sum=0;
        int step1=0;
        int step2=0;
        for (int i=1;i<=n;i++){
            if (i % 7!= 0) {
                step1 = (i / 7) * 100 + (i % 7) * 100;
                sum1 += step1;
            }
            if (i % 7==0){
                step2 = (i/7-1)*100+700;
                sum2 += step2;
            }
            sum = sum1 + sum2;
        }
        System.out.println("李四"+n+"天跑了"+sum+"米");
    }

}
