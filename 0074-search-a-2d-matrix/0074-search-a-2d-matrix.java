class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binarySearch(matrix, target, 0, 0, matrix.length - 1, matrix[0].length - 1);
    }

    private int countMidRow(int startRow, int endRow) {
        return (endRow+startRow) / 2;
    }
    
    private int countMidCol(int startRow, int startCol, int endRow, int endCol, int length) {
        return (((startRow * length + startCol) + (endRow * length + endCol)) / 2)%length;
    }

    private boolean binarySearch(int[][] matrix, int target, int startRow, int startCol, int endRow, int endCol) {
        while (startRow < endRow || (startRow == endRow && startCol <= endCol)) {
            int midRow = countMidRow(startRow, endRow);
            int midCol = countMidCol(startRow, startCol, endRow, endCol, matrix[0].length);
            if (matrix[midRow][midCol] == target) {
                return true;
            }
            else if (matrix[midRow][midCol] > target) {
                endRow = endCol == 0? --endRow : endRow;
                endCol = endCol == 0? matrix[0].length - 1 : --endCol;
                return binarySearch(matrix, target, startRow, startCol, endRow, endCol);
            } else {
                startRow = startCol == matrix[0].length - 1 ? ++startRow : startRow;
                startCol = startCol == matrix[0].length - 1 ? 0 : ++startCol;
                return binarySearch(matrix, target, startRow, startCol, endRow, endCol);
            }
        }
        return false;
    }

}