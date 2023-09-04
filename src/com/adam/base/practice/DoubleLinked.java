package com.adam.base.practice;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * {class description}
 *
 * @author wyh
 * @date 2023/8/27
 */

public class DoubleLinked implements List {

    private int size;  // 节点数量
    private Node first;  // 头节点
    private Node last;  // 尾结点

    private class Node{

        private Node prev;   // 前一个节点
        private Object value;  // 值
        private Node next;  // 后一个节点

        public Node(Node prev, Object value, Node next) {
            this.prev = prev;
            this.value = value;
            this.next = next;
        }

        private boolean valueEquals(Object value){
            if (this.value == null){
                return this.value == value;
            }else {
                return this.value.equals(value);
            }
        }
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
    public Object[] toArray() {
        Object[] objects = new Object[size];
        Node current = first;
        int index = 0;

        while (current != null){
            objects[index ++] = current.value;
            current = current.next;
        }
        return objects;
    }

    @Override
    public boolean add(Object o) {
        Node current = new Node(null,o,null);
        if (first == null){
            first = current;
        }else {
           last.next =current;
        }
        last = current;
        size ++;
        return true;
    }



    @Override
    public boolean remove(Object o) {
        if (first.valueEquals(o)){

            // 删除头节点
            Node old = first;
            first.next.prev = null;
            old.next = null;
        }else{
            Node current = first;
            while (current != null && !current.valueEquals(o)){
                current = current.next;
            }

            if (current != null){  // 删除元素
                if (last == current){  // 是否是删除最后一个元素
                    // 如果是
                    last = current.prev;

                    current.prev.next = null;
                    current.prev = null;
                }else{
                    // 如果不是(中间元素)
                    current.prev.next = current.next;
                    current.next.prev = current.prev;

                    current.prev = null;
                    current.next = null;
                }
            }
        }
        size -- ;
        return true;
    }

    @Override
    public void clear() {
        first = null;
        size = 0;
    }

    @Override
    public Object get(int index) {

        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {
        if (index == size){
            add(element);
        }
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index > size + 1){
            return "没找到";
        }

        // 如果要移除的是头节点
        if (index == 0){
            if (first == last){

                last = null;

            }
            Node current = first;
            first.next.prev = null;
            current.next = null;
            size -- ;
            return current.value;
        }else{
            Node old = getNode(index - 1);
            old.prev.next = old.next;
            old.next.prev = old.prev;
            old.next = null;
            old.prev = null;
            size --;
            return old.value;
        }

    }

    private Node getNode(int index) {
        Node current = first;
        for (int i = 0; i < size; i++) {
            current = current.next;
        }
        return current;
    }

    @Override
    public int indexOf(Object o) {
        Node current = first;

        for (int i = 0; i < size; i++) {
            if (current.valueEquals(o)){
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        Node current = first;
       while (current != null){
           sb.append(current.value);
           if (current.next != null){
               sb.append(",");
           }
           current = current.next;
       }
        sb.append("}");
       return sb.toString();
    }

    // ------------------------------------------------------------------->>>>>>

    @Override
    public boolean contains(Object o) {
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

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
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
}
