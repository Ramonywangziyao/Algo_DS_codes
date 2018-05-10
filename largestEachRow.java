class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> l = new LinkedList<Integer>();
        if(root == null) return l;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        return bfs(q, l);
    }

    private List<Integer> bfs(Queue<TreeNode> q, List<Integer> res) {
        if(q.peek() == null) return res;
        Queue<TreeNode> next = new LinkedList<TreeNode>();
        int max = Integer.MIN_VALUE;
        while(q.peek()!=null) {
            TreeNode tmp = q.poll();
            max = Math.max(max,tmp.val);
            if(tmp.left != null) next.add(tmp.left);
            if(tmp.right != null) next.add(tmp.right);
        }
        res.add(max);
        return bfs(next,res);
    }
}
