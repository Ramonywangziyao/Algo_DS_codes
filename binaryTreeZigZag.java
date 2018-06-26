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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        Queue<TreeNode> init = new LinkedList<>();
        init.add(root);
        helper(res, init, 0);
        return res;
    }

    public void helper(List<List<Integer>> res, Queue<TreeNode> q, int lv) {
        if(q.peek() == null) return;
        Queue<TreeNode> next = new LinkedList<>();
        List<Integer> level = new ArrayList<>();
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            level.add(node.val);
            if(node.left != null) next.add(node.left);
            if(node.right != null) next.add(node.right);
        }
        if(lv % 2 == 0) {
            res.add(level);
        } else {
            Collections.reverse(level);
            res.add(level);
        }
        helper(res, next, lv + 1);
    }
}
