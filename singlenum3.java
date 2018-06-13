class Solution {
    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for(int n : nums) {
            diff ^= n;
        }
        diff &= -diff;
        int[] ans = new int[2];
        for(int n : nums) {
            if((n & diff) == 0) {
                ans[0] ^= n;
            } else {
                ans[1] ^= n;
            }
        }
        return ans;
    }
}
