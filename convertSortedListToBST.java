class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return new TreeNode(head.val);
        ListNode slow = head, fast = head, pre = new ListNode(0);
        pre.next = slow;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            pre = pre.next;
        }
        TreeNode root = new TreeNode(slow.val);
        pre.next = null;
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }
}
