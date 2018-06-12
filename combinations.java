class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(n,k,1,0,new ArrayList<Integer>(), ans);
        return ans;
    }

    public void helper(int n, int k, int cur, int count, List<Integer> list, List<List<Integer>> ans) {
        if(count == k) {
            ans.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i = cur; i <= n; i++) {
            list.add(i);
            helper(n, k, i+1, count+1, list, ans);
            list.remove(list.size()-1);
        }
    }
}
