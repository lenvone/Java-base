package com.adam.base.task;
public class Task080902 {
    public static void main(String[] args) {
        String[] names = {"安琪拉", "王昭君", "蔡文姬", "妲己", "张良"};
        String[] courses = {"C++", "Java", "Python"};
        int[][] scores = {
                {90, 89, 75},
                {59, 40, 100},
                {100, 99, 80},
                {80, 61, 61},
                {60, 100, 99}
        };

        for( int i = 0 ; i < scores.length ; i++ ){
            System.out.print( names[ i ] + " => " ); // 输出学生姓名
            for( int j = 0 ; j < scores[ i ] .length ; j++ ){
                System.out.print( courses[ j ] + ":");// 输出课程名称
                System.out.print( scores[ i ][ j ] ); // 输出课程成绩
                if( j < scores[ i ] .length - 1 ) {
                    System.out.print( " , " );
                }
            }
            System.out.println();
        }

        // 1. 按照各个学生的 Java 成绩进行排序（降序）
        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - i - 1; j++) {
                if (scores[j][1] < scores[j + 1][1]) {
                    // 交换学生姓名
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    // 交换学生成绩
                    int[] tempScores = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScores;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " => " + courses[1] + ": " + scores[i][1]);
        }
        System.out.println();

        // 2. 根据学生总成绩进行排序（降序排列）
       int[] sumScore = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            sumScore[i] = sum;
        }

        // 对总分数组排序
        int[] sumArr = new int[scores.length];

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            sumArr[i] = sum;
        }

        // 选择排序(降序)
        for (int i = 0; i < scores.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < scores.length; j++) {
                if (sumArr[j] > sumArr[max]) {
                    max = j;
                }
            }
            // 交换总成绩
            int temp = sumArr[i];
            sumArr[i] = sumArr[max];
            sumArr[max] = temp;

            //
            String n = names[i];
            names[i] = names[max];
            names[max] = n;

            int[] s = scores[i];
            scores[i] = scores[max];
            scores[max] = s;
        }


        // 输出每个人的各科成绩  安琪拉： c++=90  java=89   python=75
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + ": ");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(courses[j] + "=" + scores[i][j] + "\t");
            }
            System.out.println(sumArr[i]);
            System.out.println();
        }






     /*   int[] totalScores = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            int totalScore = 0;
            for (int j = 0; j < courses.length; j++) {
                totalScore += scores[i][j];
            }
            totalScores[i] = totalScore;
        }

        for (int i = 0; i < totalScores.length - 1; i++) {
            for (int j = 0; j < totalScores.length - i - 1; j++) {
                if (totalScores[j] < totalScores[j + 1]) {
                    // 交换学生姓名
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;

                    // 交换学生成绩
                    int[] tempScores = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = tempScores;

                    // 交换总成绩
                    int tempTotalScore = totalScores[j];
                    totalScores[j] = totalScores[j + 1];
                    totalScores[j + 1] = tempTotalScore;
                }
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " =>");
            for (int j = 0; j < courses.length; j++) {
                System.out.println(courses[j] + ": " + scores[i][j]);
            }
            System.out.println("总成绩: " + totalScores[i]);
            System.out.println();
        }

        */
    }
}