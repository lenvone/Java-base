package com.adam.base.task.Task0823;

import java.util.Scanner;

/**
 * 最长子串:
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 * 输入： "abefge"  输出： 5
 * abcabcd  --> 4
 * abaca    --> 3
 * aaaaa    --> 1
 * abbbbc   --> 2
 */
public class MaxLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        String result = maxLength(str);
        System.out.println(result);
    }

    private static String maxLength(String str) {
        int[] arr = new int[200];
        int max = 0;

        for (int i = 0,j = 0 ; j < str.length(); j++) {
            char c = str.charAt(j);

            i = Math.max(arr[c],i);

                max = Math.max(max,j - i +1);

                arr[c] = j + 1;
        }
        return String.valueOf(max);
    }

}
