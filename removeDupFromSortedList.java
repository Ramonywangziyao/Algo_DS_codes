/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode trace = new ListNode(0), res = trace;
        trace.next = head;
        boolean found;
        while(head!=null) {
            found = head.next != null && head.val == head.next.val ? true : false;
            while(head.next != null && head.val == head.next.val) {
                trace.next = head.next;
                head = head.next;
            }
            if(found) trace.next = head.next;
            if(!found) trace = trace.next;
            head = head.next;
        }
        return res.next;
    }
}
