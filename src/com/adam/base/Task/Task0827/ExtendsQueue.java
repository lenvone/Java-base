package com.adam.base.Task.Task0827;

import java.util.Arrays;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public class ExtendsQueue extends Queue{
    // 定义队列，用数组实现
    private Object[] queue;
    // 定义数组大小,  下一个元素的下标 = 元素的个数
    private int size;
    // 默认容量
    private static final int DEFAULT_CAPACITY = 10;

    // 有参，无参
    public ExtendsQueue(){
        this(DEFAULT_CAPACITY);
    }

    public ExtendsQueue(int capacity) {
        if (capacity < 0 ){
            capacity = DEFAULT_CAPACITY;
        }
        queue = new Object[capacity];
    }

    @Override
    void push(Object element) {
        /**
         * 将元素插入队尾
         * @param element 要插入的元素
         */
        if (size + 1 > queue.length){
            grow();   //  确认属性私有
        }
        queue[size] = element;   //  添加元素
        size ++;
    }

    // 扩容
    private void grow() {

        int oldCapacity = queue.length;
        int newCapacity = oldCapacity << 2;
// int newcapacity = oldCapacity + 10;  -- 定长扩容
        // 确认新容量大于旧容量
        if (newCapacity > oldCapacity){
            newCapacity = Integer.MAX_VALUE;
        }
//        queue = Arrays.copyOf(queue,newCapacity);
        Object[] newArr = new Object[newCapacity];
        System.arraycopy(queue,0,newArr,0,size);
        queue = newArr;
    }

    @Override
    Object pop() {
        /**
         * 移除并返回队首元素
         * 删除第一个元素，并返回
         * @return 队首元素, 如果队列为空时，返回 null
         */
        Object element = queue[0];  // 删除第一个元素
        System.arraycopy(queue,1,queue,0,size - 1);
        // 每删除一个下标往前挪一位
        queue[size] = null;  // 移出值后将数组置空
        return element;  // 返回最终数组长度
    }

    @Override
    Object peek() {
        /**
         * 返回队首元素，但不移除
         * @return 队首元素
         */
        return queue[0];  //  队列第一位总是queue[0]
    }

    @Override
    boolean isEmpty() {
        /**
         * 检查队列是否为空
         * @return 如果队列为空则返回true，否则返回false
         */
        return size == 0;
    }

    @Override
    int size() {

        return size;
    }
}
