package org.example.simple.demo053;

/**
 * @author hzq
 * @date 2020/4/10 17:31
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = example2.maxSubArray(nums);
        System.out.println(i);
    }

    public int maxSubArray(int[] nums){
        int n = nums.length;
        int currSum = nums[0], maxSum = nums[0];
        for (int i = 1; i < n; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
