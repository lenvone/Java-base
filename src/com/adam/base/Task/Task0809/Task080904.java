package com.adam.base.Task.Task0809;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/9
 */
public class Task080904 {
    public static void main(String[] args) {
        /*
        有如下数组 nums ，请通过删除掉其中的 33 ，得到一个新的数组 newNums
        int[] nums = {2, 11, 33, 44, 55, 66, 277}
        newNums = {2, 11, 44,55, 66, 277}
        使用多种方式实现：
        1. for 循环（自己写方法实现）
        2. System 类中的 arraycopy 方法实现
         */
        // 1.
      /*  int[] nums = {2, 11, 33, 44, 55, 66, 277};
        int[] newNums = new int[nums.length - 1];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 33) {
                newNums[index] = nums[i];
                index++;
            }
        }

        // 打印newNums数组
        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i] + " ");
        }

       */

        int[] nums = {2, 11, 33, 44, 55, 66, 277};
        int[] newNums = new int[nums.length - 1];
        int index = 2; // 要删除的元素33的索引位置

// 使用arraycopy方法将nums数组中的元素复制到newNums数组中
        System.arraycopy(nums, 0, newNums, 0, index);
        System.arraycopy(nums, index + 1, newNums, index, nums.length - index - 1);

// 打印newNums数组
        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i] + " ");
        }


    }
}
