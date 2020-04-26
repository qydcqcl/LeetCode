package org.example.simple.demo053;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 *
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 *
 * @author hzq
 * @date 2020/4/10 16:32
 */
public class Example1 {

    public int crossSum(int[] nums, int left, int right, int p) {
        if(left == right){
            return nums[left];
        }
        int leftSubsum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = p; i > left - 1; --i){
            currSum += nums[i];
            leftSubsum = Math.max(leftSubsum, currSum);
        }

        int rightSubsum = Integer.MIN_VALUE;
        currSum = 0;
        for (int i = p + 1; i < right + 1; ++i){
            currSum += nums[i];
            rightSubsum = Math.max(rightSubsum, currSum);
        }
        return leftSubsum + rightSubsum;
    }

    public int helper(int[] nums, int left, int right) {
        if(left == right){
            return nums[left];
        }
        int p = (left + right) / 2;

        int leftSum = helper(nums, left, p);
        int rightSum = helper(nums, p + 1, right);
        int crossSum = crossSum(nums, left, right, p);

        return Math.max(Math.max(leftSum, rightSum), crossSum);
    }

    public int maxSubArray(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int i = example1.maxSubArray(nums);
        System.out.println(i);
    }

}
