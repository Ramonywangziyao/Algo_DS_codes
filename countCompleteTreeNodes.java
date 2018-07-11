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
    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        int left = countHeight(root, -1, 0), right = countHeight(root, 1, 0);
        if(left == right) return (1 << left) - 1;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    public int countHeight(TreeNode root, int dir, int res) {
        while(root != null) {
            root = dir == -1 ? root.left : root.right;
            res++;
        }
        return res;
    }
}
