package com.adam.base.task.Task0823;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/23
 * 判断邮箱
 * 输入一个电子邮箱，判断是否是正确电子邮箱地址。 正确的邮箱地址：
 * 必须包含 @ 字符，不能是开头或结尾
 * 必须以 .com结尾
 * @ 和.com之间必须有其他字符
 */
public class Email {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个邮箱");
        String email = sc.next();

        boolean b = isEmail(email);
        System.out.println(b);
    }

    public static boolean isEmail(String email){
        if (email == null || email.length() == 0) {
            return false;
        }
        int a = email.indexOf("@");
        int b = email.indexOf(".com");

        // @ 不在开头和结尾
        if (email.startsWith("@") || email.endsWith("@")){
            return false;
        }else {
            //  .com 结尾，且@ 和.com之间必须有其他字符
            if (email.endsWith(".com") &&
                    (email.substring( a+ 1, b).length() == 0)){
                return true;
            }
        }
        return true;
    }
}
