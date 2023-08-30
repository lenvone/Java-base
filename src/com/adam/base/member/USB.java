package com.adam.base.member;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public interface USB extends IA,IB{
    //

    // 声明变量时，默认该变量是公共的，不能改变值的静态变量
    public static final int A = 0;

    // 接口中定义的方法都是抽象的，使用`abstract`修饰.
    public abstract void charge();
    // 接口中的方法默认是 `public abstract` 修饰的
    public static class Inner{

    }
    /**
     * 默认方法
     * 默认实现
     *
     */
    public default void a(){
        System.out.println("实现A方法");
    }

    private void sort(){
        System.out.println("实现sort方法");
    }
    public static void staticMethod(){
        System.out.println("USB:staticMethod");
    }
    public static void c(){}

}

interface USBC extends USB{}

interface IA{
    public abstract void a();
}

interface IB{
    public abstract void a();
    public abstract void b();
}
