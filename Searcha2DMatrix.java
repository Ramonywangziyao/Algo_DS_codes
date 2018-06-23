class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0 || target < matrix[0][0]) return false;
        int m = matrix.length, n = matrix[0].length, i = 0, j = n - 1;
        while(j >= 0 && i < m) {
            if(target == matrix[i][j]) return true;
            else if(target > matrix[i][j]) i++;
            else if(target < matrix[i][j]) j--;
        }
        return false;
    }
}
