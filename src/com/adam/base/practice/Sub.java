package com.adam.base.practice;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/17
 */
public class Sub extends Sup{

        static int a = 11;
        static int b = 22;

    static {
        print();
        }

        public Sub(int a, int b) {
            super(a,b);
            print();
        }
//       @Override
        public static void print(){
            System.out.println(a);
            System.out.println(b);
//            System.out.println("Sub: " + this.a);
//            System.out.println("Sub: " + this.b);
//            System.out.println("Sup: " + super.a);
//            System.out.println("Sup: " + super.b);
//            System.out.println("Sub: " + a);
//            System.out.println("Sub: " + b);
//            System.out.println("Sup: " + a);
//            System.out.println("Sup: " + b);
        }

    }

