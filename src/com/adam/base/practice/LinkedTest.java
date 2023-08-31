package com.adam.base.practice;

import com.adam.base.practice.Linked;

import java.util.Arrays;

public class LinkedTest {

    public static void main(String[] args) {
        Linked linked = new Linked();

        System.out.println(linked.isEmpty()); // true
        System.out.println(linked);

        linked.add(null);
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
//        linked.add(new Student("张三", 20));

        System.out.println(linked.size()); // 4

        System.out.println(linked.indexOf("a"));  // 1

        System.out.println(linked.contains("a")); // true

        System.out.println(linked.remove("a")); // true

        System.out.println(linked.get(1));

        System.out.println(linked); // Linked[null, b, c, d]

        System.out.println(linked.set(2,"5"));  // Linked[null, b, 5, d]
        System.out.println(linked);

        System.out.println(linked.lastIndexOf("null"));  // TODO

        linked.clear();
        System.out.println(linked); // linked[]

    }
}
