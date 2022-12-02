class Solution {
    public int minMeetingRooms(int[][] intervals) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> endHeap = new PriorityQueue<>();
        int rooms = 0;
        for (int i = 0; i < intervals.length; i++) {
            heap.offer(intervals[i]);
        }
        while(!heap.isEmpty()) {
            int[] interval = heap.poll();
            if (rooms == 0) {
                rooms++;
            } else if (interval[0] < endHeap.peek()) {
                rooms++;
            } else {
                endHeap.poll();
            }
            endHeap.offer(interval[1]);
        }
        
        return rooms;
    }
}