package org.example.simple.demo101_200.demo169;

import java.util.Random;

/**
 * @author hzq
 * @date 2020/5/2 17:12
 */
public class Example3 {

    public static void main(String[] args) {
        Example3 example3 = new Example3();
        int[] nums = {2,2,1,1,1,2,2};
        int i = example3.majorityElement(nums);
        System.out.println(i);
    }

    public int majorityElement(int[] nums) {
        Random rand = new Random();
        int majorityCount = nums.length/2;
        while(true){
            int candidate = nums[randRange(rand, 0, nums.length)];
            if (countOccurences(nums, candidate) > majorityCount) {
                return candidate;
            }
        }
    }

    private int countOccurences(int[] nums, int num) {
        int count = 0;
        for (int i : nums) {
            if(i == num){
                count++;
            }
        }
        return count;
    }

    private int randRange(Random rand, int min, int max) {
        return rand.nextInt(max - min) + min;
    }
}
