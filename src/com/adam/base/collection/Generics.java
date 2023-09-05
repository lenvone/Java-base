package com.adam.base.collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wyh
 * @date 2023/8/27
 */
public class Generics {
    /**
     * 泛型 ：泛型的类型不能是基本数据类型，泛型传递给集合后，约束了集合元素的类型； 编译时做类型检查，运行时强制类型转换
     * ArrayList对象，底层数组是一个空数组 {}
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        // 泛型主要看等式左边的；主要功能是消除代码中的强制类型转换，同时获得一个附加的类型检查层，
        // 该检查层可以防止有人将错误类型的键或值保存在集合中，提高 Java 程序的类型安全。

        list.add("喜羊羊");
        list.add("美羊羊");
        list.add("村长");
        list.add("懒羊羊");
        list.add("灰太狼");
        list.add("红太狼");
        list.add("小灰灰");
        list.add("灰太狼");

        /*
        for 、for-each 、iterator迭代器 ① 遍历输出 ② 删除某位元素如"灰太狼"
        for-each和迭代器报错的原因相同，是因为for-each底层调用了迭代器，报错的原因是迭代器是依赖于集合而存在的，集合不能被修改。
        迭代器只能解决下一个元素的删除，原因是删除时将 ModCount 赋值给 迭代器的 expectedModCount(底层实现)，二者相等所以解决了报错;
        迭代器做其他操作时还是会报错的
         */

//        // for
//        for (int i = 0; i < list.size(); i++) {
//            String str = list.get(i);
//            if ("灰太狼".equals(list.get(i))){
//                list.remove(i);
//                continue;
//            }
//            System.out.println(str);
////            System.out.println(list.get(i));
//        }
//
//        System.out.println();


//        // for-each
//        for (String str: list) {
//            if ("灰太狼".equals(str)){
//                list.remove(str);
//            }
//            System.out.println(str);      // throw ConcurrentModificationException
////            System.out.println(str);
//        }
//
//        System.out.println();


        // 迭代器
        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            String str = iterator.next();
            if ("灰太狼".equals(str)){
                list.remove(str);        // 解决报错：将61行替换为 iterator.remove();
                continue;
            }
            System.out.println(str);      //   throw ConcurrentModificationException
//            System.out.println(iterator.next());
        }
    }
}
