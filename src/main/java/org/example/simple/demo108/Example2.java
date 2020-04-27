package org.example.simple.demo108;

/**
 * @author hzq
 * @date 2020/4/27 22:32
 */
public class Example2 {

    int[] nums;

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        int[] nums = {-10,-3,0,5,9};
        TreeNode treeNode = example2.sortedArrayToBST(nums);
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
            ++p;
        }

        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p - 1);
        root.right = helper(p + 1, right);
        return root;
    }

}
