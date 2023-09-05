package com.adam.base.collection;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author wyh
 * @date 2023/8/27
 */
public class StudentsTest {
    /**
     * 学生管理
     * 创建一个List集合表示学生列表。添加10个学生并设计方法实现根据学生成绩排序和计算平均成绩功能。
     */
    public static void main(String[] args) {

        Vector vector = new Vector<>();

        Students stu0 = new Students("小幺",70.0);
        Students stu1 = new Students("小迩",80.0);
        Students stu2 = new Students("小善",90.0);
        Students stu3 = new Students("小肆",60.0);
        Students stu4 = new Students("小伍",93.0);

        Students stu5 = new Students("小琉",79.0);
        Students stu6 = new Students("小期",88.0);
        Students stu7 = new Students("小鲅",85.0);
        Students stu8 = new Students("小玖",98.0);
        Students stu9 = new Students("小释",75.0);

        vector.add(stu0);
        vector.add(stu1);
        vector.add(stu2);
        vector.add(stu3);
        vector.add(stu4);

        vector.add(stu5);
        vector.add(stu6);
        vector.add(stu7);
        vector.add(stu8);
        vector.add(stu9);

        // 排序（）
        vector.sort((o1, o2) -> {
            Students student = (Students) o1;
            Students student1 = (Students) o2;
            if (student.getScore() > student1.getScore()) {
                return 1;
            } else if (student.getScore() == student1.getScore()) {
                return 0;
            } else {
                return -1;
            }
        });

        for (Object stu:vector) {
            System.out.println(stu);
        }

        double result = AvgScore(vector);
        System.out.println(result);
    }

    // 平均分
    public static double AvgScore(Vector list){
        double avgScore = 0;
        Iterator iterator =list.iterator();

        while (iterator.hasNext()){
            Object obj = iterator.next();
            if (obj instanceof Students student) {
                avgScore += student.getScore();
            }
        }
        return avgScore / list.size();
    }
}
