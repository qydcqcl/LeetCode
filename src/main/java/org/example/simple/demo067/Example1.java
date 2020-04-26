package org.example.simple.demo067;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * @author hzq
 * @date 2020/4/11 15:42
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        String a = "1010";
        String b = "1011";
        String s = example1.addBinary(a, b);
        System.out.println(s);
    }

    public String addBinary(String a, String b) {
        Integer a1 = Integer.valueOf(a, 2);
        Integer b1 = Integer.valueOf(b, 2);
        return Integer.toBinaryString(a1 + b1);
    }
}
