package com.adam.base.string;

public class Demo01 {

    public static void main(String[] args) {
        /*
          字符串使用、方法、拼接、转换
          底层实现，方法内部的实现
         */
        String str = "abc"; // 字面量，字符串常量
        //  字符串不可变, 字符串内容存储内容的元素是 final 修饰的所以不可变

        String str1 = new String("abc"); // 构造，字符串对象
        // 字符串 + 字符串 表示拼接字符串。
        // 转义字符 \
        String say = "鲁迅说：\"间就想海绵里的水，挤挤总是有的\"";

        String table = "序号 \t 姓名 \t 年龄 \n1 \t 张三 \t 20 \n 2 \t 李四 \t 22";

        // 文本块 “”“ 字符内容 ”“”
        String text = """
                     序号    姓名
                     1      张三
                     "snadnlasmkl"
                """;
        System.out.println(text);
    }
}
