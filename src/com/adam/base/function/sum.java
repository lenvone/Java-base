package com.adam.base.function;

/**
 * @author wyh
 * @date 2023/8/27
 */
public class sum {
    // 重载，可变长度参数
    public static void main(String[] args) {
        int sum = sum(1,2);
        sum = sum(3,sum);
        System.out.println(sum); // 6

    }
    public static int sum(int a,int b){
        return a + b;
    }
    public static double sum(double n1,double n2,double n3){
        return n1 + n2 + n3;
    }

}

class sum1{
    public static void main(String[] args) {
        int s = sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(s);  // 55
    }
    public static int sum(int ... n){
        System.out.println("int sum(int... n)");
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        return sum;
    }
}

class sum2{
    public static void main(String[] args) {
        int[] n = new int[]{1, 2, 3, 4};
        int sum = sum(n);
        System.out.println(sum);  // 10
    }
    public static int sum(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

//    public static int sum(int... nums){
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//        return sum;
//    }
}
