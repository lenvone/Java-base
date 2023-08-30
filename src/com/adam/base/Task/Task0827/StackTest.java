package com.adam.base.Task.Task0827;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public class StackTest {
    public static void main(String[] args) {
        ExtendsStack stack = new ExtendsStack();
        System.out.println();

        stack.push("1");
        stack.push("2");
        stack.push("3");  // 入栈元素个数最终有4个
        stack.push("4");

        System.out.println(stack.pop());  // 弹出一个栈顶元素
        System.out.println(stack.peek());  // 返回栈顶元素，但不弹出，弹出一个栈顶元素4后，此时栈顶元素为3
        System.out.println(stack.isEmpty());  // 栈元素是否为空
        System.out.println(stack.size());    //  栈中的元素个数

    }
}
