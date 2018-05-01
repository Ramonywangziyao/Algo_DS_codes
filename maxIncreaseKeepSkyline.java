class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int len = grid.length, res = 0;
        // store the max value for each column and each row
        int[] maxRow = new int[len], maxCol = new int[len];
        for(int i = 0;i<len;i++){
            for(int j = 0;j<len;j++){
                // go through once, in the correct order, i is the row, not changing, find the maximum of that row
                maxRow[i] = Math.max(maxRow[i],grid[i][j]);
                // we can find the max at each column, next time, compare with the original value
                maxCol[j] = Math.max(maxCol[j],grid[i][j]);
            }
        }
        // res(also each building) increases as the difference between the minimum maximum value and it-self
        for(int i = 0;i<len;i++)
            for(int j = 0;j<len;j++) res += Math.min(maxRow[i],maxCol[j])-grid[i][j];
        return res;
    }
}
