class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        ans.add(new ArrayList<Integer>());
        for(int n : nums) {
            int sz = ans.size();
            for(int i = 0; i < sz; i++) {
                List<Integer> tmp = new ArrayList<Integer>(ans.get(i));
                tmp.add(n);
                ans.add(tmp);
            }
        }
        return ans;
    }
}
