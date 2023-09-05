package com.adam.base.collection;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author wyh
 * @date 2023/8/27
 */
public class Goods {
    /**
     * 商品管理
     * 创建一个List集合,添加多个商品名称。实现根据输入查询某个商品是否存在,如果存在则输出信息。
     */
    public static void main(String[] args) {
        Vector vector = new Vector<>();
        vector.add("葡萄");
        vector.add("香蕉");
        vector.add("草莓");

        vector.add("橘子");
        vector.add("山竹");
        vector.add("西瓜");
        System.out.println(vector);

        search(vector,3);
//        boolean b = vector.contains("西瓜");
//        System.out.println(b);
    }
    public static void search(Vector list,int index){
        boolean b = true;
        for (int i = 0; i < list.size(); i++) {
            if (i == index) {
                System.out.println(list.get(index));
            }
        }
            if(b == false) {
                System.out.println("没找到");
            }else {
                throw new IndexOutOfBoundsException("下标越界");
            }
        }
    }

