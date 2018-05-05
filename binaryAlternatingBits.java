
class Solution {
    public boolean hasAlternatingBits(int n) {
        int startBit = ((n & 1) == 1) ? 0 : 1;
        while(n != 0) {
            if(((n ^ startBit) & 1) == 0) return false;
            startBit = startBit == 1 ? 0 : 1;
            n >>>= 1;
        }
        return true;
    }
}
