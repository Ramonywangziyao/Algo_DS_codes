class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            for(int j = i+1, k = nums.length - 1; j < k;) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum >= target) k--;
                else {
                    count += k - j;
                    j++;
                }
            }
        }
        return count;
    }
}
