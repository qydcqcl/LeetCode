package org.example.simple.demo122;

/**
 * @author hzq
 * @date 2020/5/1 15:16
 */
public class Example3 {

    public static void main(String[] args) {
        Example3 example3 = new Example3();
//        int[] nums = {7,6,4,3,1};
        int[] nums = {7,1,5,3,6,4};
        int i = example3.maxProfit(nums);
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > prices[i - 1]){
                maxprofit += prices[i] - prices[i - 1];
            }
        }
        return maxprofit;
    }
}
