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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        // 找小的目标节点和大的目标节点
        TreeNode sm = p.val <= q.val? p : q;
        TreeNode l = sm == p? q : p;
        // 如果分布两边或中间，父节点为lca
        if(sm.val <= root.val && l.val >= root.val) return root;
        // 分布在一边，找到下一次recur的方向
        TreeNode dir = sm.val > root.val? root.right : l.val < root.val? root.left : null;
        // 继续前行
        return lowestCommonAncestor(dir,sm,l);
    }
}
