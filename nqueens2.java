class Solution {
    public int totalNQueens(int n) {
        if(n <= 0) return 0;
        int[] res = new int[1];
        int[] line = new int[n];
        solve(line, res, 0, n);
        return res[0];
    }

    public void solve(int[] line, int[] res, int pos, int n) {
        if(pos >= n) {
            res[0]++;
            return;
        }
        for(int i = 0; i < n; i++) {
            line[pos] = i;
            if(isValid(line, pos)) {
                solve(line, res, pos + 1, n);
            }
        }
    }

    public boolean isValid(int[] line, int pos) {
        for(int i = 0; i < pos; i++) {
            if(line[i] == line[pos]) return false;
            if(Math.abs(line[i] - line[pos]) == Math.abs(i - pos)) return false;
        }
        return true;
    }
}
