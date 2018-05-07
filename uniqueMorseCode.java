class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<String>();
        String [] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String s : words) {
            String tmp = "";
            for(char c : s.toCharArray()) tmp += codes[c-'a'];
            if(!set.contains(tmp)) set.add(tmp);
        }
        return set.size();
    }
}
