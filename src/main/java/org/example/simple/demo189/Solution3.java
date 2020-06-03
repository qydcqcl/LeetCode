package org.example.simple.demo189;

import java.util.Arrays;

/**
 * @author hzq
 * @date 2020/6/3 15:24
 */
public class Solution3 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};

        Solution3 solution3 = new Solution3();
        solution3.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++){
            int current = start;
            int prev = nums[start];
            do{
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (current != start);
        }
    }
}
