package com.adam.base.practice;

import java.util.Arrays;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public class DoubleLinkedTest {
    public static void main(String[] args) {

        DoubleLinked linked = new DoubleLinked();

        System.out.println(linked.isEmpty());

        System.out.println(linked.size());

        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        linked.add("e");
        System.out.println(linked);  // {a,b,c,d,e}

        System.out.println(Arrays.toString(linked.toArray()));  // [a, b, c, d, e]

        System.out.println(linked.indexOf("e"));  // 4

        System.out.println(linked.remove(0)); // TODO


//        linked.remove("b");
//        System.out.println(linked);
        linked.clear();
        System.out.println(linked);  // linked[]




    }
}
