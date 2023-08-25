package com.adam.base.task.Task0822;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/22
 */
public class Marry {
     Scanner sc = new Scanner(System.in);

    public  Person[] person =  new Person[2];
    public  int count = 0;

    public Marry() {
    }

    // 开始
    public void start(){
        input();
        canMarry(person[0],person[1]);
    }
    //  输入两人信息
    public  void input(){
        for (int i = 0; i < 2; i++) {
            print("请输入姓名：");
            String name = sc.next();

            print("请选择性别(男/女)：");
            String gender = sc.next();

            System.out.println("请输入年龄：");
            int age = sc.nextInt();

            System.out.println("请输入婚姻情况(false 未婚,true 已婚)：");
            boolean isMarry = sc.nextBoolean();

            Person  person1 = new Person(name, gender, age, isMarry);
            person[count] = person1;
            count ++;
        }
    }

    // 判断是否可以结婚
    public  void canMarry(Person p1,Person p2){
        if (p1 == null || p2 == null){
            print("不符合条件");
            return;
        }else {
            information(p1);
        }
    }

    // 判断条件:性别，年龄，是否已婚
    public  boolean information(Person person){
        if(person.getGender().equals("男")){
            if(person.getAge() >= 22 && person.getAge() <=120) {
                isMarry(person);
            }
        }else {
   //     if(person.getGender().equals("女")){
            if(person.getAge() >= 20 && person.getAge() <=120) {
                isMarry(person);
            }
        }
        return false;
    }

    public Boolean isMarry(Person person){
        if (person.getMarry()){
            print("已婚，不满足结婚条件");
            return false;
        }else {
            print("可以结婚");
            return true;
        }
    }

    public  void print(Object msg){
        System.out.println(msg);
    }


}
