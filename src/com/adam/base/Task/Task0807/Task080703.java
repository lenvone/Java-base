package com.adam.base.Task.Task0807;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/7
 */
public class Task080703 {
    public static void main(String[] args) {
        /*
        需求：求出数组中索引与索引对应的元素都是奇数的元素
        分析：
        1、遍历数组
        2、判断索引是否是奇数（索引 % 2 != 0）
        3、判断索引对应的元素是否是奇数(arr[索引] % 2 != 0)
        4、满足条件输出结果
         */
       /* Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0;i < arr.length;i ++){
            arr[i] = rand.nextInt(100)+1;
        }
        for (int j = 0;j <10;j ++){
            if (j % 2 != 0 && arr[j] % 2 != 0){
                System.out.println("索引为" + j + "数值为" + arr[j]);
            }
        }
        */
        int arr[] = new int[]{12,33,56,25,65,78};
        for (int i = 0;i < arr.length;i ++){
                if (i % 2 != 0 && arr[i] % 2 != 0){
                    System.out.println("索引为" + i + "数值为" + arr[i]);
                }
        }
    }
}


