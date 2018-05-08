class Solution {
    public String customSortString(String S, String T) {
        int Slen = S.length(), Tlen = T.length(), idx = 0, exist;
        int [] nums = new int[Slen];
        int [] order = new int[26];
        char [] Tarr = T.toCharArray();
        for(int i = 0; i < Slen; i++) order[S.charAt(i)-'a'] = i+1;
        for(char c : Tarr) {
            exist = order[c-'a'];
            if(exist > 0) nums[exist-1]++;
        }
        for(int i = 0; i < Tlen; i++) {
            exist = order[Tarr[i]-'a'];
            if(exist > 0) {
                Tarr[i] = nums[idx] > 0 ? S.charAt(idx) : S.charAt(++idx);
                nums[idx]--;
            }
        }
        return new String(Tarr);
    }
}
