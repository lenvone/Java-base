package com.adam.base.branch;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/4
 */
public class Demo00804 {
    public static void main(String[] args) {

        int num = 100;
        while(num >1){
            FindNum:for (int i = 2;i<=num;i++){
                // 遍历
                // 找出所有质数
                for (int j = 2;j <= i;j++){
                    // 判断是否是质数
                    if (i % j == 0 & i != 2){
                        continue FindNum;
                    }
                }
                //  所有的质数
                //  判断是否是num的因数
                if(num % i ==0){
                    System.out.println(i);
                    num /= i;  // 改变后的质因数
                    break;
                }

            }

        }
    }
}

