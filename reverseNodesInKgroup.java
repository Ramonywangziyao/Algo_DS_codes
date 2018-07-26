/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1) return head;
        ListNode trace = head, pre = null, cur = head, next = null, res = null, last = null;
        int counter = 0, remin = k;
        while(trace != null) {
            counter++;
            trace = trace.next;
        }
        if(counter < k) return head;
        counter = counter / k;
        for(int i = counter; i > 0; i--) {
            ListNode tmp = cur;
            while(remin >= 1) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
                remin--;
            }
            if(res == null) res = pre;
            if(last != null) last.next = pre;
            last = tmp;
            pre = null;
            remin = k;
        }
        last.next = cur;
        return res;
    }
}
