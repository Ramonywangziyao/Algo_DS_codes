class Solution {
    public List<Integer> partitionLabels(String S) {
        int [] map = new int[26];
        List<Integer> res = new LinkedList<Integer>();
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            map[c-'a'] = Math.max(i,map[c-'a']);
        }
        int start = 0, last = 0;
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            last = Math.max(last,map[c-'a']);
            if(last == i) {
                res.add(last-start+1);
                start = last+1;
            }
        }
        return res;
    }
}
