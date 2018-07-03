public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                ListNode h2 = head;
                while(h2 != slow) {
                    slow = slow.next;
                    h2 = h2.next;
                }
                return h2;
            }
        }
        return null;
    }
}
