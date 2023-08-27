package com.adam.base.task.task0815;

/**
 * {class description}
 *
 * @author
 * @version 1.0.0
 * @date 2023/8/15
 */
public class StudentTest {
    public static void main(String[] args) {
        Student message = new Student();
        message.name = "小美";
        message.gender = "女";
        message.age = 18;
        message.id = 12345;
        message.score = 90;

        System.out.println(message.say());

    }
}
