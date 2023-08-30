package com.adam.base.Task.Task0804;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080401 {
    public static void main(String[] args) {
        /*
        洪乞丐干10天，收入是多少？
        天朝有一个乞丐姓洪，去天桥要钱
        第一天要了1块钱，第二天要了2块钱第三天要了4块钱，第四天要了8块钱 ，以此类推
         */
        int sum = 1;
        int moneny = 0;
        for (int day = 1;day <= 9;day ++){
            moneny = 2 << (day - 1);
            sum += moneny;
        }
        System.out.println("苏乞丐十天的收入是：" + sum);
    }

}
