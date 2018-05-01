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
    public TreeNode sortedArrayToBST(int[] nums) {
        // 测试极端case，如果input为空
        if(nums.length <= 0) return null;
        return build(nums,0,nums.length-1);
    }

    public TreeNode build(int[] nums,int lo, int hi){
        // 检查是否已经无路可走....
        if(hi<lo) return null;
        // 得到中间值位置
        int mid = lo+(hi-lo)/2;
        TreeNode tmp = new TreeNode(nums[mid]);
        // 左右开攻 -1 +1 防溢出
        tmp.left = build(nums,lo,mid-1);
        tmp.right = build(nums,mid+1,hi);
        return tmp;
    }
}
