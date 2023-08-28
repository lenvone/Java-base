package com.adam.base.task.task0816;

import java.util.Scanner;

/**
 * {class description}
 *
 * @author
 * @versionn 1.0.0
 * @date 2023/8/18
 */
public class LibraryTest {

        static Scanner input = new Scanner(System.in);

        static Library library = new Library();


        public static void start() {
            print("欢迎使用 开发喵图书管理系统 ");
            showMenu();
        }

        private static void showMenu() {
            print("请选择功能:");
            print("1. 添加图书");
            print("2. 查找图书");
            print("3. 显示所有图书");
            print("0. 退出系统");
            System.out.print("请输入：");
            int menu = input.nextInt();
            selectMenu(menu);
        }

        private static void selectMenu(int menu) {
            switch (menu) {
                case 1 -> addBook();
                case 2 -> searchBook();
                case 3 -> showAllBook();
                default -> exit();
            }

            // 再次展示菜单
            showMenu();
        }

        private static void exit() {
            print("欢迎下次光临");
            System.exit(0);
        }

        private static void showAllBook() {
            library.show();
        }

        private static void searchBook() {
            print("请输入书的【名称】:");
            String title = input.next();

            Book book = library.searchByTitle(title);
            if (book == null){
                System.out.println("\u001B[31m 没有找到此书，请联系管理员！\u001B[0m");
            } else {
                print(book.toString());
            }
        }

        private static void addBook() {
            print("请输入书的【名称】:");
            String title = input.next();
            print("请输入书的【作者】:");
            String author = input.next();
            print("请输入书的【出版年份】:");
            int year = input.nextInt();
            print("请输入书的【出版价格】:");
            double price = input.nextDouble();

            // 对象创建好了
            Book book = new Book(title, author, year, price);

            // 添加到 library 中的数组
            library.addBook(book);

            print("添加 《" + title + "》 成功!");

        }

        private static void print(String msg) {
            System.out.println(msg);
        }
    }

