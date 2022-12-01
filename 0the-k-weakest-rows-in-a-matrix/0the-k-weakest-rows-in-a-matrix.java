class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<HashMap.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) ->
            a.getValue() != b.getValue() ? a.getValue() - b.getValue() : a.getKey() - b.getKey()
                                                                                 );
        for(int i = 0; i < mat.length; i++) {
            int numberOf1 = 0;
            for (int j=0; j<mat[i].length; j++) {
                if(mat[i][j] == 1) {
                    numberOf1++;
                }
            }
            map.put(i, numberOf1);
        }
        for (HashMap.Entry<Integer, Integer> e : map.entrySet()) {
            heap.offer(e);
        }
        
        for (int i = 0; i<k; i++) {
            result[i] = heap.poll().getKey();
        }
        return result;
    }
}