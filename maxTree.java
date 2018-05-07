class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums,0,nums.length);
    }

    public TreeNode buildTree(int[] nums, int start, int end) {
        if(start >= end) return null;
        int max = Integer.MIN_VALUE, maxIdx = -1;
        for(int i = start; i < end; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxIdx = i;
            }
        }
        TreeNode maxRoot = new TreeNode(max);
        maxRoot.left = buildTree(nums, start, maxIdx);
        maxRoot.right = buildTree(nums, maxIdx+1, end);
        return maxRoot;
    }
}
