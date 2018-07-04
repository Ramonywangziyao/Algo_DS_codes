class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0), temp = null, prev = null;
        dummy.next = head;
        while(head != null && head.next != null) {
            if(head.val <= head.next.val) {
                head = head.next;
            } else {
                temp = head.next;
                head.next = temp.next;
                prev = dummy;
                while(prev.next.val <= temp.val) prev = prev.next;
                temp.next = prev.next;
                prev.next = temp;
            }
        }
        return dummy.next;

    }
}
