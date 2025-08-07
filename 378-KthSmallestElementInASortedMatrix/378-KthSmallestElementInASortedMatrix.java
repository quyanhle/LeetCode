// Last updated: 8/7/2025, 6:18:41 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int l = matrix.length;
        int[] arr = new int[l*l];
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0; i < l; i++) {
            for (int j = 0; j<l; j++) {
                heap.offer(matrix[i][j]);
            }
        }
        
        for(int i = 0; i < k-1; i++) {
            heap.poll();
        }
        return heap.peek();
    }
}