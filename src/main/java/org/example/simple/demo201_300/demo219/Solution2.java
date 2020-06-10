package org.example.simple.demo201_300.demo219;

import java.util.TreeSet;

/**
 * @author hzq
 * @date 2020/6/4 22:34
 */
public class Solution2 {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;

        Solution2 solution2 = new Solution2();
        boolean b = solution2.containsNearbyDuplicate(nums, k);
        System.out.println(b);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        TreeSet<Integer> set = new TreeSet<>();
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
