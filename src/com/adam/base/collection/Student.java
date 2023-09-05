package com.adam.base.collection;

import java.util.Objects;

/**
 * @author wyh
 * @date 2023/8/27
 */
public class Student {
    /**
     * 创建一个集合， 存储 5 个 Student 对象(name, age, toString, equals, hashCode, getter/setter).
     *  1. 设计方法对集合元素，按照年龄进行排序
     *  2. 输出排序后的集合元素
     *  3. 将下标为 3 的学生的姓名改成 "三娃"
     *  4. 在下标为 4 处添加学生 五娃 20岁
     *  6. 删除最后一个学生
     *  7. 遍历输出每个学生的姓名
     */
    private String name;
    private int age;

    public Student(){}

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}
