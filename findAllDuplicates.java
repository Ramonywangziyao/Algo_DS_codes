class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new LinkedList<Integer>();
        for(int i = 0, len = nums.length; i < len; i++) {
            int val = Math.abs(nums[i]);
            if(nums[val-1] < 0 ) ans.add(val);
            nums[val-1] *= -1;
        }
        return ans;
    }
}
