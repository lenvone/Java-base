package com.adam.base.task.Task0822;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/22
 */
public class Person {
    private  String name;

    private  String gender;  // 1.男  0.女

    private  Integer age;

    private  Boolean marry;

    public Person(String name, String  gender, Integer age, Boolean marry) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.marry = marry;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getMarry() {
        return marry;
    }

    public void setMarry(Boolean marry) {
        this.marry = marry;
    }

    @Override
    public String toString() {
        return "姓名" + name + ", 性别" + gender + ", 年龄" + age + "是否已婚" + marry;
    }

}
