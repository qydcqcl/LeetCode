package org.example.simple.demo1_100.demo070;

/**
 * @author hzq
 * @date 2020/4/24 16:32
 */
public class Example3 {

    public static void main(String[] args) {
        Example3 example3 = new Example3();
        int n = 3;
        int i = example3.climbStairs(n);
        System.out.println(i);
    }

    public int climbStairs(int n){
        if(n < 1){
            return 0;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
