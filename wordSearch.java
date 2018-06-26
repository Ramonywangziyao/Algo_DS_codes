class Solution {
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0 || board[0].length == 0) return false;
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(exist(board, i, j, m, n, word, 0)) return true;
            }
        }
        return false;
    }

    public boolean exist(char[][] board, int x, int y, int m, int n, String w, int start) {
        if(start >= w.length()) return true;
        if(x < 0 || x >= m || y < 0 || y >= n) return false;
        if(board[x][y] != w.charAt(start)) return false;
        board[x][y] ^= 256;
        boolean found = exist(board, x - 1, y, m, n, w, start + 1) ||
            exist(board, x, y + 1, m, n, w, start + 1) ||
            exist(board, x + 1, y, m, n, w, start + 1) ||
            exist(board, x, y - 1, m, n, w, start + 1);
        board[x][y] ^= 256;
        return found;
    }
}
