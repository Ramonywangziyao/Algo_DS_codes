class Solution {
    int max;
    public int longestConsecutive(TreeNode root) {
        if(root == null) return 0;
        max = 0;
        dfs(root,Integer.MAX_VALUE,1);
        return max;
    }

    private void dfs(TreeNode root,int last, int count){
        if(root == null) {
            max = Math.max(count,max);
            return;
        }
        if(root.val - last == 1) {
            count++;
        } else {
            max = Math.max(count,max);
            count = 1;
        }
        dfs(root.left,root.val,count);
        dfs(root.right,root.val,count);
    }
}
