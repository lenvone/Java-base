package com.adam.base.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wyh
 * @date 2023/8/27
 */
public class ArrayListDemo {
    // ArrayList对象，底层数组是一个空数组 {}

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("喜羊羊");
        list.add("美羊羊");
        list.add("懒羊羊");
        list.add("灰太狼");
        list.add("红太狼");
        list.add("小灰灰");
        list.add("灰太狼");

        // subList()

        // 源
        List<String> list1 = list.subList(2,5);  // 左闭右开
        list1.add(0,"QAQ");  //引用地址，对视图的修改会影响到源集合
        list1.remove("灰太狼");
        list1.clear();

        System.out.println(list1);
        System.out.println(list);

        // 集合-----> 数组
        Object[] arr = list.toArray();  // ①
        System.out.println(Arrays.toString(arr));

        String[] arr1 = list.toArray(new String[]{});  // ②
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = (String[]) Array.newInstance(String.class,0);
        System.out.println(Arrays.toString(arr2)); //  []


        // 数组-----> 集合（转变为一个不可变的集合）
        String[] str = {"a","b","c"};
        List<String> list2 = Arrays.asList(str);

        System.out.println(list2);

            // 不可修改 throw UnsupportedOperationException
//        list2.remove("b");
//        list2.set(1,"d");
//        System.out.println(list2);
        // 不可修改  throw UnsupportedOperationException
//        List<Object> of = List.of("a");
//        of.set(0,"b");
//        System.out.println(of);
    }
}
