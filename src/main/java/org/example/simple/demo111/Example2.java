package org.example.simple.demo111;

import javafx.util.Pair;

import java.util.LinkedList;

/**
 * @author hzq
 * @date 2020/4/28 22:25
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        TreeNode root = new TreeNode(3);
        TreeNode p1 = new TreeNode(9);
        TreeNode p2 = new TreeNode(20);
        TreeNode p3 = new TreeNode(15);
        TreeNode p4 = new TreeNode(7);

        root.left = p1;
        root.right = p2;
        p2.left = p3;
        p2.right = p4;
        int i = example2.minDepth(root);
        System.out.println(i);
    }

    public int minDepth(TreeNode root) {
        LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if(root == null){
            return 0;
        }else{
            stack.add(new Pair<>(root, 1));
        }

        int minHeight = Integer.MAX_VALUE;
        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> pair = stack.pollLast();
            root = pair.getKey();
            Integer currentheight = pair.getValue();
            if(root.left == null && root.right == null){
                minHeight = Math.min(currentheight, minHeight);
            }
            if(root.left != null){
                stack.add(new Pair<>(root.left, currentheight + 1));
            }
            if(root.right != null){
                stack.add(new Pair<>(root.right, currentheight + 1));
            }
        }
        return minHeight;
    }
}
