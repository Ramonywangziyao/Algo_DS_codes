class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return new LinkedList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        return bfs(q, new LinkedList<List<Integer>>());
    }

    private List<List<Integer>> bfs(Queue<TreeNode> q, List<List<Integer>> ans) {
        if(q.peek() == null) return ans;
        List<Integer> tmp = new LinkedList<Integer>();
        int size = q.size();
        for(int i = 0; i < size; i++) {
            TreeNode n = q.poll();
            if(n.left != null) q.add(n.left);
            if(n.right != null) q.add(n.right);
            tmp.add(n.val);
        }
        ans.add(tmp);
        return bfs(q,ans);
    }
}
