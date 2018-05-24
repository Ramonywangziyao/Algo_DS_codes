class Solution {
    public void gameOfLife(int[][] board) {
        if(board == null || board.length == 0) return;
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n;j++){
                int lives = countLives(board,i,j,m,n);
                if(lives == 3 && board[i][j] == 0) {
                    board[i][j] = 2;
                }
                else if(lives <= 3 && lives >= 2&& board[i][j] == 1) {
                    board[i][j] = 3;
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0;j < n; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    private int countLives(int[][] board, int i, int j, int m, int n) {
        int lives = 0;
        for(int x = Math.max(0,i-1); x <= Math.min(i+1,m-1);x++){
            for(int y = Math.max(0,j-1);y<=Math.min(j+1,n-1);y++){
                lives+=board[x][y]&1;
            }
        }
        lives-=board[i][j]&1;
        return lives;
    }
}
