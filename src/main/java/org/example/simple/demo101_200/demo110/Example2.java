package org.example.simple.demo101_200.demo110;

/**
 * @author hzq
 * @date 2020/4/27 22:59
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        TreeNode root = new TreeNode(1);
        TreeNode p1 = new TreeNode(2);
        TreeNode p2 = new TreeNode(2);
        TreeNode p3 = new TreeNode(3);
        TreeNode p4 = new TreeNode(3);
        TreeNode p5 = new TreeNode(4);
        TreeNode p6 = new TreeNode(5);
        root.left = p1;
        root.right = p2;
        p1.left = p3;
        p1.right = p4;
        p3.left = p5;
        p3.right = p6;

        boolean balanced = example2.isBalanced(root);
        System.out.println(balanced);
    }

    public boolean isBalanced(TreeNode root) {
        return isBalancedTreeHelper(root).balanced;
    }

    /**
     * Return whether or not the tree at root is balanced while also storing
     * the tree's height in a reference variable.
     *
     * @param root
     * @return
     */
    private TreeInfo isBalancedTreeHelper(TreeNode root) {
        // An empty tree is balanced and has height = -1
        if(root == null){
            return new TreeInfo(-1, true);
        }

        // Check subtrees to see if they are balanced.
        TreeInfo left = isBalancedTreeHelper(root.left);
        if(!left.balanced){
            return new TreeInfo(-1, false);
        }
        TreeInfo right = isBalancedTreeHelper(root.right);
        if(!right.balanced){
            return new TreeInfo(-1, false);
        }
        if(Math.abs(left.height - right.height) < 2){
            return new TreeInfo(Math.max(left.height, right.height) + 1, true);
        }
        return new TreeInfo(-1, false);
    }
}
