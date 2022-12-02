class Solution {
    public int minMeetingRooms(int[][] intervals) {
        PriorityQueue<Integer> endHeap = new PriorityQueue<>();
        int rooms = 0;
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        for (int i = 0; i< intervals.length; i++) {
            if (rooms == 0) {
                rooms++;
            } else if (intervals[i][0] < endHeap.peek()) {
                rooms++;
            } else {
                endHeap.poll();
            }
            endHeap.offer(intervals[i][1]);
        }
        
        return rooms;
    }
}