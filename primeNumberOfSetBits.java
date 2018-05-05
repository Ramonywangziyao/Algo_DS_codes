
class Solution {
    public int countPrimeSetBits(int L, int R) {
        int res = 0;
        for(int i = L; i <= R; i++) {
            int bits = Integer.bitCount(i);
            res = checkPrime(bits) ? res+1 : res;
        }
        return res;
    }

    public boolean checkPrime(int n) {
        if(n == 1) return false;
        int sqrt = (int)Math.sqrt(n) + 1;
        for(int i = 2; i <sqrt; i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
