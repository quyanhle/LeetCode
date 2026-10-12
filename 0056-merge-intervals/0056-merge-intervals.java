class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();
        PriorityQueue<int[]> q = new PriorityQueue<>((a , b) -> a[0] - b[0]);

        for(int i = 0; i< intervals.length; i++) {
            q.offer(intervals[i]);
        }

        while(!q.isEmpty()) {
            int[] curr = q.poll();
            if (res.isEmpty()) {
                res.add(curr);
            } else {
                int[] last = res.get(res.size() - 1);
                if (curr[0] <= last[1]) {
                    res.remove(res.size()-1);
                    if (curr[1] <= last[1]) {
                        res.add(new int[]{last[0], last[1]});
                    } else {
                        res.add(new int[]{last[0], curr[1]});
                    }
                } else {
                    res.add(curr);
                }
            }

        }
        return res.toArray(new int[0][]);
    }
}