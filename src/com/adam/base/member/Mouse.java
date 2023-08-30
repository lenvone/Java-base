package com.adam.base.member;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public class Mouse implements USB{
//    public static void main(String[] args) {
//        Mouse mouse = new Mouse();
//
//    }

    @Override
    public void charge() {
        System.out.println("charge");
    }

    @Override
    public void a() {
        System.out.println("a");
    }

    @Override
    public void b() {
        System.out.println("b");
    }

    // 空接口
    interface CCC{};
}
