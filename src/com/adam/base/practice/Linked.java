package com.adam.base.practice;


import org.w3c.dom.Node;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *  链表实现 List 接口
 */
public class Linked implements List {

    /*
        链表的头节点
        第一个元素
     */
    private Node first;

    /*
    元素个数
     */
    private int size;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {

        return new Object[0];
    }

    @Override
    public boolean add(Object obj) {
        /*
           Object --> Node
         */
        Node current = new Node(obj, null); // 当前要添加的 节点
        if (first == null) {
            first = current;
        } else {
            // 有元素， 遍历链表找到最后一个节点
            Node c = first; // 当前遍历的 节点
            while (c.next != null) { // 不是最后一个
                c = c.next;
            }
            // 此时 c 是最后一个元素
            c.next = current;
        }
        size ++; // 数量 + 1
        return true;
    }

    @Override
    public boolean remove(Object o) {
        // 判断链表上是否有元素
        if (size <= 0){
            return false;
        }
        Node remove = new Node(o, null);
        // 判断是不是头结点
        if (first.equals(remove)) {
            Node c = first; // 引用原来的 第一个节点
            first = c.next; // 将原来头结点的下一个节点（原来的 第二节点） 赋值给 头结点

            // c 是原来的头结点
            c.next = null;
            size --;
            return true;
        } else {
            Node pre = first; // 被删除元素的前一个元素
            Node c = first.next; // 假设 将要被删除的元素

            // !c.equals(remove) 删除的不是 c
            while (c != null && !c.equals(remove)){
                // 找下一个元素
                pre = c;
                c = c.next;
            }

            if (c != null){ // 删除节点
                pre.next = c.next;
                c.next = null;
                size --;
                return true;
            }

        }


        return false;
    }


    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        first = null;
        size = 0;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        Node c = first; // 当前节点
        for (int i = 0; i <= index; i++) {
            c = c.next;
        }
        return c.value;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size - 1){
            try {
                throw new LinkedIndexOutOfBoundsException("index: " + index + ", size: " + size);
            } catch (LinkedIndexOutOfBoundsException e) {
                throw new RuntimeException(e);
            }
        }
    }


    @Override
    public Object set(int index, Object element) {
        checkIndex(index);
        Node c = first;
//            for (int i = 0; i <= index; i++) {
//                if (index == i){
//                    Object old =c.value;
//                    c.value = element;
//                    return old;
//                }
//                c = c.next;
//            }
        for (int i = 0; i < index; i++) {
            c = c.next;
        }
        Object old = c.value;
        c.value = element;
        return old;
    }

    @Override
    public void add(int index, Object element) {
        /**
         * 在指定位置插入元素
         * @param index   要插入元素的索引
         * @param element 要插入的元素
         * @throws IndexOutOfBoundsException 如果索引超出范围
         */
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("下标越界");
        }

        Node c = first;
        // 如果要添加到第一位
        if (index == 0){
            first = new Node(element,first);
        }else{
            Node pre = first;
            Node old = first.next;

            for (int i = 0; i <= index; i++) {
                pre = old;
                old = old.next;
            }
            pre.next = new Node(element,old);
        }
        size ++;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        if (index == 0) {
            // 如果要移除的是头节点
            Node removedNode = first;
            first = first.next;
            size--;
            return removedNode.value;
        }

        Node prev = getNode(index - 1);
        Node removedNode = prev.next;
        prev.next = removedNode.next;
        size--;
        return removedNode.value;
    }

    /**
     * 根据索引获取对应的节点
     *
     * @param index 节点的索引
     * @return 对应的节点
     */
    private Node getNode(int index) {
        Node current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }



    @Override
    public int indexOf(Object o) {
        Node c = first;
        for (int i = 0; i < size; i++) {
            // 判断元素是否相同
            if (c.value == null){// 避免空指针异常  a.equals(“a”);  "a".equals(a);
                if (c.value == o) {
                    return i;
                }
            }else {
                if (c.value.equals(o)){
                    return i;
                }
            }
            c = c.next; // 下一个元素
        }

        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node c = first;
        int index = 0;
        int lastIndex = 0;
        while (c != null) {
            if (o == null && c.value == null) {
                lastIndex = index;
            } else if (o != null && o.equals(c.value)) {
                lastIndex = index;
            }
            c = c.next;
            index++;
        }
        return lastIndex;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] arr) {
        //
        Object[] objects = new Object[size];

        Node c = first; // 当前节点默认为头节点
        int index = 0;

        while (c != null) {
            objects[index++] = c.value;
            c = c.next;
        }
        return objects;
    }

    @Override
    public String toString(){
        if (first == null){
            return "Linked[]";
        } else {
            StringBuilder sb = new StringBuilder("Linked[");
            // 定义一个c 把原来的头节点保存起来
            Node c = first;
            // 如果下一个节点不为空
            while (c.next != null){
                sb.append(c.value); // 当前节点的值
                sb.append(", ");
                c = c.next; // 指向下一个元素
            }
            // 下一个节点为空，说明是最后一个元素
            sb.append(c.value);

//            for (int i = 0; i < size; i++) {
//                sb.append(c.value); // 当前节点的值
//                if (c.next != null){
//                    sb.append(", ");
//                }
//                c = c.next; // 指向下一个元素
//            }
            sb.append("]");
            return sb.toString();
        }

    }

    /**
     * 链表中的 节点对象
     */
    private class Node {
        /*
            元素的值
         */
        private Object value;

        /**
         * 下一个 节点
         */
        private Node next;

        public Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }

        /**
         * 判断 node 节点是否一样
         *  node 的值是否一样
         * @param obj
         * @return
         */
        @Override
        public boolean equals(Object obj){

            if (obj == null){
                return false;
            }
            if (obj == this){
                return true;
            }
            if (obj instanceof Node node){
                if (this.value == null){
                    return node.value == null;
                } else {
                    return value.equals(node.value);
                }
            }
            return false;
        }
    }

    private class LinkedIndexOutOfBoundsException extends Throwable {
        public LinkedIndexOutOfBoundsException(Object s) {
        }
    }
}
