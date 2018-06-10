class Solution {
    public void solve(char[][] board) {
        if(board.length < 2 || board[0].length < 2) return;
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++) {
            if(board[i][0] == 'O') dfs(board,i,0,m,n);
            if(board[i][n-1] == 'O') dfs(board,i,n-1,m,n);
        }
        for(int i = 0; i < n; i++) {
            if(board[0][i] == 'O') dfs(board,0,i,m,n);
            if(board[m-1][i] == 'O') dfs(board,m-1,i,m,n);
        }
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(board[i][j] == 'O') board[i][j] = 'X';
                if(board[i][j] == '*') board[i][j] = 'O';
            }
        }
    }

    private void dfs(char[][] board, int i, int j, int m, int n) {
        board[i][j] = '*';
        if(i + 1 < m && board[i+1][j] == 'O') dfs(board,i+1,j,m,n);
        if(j + 1 < n && board[i][j+1] == 'O') dfs(board,i,j+1,m,n);
        if(i - 1 >= 0 && board[i-1][j] == 'O') dfs(board,i-1,j,m,n);
        if(j - 1 >= 0 && board[i][j-1] == 'O') dfs(board,i,j-1,m,n);
    }
}
