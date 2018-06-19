class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        if(target < matrix[0][0]) return false;
        int m = matrix.length, n = matrix[0].length, startI = 0, startJ = n - 1;
        for(; startI < m; startI++) {
            while(startJ >= 0 && matrix[startI][startJ] > target) {
                startJ --;
            }
            if(startJ >= 0 && matrix[startI][startJ] == target) return true;
        }
        return false;
    }
}
