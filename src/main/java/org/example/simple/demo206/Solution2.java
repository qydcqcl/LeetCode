package org.example.simple.demo206;

/**
 * @author hzq
 * @date 2020/6/4 21:50
 */
public class Solution2 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        Solution2 solution2 = new Solution2();
        ListNode node = solution2.reverseList(head);
        System.out.println(node.val);
    }

    public ListNode reverseList(ListNode head) {
        if(head == null ||head.next == null){
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
}
