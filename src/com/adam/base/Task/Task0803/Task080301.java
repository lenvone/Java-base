package com.adam.base.Task.Task0803;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/3
 */
public class Task080301 {
    public static void main(String[] args) {
        for (int row = 6; row >= 0; row--) {
            for (int i = 1; i <= 2 * row; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= 2 * (6 - row) + 1; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        for (int j = 6; j >= 1; j--) {
            for (int i = 6; i >= j; i--) {
                System.out.print("  ");
            }
            for (int i = 1; i <= 2 * j -1; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
