package org.example.simple.demo107;

import java.util.LinkedList;
import java.util.List;

/**
 * @author hzq
 * @date 2020/4/26 23:07
 */
public class Example2 {

    private LinkedList<List<Integer>> ans;

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
        List<List<Integer>> lists = example2.levelOrderBottom(root);
        System.out.println(lists);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ans = new LinkedList<>();
        getOrder(root, 1);
        return ans;
    }

    private void getOrder(TreeNode root, int level) {
        if(root == null){
            return;
        }
        if(ans.size() < level){
            ans.addFirst(new LinkedList<>());
        }
        List<Integer> subList  = ans.get(ans.size() - level);
        subList.add(root.val);
        getOrder(root.left, level + 1);
        getOrder(root.right, level + 1);
    }
}
