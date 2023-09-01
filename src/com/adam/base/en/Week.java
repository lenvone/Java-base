package com.adam.base.en;

import java.util.Arrays;

/**
 * {class description}
 * @author wyh
 * @date 2023/8/27
 */
public enum Week {

    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    private Week(){
    }
    private static final String NAME = "周一";

    public void text(){
        System.out.println("放假");
    }
    public String getWeek(){
        return NAME;
    }
}

class test {
    public static void main(String[] args) {
        // 不能实例化
        Week week = Week.MONDAY;
        System.out.println(week);

        //
        System.out.println(week.name());

        // 枚举声明实例的索引值
        System.out.println(week.ordinal());

        // 通过枚举常量的名称，来获取实例名称
        Week week1 = Enum.valueOf(Week.class, "MONDAY");
        System.out.println(week1);

        // 返回一个类包含所有实例的数组
        Week[] weeks = Week.values();
        System.out.println(Arrays.toString(weeks));

        System.out.println(week.getWeek());
        week.text();
    }
}
