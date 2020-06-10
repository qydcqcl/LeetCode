package org.example.simple.demo101_200.demo191;

/**
 * @author hzq
 * @date 2020/6/3 16:28
 */
public class Solution2 {

    public static void main(String[] args) {
        int n = 7;

        Solution2 solution2 = new Solution2();
        int i = solution2.hammingWeight(n);
        System.out.println(i);
    }

    public int hammingWeight(int n) {
        int sum = 0;
        while(n != 0){
            sum++;
            n = n & (n - 1);
            System.out.println(n);
        }
        return sum;
    }
}
