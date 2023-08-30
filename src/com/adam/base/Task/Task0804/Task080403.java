package com.adam.base.Task.Task0804;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080403 {
    public static void main(String[] args) {
        /*
        输入一个数字判断是否为回文数
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个数字：");
        String s = scanner.next();
        char[] l = s.toCharArray();

        boolean flag = true;
        for (int i = 0; i < l.length; i++) {
            if(l[i] != l[l.length - i - 1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("是回文数");
        }else {
            System.out.println("不是回文数");
        }
    }

}
