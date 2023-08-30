package com.adam.base.Task.Task0815;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/15
 */
public class homeWork {


        {
            printA(); //1
            a = 5;
        }

        static int a = 1;

        static {
            printA();//1
        }

        public homeWork(int a){
            printA();//5
            this.a = a;
            printA();//6
        }


        public static void printA(){
            System.out.println(a);
        }

        public static void main(String[] args) {
            new homeWork(6);
        }
    }

