class Solution {
    private List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        helper(0,target,candidates,ans,new ArrayList<Integer>(),-1);
        return ans;
    }

    private void helper(int sum, int target, int[] candidates, List<List<Integer>> ans, List<Integer> list,int start){
        if(sum >= target){
            if(sum == target) {
                ans.add(new ArrayList<Integer>(list));
            }
            return;
        }
        for(int i = start+1; i < candidates.length; i++) {
            if(i>start+1&&candidates[i] == candidates[i-1]) continue;
            list.add(candidates[i]);
            sum+=candidates[i];
            helper(sum,target,candidates,ans,list,i);
            list.remove(list.size()-1);
            sum-=candidates[i];
        }
    }
}
