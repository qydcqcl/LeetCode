package org.example.simple.demo172;

/**
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * 示例 2:
 *
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 * 说明: 你算法的时间复杂度应为 O(log n) 。
 *
 * @author hzq
 * @date 2020/5/4 15:57
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        int n = 10;
        int i = example1.trailingZeroes(n);
        System.out.println(i);
    }

    public int trailingZeroes(int n) {
        int count = 0;
        while(n > 0){
            count += n / 5;
            n = n / 5;
        }
        return count;
    }
}
