package org.example.simple.demo101_200.demo112;

import java.util.LinkedList;

/**
 * @author hzq
 * @date 2020/4/28 22:55
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();

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

        boolean b = example2.hasPathSum(root, 22);
        System.out.println(b);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        LinkedList<TreeNode> nodeStack = new LinkedList();
        LinkedList<Integer> sumStack = new LinkedList();
        nodeStack.add(root);
        sumStack.add(sum - root.val);

        TreeNode node;
        int currSum;
        while(!nodeStack.isEmpty()){
            node = nodeStack.pollLast();
            currSum = sumStack.pollLast();
            if(node.left == null && node.right == null && currSum == 0){
                return true;
            }
            if(node.right != null){
                nodeStack.add(node.right);
                sumStack.add(currSum - node.right.val);
            }
            if(node.left != null){
                nodeStack.add(node.left);
                sumStack.add(currSum - node.left.val);
            }
        }
        return false;
    }
}
