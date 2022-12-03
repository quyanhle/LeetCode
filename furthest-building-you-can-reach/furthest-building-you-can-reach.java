class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);
        for (int i = 0; i < heights.length - 1; i++) {
            int difference = heights[i+1] - heights[i];
            if (difference <= 0) {
                continue;
            }
            heap.add(difference);
            bricks -= difference;
            
            if (bricks < 0 && ladders == 0) {
                return i;
            }
            
            if (bricks < 0) {
                bricks += heap.poll();
                ladders--;
            }
        }
        return heights.length - 1;
    }
}