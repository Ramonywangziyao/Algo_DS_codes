class Solution {
    public boolean isMatch(String s, String p) {
        int sp = 0, pp = 0, start = -1, match = 0;
        while(sp < s.length()) {
            if(pp < p.length() && (s.charAt(sp) == p.charAt(pp) || p.charAt(pp) == '?')) {
                sp++;
                pp++;
            } else if(pp < p.length() && p.charAt(pp) == '*') {
                start = pp;
                match = sp;
                pp++;
            } else if(start != -1) {
                pp = start + 1;
                match++;
                sp = match;
            } else return false;
        }
        while(pp < p.length() && p.charAt(pp) == '*') {
            pp++;
        }
        return pp == p.length();
    }
}
