class Solution {
    public void setZeroes(int[][] matrix) {
        HashMap<Character, ArrayList<Integer>> record = new HashMap<>();
        record.put('r', new ArrayList());
        record.put('c', new ArrayList());
        for (int i = 0; i< matrix.length; i++) {
            for (int j = 0; j< matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    record.get('r').add(i);
                    record.get('c').add(j);
                }
            }
        }
        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j< matrix[i].length; j++ ) {
                if (matrix[i][j] != 0 &&
                    (record.get('r').contains(i) || record.get('c').contains(j))) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}