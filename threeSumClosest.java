class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = nums[0]+nums[1]+nums[2];
        for(int i = 0; i < nums.length-2; i++) {
            int start = i+1, end = nums.length-1;
            while(start < end) {
                int sum = nums[i]+nums[start]+nums[end];
                min = Math.abs(sum-target) < Math.abs(min-target)? sum : min;
                if(sum > target) {
                    end--;
                }else if(sum < target) {
                    start++;
                }else return sum;
            }
        }
        return min;
    }
}
