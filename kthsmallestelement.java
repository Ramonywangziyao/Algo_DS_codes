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
    private int count, set;
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return 0;
        count = 1;
        set = -1;
        return helper(root, k);
    }

    public int helper(TreeNode root, int k) {
        if(root == null) return -1;
        int le = helper(root.left, k);
        if(count == k && set == -1) {
            ans = root.val;
            set = 1;
            return root.val;
        }
        count++;
        int ri = helper(root.right, k);
        return Math.max(le,ri);
    }
}
