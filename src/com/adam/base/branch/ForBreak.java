package com.adam.base.branch;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/4
 */
public class ForBreak {
    public static void main(String[] args) {

        // 找出1~100内的所有素数
      //  int count = 0;
        int sum = 0;
        for (int num = 2; num <= 100; num ++) {
            boolean flag = true;
            for (int i = 2; i < num; i ++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
                }
            if (flag) {
                System.out.println(num + "是素数");
          //      count ++;
            }
        }
    //    System.out.println(count);



           /* row:for (int i = 1; i <= 9; i ++){
                for (int j = 1; j <= 9; j ++){
                    if (j > i){
                   // 结束内部循环,进行下一次外循环
                    //    break row;
                    System.out.println();
                    continue row;
                    }
                    System.out.print(i + " * " + j + " = " + i * j + "\t");
                }
            }
            */
    }
}
