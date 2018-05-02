class Solution {
    public int numWays(int n, int k) {
        if(n<1) return 0;
        if(n==1) return k;
        if(n==2) return k*k;
        // the amount of ways when first two are different & when the first two are the same
        int diffFirstTwo = k*(k-1), sameFirstTwo = k, tmp;
        for(int i = 2; i<n; i++){
            tmp = diffFirstTwo;
            // exclude sameTwo situation
            diffFirstTwo = (sameFirstTwo + diffFirstTwo) * (k-1);
            // amount of sameTwo situation
            sameFirstTwo = tmp;
        }
        // total number of ways
        return diffFirstTwo + sameFirstTwo;
    }
}
