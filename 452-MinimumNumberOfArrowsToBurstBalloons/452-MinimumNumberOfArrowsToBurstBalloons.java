// Last updated: 8/7/2025, 6:18:34 PM
class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length <= 1) {
            return points.length;
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((x, y) -> {
            if (x[1] == y[1]) {
                return Integer.compare(x[0], y[0]);
            }
            return Integer.compare(x[1], y[1]);
        });
        
        for (int i = 0; i< points.length; i++) {
            heap.add(points[i]);
        }
        
        int num = 1, left = heap.peek()[1];
        while (!heap.isEmpty()) {
            int[] balloon = heap.poll();
            
            if (balloon[0] > left) {
                num++;
                left = balloon[1];
            }
            
        }
        
        return num;
    }
}