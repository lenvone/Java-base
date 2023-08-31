package com.adam.base.compare;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public class Sort {
    public static void main(String[] args) {
        String[] str = {"abc","bcd","dca","dbc"};
//        sort(str);
//        System.out.println(Arrays.toString(str));

        Student[] stus = {
                new Student("张三", 23, 90),
                new Student("李四", 24, 80),
                new Student("王五", 23, 70),
                new Student("赵六", 24, 80),
                new Student("田七", 25, 50)
        };
//        sort(stus);
//        for (Student student: stus) {
//            System.out.println(student);
//        }

//        Student stu1 = new Student();
//        Student stu2 = new Student();
        int n = Objects.compare(stus[0], stus[1], new StudentComparator());
        System.out.println(n);

    }

    public static void sort(String[] str){
        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length - i - 1; j++) {
                if (str[j].compareTo(str[j + 1]) > 0){
                    String temp = str[j];
                    str[j] = str[j + 1];
                    str[j + 1] = temp;
                }
            }
        }
    }
    public static void sort(Student[] stus){
        for (int i = 0; i < stus.length - 1; i++) {
            for (int j = 0; j < stus.length - 1 - i; j++) {
                if (stus[j].compareTo(stus[j + 1]) > 0){
                    Student temp = stus[j];
                    stus[j] = stus[j + 1];
                    stus[j + 1] = temp;
                }
            }
        }
    }
}

class Student implements Comparable,Cloneable{

    private String name;
    private int age;
    private int score;

    public Student() {
        super();
    }

    public Student(String name, int age, int score) {
        super();
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Object obj) throws RuntimeException{
        if ( obj instanceof Student student){
            if (this.age > student.age){
                return 1;
            }
            if (this.age < student.age){
                return -1;
            }
            if (this.score > student.score){
                return 1;
            }
            if (this.score < student.score){
                return -1;
            }
            return this.name.compareTo(student.name);
        }
        try {
            throw new CompareException("类型不匹配");
        } catch (CompareException e) {
            throw new RuntimeException(e);
        }
    }
    class CompareException extends Throwable {
        public CompareException() {
            super();
        }

        public CompareException(String message) {
            super(message);
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

class StudentComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Student stu1 && o2 instanceof Student stu2 ){
            if (stu1.getAge() > stu2.getAge()){
                return 1;
            }
            if (stu1.getAge() < stu2.getAge()) {
                return -1;
            }

            if (stu1.getScore() > stu2.getScore()){
                return 1;
            }
            if (stu1.getScore() < stu2.getScore()) {
                return -1;
            }
            return stu1.getName().compareTo(stu2.getName());
        }
        try {
            throw new CompareException("类型不匹配");
        } catch (CompareException e) {
            throw new RuntimeException(e);
        }
    }

    private class CompareException extends Throwable {
        public CompareException(Object 类型不匹配) {
        }
    }
}
