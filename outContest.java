
class Solution {
    public String findContestMatch(int n) {
        String [] init = new String[n];
        for(int i = 1; i <= n; i++) init[i-1] = i+"";
        while(n > 1) {
            for(int i = 0; i < n/2; i++) init[i] = "("+init[i]+","+init[n-1-i]+")";
            n /= 2;
        }
        return init[0];
    }
}
