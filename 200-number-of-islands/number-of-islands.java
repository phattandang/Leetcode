class Solution {
    public static final int[][] dirs = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
    public int numIslands(char[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int islands = 0;
        for(int r = 0; r < ROWS; r++) {
            for(int c = 0; c < COLS; c++) {
                if(grid[r][c] == '0') continue;
                else {
                    dfs(grid, r, c);
                    islands++;
                }
            }
        }
        return islands;
    }
    public void dfs(char[][] grid, int r, int c) {
        if(r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        for(int[] dir : dirs) {
            dfs(grid, r + dir[0], c + dir[1]);
        }
    }
}