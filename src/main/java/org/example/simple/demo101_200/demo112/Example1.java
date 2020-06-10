package org.example.simple.demo101_200.demo112;

/**
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例: 
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 *
 * @author hzq
 * @date 2020/4/28 22:41
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        TreeNode root = new TreeNode(5);
        TreeNode p1 = new TreeNode(4);
        TreeNode p2 = new TreeNode(8);
        TreeNode p3 = new TreeNode(11);
        TreeNode p4 = new TreeNode(13);
        TreeNode p5 = new TreeNode(4);
        TreeNode p6 = new TreeNode(7);
        TreeNode p7 = new TreeNode(2);
        TreeNode p8 = new TreeNode(1);

        root.left = p1;root.right = p2;
        p1.left = p3;
        p2.left = p4; p2.right = p5;
        p3.left = p6; p3.right = p7;
        p5.right = p8;

        boolean b = example1.hasPathSum(root, 22);
        System.out.println(b);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        sum -= root.val;
        if(root.left == null && root.right == null){
            return sum == 0;
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
