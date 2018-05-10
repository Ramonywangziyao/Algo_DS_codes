public class BSTIterator {
    Stack<TreeNode> s;

    public BSTIterator(TreeNode root) {
        s = new Stack<TreeNode>();
        init(root);
    }

    public void init(TreeNode root) {
        for(; root != null; s.push(root), root = root.left);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !s.empty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmp = s.pop();
        init(tmp.right);
        return tmp.val;
    }
}
