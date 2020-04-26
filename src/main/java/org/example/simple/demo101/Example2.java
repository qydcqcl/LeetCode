package org.example.simple.demo101;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hzq
 * @date 2020/4/26 22:30
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        TreeNode p = new TreeNode(1);
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = null;
        TreeNode p4 = new TreeNode(3);
        TreeNode p5 = null;
        TreeNode p6 = new TreeNode(3);
        p.left = p1;
        p1.left = p3;
        p1.right = p4;
        p.right = p2;
        p2.left = p5;
        p2.right = p6;
        boolean symmetric = example2.isSymmetric(p);
        System.out.println(symmetric);
    }

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while(!q.isEmpty()){
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if(t1 == null && t2 == null){return true;}
            if(t1 == null || t2 == null){return false;}
            if(t1.val != t2.val){return false;}
            q.add(t1.left);
            q.add(t2.right);
            q.add(t2.left);
            q.add(t1.right);
        }
        return true;
    }
}
