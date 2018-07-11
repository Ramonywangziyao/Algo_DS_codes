class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    public int rob(int[] nums, int lo, int hi) {
        if(lo >= nums.length || hi >= nums.length) return 0;
        int prevNot = 0, prevRob = 0;
        for(int i = lo; i <= hi; i++) {
            int tmp = prevNot;
            prevNot = Math.max(prevNot, prevRob);
            prevRob = tmp + nums[i];
        }
        return Math.max(prevNot, prevRob);
    }
}
