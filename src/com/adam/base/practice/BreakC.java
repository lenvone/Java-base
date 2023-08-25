package com.adam.base.practice;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/5
 */
public class BreakC {
    public static void main(String[] args) {
        /*
            输出 (1, 100] 间所有的 素数（质数）
         */

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i >> 1; i++) {
                if (j != 1 && i % j == 0) {
                    break;
                }
                if (j == i >> 1) { // 是最后一次循环了
                    System.out.println(i + " 是素数");
                }
            }
        }
    }
}
