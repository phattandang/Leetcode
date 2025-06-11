class Solution {
    public static final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int orangesRotting(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int fresh = 0;
        int time = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int r = 0; r < ROWS; r++) {
            for(int c = 0; c < COLS; c++) {
                if(grid[r][c] == 1) fresh++;
                if(grid[r][c] == 2) q.offer(new int[]{r, c});
            }
        }
        while(fresh > 0 && !q.isEmpty()) {
            int length = q.size();
            for(int i = 0; i < length; i++) {
                int[] cur = q.poll();
                int r = cur[0];
                int c = cur[1];

                for(int[] dir : dirs) {
                    int row = r + dir[0];
                    int col = c + dir[1];
                    if(row >= 0 && row < grid.length && col >= 0 && col < grid[0].length && grid[row][col] == 1) {
                        fresh--;
                        q.offer(new int[]{row, col});
                        grid[row][col] = 2;
                    }
                }
            }
            time++;
        }   
        return fresh == 0 ? time : -1;
    }
}