package com.adam.base.Task.Task0824;

public class MaxLengthPrefix {
    /*
    最长公共前缀
    编写一个函数来查找字符串数组中的最长公共前缀。
    如果不存在公共前缀，返回空字符串 "" 。
    输入：strs = ["flower","flow","flight"]
    输出："fl"
    输入：strs = ["dog","racecar","car"]
    输出：""
    解释：输入不存在公共前缀。
     */
    public static void main(String[] args) {
        String[] strs = {"flowera","flowa","flighta"};

        String max = maxLengthPrefix(strs);
        System.out.println(max);


    }
    private static String maxLengthPrefix(String[] strs) {
        if (strs==null || strs.length == 0){
            return "";
        }
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            // 第一位提出来后从第二位开始遍历
            while (strs[i].indexOf(s) != 0){
                // 遍历strs每一位时，
                s = s.substring(0,s.length() - 1);
                if (s.isEmpty()){
                    return "";
                }

            }
        }
        return s;
    }
}
