/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
    	ListNode l3 = head;
    	int y = 0;
        while (l1 != null || l2 != null) {
            int x = 0;
            if (l1 != null && l2 != null) {
                x = l1.val + l2.val + y;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 == null) {
                x = l2.val + y;
                l2 = l2.next;
            } else {
                x = l1.val + y;
                l1 = l1.next;
            }
            if (x >= 10) {
                l3.next = new ListNode(x % 10);
                y = 1;
            } else {
                l3.next = new ListNode(x);
                y = 0;
            }
        	l3 = l3.next;
        }
        if (y == 1) {
            l3.next = new ListNode(1);
        }
        return head.next;
    }
}