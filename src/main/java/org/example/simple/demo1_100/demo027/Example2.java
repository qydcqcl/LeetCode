package org.example.simple.demo1_100.demo027;

/**
 * @author hzq
 * @date 2020/4/10 14:20
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int i = example2.removeElement(nums, val);
        System.out.println("======================");
        System.out.println(i);
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while(i < n){
            if(nums[i] == val){
                nums[i] = nums[n - 1];
                n--;
            }else{
                i++;
            }
        }
        return n;
    }
}
