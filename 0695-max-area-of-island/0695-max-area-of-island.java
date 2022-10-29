class Solution {

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i=0; i< grid.length; i++) {
            for (int j=0; j<grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(grid, i,j, 0));
                }
            }
        }
        return maxArea;
    }
    
    public int dfs(int[][] idx, int sr, int sc, int area) {
        int rows = idx.length, cols = idx[0].length;
        if (sr < 0 || sc >= cols || sr >= rows || sc < 0 || idx[sr][sc] == 0) {
            return area;
        }
        idx[sr][sc] = 0;
        area++;
        area = dfs(idx, sr-1, sc, area);
        area = dfs(idx,sr, sc+1, area);
        area = dfs(idx,sr+1, sc, area);
        area = dfs(idx,sr, sc-1, area);
        
        return area;
    }
}