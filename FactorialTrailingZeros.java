class Solution {
    public int trailingZeroes(int n) {
        // count amount of 10(2*5), 5 as the limiting factor. also re-count the duplicates of 5, e.g 25,125,etc
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
