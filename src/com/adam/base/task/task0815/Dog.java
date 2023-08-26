package com.adam.base.task.task0815;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/15
 */
public class Dog {
    /*
    定义猫类Cat。属性:毛的颜色color，品种breed。行为:吃饭eat()，抓老鼠catchMouse()定义狗类Dog。
    属性:毛的颜色color，品种breed。行为:吃饭()，看家()
    要求：
    1.按照以上要求定义Cat类和Dog类,属性要私有,生成无参、有参构造
	2.定义测试类,在main方法中创建该类的对象并给属性赋值
	3.调用成员方法,打印格式如下:
	花色的波斯猫正在吃鱼.....
	花色的波斯猫正在逮老鼠....
	黑色的藏獒正在啃骨头.....
	黑色的藏獒正在看家.....
     */
    private char color;
    private String breed;

    public void eat(){
        System.out.println(color + "色的" + breed + "正在啃骨头");
    }
    public void watchHome(){
        System.out.println(color + "色的" + breed + "正在看家");
    }
    public Dog(char color,String breed){
        this.color = color;
        this.breed = breed;
    }
    public Dog(){
        this.color = '黑';
        this.breed = "藏獒";
    }


}
