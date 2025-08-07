// Last updated: 8/7/2025, 6:18:32 PM
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length == 0 || r*c != mat.length * mat[0].length) {
            return mat;
        }
        //flatten mat
        
        int[] mapFlatten = new int[mat.length * mat[0].length];
        int cnt = 0;
        for (int i=0; i< mat.length; i++) {
            for (int j=0; j < mat[i].length; j++) {
                mapFlatten[cnt++] = mat[i][j];
            }
        }
        //push element into resArr
        int pushPtr = 0;
        int[][] resArr = new int[r][c];
        for (int i=0; i<r; i++) {
            for (int j=0; j<c; j++) {
                resArr[i][j] = mapFlatten[pushPtr++];
            }
        }
        
        return resArr;
    }
    
}