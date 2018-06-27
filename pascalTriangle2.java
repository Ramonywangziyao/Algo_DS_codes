class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        if(rowIndex == 0) return ans;
        int t = rowIndex, b = 1;
        long cur = 1;
        for(int i = 1; i <= rowIndex; i++) {
            cur = cur * t;
            cur = cur / b;
            ans.add((int)cur);
            t--;b++;
        }
        return ans;
    }
}
