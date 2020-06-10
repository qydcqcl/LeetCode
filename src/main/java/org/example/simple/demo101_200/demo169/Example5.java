package org.example.simple.demo101_200.demo169;

/**
 * @author hzq
 * @date 2020/5/2 16:54
 */
public class Example5 {

    public static void main(String[] args) {
        Example5 example5 = new Example5();
        int[] nums = {2,2,1,1,1,2,2};
        int i = example5.majorityElement(nums);
        System.out.println(i);
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
