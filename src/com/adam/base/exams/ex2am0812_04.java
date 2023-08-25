package com.adam.base.exams;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/14
 */
public class ex2am0812_04 {

    public static int[][] yanghui(int num) {
        int[][] arr = new int[num][num];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i ){
                    arr[i][j] = 1;
                }else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }

//            arr[i] = new int[i + 1];  //
//            arr[i][0] = 1;
//            arr[i][i] = 1;
//            for (int j = 1; j < i; j++) {
//                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int num = 6;
        int[][] arr = yanghui(num) ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0){
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]) + "\t");
//        }
 //      System.out.println();
    }
}

