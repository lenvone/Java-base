package com.adam.base.Task.Task0827;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public class QueueTest {
    public static void main(String[] args) {
        ExtendsQueue queue = new ExtendsQueue();

            queue.push("a");
            queue.push("b");
            queue.push("c");

            System.out.println(queue.pop());  // 弹出一个队列元素
            System.out.println(queue.peek());  // 返回队首元素，但不移除
            System.out.println(queue.isEmpty());  // 判断队列是否为空
            System.out.println(queue.size());  // 容量
    }
}
