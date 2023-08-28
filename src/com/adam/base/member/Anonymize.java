package com.adam.base.member;

/*
    外部类和内部类
 */
public class Anonymize {

    private static int b = 1;

    // 静态类变量
    static class StaticInnerClass {
        int b = 2;

        private static int aa = 1;
        private int bb = 3;

        public void test(){
            System.out.println("StaticInnerClass :");
            System.out.println(aa);  // 1
            System.out.println(bb);  // 3
            System.out.println(b);  //2 遮蔽
            System.out.println(this.b);  // 2  遮蔽
            System.out.println(this.bb); // 3  遮蔽
            System.out.println(this);  // com.adam.base.member.Anonymize$StaticInnerClass@58372a00
            System.out.println(Anonymize.b); // 1 调用外部类静态变量b (private)
            System.out.println(new Anonymize().a); // 1 调用外部类中的非静态类  （不推荐使用）
            System.out.println(InnerClass.aa);  // 1 调用外部类中的非静态类中的静态变量 （private）
            //  不能调用外部类中的非静态类中的非静态变量
        }
    }
    // 外部类可以直接调用成员类的静态成员,实例成员需要创建成员类的对象来调用
    public static void test(){
        StaticInnerClass.aa = 2;  // 外部类的静态方法调用内部静态类中的静态变量
        new StaticInnerClass().bb = 2;  // 外部类的静态方法调用内部静态类中的非静态变量
    }

    public void t(){
        StaticInnerClass.aa = 3;
        new StaticInnerClass().bb = 3;
    }

    // 非静态类变量
    private int a = 1;
    class InnerClass {
        int a = 2;

        private static int aa = 1;
        private int bb = 2;
        public void test(){
            System.out.println("InnerClass :");
            System.out.println(this);  //com.adam.base.member.Anonymize$InnerClass@6d311334
            System.out.println(a); // 2
            System.out.println(aa); // 1
            System.out.println(bb); // 2
            System.out.println(this.a);  // 2 局部变量遮蔽
            System.out.println(this.bb); // 2
            System.out.println(Anonymize.b);  // 1 外部类静态变量  （private）
            System.out.println(Anonymize.this.a);  //1 外部类非静态变量 （private）
            System.out.println(StaticInnerClass.aa);  // 1 调用外部类中静态类中的静态变量 （private）
            System.out.println(new StaticInnerClass().bb); // 3 调用外部类中静态类中的非静态变量（private）
            System.out.println(new StaticInnerClass().b);  // 2 调用外部类中静态类中的非静态变量 （public）
        }

        public static void test1(){
            InnerClass.aa = 1;
            InnerClass.test1();
        }

    }

    public static void test1(){
        InnerClass.aa = 1;
        InnerClass.test1();

    }
}

class Demo1 {

    public static void main(String[] args) {
        // 创建 static 成员类的对象   static 成员类, 使用 类名. 调用. 使用 new 外部类.内部类();
        Anonymize.StaticInnerClass staticInnerClass = new Anonymize.StaticInnerClass();
        // 创建实例成员类的对象  实例成员类， 使用外部类的对象来调用. 使用 对象.new 内部类();
//        Anonymize.InnerClass innerClass1 = new Anonymize().new InnerClass();

        Anonymize anonymize = new Anonymize();
        System.out.println(anonymize);
        Anonymize.InnerClass innerClass = anonymize.new InnerClass();
        // 71 == 73 + 75

        staticInnerClass.test();
        innerClass.test();
    }

}
