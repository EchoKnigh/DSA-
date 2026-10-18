class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int r = 0, c = 0;
        visited[r][c] = true;
        while (true) {
            int nr = r, nc = c;
            if (grid[r][c] == 'U') {
                nr--;
            } else if (grid[r][c] == 'D') {
                nr++;
            } else if (grid[r][c] == 'L') {
                nc--;
            } else {
                nc++;
            }
            if (nr < 0 || nr >= m || nc < 0 || nc >= n || visited[nr][nc]) {
                break;
            }
            r = nr;
            c = nc;
            visited[r][c] = true;
        }
        return new int[]{r, c};
    }
}