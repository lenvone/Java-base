package com.adam.base.practice;

import org.w3c.dom.Node;


import java.util.*;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */
public class MyList implements List {
    private Object[] value;

    private int size;

    // 每次增长量
    private int increment;
    // 默认长度和默认增长量
    private static final int DEFAULT_CAPACITY = 10;
    private static final int DEFAULT_INCREMENT = 10;
    // 设置链表头节点
    private Node first;

    public MyList() {
        this(DEFAULT_CAPACITY, DEFAULT_INCREMENT);
    }

    public MyList(int capacity) {
        this(capacity, DEFAULT_INCREMENT);
    }

    public MyList(int capacity, int increment) {
        if (capacity < 0) {
            capacity = DEFAULT_CAPACITY;
        }
        if (increment >= size) {
            increment = DEFAULT_INCREMENT;
        }
        value = new Object[capacity];
        this.increment = increment;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object obj) {
        // 是否包含元素
        for (int i = 0; i < size; i++) {
            if (value[i] == null) {
                if (obj == null) {
                    return true;
                }
            } else {
                if (value[i].equals(obj))
                    return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        Object[] str;
        str = Arrays.copyOf(value, size);
        return str;
    }

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
    }

    @Override
    public boolean add(Object obj) {
        //  当前要添加的节点
        Node current = new Node(obj, null);
        // 如果第一个为空，则把当前值给第一位
        if (first == null) {
            first = current;
        } else {
        //
            Node c = first;
            // 如果下一个不为空，则进入循环
            while (c.next != null) {
                c = c.next;
            }
            // 判断为空时，就把当前的值放在这里
            c.next = current;
        }
        size ++;
//        // 扩容
//        grow(size + 1);
//        // 添加元素
//        value[size ++] = obj;
        return true;
    }

    /**
     * 扩容
     *
     * @param mincapacity
     */
    private void grow(int mincapacity) {
        // 需要的空间大于总长度
        if (mincapacity > value.length) {
            int oldcapacity = value.length;
            int newcapacity = oldcapacity + increment;
            value = Arrays.copyOf(value, newcapacity);
        }
    }

    @Override
    public boolean remove(Object obj) {
        // 按照值来删
        for (int i = 0; i < size; i++) {
            if (value[i] == null) {
                if (obj == null) {
                    value[i] = null;
                    size -= 1;
                    return true;
                }
            } else {
                if (value[i].equals(obj)) {
                    value[i] = null;
                    size -= 1;
                    return true;
                }
            }
        }
        return false;
    }


    @Override
    public void clear() {
        // value = new object[]{};
        for (int i = 0; i < size; i++) {
            value[i] = null;
        }
        size = 0;
    }

    @Override
    public Object get(int index) {

        // 获取元素
        if (index < 0 || index > size) {
            return null;   // 下标越界
        } else
            return value[index];
    }

    @Override
    public Object set(int index, Object element) {
        if (index < 0 || index > size) {
            return null;
        }
        for (int i = 0; i < size + 1; i++) {
            if (index == i) {
                value[index] = element;
            }

        }
//        Object[] newVaule = new Object[size + 1];
//        System.arraycopy(value,0,newVaule, 0,size - 1);
//        newVaule[index] = element;
//        System.arraycopy(value,index,newVaule,index + 1,size - index);
//
//        return newVaule;
        return value;
    }

    @Override
    public void add(int index, Object element) {
        if (index < 0 || index > size) {
            return;
        }
        Object[] newVaule = new Object[size + 1];
        System.arraycopy(value, 0, newVaule, 0, index);
        newVaule[index] = element;
        System.arraycopy(value, index, newVaule, index + 1, size() - index);
        value = newVaule;
    }

    @Override
    public Object remove(int index) {
        // 按照下标删除元素
        if (index < 0 || index > size) {
            return null;  //  下标越界
        }
        // 被删除值
        Object obj = value[index];

        System.arraycopy(value, index + 1, value, index, value.length - index - 1);

        value[index] = null;
        size -= 1;
        return null;

    }

    @Override
    public int indexOf(Object obj) {
        // 如果当前位置元素是null，就用 == 判断
        for (int i = 0; i < size; i++) {
            if (value[i] == null) {
                if (obj == null) {
                    return i;
                }
            } else {
                if (value[i].equals(obj)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] str;
        str = Arrays.copyOf(value, size);
        return str;
    }

    @Override
    public String toString() {

        Node c = first;
        StringBuilder sb = new StringBuilder();
        while(c.next != null){
            sb.append(c.value);
            sb.append(", ");
            c = c.next;
        }
        sb.append(c.value);
        return sb.toString();

//        return "MyList{" +
//                "value=" + Arrays.toString(value) +
//                ", size=" + size +
//                ", increment=" + increment +
//                '}';
    }

    // ----------------------------------------

    @Override
    public int lastIndexOf(Object o) {
        return 0;
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
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

}
