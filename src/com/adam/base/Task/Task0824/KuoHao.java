package com.adam.base.Task.Task0824;

import java.util.Stack;

public class KuoHao {
    /*
    给定一个只包括 '('，')' 的字符串，判断字符串是否有效。
    有效字符串需满足：
    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。
    注意空字符串可被认为是有效字符串
    ((()))   (()())   ((((((()))   )()(
     */
    //match 匹配
    public static void main(String[] args) {
        String str = ")()(";
        boolean match = match(str);
        System.out.println("括号匹配结果: " + match);

    }
    public static boolean match(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
            Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // 获取当前位置的字符
            // 如果当前字符是左括号，如 '('，'['，'{'，则将对应的右括号入栈，即将 ')'，']'，'}' 分别入栈。
                if (ch == '(') {
                    stack.push(')');
                } else if (ch == '[') {
                    stack.push(']');
                } else if (ch == '{') {
                    stack.push('}');
                } else if (ch == ')' || ch == ']' || ch == '}') {
                    // 如果当前字符是右括号,如果栈顶元素不等于当前右括号，即左右括号不匹配，返回 false。
                    //如果栈顶元素等于当前右括号，说明左右括号匹配成功，将栈顶元素出栈，继续遍历下一个字符。
                    //如果栈为空，说明没有与之匹配的左括号，返回 false。
                    if (stack.isEmpty() || stack.pop() != ch) {
                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }

//如果当前字符是左括号（'(', '[', '{'），则将其入栈（stack.push(ch)）。
//                      如果当前字符是右括号（')', ']', '}'）
//                         如果栈为空，说明没有与之匹配的左括号，返回 false。
                    //
                        // 当如果当前右括号与栈顶元素不匹配，返回 false。
                        // 当前右括号与栈顶元素不匹配
                        // 当前右括号与栈顶元素不匹配

            // 如果遍历完字符串后，栈为空，说明所有括号都匹配，返回 true；否则返回 false



}
