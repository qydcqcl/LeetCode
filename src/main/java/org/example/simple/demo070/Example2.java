package org.example.simple.demo070;

/**
 * @author hzq
 * @date 2020/4/24 16:22
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        int n = 5;
        int i = example2.climbStairs(n);
        System.out.println(i);
    }

    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climb_Stairs(0, n, memo);
    }

    private int climb_Stairs(int i, int n, int[] memo) {
        if(i > n){
            return 0;
        }
        if(i == n){
            return 1;
        }
        if(memo[i] > 0){
            return memo[i];
        }
        memo[i] = climb_Stairs(i + 1, n, memo) + climb_Stairs(i + 2, n, memo);
        return memo[i];
    }
}
