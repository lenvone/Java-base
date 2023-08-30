package com.adam.base.Task.Task0827;

import java.util.Arrays;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public class ExtendsStack extends Stack {
    // 定义栈

    // 用数组模拟实现,定义数组，大小，和 栈顶标记
    private Object[] stack;
    // 下一个元素的下标
    private int length;
    // 默认容量
    private static final int DEFAULT_CAPACITY = 10;

    // 有参无参
    public ExtendsStack(){
        this(DEFAULT_CAPACITY);
    }
    // 传入容量
    public ExtendsStack(int capacity) {
        if (capacity < 0 ){
            capacity = DEFAULT_CAPACITY;
        }
        stack = new Object[capacity];
    }

    @Override
    public void push(Object element) {
        /**
         * 将元素压入栈顶
         * 入栈
         * @param element 要压入的元素
         */
        // length < stack.length
        if (length + 1 < stack.length){
            grow();  // 扩容
        }
        // stack[length ++] = element;
        stack[length] = element;
        length ++;   // 每添加一个元素，下标后移一位
    }

    private void grow() {   // 属性私有
        int oldCapacity = stack.length;
        int newCapacity = oldCapacity << 1;  // 扩容为原来的两倍（old + old >> 1,扩容1.5倍）

        // 确认新容量大于旧容量
        if (newCapacity < oldCapacity){
            newCapacity = Integer.MAX_VALUE;
        }

        stack = Arrays.copyOf(stack,newCapacity);
    }

    @Override
    public Object pop() {
        /**
         * 弹出栈顶元素并返回
         * 把栈顶元素删除，并返回
         * 出栈
         * @return 弹出的栈顶元素, 如果栈为空返回 null
         */
        // 栈顶元素
        // Object element = stack[-- length]
        Object element = stack[length - 1];   // 被删除元素
        stack[length - 1] =null;   // 出栈，直至第一个元素位置为空值
        length -- ;    // 每出栈一次，存入元素就少一个
        return element;
    }

    @Override
    public Object peek() {
        /**
         * 返回栈顶元素，但不弹出
         * @return 栈顶元素
         */
        return stack[length - 1];
    }

    @Override
    public boolean isEmpty() {
        /**
         * 检查栈是否为空
         * @return 如果栈为空则返回true，否则返回false
         */
        return length == 0;
    }

    @Override
    public int size() {
        /**
         * 返回栈中的元素个数
         * @return 栈中元素的个数
         */
        return length;
    }
}
