class Solution {
    public int countCornerRectangles(int[][] grid) {
        int res = 0, len = grid.length;
        for(int i = 0; i < len-1; i++) {
            for(int j = i+1; j < len; j++ ) {
                int ct = 0;
                for(int k = 0; k < grid[0].length; k++)
                    if(grid[i][k] == 1 && grid[j][k] == 1) ct++;
                res += ct * (ct-1) / 2;
            }
        }
        return res;
    }
}
