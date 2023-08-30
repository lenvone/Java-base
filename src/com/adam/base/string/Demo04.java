package com.adam.base.string;

import java.util.Arrays;

public class Demo04 {
        public static void main(String[] args) {
            String str = "hello";

            // 字符串拼接
//        str = str.concat(" world");
            str = str + " world";
            System.out.println(str);
            // 字符串只能做 + 操作,表示拼接。任何类型的元素和字符串做 + 操作都字符串的拼接
            String s = 1 + 1 + "1" + 1 + 1;
//        String s = new Person("张三", '男', 20, false) + str;
            System.out.println(s);// 2111 212


            // 判断是否包含
            boolean contains = str.contains("hello world");
            System.out.println(contains);

            // 是否以某个字符串结尾
            String email = "xxxx@qq.com";
            boolean end = email.endsWith(".com");
            System.out.println(end);

            // 是否以某个字符串开头
            boolean start = email.startsWith("xxx");
            System.out.println(start);

            // 子串在字符串中第一次出现的位置(下标), -1 表示没出现
            int index = str.indexOf("e");
            System.out.println(index);

            int hello = str.indexOf("le");
            System.out.println(hello); // -1

            // 从 fromIndex开始第一次出现的下标
            index = str.indexOf("l", 3);
            System.out.println(index);

            // 最后一次出现的位置
            index = str.lastIndexOf("l");
            System.out.println(index); // 9

            str = """
            先天下之忧而忧，
            后天下之乐而乐。
            """;
            System.out.println(str);
            s = str.indent(2);
            System.out.println(s);

            // 分隔字符串
            str = "1-2-3-4-5-6";
            String[] strs = str.split("-");
            System.out.println(Arrays.toString(strs));


            str = "1.2.3.4.5.6";
            strs = str.split("\\.");
            System.out.println(Arrays.toString(strs));

            str = "123456";
            char[] chs = str.toCharArray();
            strs = str.split("");
            System.out.println(Arrays.toString(strs));

            str = "--1-2-3-4-5-6------";
            strs = str.split("-");
            System.out.println(Arrays.toString(strs));

            // 合并 static方法
            str = String.join(".", "a", "b", "c", "d");
            System.out.println(str);

            // 重复
            str = "666";
            str = str.repeat(3);
            System.out.println(str);

            // 替换
            str = "abcdabcd";
//        str = str.replace("a","A");
            str = str.replaceFirst("a", "A");
            System.out.println(str);


            // 格式化
            str = "我是%s".formatted("张三");
            System.out.println(str);

            // 占位符 %s 字符串  %b boolean %c char  %d integer  %f 浮点数
            str = """
                我是%s
                我说%s
                """.formatted("秦始皇", "打钱");
            System.out.println(str);


            str = String.format("我今年%d岁", 23);
            System.out.println(str);

        }

}
