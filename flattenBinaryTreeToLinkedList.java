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
    public void flatten(TreeNode root) {
        helper(root);
    }

    public TreeNode helper(TreeNode root) {
        if(root == null) return null;
        TreeNode le = helper(root.left);
        TreeNode ri = helper(root.right);
        root.left = null;
        root.right = le;
        TreeNode trace = root;
        while(trace.right != null) trace = trace.right;
        trace.right = ri;
        return root;
    }
}
