package org.example.simple.demo189;

import java.util.Arrays;

/**
 * @author hzq
 * @date 2020/6/2 23:23
 */
public class Solution2 {

    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};

        Solution2 solution2 = new Solution2();
        solution2.rotate(nums,2);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = a[i];
        }
    }
}
