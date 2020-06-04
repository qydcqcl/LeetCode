package org.example.simple.demo217;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hzq
 * @date 2020/6/4 22:27
 */
public class Solution3 {

    public static void main(String[] args) {
        int[] nums = {1,2,1};

        Solution3 solution3 = new Solution3();
        boolean b = solution3.containsDuplicate(nums);
        System.out.println(b);
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
