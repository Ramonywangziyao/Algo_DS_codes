class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode ans = new ListNode(0), pre = ans;
        ans.next = head;
        while(head != null && head.next !=null) {
            swap(pre,head,head.next);
            pre = pre.next.next;
            head = head.next;
        }
        return ans.next;
    }

    private void swap(ListNode pre, ListNode a, ListNode b) {
        ListNode next = b.next;
        pre.next = b;
        b.next = a;
        a.next = next;
    }
}
