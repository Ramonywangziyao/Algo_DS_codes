class Solution {
    public void wiggleSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(i + 1 == nums.length) break;
            if(i % 2 == 0) {
                if(nums[i+1] < nums[i]) swap(nums,i);
            } else {
                if(nums[i+1] > nums[i]) swap(nums,i);
            }
        }
    }

    private void swap(int[] nums, int x) {
        int tmp = nums[x];
        nums[x] = nums[x+1];
        nums[x+1] = tmp;
    }
}
