
class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for(int len = s.length()-1, i = len; i >= 0; i-=2) {
            char c = s.charAt(i), pre = i > 0 ? s.charAt(i-1) : ' ';
            if(i > 0 && ((c == 'V') || (c == 'X')) && pre == 'I') res += c == 'V' ? 4 : 9;
            else if(i > 0 && ((c == 'L') || (c == 'C')) && pre == 'X') res += c == 'L' ? 40 : 90;
            else if(i > 0 && ((c == 'D') || (c == 'M')) && pre == 'C') res += c == 'D' ? 400 : 900;
            else {
                if(c == 'I') res += 1;
                else if (c == 'V') res += 5;
                else if(c == 'X') res += 10;
                else if(c == 'L') res += 50;
                else if(c == 'C') res += 100;
                else if(c == 'D') res += 500;
                else res += 1000;
                i++;
            }
        }
        return res;
    }
}
