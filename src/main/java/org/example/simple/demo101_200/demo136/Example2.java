package org.example.simple.demo101_200.demo136;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hzq
 * @date 2020/5/1 15:44
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        int[] nums = {1,2,4,1,2};
        int i = example2.singleNumber(nums);
        System.out.println(i);
    }

    public int singleNumber(int[] nums) {
        Map<Integer, Object> map = new HashMap<>();
        for (int num : nums) {
            if(!map.containsKey(num)){
                map.put(num, null);
            }else{
                map.remove(num);
            }
        }
        return map.keySet().iterator().next();
    }
}
