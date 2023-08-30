package com.adam.base.practice;

import java.util.Arrays;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public class ListTest {
    public static void main(String[] args) {
        MyList list = new MyList(0);
        System.out.println(list.isEmpty());  // true
        System.out.println(list.size()); // 0

        list.add("a");
        list.add("b");
        list.add("c");


        System.out.println(list.size()); // 3

//        System.out.println(list.remove("a")); //true
//        System.out.println(list.size()); // 2
//
        System.out.println(list.contains("b"));  // true
        System.out.println(list.indexOf("b"));  // 1  元素b的下标为1
//
////        list.add(0,"d");
////        System.out.println(list.size());
//        list.remove(0);
//        System.out.println(list.size()); // 1
//
//        list.set(0,"e");
//        Object a = list.get(1);
//        System.out.println(a);

        System.out.println(list.toString());

        System.out.println(Arrays.toString(list.toArray())); //

    }




}
