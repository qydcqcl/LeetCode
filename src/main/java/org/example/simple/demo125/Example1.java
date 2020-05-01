package org.example.simple.demo125;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 *
 * @author hzq
 * @date 2020/5/1 15:19
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
//        String s = "A man, a plan, a canal: Panama";
        String s = "race a car";
        boolean b = example1.isPalindrome(s);
        System.out.println(b);
    }

    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^0-9a-z]", "");
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while(i < j){
            if(chars[i] != chars[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
