class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int count = 1, pos = 0, last = nums[0], res = 0;
        for(int i = 0, len = nums.length; i < len;) {
            if(count > 2) while(i < len && nums[i] == last) i++;
            if(i >= len) break;
            if(nums[i] != last) {
                count = 1;
                last = nums[i];
            }
            nums[pos++] = nums[i++];
            res++;
            count++;
        }
        return res;
    }
}
