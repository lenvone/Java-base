package com.adam.base.task;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080404 {
    public static void main(String[] args) {
        /*
            # @ @ @ #
            @ * * * @
            @ * * * @
            @ * * * @
            # @ @ @ #
         */
        for (int a=1;a<=5;a++){
            if (a==1 || a==5){
                for (int b=1;b<=5;b++){
                    if (b==1 || b==5){
                        System.out.print("# ");
                    }else {
                        System.out.print("@ ");
                    }

                }
                System.out.println();
            }else {
                for (int b=1;b<=5;b++){
                    if (b==1 || b==5){
                        System.out.print("@ ");
                    }else {
                        System.out.print("* ");
                    }

                }
                System.out.println();
            }

        }
    }

}
