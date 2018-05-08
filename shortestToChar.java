class Solution {
    public int[] shortestToChar(String S, char C) {
        int len = S.length(), pos = -len;
        int [] ans = new int[len];
        for(int i = 0; i < len; i++) {
            if(S.charAt(i) == C) pos = i;
            ans[i] = i - pos;
        }
        for(int i = len-1; i >= 0; i--) {
            if(S.charAt(i) == C) pos = i;
            ans[i] = Math.min(Math.abs(i - pos),ans[i]);
        }
        return ans;
    }
}
