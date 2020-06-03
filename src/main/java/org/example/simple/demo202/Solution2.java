package org.example.simple.demo202;

/**
 * @author hzq
 * @date 2020/6/3 21:27
 */
public class Solution2 {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        boolean happy = solution2.isHappy(19);
        System.out.println(happy);
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = bitSquareSum(n);
        while(fast != 1 && fast != slow){
            slow = bitSquareSum(slow);
            fast = bitSquareSum(bitSquareSum(fast));
        }
        return fast == 1;
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
