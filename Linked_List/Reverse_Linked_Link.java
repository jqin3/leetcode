/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
    	if (head == null || head.next == null) {
    		return head;
    	} 
    		ListNode cur = head.next;
    		head.next = null;
    		while (cur != null) {
    			
    			ListNode temp = cur.next;
    			cur.next = head;
    			head = cur;
    			cur = temp;
    		}
    	return head;
    }
}