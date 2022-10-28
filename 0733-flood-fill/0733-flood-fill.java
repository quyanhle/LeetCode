class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }
        int rows = image.length;
        int cols = image[0].length;
        int sourceColor = image[sr][sc];
        dfs(image, sr, sc, rows, cols, sourceColor, color);
        return image;
    }
    
    public void dfs(int[][] matrix, int sr, int sc, int rows, int cols, int sourceColor, int color) {
        if (sr <0 || sc<0 || sr >= rows || sc >= cols) {
            return;
        } else if (matrix[sr][sc] != sourceColor) {
            return;
        }
        matrix[sr][sc] = color;
        dfs(matrix, sr-1, sc, rows, cols, sourceColor, color);
        dfs(matrix, sr, sc+1, rows, cols, sourceColor, color);
        dfs(matrix, sr+1, sc, rows, cols, sourceColor, color);
        dfs(matrix, sr, sc-1, rows, cols, sourceColor, color);
    }
}