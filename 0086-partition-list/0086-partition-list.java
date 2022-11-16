/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode ptr1 = new ListNode();
        ListNode ptr2 = new ListNode();
        ListNode l = ptr1;
        ListNode r = ptr2;
        
        while(head != null) {
            if(head.val < x) {
                l.next = head;
                l = l.next;
            }
            else {
                r.next = head;
                r = r.next;
            }
            head = head.next;
        }
        
        r.next = null;
        l.next = ptr2.next;
        return ptr1.next;
    }
}