class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        int m = heights.length;
        int n = heights[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean[][] visited = new boolean[m][n];
                boolean[] reach = new boolean[]{false, false};
                dfs(heights, i, j, heights[i][j], visited, reach);
                if(reach[0] && reach[1]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }

    private void dfs(int[][] grid, int r, int c, int prev, boolean[][] visited, boolean[] reach) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || visited[r][c] || grid[r][c] > prev) {
            return;
        }
        visited[r][c] = true;

        if (r == 0 || c == 0) {
            reach[0] = true;
        }
        if (r == grid.length - 1 || c == grid[0].length - 1) {
            reach[1] = true;
        }
        dfs(grid, r-1, c, grid[r][c], visited, reach);
        dfs(grid, r+1, c, grid[r][c], visited, reach);
        dfs(grid, r, c - 1, grid[r][c], visited, reach);
        dfs(grid, r, c+1, grid[r][c], visited, reach);
    }
}