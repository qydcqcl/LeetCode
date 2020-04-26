package org.example.simple.demo021;

/**
 * @author hzq
 * @date 2020/4/10 10:39
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();
        ListNode l1 = new ListNode(1);
        ListNode n1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode n4 = new ListNode(4);
        l1.next = l2;
        l2.next = l4;

        n1.next = n3;
        n3.next = n4;

        ListNode listNode = example2.mergeTwoLists(l1, n1);
        System.out.println(listNode.val);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preHead = new ListNode(-1);
        ListNode pre = preHead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                pre.next = l1;
                l1 = l1.next;
            }else{
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        pre.next = l1 == null ? l2 : l1;
        return preHead.next;
    }
}
