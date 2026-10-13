class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        LinkedList<int[]> res = new LinkedList<>();
        int n = intervals.length;
        int i = 0;
        int start = newInterval[0], end = newInterval[1];

        while (i < n && intervals[i][1] < start) {
            res.offer(intervals[i++]);
        }

        while (i < n && intervals[i][0] <= end) {
            start = Math.min(intervals[i][0], start);
            end = Math.max(intervals[i][1], end);
            i++;
        }
        res.offer(new int[]{start, end});
        while (i<n) {
            res.offer(intervals[i++]);
        }

        return res.toArray(new int[0][]);
    }
}