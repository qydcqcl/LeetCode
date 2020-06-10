package org.example.simple.demo101_200.demo168;

/**
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * 示例 1:
 *
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 *
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 *
 * 输入: 701
 * 输出: "ZY"
 *
 * @author hzq
 * @date 2020/5/2 16:05
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        int n = 28;
        String s = example1.convertToTitle(n);
        System.out.println(s);
    }

    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int c = n % 26;
            if(c == 0){
                c = 26;
                n -= 1;
            }
            sb.insert(0, (char) ('A' + c - 1));
            n /= 26;
        }
        return sb.toString();
    }
}
