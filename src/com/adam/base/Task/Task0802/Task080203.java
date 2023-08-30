package com.adam.base.Task.Task0802;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/2
 */
public class Task080203 {
    public static void main(String[] args) {
        /*
            编写一个简单的计算器程序，要求用户输入两个数和操作符（+、-、*、/）
            根据操作符进行相应的运算，并输出结果。
            如果输入的运算符不是有效的运算符，则输出"无效的运算符"。
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数，以空格分隔：");
        int num = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("请输入操作符(+、-、*、/)");
        String n = sc.next();

        switch (n){
            case "+" -> {
                int result = num + num2;
                System.out.printf("两数之和为: %d \n", result);
            }
            case "-" -> {
                int result = num - num2;
                System.out.printf("两数之差为: %d \n", result);
            }
            case "*" ->{
                int result = num * num2;
                System.out.printf("两数之积为: %d \n", result);
            }
            case "/" ->{
                int result = num / num2;
                System.out.printf("两数之商为: %d \n", result);
            }
            default -> System.out.println("输入错误");
        }
    }
}
