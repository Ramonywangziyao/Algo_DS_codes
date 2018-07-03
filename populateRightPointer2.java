public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode head = null, pre = null, cur = root;
        while(cur != null) {
            while(cur != null) {
                if(cur.left != null) {
                    if(pre != null) {
                        pre.next = cur.left;
                    } else {
                        head = cur.left;
                    }
                    pre = cur.left;
                }

                if(cur.right != null) {
                    if(pre != null) {
                        pre.next = cur.right;
                    } else {
                        head = cur.right;
                    }
                    pre = cur.right;
                }
                cur = cur.next;
            }
            cur = head;
            head = null;
            pre = null;
        }
    }
}
