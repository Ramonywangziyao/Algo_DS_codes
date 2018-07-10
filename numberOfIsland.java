class Solution {
    public int[] rowDir = {-1, 0, 1, 0};
    public int[] colDir = {0, 1, 0, -1};
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0 || grid[0].length == 0) return 0;
        int m = grid.length, n = grid[0].length, res = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] == '1') {
                    res++;
                    checkSurround(grid, m, n, i, j);
                }
            }
        }
        return res;
    }

    public void checkSurround(char[][] grid, int m, int n, int x, int y) {
        grid[x][y] = '2';
        for(int i = 0; i < 4; i++) {
            int newX = x + rowDir[i], newY = y + colDir[i];
            if(newX >= 0 && newX < m && newY >= 0 && newY < n) {
                if(grid[newX][newY] == '1') checkSurround(grid, m, n, newX, newY);
            }
        }
    }
}
