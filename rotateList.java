/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;
        int start = 0, count = 0;
        ListNode headDup = head, newStart = null, end = null;
        while(true) {
            count++;
            if(head.next == null) {
                head.next = headDup;
                end = head;
                break;
            }
            head = head.next;
        }
        while(true) {
            int newPos = start + k >= count ? (start + k) % count : start + k;
            if(newPos == 0) {
                newStart = headDup;
                break;
            }
            headDup = headDup.next;
            end = end.next;
            start++;
        }
        end.next = null;
        return newStart;
    }
}
