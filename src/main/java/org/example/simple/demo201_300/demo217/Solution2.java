package org.example.simple.demo201_300.demo217;

import java.util.Arrays;

/**
 * @author hzq
 * @date 2020/6/4 22:25
 */
public class Solution2 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Solution2 solution2 = new Solution2();
        boolean b = solution2.containsDuplicate(nums);
        System.out.println(b);
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }
        return false;
    }
}
