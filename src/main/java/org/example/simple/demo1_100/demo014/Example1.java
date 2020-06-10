package org.example.simple.demo1_100.demo014;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * @author hzq
 * @date 2020/4/8 18:04
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        String[] arr = new String[]{"flower","flow","flight"};
//        String[] arr = new String[]{"dog","racecar","car"};
        String s = example1.longestCommonPrefix(arr);
        System.out.println(s);
    }

    public String longestCommonPrefix(String[] arr){
        if(arr.length == 0)
            return "";
        String prefix = arr[0];
        for (int i = 1; i < arr.length; i++) {
            while(arr[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
