class Solution {
    public List<String> res;
    public List<String> letterCasePermutation(String S) {
        res = new LinkedList<String>();
        helper(S.toCharArray(),0);
        return res;
    }

    public void helper(char [] ca, int idx) {
        if(idx >= ca.length) {
            res.add(new String(ca));
            return;
        }
        if(Character.isDigit(ca[idx])) helper(ca,idx+1);
        else {
            ca[idx] = Character.toLowerCase(ca[idx]);
            helper(ca,idx+1);
            ca[idx] = Character.toUpperCase(ca[idx]);
            helper(ca,idx+1);
        }
    }
}
