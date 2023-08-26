package com.adam.base.task.task0816;

import java.util.Arrays;

public class Library {

    /*
        对象数组
        TODO( 如果我要存第 11 本书怎么办？ 扩容？)
        如果一个个扩容，效率太低了。高效的扩容方式
     */
    private Book[] books = new Book[10];

    // 图书数量
    private int count = 0;

    {
        for (int i = 0; i < 10; i++) {
            String name = "第" + (i + 1) + "本书";
            addBook(new Book(name, "佚名", 2020, 3.86));
        }
    }


    public void addBook(Book book) {
        if (count + 1 > books.length) {
            // 扩容
            grow();
        }
        books[count++] = book;
    }
    private void grow() {
        // 用一个新数组将原来数组元素 copy 过去,  2n
//        Book[] newArr = new Book[books.length * 2];
//        System.arraycopy(books, 0, newArr, 0, books.length);

        Book[] newArr = Arrays.copyOf(books, books.length * 2);

        books = newArr;
    }

    public void show() {
//        for (Book book : books){
//            System.out.println(book);
//        }
        if (count == 0) {
            System.out.println("\u001B[31m 目前没有存书！\u001B[0m");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(i + 1 + ". " + books[i].info());
            }
        }
    }

    public Book searchByTitle(String title){
        for (int i = 0; i < count; i++) {
            if (title.equals(books[i].getTitle())){
                return books[i];
            }
        }
        return null;
    }
}
