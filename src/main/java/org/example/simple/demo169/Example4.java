package org.example.simple.demo169;

/**
 * @author hzq
 * @date 2020/5/2 16:42
 */
public class Example4 {

    public static void main(String[] args) {
        Example4 example4 = new Example4();
        int[] nums = {2,2,1,1,1,2,2};
        int i = example4.majorityElement(nums);
        System.out.println(i);
    }

    public int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length-1);
    }

    private int majorityElementRec(int[] nums, int lo, int hi) {
        if(lo == hi){
            return nums[lo];
        }

        //recurse on left and right halves of this slice.
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);

        //if the two halves agree on the majority element, return it.
        if(left == right){
            return left;
        }

        //otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        return leftCount > rightCount ? left : right;
    }

    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }
}
