package com.adam.base.exams;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/14
 */
public class ex2am0812_01 {
    public static void sort(int[][] scores,String[] names){
         /*
    有 5 位同学的姓名存储在一个一维数组 names 中，他们的三科（数学，语文，英语）
        成绩，存储在一个二维数组 scores 中，请根据语文成绩降序排名并输出每个人及其各科
        成绩。
     */
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1- i; j++) {
                if (scores[j][1] < scores[j + 1][1]){
                    int[] temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;

                    String name = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = name;
                }
            }
        }
    }
    public static void input(int[][] scores,String[] names){
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ":");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] scores = {
                {2,3,4},
                {5,6,7},
                {8,9,1},
                {5,7,9},
                {3,6,9}
        };
        String[] names = {"A","B","C","D","E"};
        sort(scores,names);
        input(scores,names);
    }

}
