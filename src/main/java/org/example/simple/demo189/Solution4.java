package org.example.simple.demo189;

import java.util.Arrays;

/**
 * @author hzq
 * @date 2020/6/3 15:33
 */
public class Solution4 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        Solution4 solution4 = new Solution4();
        solution4.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
