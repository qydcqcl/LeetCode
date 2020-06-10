package org.example.simple.demo101_200.demo121;

/**
 * @author hzq
 * @date 2020/5/1 14:49
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        int[] nums = {7,6,4,3,1};
        int i = example2.maxProfit(nums);
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(minprice > prices[i]){
                minprice = prices[i];
            } else if(prices[i] - minprice > maxprfit){
                maxprfit = prices[i] - minprice;
            }
        }
        return maxprfit;
    }
}
