package com.adam.base.Date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        // 获取当前时间：Fri Aug 25 14:14:00 CST 2023
        Date date = new Date();
        System.out.println(date);
        // 获取当前时间的毫秒值  1692944118522
        long time = date.getTime();
        System.out.println(time);
        // 获取指定时间的Date对象
        Date date1 = new Date(1692944118522L);
        System.out.println(date1);
        // 比较两个Date对象的时间
        // 是否在指定日期之前/之后/相等
        boolean isBefore = date.before(date1);
        boolean isAfter = date.after(date1);
        boolean isEqual = date1.equals(date1);

        System.out.println(isBefore);
        System.out.println(isAfter);
        System.out.println(isEqual);


    }
}
