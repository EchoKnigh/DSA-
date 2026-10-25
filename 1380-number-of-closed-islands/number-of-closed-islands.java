class Solution {

    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        // STEP 1: Remove islands touching border
        for (int i = 0; i < n; i++) {
            if (grid[i][0] == 0) dfs(grid, visited, i, 0, n, m);
            if (grid[i][m - 1] == 0) dfs(grid, visited, i, m - 1, n, m);
        }

        for (int j = 0; j < m; j++) {
            if (grid[0][j] == 0) dfs(grid, visited, 0, j, n, m);
            if (grid[n - 1][j] == 0) dfs(grid, visited, n - 1, j, n, m);
        }
        int count = 0;
        visited = new boolean[n][m]; 

        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                if (grid[i][j] == 0 && !visited[i][j]) {
                    count++;
                    dfs(grid, visited, i, j, n, m);
                }
            }
        }

        return count;
    }

    private void dfs(int[][] grid, boolean[][] visited, int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m) return;
        if (grid[i][j] == 1 || visited[i][j]) return;

        visited[i][j] = true;
        grid[i][j] = 1; 

        dfs(grid, visited, i + 1, j, n, m);
        dfs(grid, visited, i - 1, j, n, m);
        dfs(grid, visited, i, j + 1, n, m);
        dfs(grid, visited, i, j - 1, n, m);
    }
}