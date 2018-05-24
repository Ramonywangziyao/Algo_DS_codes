class Solution {
    public void wallsAndGates(int[][] rooms) {
        if(rooms == null) return;
        int m = rooms.length;
        if(m == 0) return;
        int n = rooms[0].length;
        List<int[]> directions = Arrays.asList(
            new int[]{-1,0},
            new int[]{0,1},
            new int[]{1,0},
            new int[]{0,-1}
        );
        Queue<int[]> gates = new LinkedList<>();
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(rooms[i][j] == 0) {
                    gates.add(new int[]{i,j});
                }
            }
        }
        while(!gates.isEmpty()) {
            int[] idxs = gates.poll();
            int row = idxs[0];
            int col = idxs[1];
            for(int[] direction : directions) {
                int r = row+direction[0];
                int c = col+direction[1];
                if(c < 0 || r < 0 || r >= m || c >= n || rooms[r][c] != Integer.MAX_VALUE) continue;
                rooms[r][c] = rooms[row][col] + 1;
                gates.add(new int[]{r,c});
            }
        }
    }
}
