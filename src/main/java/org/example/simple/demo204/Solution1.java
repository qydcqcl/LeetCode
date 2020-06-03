package org.example.simple.demo204;

import java.util.Arrays;

/**
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7
 *
 * @author hzq
 * @date 2020/6/3 21:45
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        int i = solution1.countPrimes(10);
        System.out.println(i);
    }

    public int countPrimes(int n) {
        boolean[] isPrim = new boolean[n];
        // 将数组都初始化为 true
        Arrays.fill(isPrim, true);

        for (int i = 2; i * i < n; i++){
            if(isPrim[i]){
                for (int j = i * i; j < n; j += i) {
                    isPrim[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++){
            if(isPrim[i]){
                count++;
            }
        }
        return count;
    }
}
