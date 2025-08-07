// Last updated: 8/7/2025, 6:19:23 PM
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        if (n == 0) {
            return res;
        }

        int rowStart = 0, rowEnd = n-1, colStart = 0, colEnd = n-1, curr = 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for(int i = colStart; i<= colEnd; i++) {
                res[rowStart][i] = curr++;
            }
            rowStart++;

            for (int i = rowStart; i<= rowEnd; i++) {
                res[i][colEnd] = curr++;
            }
            colEnd--;
            for (int i = colEnd; i >=colStart; i--) {
                res[rowEnd][i] = curr++;
            }
            rowEnd--;

            for(int i= rowEnd; i>=rowStart; i--) {
                res[i][colStart] = curr++;
            }
            colStart++;
        }
        return res;
    }
}