package org.example.simple.demo053;

/**
 * @author hzq
 * @date 2020/4/10 18:12
 */
public class Example3 {

    public static void main(String[] args) {
        Example3 example3 = new Example3();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = example3.maxSubArray(nums);
        System.out.println(i);
    }

    public int maxSubArray(int[] nums){
        int n = nums.length, maxSum = nums[0];
        for (int i = 1; i < n; i++) {
            if(nums[i - 1] > 0){
                nums[i] += nums[i - 1];
            }
            maxSum = Math.max(nums[i], maxSum);
        }
        return maxSum;
    }
}
