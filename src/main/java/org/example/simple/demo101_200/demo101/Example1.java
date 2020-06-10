package org.example.simple.demo101_200.demo101;

/**
 *
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 *
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 * @author hzq
 * @date 2020/4/26 22:15
 */
public class Example1 {

    public static void main(String[] args) {
        Example1 example1 = new Example1();
        TreeNode p = new TreeNode(1);
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);
        TreeNode p4 = new TreeNode(4);
        TreeNode p5 = new TreeNode(4);
        TreeNode p6 = new TreeNode(3);
        p.left = p1;
        p1.left = p3;
        p1.right = p4;
        p.right = p2;
        p2.left = p5;
        p2.right = p6;
        boolean b = example1.isSymmetric(p);
        System.out.println(b);
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){ return true; }
        if(t1 == null || t2 == null){ return false; }
        return t1.val == t2.val && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }


}
