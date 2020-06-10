package org.example.simple.demo1_100.demo070;

/**
 * @author hzq
 * @date 2020/4/24 16:38
 */
public class Example4 {

    public static void main(String[] args) {
        Example4 example4 = new Example4();
        int n = 4;
        int i = example4.climbStairs(n);
        System.out.println(i);
    }

    public int climbStairs(int n){
        if(n < 1){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
