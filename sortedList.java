class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fast = head, slow = head, cut = slow;
        while(fast != null && fast.next!=null) {
            cut = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        cut.next = null;
        ListNode l = sortList(head);
        ListNode r = sortList(slow);
        return merger(l,r);
    }

    public ListNode merger(ListNode n1, ListNode n2) {
        ListNode head = new ListNode(0), res = head;
        while(n1!=null || n2!=null) {
            if(n1 == null) {
                head.next = n2;
                n2 = n2.next;
            } else if (n2 == null) {
                head.next = n1;
                n1 = n1.next;
            } else if(n1.val <= n2.val) {
                head.next = n1;
                n1 = n1.next;
            } else if(n2.val < n1.val) {
                head.next = n2;
                n2 = n2.next;
            }
            if(res == null) res = head;
            head = head.next;
        }
        return res.next;
    }
}
