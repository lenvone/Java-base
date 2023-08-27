package com.adam.base.task.Task0802;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/2
 */
public class Task080204 {
    public static void main(String[] args) {
        /*
           根据用户输入的月份（1 到 12），输出该月份所属的季节。
           假设春季是 3到 5月，夏季是6到8月，秋季是9到11月，冬季是12、1和2月。
           如果输入的月份超出了范围，输出"输入错误"。
         */
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个数:");
        int season = in.nextInt();

        switch (season){
            case 3,4,5 -> {
                System.out.println("春季");
            }
            case 6,7,8 ->{
                System.out.println("夏季");
            }
            case 9,10,11 ->{
                System.out.println("秋季");
            }
            case 12,1,2 ->{
                System.out.println("冬季");
            }
            default -> System.out.println("输入错误");
        }
    }
}
