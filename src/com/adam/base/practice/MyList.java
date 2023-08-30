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

    public MyList(){
        this(DEFAULT_CAPACITY,DEFAULT_INCREMENT);
    }
    public MyList(int capacity){
        this(capacity,DEFAULT_INCREMENT);
    }

    public MyList(int capacity,int increment){
        if (capacity < 0){
            capacity = DEFAULT_CAPACITY;
        }
        if (increment >= size){
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

        return false;
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
//        Node current = new Node(obj,null);
//        if (first == null){
//            first == current;
//        }else {
//            Node c =
//        }
        // 扩容
        grow(size + 1);
        // 添加元素
        value[size ++] = obj;
        return true;
    }
    /**
     * 扩容
     * @param mincapacity
     */
    private void grow(int mincapacity) {
        // 需要的空间大于总长度
        if (mincapacity > value.length){
            int oldcapacity = value.length;
            int newcapacity = oldcapacity + increment;
            value = Arrays.copyOf(value,newcapacity);
        }
    }

    @Override
    public boolean remove(Object obj) {
        // 按照值来删
        for (int i = 0; i < size; i++) {
            if (value[i] == null){
                if (obj == null){
                    remove(i);
                    return true;
                }
            } else {
                if (value[i].equals(obj)){
                    remove(i);
                    return true;
                }
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

    }

    @Override
    public Object get(int index) {
        // 获取元素
        if (index < 0 || index > size){
            return null;   // 下标越界
        }else
            return value[index];
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        // 按照下标添加元素
        if (index < 0 || index > size){
            return null;  //  下标越界
        }

        return null;
    }

    @Override
    public int indexOf(Object obj) {
        // 如果当前位置元素是null，就用 == 判断
        for (int i = 0; i < size; i++) {
            if (value[i] == null){
                if (obj == null){
                    return i;
                }
            }else{
                if(value[i].equals(obj)){
                    return i;
                }
            }
        }
        return -1;
    }

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
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
