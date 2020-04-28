package org.example.simple.demo108;

import java.util.Random;

/**
 * @author hzq
 * @date 2020/4/27 22:35
 */
public class Example3 {

    int[] nums;

    Random rand = new Random();

    public static void main(String[] args) {
        Example3 example3 = new Example3();
        int[] nums = {-10,-3,0,5,9};
        TreeNode treeNode = example3.sortedArrayToBST(nums);
        System.out.println(treeNode);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length - 1);
    }

    private TreeNode helper(int left, int right) {
        if(left > right){
            return null;
        }
        int p = (left + right) / 2;
        if((left + right) % 2 == 1){
            p += rand.nextInt(2);
        }

        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p - 1);
        root.right = helper(p + 1, right);
        return root;
    }
}
