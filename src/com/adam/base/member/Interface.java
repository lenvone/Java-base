package com.adam.base.member;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public class Interface {
    public static void main(String[] args) {
        USB usb = new USB() {    // 匿名类
            @Override
            public void charge() {

            }

            @Override
            public void a() {

            }

            @Override
            public void b() {

            }
        };

        // 函数接口，某一种功能
//        Charge charge = new Charge(){
//            @Override
//            public void charge(int b){
//                System.out.println(b);
//                System.out.println("充电");
//            }
//        };
//   lambda 相当于 匿名类中 只有一个有效方法，

        // lambda 简写函数接口实例化
        Charge c = (b) ->{
            System.out.println(b);
            System.out.println("充电");
        };

        c.charge(10);
        c.test();
    }
}
