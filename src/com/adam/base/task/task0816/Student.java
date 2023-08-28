package com.adam.base.task.task0816;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/16
 */
public class Student {
    /*
    创建一个学生类 编写一个名为 Student 的类，包含以下属性和方法：
    属性：姓名（name）、年龄（age）、学号（studentId）、成绩（score）
    方法：构造方法、获取姓名的方法、获取年龄的方法、获取学号的方法、获取成绩的方法、设置成绩的方法
     */
    private String name;
    private Integer age;
    private Integer studentId;
    private Double score;

    public Student(){
        this.name = "小美";

    }
    public void Student(String name, int age, int studentId, double score){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        getScore();
    }
    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }
    public int getStudentId(){
        return studentId;
    }

    public void setScore(double score){
        if (score <= 60 || score >= 100){
            this.score = 59.9 ;
        }else {
            this.score = score;
        }
    }
    public double getScore(){
        return score;
    }
}
