package org.example.simple.demo101_200.demo136;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * @author hzq
 * @date 2020/5/1 15:27
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        int[] nums = {1,2,4,1,2};
        int i = example1.singleNumber(nums);
        System.out.println(i);
    }

    public int singleNumber(int[] nums) {
        List<Integer> no_duplicate_list = new ArrayList<>();
        for (int num : nums) {
            if(!no_duplicate_list.contains(num)){
                no_duplicate_list.add(num);
            } else {
                no_duplicate_list.remove((Object) num);
            }
        }
        return no_duplicate_list.get(0);
    }
}
