public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode cur = root, level = cur;
        while(level != null) {
            while(cur != null) {
                if(cur.left != null) {
                    cur.left.next = cur.right;
                }
                if(cur.right != null && cur.next != null) {
                    cur.right.next = cur.next.left;
                }
                cur = cur.next;
            }
            cur = level.left;
            level = cur;
        }
    }
}
