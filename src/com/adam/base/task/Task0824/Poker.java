package com.adam.base.task.Task0824;

public class Poker {
    //定义两个数组，一个数组存储扑克牌花色，另一个数组存储扑克牌（A~K），输出52张扑克牌（除大小王）
    //♥A、♥2...

    public static void main(String[] args) {
        String[] cards = {"♥", "♠", "♣", "♦"};
        String[] nums = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                        "J", "Q", "K"};

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                sb.append(cards[i] + nums[j]);
            }
        }
        System.out.println(sb);
    }
}
