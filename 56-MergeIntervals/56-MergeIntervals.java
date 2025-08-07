// Last updated: 8/7/2025, 6:19:24 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        LinkedList<int[]> res = new LinkedList<>();
        for (int i = 0; i < intervals.length; i++) {
            if (!res.isEmpty() && intervals[i][0] <= res.getLast()[1]) {
                int[] last = res.getLast();
                res.getLast()[1] = last[1] >= intervals[i][1] ? last[1] : intervals[i][1];
            } else {
                res.add(intervals[i]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}