// Last updated: 8/7/2025, 6:18:37 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        LinkedList<int[]> list = new LinkedList<>();
        int res = 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });
        for (int i = 0; i<intervals.length; i++) {
            if (i == 0) {
                list.add(intervals[i]);
                continue;
            } else {
                int[] last = list.getLast();
                if (last[1] <= intervals[i][0]) {
                    list.add(intervals[i]);
                } else if (last[1] >= intervals[i][1]) {
                    list.removeLast();
                    list.add(intervals[i]);
                    res++;
                } else {
                    res++;
                    continue;
                }

            }
        }
        return res;
    }
}