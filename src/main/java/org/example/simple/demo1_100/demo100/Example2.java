package org.example.simple.demo1_100.demo100;

import java.util.ArrayDeque;

/**
 * @author hzq
 * @date 2020/4/26 10:08
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        TreeNode p = new TreeNode(1);
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(3);
        p.left = p1;
        p.right = p2;

        TreeNode q = new TreeNode(1);
        TreeNode q1 = new TreeNode(2);
        TreeNode q2 = new TreeNode(3);
        q.left = q1;
        q.right = q2;
        boolean b = example2.isSameTree(p, q);
        System.out.println(b);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if(!check(p,q)){
            return false;
        }

        //init ArrayDeque
        ArrayDeque<TreeNode> deqP = new ArrayDeque<>();
        ArrayDeque<TreeNode> deqQ = new ArrayDeque<>();
        deqP.addLast(p);
        deqQ.addLast(q);

        while(!deqP.isEmpty()){
            p = deqP.removeFirst();
            q = deqQ.removeFirst();

            if(!check(p, q)){
                return false;
            }

            if(p != null){
                if(!check(p.left, q.left)){
                    return false;
                }
                if(p.left != null){
                    deqP.addLast(p.left);
                    deqQ.addLast(q.left);
                }
                if (!check(p.right, q.right)) {
                    return false;
                }
                if(p.right != null){
                    deqP.add(p.right);
                    deqQ.add(q.right);
                }
            }
        }
        return true;
    }

    private boolean check(TreeNode p, TreeNode q) {
        if(p == null && q ==null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return true;
    }
}
