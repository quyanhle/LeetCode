class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int res = 0;

        Arrays.sort(intervals, (a, b) -> a[1] != b[1] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]));
        int i = 0;
        while(i< intervals.length - 1) {
            int j = i + 1;
            while(j < intervals.length && intervals[i][1] > intervals[j][0]) {
                res++;
                j++;
            }
            i = j;
        }
        return res;
    }
}