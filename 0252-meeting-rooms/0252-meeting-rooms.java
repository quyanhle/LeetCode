class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a,b) -> a[0] - b[0]
        );
        for (int i = 0; i< intervals.length; i++) {
            minHeap.offer(intervals[i]);
        }
        int size = minHeap.size();
        if (size <= 1) {
            return true;
        }
        for (int i =0; i< size -1; i++) {
            int[] time = minHeap.poll();
            int[] time1 = minHeap.peek();
            if (time[1] > time1[0]) {
                return false;
            }
        }
        return true;
    }
}