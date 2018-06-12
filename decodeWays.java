class Solution {
    public int numDecodings(String s) {
        if(s == null || s.length() == 0) return 0;
        int len = s.length(), d1 = 1, d2 = s.charAt(0) != '0' ? 1 : 0;
        for(int i = 2; i <= len; i++) {
            int first = Integer.parseInt(s.substring(i-1,i));
            int second = Integer.parseInt(s.substring(i-2,i));
            int dc = 0;
            if(first > 0 && first < 10) dc += d2;
            if(second >= 10 && second <= 26) dc += d1;
            d1 = d2;
            d2 = dc;
        }
        return d2;
    }
}
