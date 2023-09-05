package com.adam.base.collection;

/**
 * @author wyh
 * @date 2023/8/27
 */
public class Students {
    /**
     * 学生管理
     * 创建一个List集合表示学生列表。添加10个学生并设计方法实现根据学生成绩排序和计算平均成绩功能。
     */
    private String name;

    private Double score;

    public Students(String name, Double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
