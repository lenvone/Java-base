package com.adam.base.task.Task0822;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/23
 */
public class circle {
    public static void main(String[] args) {
        String str = "abcba";
        String str1 = "上海自来水来自海上";

        System.out.println(isdrome(str));
        System.out.println(isdrome(str1));
    }
    public static Boolean isdrome(String str){
        int left = 0;
        int right = str.length() - 1;

        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }

}
