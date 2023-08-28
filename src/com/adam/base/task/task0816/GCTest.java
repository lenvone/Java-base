package com.adam.base.task.task0816;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/16
 */
public class GCTest {
    public static void main(String[] args) {
        GeometryCalculator g = new GeometryCalculator();
        g.calculateCircleArea(2.0);
        g.calculateRectangleArea(3.0,4.0);

        System.out.println("圆的面积为：" + g.calculateCircleArea(2.0) + "矩形的面积为："
                + g.calculateRectangleArea(3.0,4.0));
    }
}
