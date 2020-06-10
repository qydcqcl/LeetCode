package org.example.simple.demo101_200.demo136;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hzq
 * @date 2020/5/1 15:48
 */
public class Example3 {

    public static void main(String[] args) {
        Example3 example3 = new Example3();
        int[] nums = {1,2,4,1,2};
        int i = example3.singleNumber(nums);
        System.out.println(i);
    }

    public int singleNumber(int[] nums) {
        int sumOfSet = 0, sumOfNums = 0;
        Set<Integer> set = new HashSet();

        for (int num : nums) {
            if(!set.contains(num)){
                set.add(num);
                sumOfSet += num;
            }
            sumOfNums += num;
        }
        return 2 * sumOfSet - sumOfNums;
    }
}
