package org.example.simple.demo201_300.demo202;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 True ；不是，则返回 False 。
 *
 * 示例：
 *
 * 输入：19
 * 输出：true
 * 解释：
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 *
 * @author hzq
 * @date 2020/6/3 21:08
 */
public class Solution1 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        boolean happy = solution1.isHappy(116);
        System.out.println(happy);
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1){
            n = bitSquareSum(n);
            if(!set.add(n)){
                return false;
            }
        }
        return true;
    }

    private int bitSquareSum(int x) {
        int sum = 0, cur = 0;
        while(x > 0){
            cur = x % 10;
            sum += cur * cur;
            x /= 10;
        }
        return sum;
    }
}
