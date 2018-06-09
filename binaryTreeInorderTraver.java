class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(cur != null || !stack.empty()) {
            while(cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            TreeNode tmp = stack.pop();
            ans.add(tmp.val);
            cur = tmp.right;
        }
        return ans;
    }

}
