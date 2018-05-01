class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root)!=-1;
    }

    public int height(TreeNode root){
        if(root == null) return 0;

        // check left
        int le = height(root.left);

        // if already not balanced, return -1
        if(le==-1) return -1;

        // check right
        int ri = height(root.right);

        // if right already not balanced, return -1
        if(ri==-1) return -1;

        // if their height diff is greater than 1, return -1
        if(Math.abs(le-ri) >1) return -1;

        // return the current max height to the last level of execution
        return Math.max(le,ri)+1;
    }
}
