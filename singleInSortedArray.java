class Solution {
    public int singleNonDuplicate(int[] nums) {
        int len = nums.length, lo = 0, hi = len, mid = (lo+hi)/2;
        while((mid+1 < len && nums[mid+1] == nums[mid]) || (mid - 1 >= 0 && nums[mid-1] == nums[mid])) {
            if(mid % 2 == 0) {
                if(nums[mid-1] == nums[mid]) hi = mid;
                else lo = mid;
            } else {
                if(nums[mid-1] == nums[mid]) lo = mid;
                else hi = mid;
            }
            mid = (lo+hi)/2;
        }
        return nums[mid];
    }
}
