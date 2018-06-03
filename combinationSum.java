class Solution {
    private List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        helper(0,target,candidates,ans,new ArrayList<Integer>(),0);
        return ans;
    }

    private void helper(int sum, int target, int[] candidates, List<List<Integer>> ans, List<Integer> list,int start){
        if(sum >= target){
            if(sum == target) {
                ans.add(new ArrayList<Integer>(list));
            }
            return;
        }
        for(int i = start; i < candidates.length; i++) {
            list.add(candidates[i]);
            sum+=candidates[i];
            helper(sum,target,candidates,ans,list,i);
            list.remove(list.size()-1);
            sum-=candidates[i];
        }
    }
}
