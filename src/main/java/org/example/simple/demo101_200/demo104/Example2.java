package org.example.simple.demo101_200.demo104;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hzq
 * @date 2020/4/26 22:44
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
        int i = example2.maxDepth(root);
        System.out.println(i);
    }

    public int maxDepth(TreeNode root) {
        Queue<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if(root != null){
            stack.add(new Pair<>(root, 1));
        }
        int depth = 0;
        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> current = stack.poll();
            root = current.getKey();
            int currDepth = current.getValue();
            if(root != null){
                depth = Math.max(depth, currDepth);
                stack.add(new Pair<>(root.left, currDepth + 1));
                stack.add(new Pair<>(root.right, currDepth +1));
            }
        }
        return depth;
    }
}
