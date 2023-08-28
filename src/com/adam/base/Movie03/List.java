package com.adam.base.Movie03;

import java.util.Arrays;

public class List {

    /**
     * 容器 -> 可变的数组
     * 解决数组长度不能变的问题
     * List list = new List()
     * list.add(obj);
     * list.add(obj1);
     * <p>
     * list.get(index);
     * <p>
     * list.remove(index);
     */
        /*
            存元素容器
         */
        private Object[] arr;

        // 元素的个数
        private int size;

        private final int DEFAULT_CAPACITY = 10; // 默认容量

        public List(){
            arr = new Object[DEFAULT_CAPACITY];
        }

        public List(int size){
            // 判断数组大小是否合法
            if (size < 0){
                size = DEFAULT_CAPACITY;
            }
            arr = new Object[size];
        }

        /**
         * 添加元素
         * @param obj 要存的元素
         */
        public void add(Object obj) {
            // 判断能否存下
            if (this.size + 1 > arr.length){
                // 存不下
                grow();
            }
//        arr[size] = obj;
//        size ++;
            arr[size ++] = obj;
        }

        /**
         * 扩容
         */
        private void grow() {
            arr = Arrays.copyOf(arr, arr.length  * 2);
        }

        /**
         * 根据下标获取元素
         * @param index
         * @return 该位置的元素，如果 index 不合法返回 null
         */
        public Object get(int index){
            // 检查下标是否合法
            if (index < 0 || index >= size){
                // 不合法， 报错 IndexOutOfBoundsException
                System.out.println("下标不合法");
                return null;
            }
            return arr[index];
        }

        /**
         * 根据下标删除元素
         * @param index  元素的下标
         * @return 被删除的元素
         */
        public Object remove(int index){
            if (index < 0 || index >= size){
                // 不合法， 报错 IndexOutOfBoundsException
                System.out.println("下标不合法");
                return null;
            }
            // 被删除值
            Object obj = arr[index];

            System.arraycopy(arr, index + 1, arr, index, arr.length - index - 1);
            arr[-- size] = null; // 最后一个置为 null

            return obj;
        }

        /**
         * 删除指定元素
         * @param obj 要删除元素
         * @return true 表示删除成功， false 删除失败
         */
        public boolean remove(Object obj){
            for (int i = 0; i < size; i++) {
                if (obj == null){
                    if (obj == arr[i]){
                        remove(i);
                        return true;
                    }
                } else {
                    if (obj.equals(arr[i])){
                        remove(i);
                        return true;
                    }
                }
            }
            return false;
        }

        public int size(){
            return size;
        }

        public boolean isEmpty(){
            return size == 0;
        }


        @Override
        public String toString(){
            String str = "共有 " + size + " 个元素，分别是： \n";

            for (int i = 0; i < size; i++) {
                str += arr[i];
                str += "\n";
            }
            return str;
        }

}
