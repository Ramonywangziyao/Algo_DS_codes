class Solution {
    public List<List<Integer>> getFactors(int n) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result,new ArrayList<Integer>(), n , 2);
        return result;
    }

    private void helper(List<List<Integer>> result, List<Integer> items, int n, int start) {
        if(n <= 1) {
            if(items.size()>1) {
                result.add(new ArrayList<Integer>(items));
            }
            return;
        }
        for(int i = start; i <= n; i++) {
            if(n%i == 0) {
                items.add(i);
                helper(result,items,n/i,i);
                items.remove(items.size()-1);
            }
        }
    }
}
