class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        int start = 0, len = nums.length;
        for(int i = 1; i < len; i++) {
            if(nums[i - 1] + 1 != nums[i]) {
                if(nums[i - 1] == nums[start]) res.add(nums[start]+"");
                else res.add(nums[start]+"->"+nums[i-1]);
                start = i;
            }
        }
        if(nums[start] == nums[len - 1]) res.add(nums[start]+"");
        else res.add(nums[start]+"->"+nums[len-1]);
        return res;
    }
}
