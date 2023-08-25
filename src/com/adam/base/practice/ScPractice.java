package com.adam.base.practice;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/4
 */
public class ScPractice {
    public static void main(String[] args) {
        // next()与nextLine()方法的区别
        // 以Hello World 为例

   /* public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入：");
        String str = in.next();
        System.out.println("你的输入用next接收为：" + str);
        in.close();
    }             //  只输出了Hello
    */
        /*
            Scanner a = new Scanner(System.in);
            System.out.println("请输入：");
            String b = a.nextLine();
            System.out.println("你的输入用nextLine()接收为：" + b);
            a.close();

         */

        /*
        当程序运行到input对象调用next(),nextLine()等输入数据的方法时，程序将暂停停止运行，等待用户输入数据
        input.close()凡是属于IO流的类如果不关闭会一直占用资源，所以要养成使用完就关闭的习惯
         */
      /*  Scanner input = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = input.next();
        System.out.println("请输入数学成绩：");
        double mathScore = input.nextDouble();

        // 输出学生信息及数学成绩
        System.out.println("学生姓名是" + name);
        System.out.println("数学成绩是" + mathScore);
       */

        // 键盘输入一个数字，判断是否为奇数
        /*Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();

        boolean a = (num % 2 != 0);
        System.out.println(a);
         */
        int i = -2 >> 3;
        System.out.println(i);

    }
}
