package org.example.simple.demo219;

/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 *
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 *
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 *
 * @author hzq
 * @date 2020/6/4 22:30
 */
public class Solution1 {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1};
        int k = 1;
        Solution1 solution1 = new Solution1();
        boolean b = solution1.containsNearbyDuplicate(nums, k);
        System.out.println(b);
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = Math.max(i - k, 0); j < i; j++) {
                if(nums[j] == nums[i]){
                    return true;
                }
            }
        }
        return false;
    }
}
