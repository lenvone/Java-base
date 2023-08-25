package com.adam.base.task;

import java.util.Arrays;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/9
 */
public class Task080903 {
    public static void main(String[] args) {
        // 编写一个程序，生成一个给定行数的杨辉三角
//        1
//        1 1
//        1 2 1
//        1 3 3 1
//        1 4 6 4 1
//        1 5 10 10 5 1
      /*  Scanner scanner = new Scanner(System.in);
                System.out.print("请输入杨辉三角形的行数：");
                int n = scanner.nextInt();

                // 定义一个二维数组
                int[][] yanghui = new int[n][n];

                // 给第一列和最后一列赋值为1
                for (int i = 0; i < n; i++) {
                    yanghui[i][0] = 1;
                    yanghui[i][i] = 1;
                }

                // 按照规律给其他元素赋值
                for (int i = 2; i < n; i++) {
                    for (int j = 1; j < i; j++) {
                        yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
                    }

                }

                // 遍历二维数组并打印
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print(yanghui[i][j] + " ");
                    }
                    System.out.println();
                }
       */
        /*int[][] nums = new int[6][];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[i + 1];
            for (int j = 0; j < nums[i].length; j++) {
                if (j == 0 || j == nums[i].length - 1) {
                    // 第一个和最后一个
                    nums[i][j] = 1;
                } else {
                    nums[i][j] = nums[i - 1][j] + nums[i - 1][j - 1];
                }
            }
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
         */
        int[][] nums = new int[6][];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = new int[i + 1];
            Arrays.fill(nums[i], 1); // 每一个元素都是 1
            // j = 1 每行的第一个元素跳过, j < nums[i].length - 1 跳过最后一个  i > 1 跳过前两行
            for (int j = 1; i > 1 && j < nums[i].length - 1; j++) {
                nums[i][j] = nums[i - 1][j] + nums[i - 1][j - 1];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(Arrays.toString(nums[i]));
        }
    }
}



