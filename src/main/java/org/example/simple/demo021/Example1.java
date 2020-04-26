package org.example.simple.demo021;

/**
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * @author hzq
 * @date 2020/4/10 10:29
 */
public class Example1 {


    public static void main(String[] args) {
        Example1 example1 = new Example1();
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

        ListNode listNode = example1.mergeTwoLists(l1, n1);
        System.out.println(listNode.val);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
