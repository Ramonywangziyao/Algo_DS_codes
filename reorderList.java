class Solution {
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode slow = head, fast = head, pre = null, trace = new ListNode(0), next;
        boolean single = true;
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        pre = null;
        next = slow.next;
        while(true) {
            slow.next = pre;
            pre = slow;
            slow = next;
            if(next == null) break;
            next = next.next;
        }
        while(head != null || pre != null) {
            if(single && head != null) {
                trace.next = head;
                head = head.next;
            } else {
                trace.next = pre;
                pre = pre.next;
            }
            if(head == null && pre == null) break;
            trace = trace.next;
            single = single?false:true;
        }
    }
}
