class Solution {
    public TreeNode pruneTree(TreeNode root) {
        noOne(root);
        return root;
    }

    public boolean noOne(TreeNode root) {
        if(root == null) return true;
        boolean le = noOne(root.left);
        if(le) root.left = null;
        boolean ri = noOne(root.right);
        if(ri) root.right = null;
        return le && ri && root.val == 0;
    }
}
