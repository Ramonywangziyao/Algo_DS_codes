class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid[0].length;
        int[] res = new int[n];
        res[0] = 1;
        for(int[] row : obstacleGrid) {
            for(int i = 0; i < n; i++) {
                if(row[i] == 1) res[i] = 0;
                else if(i > 0) res[i] += res[i - 1];
            }
        }
        return res[n - 1];
    }
}
