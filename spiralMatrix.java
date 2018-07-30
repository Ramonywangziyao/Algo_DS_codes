class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return res;
        int top = 0, left = 0, bot = matrix.length, right = matrix[0].length;
        int row = -1, col = -1, count = 0, total = bot * right;
        while(count < total) {
            if(col < right && count < total) {
                top++;
                row++;
                col++;
                while(col < right) {
                    res.add(matrix[row][col]);
                    col++;
                    count++;
                }
            }
            if(row < bot && count < total) {
                col--;
                right--;
                row++;
                while(row < bot) {
                    res.add(matrix[row][col]);
                    row++;
                    count++;
                }
            }
            if(col >= left && count < total) {
                row--;
                bot--;
                col--;
                while(col >= left) {
                    res.add(matrix[row][col]);
                    col--;
                    count++;
                }
            }
            if(row >= top && count < total) {
                left++;
                col++;
                row--;
                while(row >= top) {
                    res.add(matrix[row][col]);
                    row--;
                    count++;
                }
            }
        }
        return res;
    }
}
