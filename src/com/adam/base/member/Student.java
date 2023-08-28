package com.adam.base.member;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public abstract class Student{
    public abstract void play();
    public void study() {
        System.out.println("学习");
    }
}
class StudentTest {
    public static void main(String[] args) {
        // 内部类, 当 main 方法调用结束，就销毁
        class stu extends Student {

            @Override
            public void play() {
                System.out.println("打游戏");
            }

            public void test() {
                System.out.println("test");
            }
        }

        Student s = new stu();
        s.study();

        // 匿名类
        Student stu = new Student() {

            @Override
            public void play() {
                System.out.println("shushiping");
            }
        };

//        Person person = new Person();
//        person.say();

        Person person1 = new Person() {
            @Override
            public void say() {
                System.out.println("areyouok");
            }
        };
        person1.say();
    }
}
