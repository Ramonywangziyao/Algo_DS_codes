class Solution {
    public List<List<String>> partition(String s) {
        if(s == null || s.length() == 0) return null;
        List<List<String>> ans = new ArrayList<>();
        helper(ans, new ArrayList<String>(), s, 0);
        return ans;
    }

    public void helper(List<List<String>> ans, List<String> list, String s, int start){
        if(start >= s.length()) {
            ans.add(new ArrayList<String>(list));
            return;
        }
        for(int i = start; i < s.length(); i++) {
            String sub = s.substring(start,i + 1);
            if(isPali(sub)) {
                list.add(sub);
                helper(ans,list,s,i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public boolean isPali(String s){
        for(int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }


}
