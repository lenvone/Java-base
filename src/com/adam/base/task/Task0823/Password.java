package com.adam.base.task.Task0823;

import java.util.Random;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/23
 *生成密码
 * 随机生成一个 6 位的密码，要求：
 * 不包含重复字符
 * 要有字母和数字
 * 不能以数字开头
 */
public class Password {
    public static void main(String[] args) {
        Random rand = new Random();
        String str = "";

        int n = rand.nextInt(65,122);
        if (n>=65&&n<=90 || n>=97&&n<=122){
            char ch = (char)n;
            str = str+ch;
        }
        outer:for (int i = 0; i < 5; i++) {
            n = rand.nextInt(48,112);
            int[] arr = new int[5];
            for (int j = 0; j < i; j++) {
                if (arr[j]==n){
                    i--;
                    continue outer;
                }
            }
            arr[i]=n;
            if (n>=48 && n<=57 || n>=65&&n<=90 || n>=97&&n<=122){
                char ch = (char)n;
                str = str+ch;
            }else {
                i--;
            }
        }
        System.out.println(str);


    }
}
