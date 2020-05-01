package org.example.simple.demo141;

/**
 * @author hzq
 * @date 2020/5/1 15:58
 */
public class Example2 {

    public static void main(String[] args) {
        Example2 example2 = new Example2();

        ListNode head = new ListNode(1);
        ListNode n1 = new ListNode(2);
        head.next = n1;
//        n1.next = head;

        boolean b = example2.hasCycle(head);
        System.out.println(b);
    }

    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
