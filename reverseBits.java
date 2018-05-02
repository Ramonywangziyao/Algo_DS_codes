
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++) {
            res += n & 1;
            // >=32 shift causes integer overflow
            if(i<31) res <<= 1;
            // logic shift
            n >>>= 1;
        }
        return res;
    }
}
