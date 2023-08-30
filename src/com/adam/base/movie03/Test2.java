package com.adam.base.movie03;

/*
instence 和 getClass
 */
public class Test2 {

        public static void main(String[] args) {
            Student stu = new Student("zhangsan", 20);

            Class cla = stu.getClass();
            System.out.println(cla);
        }

}
