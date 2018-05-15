class Solution {
    List<String> ans;
    public List<String> letterCombinations(String digits) {
        ans = new LinkedList<String>();
        int length = digits.length();
        if(length == 0) return ans;
        dfs(digits,length,0,ans,"",new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"});
        return ans;
    }

    private void dfs(String digits, int strlen, int idx, List<String> ans, String res, String[] m) {
        if(idx == strlen) {
            ans.add(res);
            return;
        }
        int pos = digits.charAt(idx)-'0'-2;
        for(int i = 0, len = m[pos].length(); i < len; i++) dfs(digits,strlen,idx+1,ans,res+m[pos].charAt(i),m);
    }
}
