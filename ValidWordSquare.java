class Solution {
    public boolean validWordSquare(List<String> words) {
        if(words.size()==0) return true;
        int sz = words.size();
        for(int i = 0, slen = 0; i < sz; i++){
            String s = words.get(i);
            slen = s.length();
            for(int j = 0; j < slen; j++){
                // check all extreme conditions
                if(j >= sz || i >= words.get(j).length() || s.charAt(j) != words.get(j).charAt(i))
                    return false;
            }
        }
        return true;
    }
}
