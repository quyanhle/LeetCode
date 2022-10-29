class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for (int i=0; i< grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (!visited[i][j] && grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, visited, i,j, 0));
                }
            }
        }
        return maxArea;
    }
    
    public int dfs(int[][] idx, boolean[][] visited, int sr, int sc, int area) {
        int rows = idx.length, cols = idx[0].length;
        if (sr < 0 || sc >= cols || sr >= rows || sc < 0 || idx[sr][sc] == 0 || visited[sr][sc]) {
            return area;
        }
        visited[sr][sc] = true;
        area++;
        area = dfs(idx, visited, sr-1, sc, area);
        area = dfs(idx, visited,sr, sc+1, area);
        area = dfs(idx, visited,sr+1, sc, area);
        area = dfs(idx, visited,sr, sc-1, area);
        
        return area;
    }
}