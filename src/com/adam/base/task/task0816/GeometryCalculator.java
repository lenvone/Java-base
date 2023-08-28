package com.adam.base.task.task0816;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/16
 */
public class GeometryCalculator {
    /*
    几何图形计算器 设计一个几何图形计算器，可以计算圆的面积和矩形的面积。创建名为 GeometryCalculator 的类，
    包含以下实例方法：
    calculateCircleArea(double radius) ：计算并返回圆的面积
     calculateRectangleArea(double width, double height) ：计算并返回
    矩形的面积
    完成计算圆的面积以及计算矩形的面积等功能。
     */

    Double calculateCircleArea;// 圆的面积


    Double calculateRectangleArea;// 矩形面积

    public GeometryCalculator(){
        this.calculateCircleArea = calculateCircleArea;
        this.calculateRectangleArea = calculateRectangleArea;

    }
    public double  calculateCircleArea(double r) {
        return 3.14 * r * r;
    }


    public double calculateRectangleArea(double width, double height) {
        return width * height;
    }


}
