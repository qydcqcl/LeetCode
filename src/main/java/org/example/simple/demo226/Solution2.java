package org.example.simple.demo226;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hzq
 * @date 2020/6/5 16:55
 */
public class Solution2 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(7);
        TreeNode node3 = new TreeNode(1);
        TreeNode node4 = new TreeNode(3);
        TreeNode node5 = new TreeNode(6);
        TreeNode node6 = new TreeNode(9);

        root.left = node1;
        root.right = node2;

        node1.left = node3;
        node1.right = node4;

        node2.left = node5;
        node2.right = node6;

        Solution2 solution2 = new Solution2();
        TreeNode treeNode = solution2.invertTree(root);
        System.out.println(treeNode);
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode curr = queue.poll();
            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
            if(curr.left != null){
                queue.add(curr.left);
            }
            if(curr.right != null){
                queue.add(curr.right);
            }
        }
        return root;
    }
}
