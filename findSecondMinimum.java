class Solution {
    // 随时追踪第一和第二最小值。
    int firstMin = Integer.MIN_VALUE, secMin = Integer.MIN_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        // 剪枝，如果空或如果知道第一第二最小值已经找到，当前值大于第二最小值，则没必要继续往下了。如果一直为相同值，返回-1
        if(root == null || (root.val > secMin && firstMin >= 0)) return firstMin < 0? -1 : secMin;
        // 递进最小值
        if(root.val>secMin && firstMin < 0){
            firstMin = secMin;
            secMin = root.val;
        }
        // 替换第二最小值
        if(root.val>firstMin && root.val<secMin) secMin = root.val;
        // 左右开攻，如果都没找到返回-1
        return Math.max(findSecondMinimumValue(root.left),findSecondMinimumValue(root.right)) >= 0 ? secMin : -1;
    }
}
