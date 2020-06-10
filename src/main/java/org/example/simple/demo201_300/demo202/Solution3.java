package org.example.simple.demo201_300.demo202;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author hzq
 * @date 2020/6/3 21:33
 */
public class Solution3 {

    private static Set<Integer> cycleMembers =
            new HashSet<>(Arrays.asList(4, 16, 37, 58, 89, 145, 42, 20));

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        boolean happy = solution3.isHappy(19);
        System.out.println(happy);
    }

    public boolean isHappy(int n) {
        while (n != 1 && !cycleMembers.contains(n)) {
            n = bitSquareSum(n);
        }
        return n == 1;
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
