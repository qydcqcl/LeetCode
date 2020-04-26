package org.example.simple.demo020;

import java.util.HashMap;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 * @author hzq
 * @date 2020/4/8 18:45
 */
public class Example1 {

    private HashMap<Character, Character> hashMap;

    public Example1() {
        hashMap = new HashMap<>();
        hashMap.put(')', '(');
        hashMap.put('}', '{');
        hashMap.put(']', '[');
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        String s = "{[]}";
        boolean valid = example1.isValid(s);
        System.out.println(valid);
    }

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(hashMap.containsKey(c)){
                char top = stack.empty() ? '#' : stack.pop();
                if(top != hashMap.get(c))
                    return false;
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
