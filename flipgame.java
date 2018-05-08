class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> ans = new LinkedList<String>();
        char[] hold = s.toCharArray();
        for(int i = 0, len = s.length(); i < len; i++) {
            if(i+1 >= len) break;
            if(hold[i] == hold[i+1] && hold[i] == '+') {
                hold[i] = '-';
                hold[i+1] = '-';
                ans.add(new String(hold));
                hold[i] = '+';
                hold[i+1] = '+';
            }
        }
        return ans;
    }
}
