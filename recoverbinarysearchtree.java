/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private TreeNode first = null;
    private TreeNode prev = null;
    private TreeNode second = null;
    public void recoverTree(TreeNode root) {
        if(root == null) return;
        helper(root);
        if(first != null && second != null) {
            int tmp = first.val;
            first.val = second.val;
            second.val = tmp;
        }
    }

    public void helper(TreeNode root) {
        if(root == null) return;
        helper(root.left);
        if(prev != null && root.val <= prev.val) {
            if(first == null) first = prev;
            second = root;
        }
        prev = root;
        helper(root.right);
    }
}
