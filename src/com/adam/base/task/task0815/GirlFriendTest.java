package com.adam.base.task.task0815;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/15
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend gf = new GirlFriend("凤姐",155.0,130.0);
        gf.name = "凤姐";
        gf.height = 155.0;
        gf.weight = 130.0;

        gf.show();
        gf.wash();
        gf.cook();
//        GirlFriend gf = new GirlFriend();
//        gf.show();
    }
}
