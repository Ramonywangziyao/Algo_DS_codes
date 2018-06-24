class Solution {
    public List<String> generatePalindromes(String s) {
        if(s == null || s.length() == 0) return null;
        List<String> res = new ArrayList<>();
        Map<Character, Integer> m = new HashMap<>();
        String single = "", newStr = "";
        if(!checkGenerable(s, m)) return res;
        for(Map.Entry e : m.entrySet()) {
            int value = (int)e.getValue();
            if(value % 2 == 1) single = e.getKey()+"";
            value /= 2;
            while(value-- > 0) newStr+=e.getKey();
        }
        helper(res, newStr, new HashSet<Integer>(), newStr.length(), "", single);
        return res;
    }

    public boolean checkGenerable(String s, Map<Character, Integer> m) {
        for(char c : s.toCharArray()) m.put(c, m.getOrDefault(c, 0) + 1);
        boolean foundOdd = false;
        for(Map.Entry e : m.entrySet()) {
            int value = (int)e.getValue();
            if(value % 2 == 1 && !foundOdd) foundOdd = true;
            else if(value % 2 == 1 && foundOdd) return false;
        }
        return true;
    }

    public void helper(List<String> ans, String s, Set<Integer> checkedIndex, int len, String permut, String single) {
        if(checkedIndex.size() == len) {
            String finalStr = permut + single + new StringBuilder(permut).reverse().toString();
            ans.add(finalStr);
            return;
        }
        for(int i = 0; i < len; i++) {
            if(checkedIndex.contains(i)) continue;
            if(i > 0 && s.charAt(i) == s.charAt(i - 1) && !checkedIndex.contains(i - 1)) continue;
            checkedIndex.add(i);
            helper(ans, s, checkedIndex, len, permut+s.charAt(i), single);
            checkedIndex.remove(i);
        }
    }
}
