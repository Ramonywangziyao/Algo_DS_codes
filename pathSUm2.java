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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        helper(root, res, new ArrayList<>(), 0, sum);
        return res;
    }

    public void helper(TreeNode node, List<List<Integer>> res, List<Integer> list, int cum, int sum) {
        if(node == null) return;
        if(node.left == null && node.right == null) {
            if(cum + node.val == sum) {
                list.add(node.val);
                res.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }
            return;
        }
        list.add(node.val);
        helper(node.left, res, list, cum + node.val, sum);
        helper(node.right, res, list, cum + node.val, sum);
        list.remove(list.size() - 1);
    }
}
