class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode fast = head, slow = head;
        while(fast.next != null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next!=null) slow = slow.next;
        slow = reverse(slow);
        fast = head;
        while(slow!=null) {
            if(slow.val!=fast.val) return false;
            slow = slow.next;
            fast = fast.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode last = null, tmp;
        while(true) {
            tmp = head.next;
            head.next = last;
            if(tmp == null) break;
            last = head;
            head = tmp;
        }
        return head;
    }
}
