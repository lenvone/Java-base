package com.adam.base.task;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/2
 */
public class Task080206 {
    public static void main(String[] args) {
        /*
        编写一个程序，根据员工的工龄来计算年终奖金。
        奖金计算规则如下：工龄小于等于5年，奖金为工资的5%
                      工龄大于5年且小于等于10年，奖金为工资的10%
                      工龄大于10年，奖金为工资的15%
                      (工资和工龄输入)
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入工龄");
        int years = sc.nextInt();

        System.out.println("请输入工资");
        float sal = sc.nextFloat();

        float bonuses = 0;
        if (years <= 5){
             bonuses = sal + (sal * 0.05f);
        }else if (years > 5 & years <= 10){
             bonuses = sal + (sal * 0.10f);
        }else if (years > 10){
             bonuses = sal + (sal * 0.15f);
        }
        System.out.printf("工资为: %f", bonuses);
    }
}
