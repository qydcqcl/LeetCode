package org.example.simple.demo101_200.demo122;

/**
 * @author hzq
 * @date 2020/5/1 15:08
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        int[] nums = {1,2,3,4,5};
        int i = example2.maxProfit(nums);
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while(i < prices.length - 1){
            while(i < prices.length - 1 && prices[i] >= prices[i + 1]){
                i++;
            }
            valley = prices[i];
            while(i < prices.length - 1 && prices[i] <= prices[i + 1]){
                i++;
            }
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}
