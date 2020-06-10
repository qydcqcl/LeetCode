package org.example.simple.demo101_200.demo169;

import java.util.Arrays;

/**
 * @author hzq
 * @date 2020/5/2 16:33
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        int[] nums = {2,2,1,1,1,2,2};
        int i = example2.majorityElement(nums);
        System.out.println(i);
    }

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
