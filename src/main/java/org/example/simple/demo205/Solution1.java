package org.example.simple.demo205;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 *
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 *
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 *
 * 示例 1:
 *
 * 输入: s = "egg", t = "add"
 * 输出: true
 * 示例 2:
 *
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * 示例 3:
 *
 * 输入: s = "paper", t = "title"
 * 输出: true
 * 说明:
 * 你可以假设 s 和 t 具有相同的长度
 *
 * @author hzq
 * @date 2020/6/4 20:48
 */
public class Solution1 {

    public static void main(String[] args) {
        String s = "aa";
        String t = "ab";

        Solution1 solution1 = new Solution1();
        boolean isomorphic = solution1.isIsomorphic(s, t);
        System.out.println(isomorphic);
    }

    public boolean isIsomorphic(String s, String t) {
        return isIsomorphicHelper(s, t) && isIsomorphicHelper(t, s);
    }

    private boolean isIsomorphicHelper(String s, String t) {
        int length = s.length();
        Map<Character, Character> map = new HashMap<>();
        for (int i= 0; i < length; i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(map.containsKey(c1)){
                if(map.get(c1) != c2){
                    return false;
                }
            }else{
                map.put(c1, c2);
            }
        }
        return true;
    }
}
