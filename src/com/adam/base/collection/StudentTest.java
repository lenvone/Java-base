package com.adam.base.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author wyh
 * @date 2023/8/27
 */
public class StudentTest {
    /**
     * 创建一个集合， 存储 5 个 Student 对象(name, age, toString, equals, hashCode, getter/setter).
     * 1. 设计方法对集合元素，按照年龄进行排序
     * 2. 输出排序后的集合元素
     * 3. 将下标为 3 的学生的姓名改成 "三娃"
     * 4. 在下标为 4 处添加学生 五娃 20岁
     * 6. 删除最后一个学生
     * 7. 遍历输出每个学生的姓名
     */
    public static void main(String[] args) {
        Student stu1 = new Student("张三", 23);
        Student stu2 = new Student("李四", 21);
        Student stu3 = new Student("王五", 24);
        Student stu4 = new Student("赵六", 22);
        Student stu5 = new Student("田七", 25);

        Vector vector = new Vector<>();
        vector.add(stu1);
        vector.add(stu2);
        vector.add(stu3);
        vector.add(stu4);
        vector.add(stu5);

        // 排序1
        vector.sort((o1, o2) -> {
            if (o1 instanceof Student student && o2 instanceof Student student1){
                return student.getAge() - student1.getAge();
            }
            return 0;
        });

        // 调用方法进行排序 2
        sort(vector, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Student stu = (Student) o1;
                Student stu1 = (Student) o2;
                if(stu.getAge() > stu1.getAge()){
                    return 1;
                }else if (stu.getAge() == stu1.getAge()){
                    return 0;
                }else
                    return -1;
            }
        });

        // 遍历输出
        for (Object stu:vector) {
            System.out.println(stu);
        }
        System.out.println();

        // 将下标为 3 的学生的姓名改成 "三娃"
        Student stu = (Student) vector.get(3);
        stu.setName("三娃");

        // 在下标为 4 处添加学生 五娃 20岁
        Student stu6 = new Student("五娃",20);
        vector.add(4,stu6);

        // 删除最后一个学生
        vector.remove(vector.size() - 1);
//
//        for (Object student :vector) {
//            System.out.println(student);
//        }

        // 迭代器（遍历輸出）每个学生的姓名
        Iterator iterator =vector.iterator();

        while (iterator.hasNext()){
            Object obj = iterator.next();
            if (obj instanceof Student student) {
                System.out.println(student.getName());
            }
        }
    }


    public static void sort(Vector list, Comparator comparator) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (comparator.compare(list.get(j), list.get(j + 1)) > 0) {
                    Object temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
