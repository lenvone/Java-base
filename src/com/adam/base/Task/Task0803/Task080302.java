package com.adam.base.Task.Task0803;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/3
 */
public class Task080302 {
    public static void main(String[] args) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 6 - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5 - i; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 2 * i + 3; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 5 - i - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 0; j < 2 * i + 5; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = 0; i < 4; i++) {
                for (int j = 1; j <= 4;j ++){
                    System.out.print("  ");
                }
                for (int j = 0;j <= 4;j ++){
                    System.out.print("# ");
                }
                System.out.println();

            }
    }
}
