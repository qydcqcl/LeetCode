package org.example.simple.demo111;

/**
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最小深度  2.
 *
 * @author hzq
 * @date 2020/4/28 22:16
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        TreeNode root = new TreeNode(3);
        TreeNode p1 = new TreeNode(9);
        TreeNode p2 = new TreeNode(20);
        TreeNode p3 = new TreeNode(15);
        TreeNode p4 = new TreeNode(7);

        root.left = p1;
        root.right = p2;
        p2.left = p3;
        p2.right = p4;
        int i = example1.minDepth(root);
        System.out.println(i);
    }

    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        int minHeight = Integer.MAX_VALUE;
        if(root.left != null){
            minHeight = Math.min(minDepth(root.left), minHeight);
        }
        if(root.right != null){
            minHeight = Math.min(minDepth(root.right), minHeight);
        }
        return minHeight + 1;
    }
}
