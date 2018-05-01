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
    public int closestValue(TreeNode root, double target) {
        // 因为是bst,比当前节点大要找最接近的值的话，当前节点就是最近的值了，同理比当前节点小
        TreeNode kid = target < root.val? root.left : root.right;
        // 证明等于当前节点，或已经走到底，节点不存在的
        if(kid == null) return root.val;
        int tmp = closestValue(kid,target);
        // 找最接近，比较正确方向子节点返回的和当前节点的值
        return Math.abs(tmp-target) < Math.abs(root.val-target)? tmp : root.val;
    }
}
