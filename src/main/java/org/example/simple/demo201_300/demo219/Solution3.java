package org.example.simple.demo201_300.demo219;

import java.util.HashSet;

/**
 * @author hzq
 * @date 2020/6/4 22:41
 */
public class Solution3 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;

        Solution3 solution3 = new Solution3();
        boolean b = solution3.containsNearbyDuplicate(nums, k);
        System.out.println(b);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
