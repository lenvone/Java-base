package com.adam.base.member;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
@FunctionalInterface
public interface Charge{
    //  函数式接口,,接口中只有一个抽象方法;
    // 函数式接口的匿名类写法可用 `lambda`来简写. -->Interface

       public abstract void charge(int a);  // void(int a)

        default public void test(){
            System.out.println("test");
        }
}
