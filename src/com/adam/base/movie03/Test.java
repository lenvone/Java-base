package com.adam.base.movie03;

public class Test {
        public static void main(String[] args) {
            List list = new List();
//        List list1 = new List(20);

            System.out.println("list 的大小: " + list.size());

            Student stu = new Student("张三", 20);
            Student stu1 = new Student("李四", 20);
            Student stu2 = new Student("王五", 20);
            Student stu3 = new Student("赵六", 20);
            Student stu4 = new Student("钱七", 20);

            list.add(stu);
            list.add(stu1);
            list.add(stu2);
            list.add(stu3);
            list.add(stu4);

            System.out.println("list 的大小: " + list.size());

            System.out.println(list);

            System.out.println("第一个元素是：" + list.get(0));

            System.out.println("删除的下标为 3 的元素是： " + list.remove(3));

            System.out.println(list);

            Student remove = new Student("张三", 20);
            boolean flag = list.remove(remove);

            System.out.println(flag);

            System.out.println(list);
        }

}
