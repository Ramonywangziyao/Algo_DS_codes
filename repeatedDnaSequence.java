class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> res = new ArrayList<>();
        if(s == null || s.length() < 10) return res;
        Set<String> set = new HashSet<>(), added = new HashSet<>();
        for(int i = 0, len = s.length(); i + 10 <= len; i++) {
            String tmp = s.substring(i, i+10);
            if(!set.contains(tmp)) {
                set.add(tmp);
            } else if(!added.contains(tmp)){
                res.add(tmp);
                added.add(tmp);
            }
        }
        return res;
    }
}
