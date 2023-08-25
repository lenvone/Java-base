package com.adam.base.practice;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/17
 */
public class Sup {
        static int a = 1;

        static{
            b = 3;
            print();
        }
        static int b = 2;


        public Sup(int a, int b){
            print();
            this.a = a;
            this.b = b;
            print();
        }

        public static void print(){
            System.out.println(a);
            System.out.println(b);
        }
    }


