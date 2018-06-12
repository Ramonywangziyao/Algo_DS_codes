class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head == null) return null;
        ListNode less = new ListNode(0), more = new ListNode(0), startL = less, startM = more;
        while(head != null) {
            if(head.val < x) {
                less.next = head;
                less = less.next;
            } else {
                more.next = head;
                more = more.next;
            }
            head = head.next;
        }
        less.next = startM.next;
        more.next = null;
        return startL.next;
    }
}
