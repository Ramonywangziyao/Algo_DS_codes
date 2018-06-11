class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums,nums.length,new ArrayList<Integer>(),ans,0);
        return ans;
    }

    private void helper(int[] nums, int len, List<Integer> list, List<List<Integer>> ans, int start) {
        if(start > len) return;
        ans.add(new ArrayList<Integer>(list));
        for(int i = start; i < len; i++) {
            list.add(nums[i]);
            helper(nums,len,list,ans,i+1);
            list.remove(list.size()-1);
            while(i+1 < len && nums[i] == nums[i+1]) i++;
        }
    }
}
