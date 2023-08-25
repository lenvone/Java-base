package com.adam.base.branch;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/2
 */
public class Loop {
    public static void main(String[] args) {
        /*
            if(boolean 代码块){
                //代码块
           }当Boolean表达式结果为true时执行代码块，否则代码不会被执行
         */
        // 创建一个Scanner对象
        Scanner sc = new Scanner(System.in);
        // 获取输入
      /* System.out.println("请输入年龄");
        int age = sc.nextInt();

        //判断是否成年
        if(age >= 18){
            System.out.println("成年人");
        }
        System.out.println("end");
       */
        /* System.out.println("请输入考试成绩");
        int score = sc.nextInt();
        if(score >= 60){
            System.out.println("考试通过");
        }else{
            System.out.println("下次努力");
        }
        */
        System.out.println("请输入年份：");
        int year = sc.nextInt();
         /*
            闰年，判断输入的年份是否是闰年
            条件：
              四年一润，百年不闰。四百年再闰
              (每四年是一个闰年，但是遇到一百年就不是闰年了
              每四百年是一个闰年)
         */
       /* if (year % 4 ==0){
            if (year % 100 == 0){
                if (year % 4 == 0){
                    System.out.println("是闰年");
                }else{
                    System.out.println("不是闰年");
                }
            }else{
                System.out.println("是闰年");
            }
        }else{
            System.out.println("不是闰年");
        }
        */

        if ((year % 4 == 0 && year % 100 !=0) || year % 400 ==0){
            System.out.println("是闰年");
        }else{
            System.out.println("不是闰年");
        }
    }
}
