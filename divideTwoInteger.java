class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 0) {
            return 0;
        }
        int sign = 1;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            sign = -1;
        }
        long ldv = Math.abs((long)dividend);
        long lds = Math.abs((long)divisor);
        long ans = divideHelper(ldv,lds);
        if(ans > Integer.MAX_VALUE) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return sign * (int)ans;
    }

    private long divideHelper(long dividend, long divisor) {
        if(dividend < divisor) return 0;
        long sum = divisor;
        long multiple = 1;
        while((sum + sum) <= dividend ) {
            sum += sum;
            multiple += multiple;
        }
        return multiple + divideHelper(dividend - sum, divisor);
    }
}
